package com.example.demo;

public class Application {

	public static void main(String[] args) {
		String bestCity="chennai";
		String prefCity="chennai";
		
		System.out.println("using (==) ->" +  (bestCity==prefCity));
		
		System.out.println("using dot.equals->"+ bestCity.equals(prefCity));
		
		String greatCity=prefCity;
		
		System.out.println("using (==) for comparing->" +  (greatCity==prefCity));
		System.out.println("using dot.equals for comparing-> "+ greatCity.equals(prefCity));
		
		System.out.println("<--------using String object------->");
		String bestCityObj=new String("chennai");
		String prefCityObj=new String("chennai");
		
		System.out.println("using (==) ->" +  (bestCityObj==prefCityObj));
		System.out.println("using dot.equals->"+ bestCityObj.equals(prefCityObj));
		
		StringUtility stringUtility=new StringUtility();
		System.out.println(stringUtility.getSubString("hi brother", 7));
		System.out.println(stringUtility.checkContains("hello", "s"));
		System.out.println(stringUtility.checkPositionOfChar("hello", 'e'));
		System.out.println(stringUtility.joinTwoStrings("hi", "hello"));
		System.out.println(stringUtility.replaceString("hi", "hello"));
		System.out.println(stringUtility.toLowerCase("HELLO"));
		System.out.println(stringUtility.trimMethod( "                    yy"));
		
		
		
		//String list="suresh:ramesh:viki";
		
//		String[] values=stringUtility.splitString(list,":");
//		
//		for(String eachString: values) {
//			System.out.println(eachString);
//		}
		
	}

}
