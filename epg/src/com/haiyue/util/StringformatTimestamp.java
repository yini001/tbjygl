package com.haiyue.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class StringformatTimestamp {
	//String to Timestamp
	public static Timestamp formatString(String st){
			return Timestamp.valueOf(st);
	} 
	
	
	//Timestamp to String
	public static String formatTimestamp(Timestamp ts){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(ts);	
	}
	
}
