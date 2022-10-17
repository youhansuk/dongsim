package com.exam.dongsim;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class test2 {

		private static final String DRIVER = "com.mysql.jdbc.Driver";
		private static final String URL = "jdbc:mysql://118.217.180.135:3306/dongsim_new";
		private static final String USER = "dongsimkids";
		private static final String PW = "ds191121)($%";
		
		@Test
		public void testConnection() throws Exception {
			Class.forName(DRIVER);
			
		try	(Connection connection = DriverManager.getConnection(URL,USER,PW)) {
				System.out.println("성공");
			} catch (Exception e) {
				System.out.println("실패");
				e.printStackTrace();
			}
		}
}