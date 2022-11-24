/**
 * 
 */
package in.codifi.app.auth.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mohup
 *
 */
public class CodifiAuthTokenDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("client_id")
	private String clientId;
	
	@JsonProperty("client_secret")
	private String clientSecret;
	
	@JsonProperty("grant_type")
	private String grantType;
	
	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("expires_in")
	private String expiry;

	@JsonProperty("refresh_expires_in")
	private String refreshExpiry;

	@JsonProperty("token_type")
	private String tokenType;

	@JsonProperty("not-before-policy")
	private int notBeforePolicy;

	@JsonProperty("scope")
	private String scope;
	
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
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	/**
	 * @return the expiry
	 */
	public String getExpiry() {
		return expiry;
	}
	/**
	 * @param expiry the expiry to set
	 */
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	/**
	 * @return the refreshExpiry
	 */
	public String getRefreshExpiry() {
		return refreshExpiry;
	}
	/**
	 * @param refreshExpiry the refreshExpiry to set
	 */
	public void setRefreshExpiry(String refreshExpiry) {
		this.refreshExpiry = refreshExpiry;
	}
	/**
	 * @return the tokenType
	 */
	public String getTokenType() {
		return tokenType;
	}
	/**
	 * @param tokenType the tokenType to set
	 */
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	/**
	 * @return the notBeforePolicy
	 */
	public int getNotBeforePolicy() {
		return notBeforePolicy;
	}
	/**
	 * @param notBeforePolicy the notBeforePolicy to set
	 */
	public void setNotBeforePolicy(int notBeforePolicy) {
		this.notBeforePolicy = notBeforePolicy;
	}
	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}
	/**
	 * @param scope the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

}
