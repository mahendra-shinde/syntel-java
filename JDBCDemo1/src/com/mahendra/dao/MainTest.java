package com.mahendra.dao;

import java.sql.*;

public class MainTest {

	private static final String SQL="select country_id, country_name, region_id from countries";
	
	public static void main(String[] args) {
		Connection con = ConnectionUtil.getConnection();
		if(con!=null) {
			//print database product name
			try {
				System.out.println(con.getMetaData().getDatabaseProductName());
				
				try(Statement st = con.createStatement()){
				ResultSet rs = st.executeQuery(SQL);
				
				ResultSetMetaData metaData = rs.getMetaData();
				System.out.println("Columns in resultset : "+metaData.getColumnCount());
				
				for (int i=1;i<=metaData.getColumnCount();i++) {
					System.out.println(metaData.getColumnName(i)+" "+ metaData.getColumnTypeName(i));
				}
				
				while(rs.next()) {
					String id = rs.getString("country_id");
					String name = rs.getString("country_name");
					int region = rs.getInt("region_id");
					System.out.println("Country details: "+id+" "+name+" "+region);
				}
				}
				
				//Close connection once its done
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
