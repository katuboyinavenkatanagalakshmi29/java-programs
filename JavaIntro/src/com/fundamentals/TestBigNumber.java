package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;


public class TestBigNumber {

	public static void main(String[] args) {
		
		BigInteger a = new BigInteger("1000000000000");
		BigInteger b = new BigInteger("2000000000000");
		
		BigDecimal x = new BigDecimal("100.50");
		BigDecimal y = new BigDecimal("200.50");
		
		System.out.println("BigInteger :"+ a.add(b));
		System.out.println("BigDecimal :"+ x.add(y));
	}

}
