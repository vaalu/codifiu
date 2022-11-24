/**
 * 
 */
package in.codifi.app.auth.dto;

/**
 * @author mohup
 *
 */
public class CodifiAuthRole {

	private String id;
	private String name;
	private String description;
	private Boolean composite;
	private Boolean clientRole;
	private String containerId;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	/**
	 * @return the composite
	 */
	public Boolean getComposite() {
		return composite;
	}
	/**
	 * @param composite the composite to set
	 */
	public void setComposite(Boolean composite) {
		this.composite = composite;
	}
	/**
	 * @return the clientRole
	 */
	public Boolean getClientRole() {
		return clientRole;
	}
	/**
	 * @param clientRole the clientRole to set
	 */
	public void setClientRole(Boolean clientRole) {
		this.clientRole = clientRole;
	}
	/**
	 * @return the containerId
	 */
	public String getContainerId() {
		return containerId;
	}
	/**
	 * @param containerId the containerId to set
	 */
	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}
	
}
