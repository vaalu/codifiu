/**
 * 
 */
package in.codifi.app.auth.specs;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import in.codifi.app.auth.dto.CodifiAuthUser;
import in.codifi.app.auth.dto.CodifiUser;

/**
 * @author mohup
 *
 */
public interface IAuthSpecs {

	/**
	 * @param {@link CodifiAuthUser}
	 * @return {@link CodifiUser}
	 */
	@Path("/addNewUser")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @APIResponse(description = "Create a new user after phone, email and mpin registration")
    public CodifiUser addNewUser(CodifiAuthUser user);
	
}
