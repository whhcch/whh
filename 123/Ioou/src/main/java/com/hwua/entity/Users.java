package com.hwua.entity;

import java.util.Date;
import java.util.List;

/**
 * Users(用户表)
 * 
 * @author oracleOAEC
 *
 */
public class Users {
	private Integer uid; // 用户编号
	private String uname;// 用户名称
	private Date birthday;// 生日
	private String sex;// 性别
	private String address;// 地址
	private List<Orders> ordersList;// 订单集合

	public Users() {
		super();
	}

	public Users(Integer uid, String uname, Date birthday, String sex, String address) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.birthday = birthday;
		this.sex = sex;
		this.address = address;
	}

	public Users(Integer uid, String uname, Date birthday, String sex, String address, List<Orders> ordersList) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.birthday = birthday;
		this.sex = sex;
		this.address = address;
		this.ordersList = ordersList;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

}
