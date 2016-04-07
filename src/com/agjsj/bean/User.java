package com.agjsj.bean;


/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String userName;
	private String userPsw;
	private Integer userSex;
	private String userPhone;
	private String userEmail;
	private String userBirthdate;
	private String userAddress;
	private String userAddressinfo;
	private String userIcon;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String userPsw, Integer userSex,
			String userPhone) {
		this.userName = userName;
		this.userPsw = userPsw;
		this.userSex = userSex;
		this.userPhone = userPhone;
	}

	/** full constructor */
	public User(String userName, String userPsw, Integer userSex,
			String userPhone, String userEmail, String userBirthdate,
			String userAddress, String userAddressinfo, String userIcon) {
		this.userName = userName;
		this.userPsw = userPsw;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userBirthdate = userBirthdate;
		this.userAddress = userAddress;
		this.userAddressinfo = userAddressinfo;
		this.userIcon = userIcon;
	}

	// Property accessors

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPsw() {
		return this.userPsw;
	}

	public void setUserPsw(String userPsw) {
		this.userPsw = userPsw;
	}

	public Integer getUserSex() {
		return this.userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserBirthdate() {
		return this.userBirthdate;
	}

	public void setUserBirthdate(String userBirthdate) {
		this.userBirthdate = userBirthdate;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserAddressinfo() {
		return this.userAddressinfo;
	}

	public void setUserAddressinfo(String userAddressinfo) {
		this.userAddressinfo = userAddressinfo;
	}

	public String getUserIcon() {
		return this.userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPsw=" + userPsw
				+ ", userSex=" + userSex + ", userPhone=" + userPhone
				+ ", userEmail=" + userEmail + ", userBirthdate="
				+ userBirthdate + ", userAddress=" + userAddress
				+ ", userAddressinfo=" + userAddressinfo + ", userIcon="
				+ userIcon + "]";
	}

}