/**
 * 
 */
package in.codifi.app.auth.config;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * @author mohup
 *
 */
@ApplicationScoped
public class PropertiesConfig {

	@ConfigProperty(name="auth.org.server.url")
	private String authServerTokenUrl;
	
	@ConfigProperty(name="quarkus.rest-client.auth-user-api.url")
	private String authServerUrl;
	
	@ConfigProperty(name="auth.org.server.client-id")
	private String clientId;

	@ConfigProperty(name="auth.org.server.client-secret")
	private String clientSecret;

	@ConfigProperty(name="auth.org.server.grant-type")
	private String grantType;
	
	/**
	 * @return the authServerUrl
	 */
	public String getAuthServerUrl() {
		return authServerUrl;
	}

	/**
	 * @param authServerUrl the authServerUrl to set
	 */
	public void setAuthServerUrl(String authServerUrl) {
		this.authServerUrl = authServerUrl;
	}

	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the clientSecret
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * @param clientSecret the clientSecret to set
	 */
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	/**
	 * @return the grantType
	 */
	public String getGrantType() {
		return grantType;
	}

	/**
	 * @param grantType the grantType to set
	 */
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	/**
	 * @return the authServerTokenUrl
	 */
	public String getAuthServerTokenUrl() {
		return authServerTokenUrl;
	}

	/**
	 * @param authServerTokenUrl the authServerTokenUrl to set
	 */
	public void setAuthServerTokenUrl(String authServerTokenUrl) {
		this.authServerTokenUrl = authServerTokenUrl;
	}

}
