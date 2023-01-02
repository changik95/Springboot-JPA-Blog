package address.vo;

import java.io.Serializable;

//1명에 대한 정보 저장
public class AddressVO implements Serializable{
	
	private static final long serialVersionUID = 439299235899692160L;
	
	String name;	//이름
	String phone;	//전화번호
	String email;	//이메일주소
	
	public AddressVO() {
	}
		
	public AddressVO(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AddressVO [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
}
