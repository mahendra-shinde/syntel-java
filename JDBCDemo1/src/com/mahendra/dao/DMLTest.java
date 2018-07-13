package com.mahendra.dao;

import java.sql.*;
import java.util.Calendar;

public class DMLTest {

	public static void main(String[] args) {
		
		Connection con = ConnectionUtil.getConnection();
		String sql = "INSERT into MEMBERS (member_id, first_name, last_name, dob, gender) VALUES(?,?,?,?,?)";

		try(PreparedStatement st = con.prepareStatement(sql)){
			con.setAutoCommit(false);//Enable Transactions
			st.setInt(1, 1);
			st.setString(2, "Neil");
			st.setString(3, "Armstrong");
			Calendar c = Calendar.getInstance();
			c.set(1942, 03, 20); 
			st.setDate(4,new java.sql.Date(c.getTimeInMillis()));
			st.setString(5, "M");
			
			int r = st.executeUpdate();
			con.commit();//save the changes
			System.out.println("Records created : "+r);
		}catch(SQLException ex) {
			try {
				con.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ex.printStackTrace();
		}
	
	}

}
