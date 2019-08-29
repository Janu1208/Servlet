package com.revature.week3.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.revature.week3.controller.ConnectionUtil;

public class UserDAO {
	 public boolean login(String email, String password) {
	        boolean isValidLogin = false;
	        Connection con=null;
	        PreparedStatement pst=null;
		try {
			 con = ConnectionUtil.getConnection();
			String sql = "select * from users where email=? and password=?";
			pst = con.prepareStatement(sql);
			
			pst.setString(1, email);
			pst.setString(2, password);
			
		 ResultSet rs=pst.executeQuery();
		 if(rs.next())
		 {
			 isValidLogin=true;
		 }
		} catch (Exception e) {
			e.printStackTrace();
		}
   
	        return isValidLogin;
	 }
}
