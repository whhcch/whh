package com.hwua.entity;

import java.util.Date;
import java.util.List;

/**
 * Orders(订单表)
 * 
 * @author oracleOAEC
 *
 */
public class Orders {
	private Integer oid;// 订单编号
	private Users user_id;// 下单用户
	private String number;// 订单号
	private Date createtime;// 创建订单时间
	private String note;// 备注
	private List<Orderdetail> OrderdetailList;// 订单详情集合

	public Orders() {
		super();
	}

	public Orders(Integer oid, Users user_id, String number, Date createtime, String note) {
		super();
		this.oid = oid;
		this.user_id = user_id;
		this.number = number;
		this.createtime = createtime;
		this.note = note;
	}

	public Orders(Integer oid, Users user_id, String number, Date createtime, String note,
			List<Orderdetail> orderdetailList) {
		super();
		this.oid = oid;
		this.user_id = user_id;
		this.number = number;
		this.createtime = createtime;
		this.note = note;
		OrderdetailList = orderdetailList;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Users getUser_id() {
		return user_id;
	}

	public void setUser_id(Users user_id) {
		this.user_id = user_id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Orderdetail> getOrderdetailList() {
		return OrderdetailList;
	}

	public void setOrderdetailList(List<Orderdetail> orderdetailList) {
		OrderdetailList = orderdetailList;
	}

}
