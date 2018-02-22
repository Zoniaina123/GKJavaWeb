package com.formation.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
	private Date d;
	
	public DataUtil() {
		d = new Date();
	}
	
	public Date getD() {
		return d;
	}
	
	public String getCurrentDate() {
	 String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(d);

		return date;
	}

	@Override
	public String toString() {
		return " " + getCurrentDate() ;
	}
	
	
}