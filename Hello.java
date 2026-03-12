package com.prince;

public class Hello { 
A aobj; //S.I 
B bobj; //C.I 
static { 
System.out.println("Hello - S.B"); 
} 
public Hello(B bobj) { 
System.out.println("Hello(B) - 1arg"); 
this.bobj = bobj; 
} 
public void setAobj(A aobj) { 
System.out.println("Hello-setAobj()"); 
this.aobj = aobj; 
} 
public void show() { 
	 System.out.println("Hello-show()"); 
	 System.out.println(aobj); 
	 System.out.println(bobj); 
	} 
	} 