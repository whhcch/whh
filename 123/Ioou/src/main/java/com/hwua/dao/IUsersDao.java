package com.hwua.dao;

import java.util.List;

import com.hwua.entity.Users;

public interface IUsersDao {

	/**
	 * 查询所有用户信息(订单信息)
	 * 
	 * @return 所有用户信息(订单信息)
	 */
	public List<Users> getAllUsers();

	/**
	 * 通过uid查询用户信息(订单信息)
	 * 
	 * @param uid
	 *            用户编号
	 * @return 用户信息(订单信息)
	 */
	public Users getUsersByUid(Integer uid);

	/**
	 * 添加用户
	 * 
	 * @param user
	 *            用户对象
	 * @return 受影响的行数大于等于1表示成功 受影响的行数等于小于0表示失败
	 */
	public int addUsers(Users user);

	/**
	 * 删除用户
	 * 
	 * @param uid
	 *            用户ID
	 * @return 受影响的行数大于等于1表示成功 受影响的行数等于小于0表示失败
	 */
	public int delUsers(Integer uid);

	/**
	 * 修改用户
	 * 
	 * @param user
	 *            用户对象
	 * @return 受影响的行数大于等于1表示成功 受影响的行数等于小于0表示失败
	 */
	public int editUsers(Users user);

}
