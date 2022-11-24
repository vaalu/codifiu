/**
 * 
 */
package in.codifi.app.auth.specs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.HeaderParam;

import in.codifi.app.auth.dto.CodifiAuthUser;

/**
 * @author mohup
 *
 */

@RegisterRestClient(configKey="auth-user-api")
@RegisterClientHeaders
public interface ICodifiUserAuthService {
	/**
	 * @param user
	 * @return {@link CodifiAuthUser}
	 */
	@Path("/users")
	@POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    @APIResponse(description = "Create a new user after phone, email and mpin registration")
    public void addNewUser(@HeaderParam(HttpHeaders.AUTHORIZATION) String authHeader, CodifiAuthUser user);
	
}
