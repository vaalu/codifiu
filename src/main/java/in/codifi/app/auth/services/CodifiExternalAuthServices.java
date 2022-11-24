/**
 * 
 */
package in.codifi.app.auth.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import in.codifi.app.auth.config.AuthActions;
import in.codifi.app.auth.config.PropertiesConfig;
import in.codifi.app.auth.dto.CodifiAuthUser;
import in.codifi.app.auth.exceptions.CodifiAuthException;
import in.codifi.app.auth.specs.ICodifiUserAuthService;
import in.codifi.app.auth.specs.ICodifiUserAuthTokenService;

/**
 * @author mohup
 *
 */
@ApplicationScoped
public class CodifiExternalAuthServices {
	
	@Inject
	@RestClient
	ICodifiUserAuthService userService;
	

	@Inject
	@RestClient
	ICodifiUserAuthTokenService tokenService;

	@Inject
	PropertiesConfig props;
	
	private CodifiAuthException getException(Throwable exception) {
		AuthActions action = AuthActions.EXCEPTION_UNEXPECTED;
		String errorCode = exception.getMessage();
		int beginIndx = errorCode.length() - 3;
		errorCode = errorCode != null ? errorCode.strip().substring(beginIndx).strip() : "500";
		int statusCode = Integer.valueOf(errorCode);
		switch(statusCode) {
		case 307:
			action = AuthActions.EXCEPTION_RESUBMIT_DIFF_LOCATION;
			break;
		case 400:
			action = AuthActions.EXCEPTION_PAYLOAD;
			break;
		case 401:
			action = AuthActions.EXCEPTION_AUTH_INVALID;
			break;
		case 403:
			action = AuthActions.EXCEPTION_AUTH_INSUFFICIENT;
			break;
		case 404:
			action = AuthActions.EXCEPTION_RESOURCE_NOT_EXIST;
			break;
		case 405:
			action = AuthActions.EXCEPTION_UNSUPPORTED_METHOD;
			break;
		case 409:
			action = AuthActions.EXCEPTION_RESOURCE_CONFLICT;
			break;
		case 415:
			action = AuthActions.EXCEPTION_MEDIA_UNSUPPORTED;
			break;
		default:
			action = AuthActions.EXCEPTION_UNEXPECTED;
		}
		
		return new CodifiAuthException(action, exception, statusCode);
	}
	
	public String getToken() throws CodifiAuthException {
		String token = null;
		String clientId = props.getClientId();
		String clientSecret = props.getClientSecret();
		String grantType = props.getGrantType();
		try {
			token = tokenService.fetchToken(clientId, clientSecret, grantType).getAccessToken();
		}catch (Exception e) {
			throw getException(e);
		}
		return token;
	}
	
	public void addNewUser(CodifiAuthUser user) throws CodifiAuthException {
		try {
			String token = "Bearer " + getToken();
			userService.addNewUser(token, user);
		}catch (Exception e) {
			throw getException(e);
		}
	}

}
