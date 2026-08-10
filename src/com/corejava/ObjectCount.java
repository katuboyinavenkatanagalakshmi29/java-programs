package com.corejava;

public class ObjectCount {
	
	static int count = 0;
	
	public ObjectCount() {
		
		count++;
	}
	

	public static void main(String[] args) {
		
		ObjectCount obj1 = new ObjectCount();
		ObjectCount obj2 = new ObjectCount();
		ObjectCount obj3 = new ObjectCount();
		ObjectCount obj4 = new ObjectCount();
		
		
		System.out.println("Total objects are created :" + ObjectCount.count);
		
		
		

	}

}
