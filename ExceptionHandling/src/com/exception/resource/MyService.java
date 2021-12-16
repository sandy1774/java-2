package com.exception.resource;

public class MyService {
		public int mark() {
		//Object strMark=new String("ninety");
		//Object strMark=new Integer(45);
		Object strMark=Integer.valueOf(45);
		int mark=0;
		try {
			mark = (Integer)strMark;
			
		} catch (RuntimeException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(mark);
		return 0;

	}
	 	public double markWithNestedTryCatch(String markScored) {
	 		Object strMark=Integer.valueOf(45);
		double testScore=0.0;
		int mark=0;
		
		try {
			try {
				mark = (Integer)strMark;
			} catch (ClassCastException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			testScore=Double.parseDouble(markScored);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(mark);
		System.out.println(testScore);
		return 0;
		}
	 	
		

		public double multipleCatch(String markScored) {
	 		Object strMark=Integer.valueOf(45);
		double testScore=0.0;
		int mark=0;
		
		try {
			
				mark = (Integer)strMark;
			   testScore=Double.parseDouble(markScored);
		} catch (NumberFormatException|ClassCastException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(mark);
		return 0;
}
		public String exampleForDeclare(String name)throws NullPointerException {
			
			return name.toUpperCase();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}