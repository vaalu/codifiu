/**
 * 
 */
package in.codifi.app.auth.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author mohup
 *
 */
public class CodifiUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String phone;
	
	private String email;
	
	private String mpin;
	
	private String status;
	
	private String otp;
	
	private List<CodifiMessage> info = new ArrayList<>();
	
	@JsonIgnore
	private boolean valid;

	public CodifiUser() {
	}
	
	public CodifiUser(CodifiAuthUser entity) {
		this.email = entity.getEmail();
	}
	
	public int addMessage(CodifiMessage message) {
		info.add(message);
		return info.size();
	}
	
	
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the otp
	 */
	public String getOtp() {
		return otp;
	}

	/**
	 * @param otp the otp to set
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	/**
	 * @return the info
	 */
	public List<CodifiMessage> getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(List<CodifiMessage> info) {
		this.info = info;
	}

	/**
	 * @return the mpin
	 */
	public String getMpin() {
		return mpin;
	}

	/**
	 * @param mpin the mpin to set
	 */
	public void setMpin(String mpin) {
		this.mpin = mpin;
	}
	
}
