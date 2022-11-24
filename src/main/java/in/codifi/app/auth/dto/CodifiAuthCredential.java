/**
 * 
 */
package in.codifi.app.auth.dto;

import java.io.Serializable;

/**
 * @author mohup
 *
 */
public class CodifiAuthCredential implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private String value;
	private Boolean temporary;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the temporary
	 */
	public Boolean getTemporary() {
		return temporary;
	}
	/**
	 * @param temporary the temporary to set
	 */
	public void setTemporary(Boolean temporary) {
		this.temporary = temporary;
	}
}
