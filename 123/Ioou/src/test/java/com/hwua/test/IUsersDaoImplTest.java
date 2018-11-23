package com.hwua.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.hwua.dao.IUsersDao;
import com.hwua.dao.impl.IUsersDaoImpl;
import com.hwua.entity.Orders;
import com.hwua.entity.Users;
import com.hwua.util.DateSS;

public class IUsersDaoImplTest {

	@Test
	public void testGetAllUsers() {
		IUsersDao udao = new IUsersDaoImpl();
		List<Users> ulist = udao.getAllUsers();
		for (Users user : ulist) {
			System.out.println("ID:"+user.getUid() + "\tusername:" + user.getUname());
			for (Orders or : user.getOrdersList()) {
				System.out.println("OID:"+or.getOid()+"\tcteatetime:"+DateSS.dateHMSToString(or.getCreatetime())+"\tnumber:"+or.getNumber());
			}
		}
	}

	@Test
	public void testGetUsersByUid() {
		IUsersDao udao = new IUsersDaoImpl();
		Users user = udao.getUsersByUid(10);
		System.out.println(user.getUid()+"\t"+user.getUname()+"\t"+DateSS.dateHMSToString(user.getBirthday())+"\t"+user.getSex()+"\t"+user.getAddress());
	}

	@Test
	public void testAddUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditUsers() {
		fail("Not yet implemented");
	}

}
