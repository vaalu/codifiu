/**
 * 
 */
package in.codifi.app.auth.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author mohup
 *
 */
public class CodifiExceptionMapper implements ExceptionMapper<CodifiAuthException> {

	@Override
	public Response toResponse(CodifiAuthException exception) {
		return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build();
	}

}
