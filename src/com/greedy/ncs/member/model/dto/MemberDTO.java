package com.greedy.ncs.member.model.dto;

import java.util.Date;

public class MemberDTO {
	
	private int memberNo;

	private String id;
	private String password;
	private String name;
	private java.util.Date date;
	private double height;
	private double weight;
	private boolean isActivity;
	
	public MemberDTO() {}
	
	public MemberDTO(int memberNo, String id, String password, String name
						, Date date, double height, double weight,
							boolean isActivity) {
		super();
		this.memberNo = memberNo;
		this.id = id;
		this.password = password;
		this.name = name;
		this.date = date;
		this.height = height;
		this.weight = weight;
		this.isActivity = isActivity;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isActivity() {
		return isActivity;
	}

	public void setActivity(boolean isActivity) {
		this.isActivity = isActivity;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", id=" + id 
				+ ", password=" + password + ", name=" + name
				+ ", date=" + date + ", height=" + height 
				+ ", weight=" + weight + ", isActivity=" + isActivity + "]";
	}
	

}
