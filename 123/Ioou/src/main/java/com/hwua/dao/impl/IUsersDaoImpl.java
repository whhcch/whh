package com.hwua.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hwua.dao.IUsersDao;
import com.hwua.entity.Users;
import com.hwua.util.MyBatisUtils;

public class IUsersDaoImpl implements IUsersDao {

	public List<Users> getAllUsers() {
		SqlSession session = MyBatisUtils.openSqlSession();
		IUsersDao udao = session.getMapper(IUsersDao.class);
		List<Users> ulist = udao.getAllUsers();
		MyBatisUtils.closeSqlSession();
		return ulist;
	}

	public Users getUsersByUid(Integer uid) {
		SqlSession session = MyBatisUtils.openSqlSession();
		IUsersDao udao = session.getMapper(IUsersDao.class);
		Users user = udao.getUsersByUid(uid);
		MyBatisUtils.closeSqlSession();
		return user;
	}

	public int addUsers(Users user) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delUsers(Integer uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int editUsers(Users user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
