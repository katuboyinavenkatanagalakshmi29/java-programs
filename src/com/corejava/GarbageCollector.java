package com.corejava;

public class GarbageCollector {
	
	GarbageCollector ref;
	
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
		
	}
	
	static void display() {
		GarbageCollector g3 = new GarbageCollector();
	}

	public static void main(String[] args) {

		
		GarbageCollector g1 = new GarbageCollector();
		GarbageCollector g2 = new GarbageCollector();
		GarbageCollector g3 = new GarbageCollector();
		
		
		System.out.println(g1);
		System.out.println(g2);
        System.out.println(g3);
		
		// Nullifying 
		g1 = null;
		
		// Re - Assigning
		g2 = g1;
		// Anonymous Object
		
		new GarbageCollector();
		
		// Method inside Object 
		
		display();
		
		// island of isolation
		
		GarbageCollector g4 = new GarbageCollector();
		GarbageCollector g5 = new GarbageCollector();
		
		g4.ref = g5;
		g5.ref = g4;
		
		g4 = null;
		g5 = null;
		
		System.gc();
		
		
	
	}

}
