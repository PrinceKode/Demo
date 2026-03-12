package com.prince;

public class B {
	int b;
	String str;
	static {
		System.out.println("B-s.B");
	}

	public B(int  b,String str) {
		System.out.println("B-2arg");
		this.b=b;
		this.str=str;
	}
	public String toString() {
		return ""+b+"\t"+str;
	}

}
