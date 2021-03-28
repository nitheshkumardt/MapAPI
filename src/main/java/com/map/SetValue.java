package com.map;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Util.DbConnection;

public class SetValue {
	public static void DpFunction() throws SQLException {
		//System.out.println("Successfull");
		DbConnection.getConnection();
		Connection connection=DbConnection.getConnection();
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery("Select *from location");
		while(result.next()) {
			double x=Double.parseDouble(result.getString(1));
			double y=Double.parseDouble(result.getString(2));
			FetchValue.setXvalue(x);
			FetchValue.setYvalue(y);
		}
	}
}
