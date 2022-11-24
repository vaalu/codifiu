/**
 * 
 */
package in.codifi.app.auth.specs;

import in.codifi.app.auth.dto.CodifiAuthUser;
import in.codifi.app.auth.dto.CodifiUser;

/**
 * @author mohup
 *
 */
public interface IAuthSpecsService {

	/**
	 * @param {@link CodifiAuthUser}
	 * @return {@link CodifiUser}
	 */
    public CodifiUser addNewUser(CodifiAuthUser user);
    
}
