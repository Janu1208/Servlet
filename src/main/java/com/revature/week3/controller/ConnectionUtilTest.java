package com.revature.week3.controller;


import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;
public class ConnectionUtilTest {
	 @Test
	    public void testConnection() {
	        Connection connection = ConnectionUtil.getConnection();
	        assertNotNull(connection);
}
}