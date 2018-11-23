package com.hwua.entity;

import java.util.Date;
import java.util.List;

/**
 * Items(商品表)
 * 
 * @author oracleOAEC
 *
 */
public class Items {
	private Integer pid;// 商品编号
	private String name;// 商品名称
	private Float price;// 商品价格
	private String detail;// 商品描述
	private String pic;// 商品图片
	private Date createtime;// 生产日期
	private List<Orderdetail> OrderdetailList;// 订单详情集合

	public Items() {
		super();
	}

	public Items(Integer pid, String name, Float price, String detail, String pic, Date createtime) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.pic = pic;
		this.createtime = createtime;
	}

	public Items(Integer pid, String name, Float price, String detail, String pic, Date createtime,
			List<Orderdetail> orderdetailList) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.detail = detail;
		this.pic = pic;
		this.createtime = createtime;
		OrderdetailList = orderdetailList;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public List<Orderdetail> getOrderdetailList() {
		return OrderdetailList;
	}

	public void setOrderdetailList(List<Orderdetail> orderdetailList) {
		OrderdetailList = orderdetailList;
	}

}
