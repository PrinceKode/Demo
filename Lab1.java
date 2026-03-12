package com.prince;

public class Lab1 {
	public static void main(String agr[]) {
		A ao=new A();
		ao.setA(10);
		ao.setMsg("prince");
		
		B bo=new B(102,"I am prince");
		
		Hello h=new Hello(bo);
		h.setAobj(ao);
		h.show();
	}
	

}
