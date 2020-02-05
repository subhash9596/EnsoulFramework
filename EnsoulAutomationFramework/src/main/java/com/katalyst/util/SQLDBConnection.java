package com.katalyst.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDBConnection{

	public static ResultSet getMyConnectionTS(String Sql_Query, String Object) throws Exception {
		Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:jtds:sqlserver://13.232.245.39:50527;instanceName=KT_WMS_DEV;databasename=Celero_QA_SUManagementTest;user=CeleroQA;password=@J6qmZ%t;trustServerCertificate=true;encrypt=false;authentication=SqlPassword");
			if(con != null)
			{
				Statement stmt = con.createStatement();
				rs = stmt.executeQuery(Sql_Query);	
			}
			else
			{
				System.out.println("Fail to connect DB " + con);
			}

		} catch (SQLException e) {
			if(e.getMessage().contains("Cannot insert duplicate key"))
			{
				Reports.passTest(Object);
				System.out.println("Your trying to add duplicate data, please insert valid data");
			}
			else
			{
				Reports.failTest(Object);
				System.out.println(e.getMessage());
			}
		}
		return rs;
	}
}
