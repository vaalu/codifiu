/**
 * 
 */
package in.codifi.app.auth.config;

/**
 * @author mohup
 *
 */
public enum AuthActions {
	UNREGISTERED(0, "Unregistered user."),
	REGISTERED_EMAIL(1, "Email not validated."),
	REGISTERED_PHONE(2, "Phone not validated."),
	REGISTERED(3, "Registered user with phone and email validated."),
	DORMANT(4, "Inactive (Dormant)."),
	TOKEN_ISSUE(5, "Token generation"),
	EXCEPTION_PAYLOAD(400, "Invalid payload."),
	EXCEPTION_AUTH_INVALID(401, "Provided authorization is invalid"),
	EXCEPTION_AUTH_INSUFFICIENT(403, "Authorization provided by the client is not enough to access the resource"),
	EXCEPTION_RESOURCE_NOT_EXIST(404, "Requested resource does not exist"),
	EXCEPTION_UNSUPPORTED_METHOD(405, "Method chosen by the client to access a resource is not supported"),
	EXCEPTION_RESOURCE_CONFLICT(409, "Resource already exists or some conflict when processing the request"),
	EXCEPTION_MEDIA_UNSUPPORTED(415, "Requested media type is not supported"),
	EXCEPTION_UNEXPECTED(500, "Server could not fulfill the request due to some unexpected error"),
	EXCEPTION_RESUBMIT_DIFF_LOCATION(307, "Resubmit the request to another location"),
	;
	
	private AuthActions(int code, String description) {
		this.code = code;
	}
	
	private int code;
	private String description;

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
