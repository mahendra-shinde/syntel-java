package com.mahendra.dao;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
	public static void main(String[] args) {
		
		try {
			RowSetFactory factory = RowSetProvider.newFactory();
			JdbcRowSet set = factory.createJdbcRowSet();
			set.setUrl("jdbc:oracle:thin:@192.168.56.204:1521/xe");
			set.setPassword("hr");
			set.setUsername("hr");
			set.setCommand("select * from emp");
			set.execute();
			while(set.next()) {
				System.out.println(set.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
