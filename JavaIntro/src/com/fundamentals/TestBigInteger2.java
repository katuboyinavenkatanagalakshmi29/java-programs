package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;


public class TestBigInteger2 {
	
	
	public static void main(String[] args) {
		

		BigInteger a = new BigInteger("100000000");
		BigInteger b = new BigInteger("2000000000");
		
		
		BigDecimal x = new BigDecimal("500.50");
		
		BigDecimal 	y = new BigDecimal("500.50");
		
		System.out.println(a.add(b));
		
		System.out.println(x.add(y));
		
	}

}
