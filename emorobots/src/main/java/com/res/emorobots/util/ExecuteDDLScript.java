package com.res.emorobots.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.Statement;

public class ExecuteDDLScript {

	
/**
 * 
 */
	public static 	boolean generateDDL(Connection c, File f,String regex) throws Exception {

		int index = 0;
		int veridx = 0;
		String rgx  = regex;
		String line = null;
		StringReader strread = null;
		BufferedReader bur = null;
		StringBuffer buf = null;
		boolean appending = false;
		int res = -1;

	

			bur =new BufferedReader( new FileReader(f));

			line = bur.readLine();

			while(line!=null ) {

				if(line.trim().length()>0) {

					String[]sa = line.trim().split(regex);

					if(sa[1] != null && sa[1].length()>0) {
						//veridx = Integer.valueOf(sa[1].substring(sa[1].lastIndexOf('-')+1));
						
						if(buf.length()>0 &&
							executeDDL(c, buf.toString(),veridx)) {
							index ++;
							veridx = index;
							buf = new StringBuffer();


						}else if(index==0)
							buf = new StringBuffer();
					}			

					line = bur.readLine();
					if(line==null ) {
						if(buf.length()>0		&&	executeDDL(c, buf.toString(),veridx)) 
							index ++;
			        	break;
					}

				/*	byte[] b = line.trim().getBytes("utf-8");

				   if(b!=null && b.length>0) {
					   for(int i=0;i<b.length;i++) []
						   if((b[i] ==';' || b[i] == '\n')
							    b[i] = ' ';
					*/	   
					String trimed = line.trim();
					trimed = trimed.substring(0, trimed.lastIndexOf('\n'));
					trimed = trimed.substring(0, trimed.lastIndexOf(';'));
					   
					buf.append(trimed);
				   
				}
							
			}

				
            if(buf.length()>0		&&	executeDDL(c, buf.toString(),veridx)) 
				index ++;
				
	
    		return (index>=veridx);
    		
		}
	
	

 static boolean executeDDL(Connection c, String ddl, int verif) throws Exception {
	 boolean r;
	 try {
			Statement s = c.createStatement();
			r = s.execute(ddl);
		}catch(Exception ex) {
			Exception ex1 = new Exception("Failed at"+verif ,(Throwable)ex);
			ex.printStackTrace();
			throw ex1;
		}

	 return r;
 
 }






}