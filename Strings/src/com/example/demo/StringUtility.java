package com.example.demo;

public class StringUtility {
	
	
	public static String getSubString(String arg, int start,int end) {
		
		return arg.substring(start,end);
		
	}
	//overloaded method
public static String getSubString(String arg, int start) {
		
		return arg.substring(start);
		
	}
	public static boolean checkContains(String arg, String srchChar) {
		
		return arg.contains(srchChar);
		
	}
public static int checkPositionOfChar(String arg, char srchChar) {
		return arg.indexOf(srchChar);
		
	}
public static String joinTwoStrings(String str1, String str2) {
	return str1.concat(str2);
	
}
public static String replaceString(String originalString, String replaceString) {
     return originalString.replaceAll(originalString, replaceString);
}

public static String[] splitString(String str, String delim) {
	return str.split(delim);
}

public static String toLowerCase(String str) {
	return str.toLowerCase();
}
 public static String trimMethod(String str) {
	 return str.trim();
	 
 }
 
}
