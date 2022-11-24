/**
 * 
 */
package in.codifi.app.auth.rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import in.codifi.app.auth.dto.CodifiAuthUser;
import in.codifi.app.auth.dto.CodifiUser;
import in.codifi.app.auth.specs.IAuthSpecs;
import in.codifi.app.auth.specs.IAuthSpecsService;

/**
 * @author mohup
 *
 */
@Path("/obauth")
public class CodifiAuthentication implements IAuthSpecs {

	@Inject
	IAuthSpecsService authServices;
	
	@Override
	public CodifiUser addNewUser(CodifiAuthUser user) {
		return authServices.addNewUser(user);
	}
	
}
