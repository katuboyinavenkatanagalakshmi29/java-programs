package com.fundamentals;

public class ObjectCount {
	
	static int count = 0;
	
	ObjectCount (){
		count++;
	}		
		
	
	
	
		
		public static void main(String[] args) {
			
			 ObjectCount c1 = new  ObjectCount();
			 ObjectCount c2 = new  ObjectCount();
			 ObjectCount c3 = new  ObjectCount();
			 
			System.out.println("Object Count :"+ count);
			 
			 
			 
			
		}
		
		
}
