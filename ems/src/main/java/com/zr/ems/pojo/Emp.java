package com.zr.ems.pojo;

import java.io.Serializable;

/**
 *  µÃÂ¿‡
 *
 */
@SuppressWarnings("serial")
public class Emp implements Serializable {

	private Integer id;
	private String nickname;
	private String password;
	private String gender;
	private String email;

	public Emp() {
	}

	public Emp(Integer id, String nickname, String password, String gender, String email) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.password = password;
		this.gender = gender;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setSalary(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", nickname=" + nickname + ", password=" + password + ", gender=" + gender
				+ ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

}
