package com.operators;

public class Unary {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		
		System.out.println(+a);// -5 Unary +
		System.out.println(-b);// -6 Unary -
		
		System.out.println(++a);// a => a + 1 = 6
		System.out.println(--b);// b => b - 1 = 5
		System.out.println(a++);//6 a => a+1 = (7) ---> internal 
		System.out.println(b--);//5 b => b-1 = (4) ---> internal
		
		System.out.println(++a);// 8
		System.out.println(b--);// 3
		System.out.println(a++);// 8--> 9
		System.out.println(b++);// 3--> 4
		System.out.println(++b);// 5
	
		
		System.out.println(--a);// 8
		System.out.println(++b);// 6
		System.out.println(b--);// 6
		System.out.println(--a);// 7
		System.out.println(a--);// 7-->6
		System.out.println(b++);// 5-->6
		
		
		System.out.println("A value :"+ a);	System.out.println("B value :"+ b);
		
		System.out.println(++a + b++ + a-- + b--);// 27 (7 + 6--> 7 + 7 + 7)
		

		System.out.println("A value :"+ a);//6
		System.out.println("B value :"+ b);//6
		
		System.out.println(a++ + ++b + a-- + b++ + ++a + b++); // 6 --> 7 + 7 + 6 + 7-->8 + 7 + 9 = 42
		
		System.out.println("A value :"+ a);
		System.out.println("B value :"+ b);
		 
	}

}
