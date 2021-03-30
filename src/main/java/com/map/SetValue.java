package com.map;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Util.DbConnection;

public class SetValue {
	public static void DpFunction() throws SQLException {
		//System.out.println("Successfull");
		//DbConnection.getConnection();
		Connection connection=DbConnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery("Select *from location");
		int s=0;
		while(result.next()) {
			String x=result.getString(1);
			String y=result.getString(2);
			FetchValue.setXvalue(x);
			FetchValue.setYvalue(y);
			s=s+1;
		}
		System.out.println(s);
		FetchValue.setSize(s);
	}
}
//Double.parseDouble