/**
 * 
 */
package in.codifi.app.auth.config.rest;

import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;

import org.eclipse.microprofile.rest.client.ext.ClientHeadersFactory;

/**
 * @author mohup
 *
 */
public class CodifiRestHeadersFactory implements ClientHeadersFactory {
	
	@Override
	public MultivaluedMap<String, String> update(MultivaluedMap<String, String> incomingHeaders,
			MultivaluedMap<String, String> clientOutgoingHeaders) {
		MultivaluedMap<String, String> returnVal = new MultivaluedHashMap<>();
        returnVal.putAll(clientOutgoingHeaders);
        return returnVal;
	}

}
