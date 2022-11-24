/**
 * 
 */
package in.codifi.app.auth.specs;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import in.codifi.app.auth.dto.CodifiAuthTokenDetail;
import in.codifi.app.auth.dto.CodifiAuthUser;

/**
 * @author mohup
 *
 */
@Path("/token")
@RegisterRestClient(configKey = "token-service")
public interface ICodifiUserAuthTokenService {
	
	/**
	 * @param {@link CodifiAuthUser}
	 * @return {@link String}
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @APIResponse(description = "Fetches access token for user creation")
    public CodifiAuthTokenDetail fetchToken(
    		@FormParam("client_id") String client_id,
    		@FormParam("client_secret") String client_secret,
    		@FormParam("grant_type") String grant_type);
}
