/**
 * 
 */
package in.codifi.app.auth.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author mohup
 *
 */
public class CodifiAuthUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("lastName")
	private String lastName;

	@JsonProperty("username")
	private String username;

	@JsonProperty("email")
	private String email;

	@JsonProperty("enabled")
	private Boolean enabled;
	
	@JsonProperty("emailVerified")
	private Boolean emailVerified;

	@JsonProperty("credentials")
	private List<CodifiAuthCredential> credentials;
	
	@JsonProperty("realmRoles")
	private List<String> realmRoles;
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	/**
	 * @return the credentials
	 */
	public List<CodifiAuthCredential> getCredentials() {
		return credentials;
	}
	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(List<CodifiAuthCredential> credentials) {
		this.credentials = credentials;
	}
	/**
	 * @return the emailVerified
	 */
	public Boolean getEmailVerified() {
		return emailVerified;
	}
	/**
	 * @param emailVerified the emailVerified to set
	 */
	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	/**
	 * @return the realmRoles
	 */
	public List<String> getRealmRoles() {
		return realmRoles;
	}
	/**
	 * @param realmRoles the realmRoles to set
	 */
	public void setRealmRoles(List<String> realmRoles) {
		this.realmRoles = realmRoles;
	}
}
