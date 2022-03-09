package com.ustc.action.student;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class StudentForm extends ActionForm
{
	public String stuID;//ѧ��
	public String username;//����
	public String gender;//�Ա�
	public String city;//����
	public String phone;//��ϵ�绰
	public String email;//��������
	public String postID;//��������
	public String address;//ͨѶ��ַ
	public String identityID;//���֤��
	
	/**
	 * @return Returns the address.
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address The address to set.
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return Returns the city.
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city The city to set.
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return Returns the email.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email The email to set.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return Returns the gender.
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender The gender to set.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return Returns the phone.
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone The phone to set.
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return Returns the postID.
	 */
	public String getPostID() {
		return postID;
	}
	/**
	 * @param postID The postID to set.
	 */
	public void setPostID(String postID) {
		this.postID = postID;
	}
	/**
	 * @return Returns the stuID.
	 */
	public String getStuID() {
		return stuID;
	}
	/**
	 * @param stuID The stuID to set.
	 */
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	/**
	 * @return Returns the username.
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username The username to set.
	 */
	public void setUsername(String username) {
		this.username = username;
	}
    public void reset(ActionMapping actionMapping,
            HttpServletRequest httpServletRequest) {    	
    	stuID = "";//ѧ��
    	username = "";//����
    	gender = "";//�Ա�
    	city = "";//����
    	identityID = "";//���֤��
    	phone = "";//��ϵ�绰
    	email = "";//��������
    	postID = "";//��������
    	address = "";//ͨѶ��ַ
    }
    
    public String getIdentityID() {
        return identityID;
    }
    public void setIdentityID(String identityID) {
        this.identityID = identityID;
    }

}