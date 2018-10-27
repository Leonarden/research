package com.res.emorobot.db;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.res.emorobots.util.ExecuteDDLScript;

public class DerbyInitTest {

	String scriptN =  "/home/david/.wrk/devenv-A/git/research/emorobots/src/main/resources/sql/temp.sql";
	@Test
	public void test() {
		boolean r = false;
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver"); 


			Connection conn =  DriverManager.getConnection("jdbc:derby:emorobots;create=true","c3po","ok");

			 r = ExecuteDDLScript.generateDDL(conn, new File(scriptN),  new String("#+-TOKEN-"));

			System.out.println("DDL executed correctly :" + r );
		}catch(Exception ex) {
		
			Exception ex1 = new Exception("Error at " + r,ex);
		
			ex1.printStackTrace(System.err);
		}
	}

}