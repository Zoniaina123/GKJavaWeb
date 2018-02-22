package com.formation.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
	private Date d;
	
	public DataUtil() {
		Date d = new Date();
	}
	
	public Date getD() {
		return d;
	}
	
	public String getCurrentDate() {
	 String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(getD());
		
		return date;
	}
	
}
