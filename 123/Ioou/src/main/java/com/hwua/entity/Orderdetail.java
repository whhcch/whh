package com.hwua.entity;

/**
 * Orderdetail(订单详情表)
 * 
 * @author oracleOAEC
 *
 */
public class Orderdetail {
	private Integer did; // 订单详情编号
	private Orders orders; // 订单对象
	private Items items;// 商品对象
	private Integer items_num;// 商品购买数量

	public Orderdetail() {
		super();
	}

	public Orderdetail(Integer did, Orders orders, Items items, Integer items_num) {
		super();
		this.did = did;
		this.orders = orders;
		this.items = items;
		this.items_num = items_num;
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public Integer getItems_num() {
		return items_num;
	}

	public void setItems_num(Integer items_num) {
		this.items_num = items_num;
	}

}
