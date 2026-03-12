package com.prince;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public A createA() {
		A ao=new A();
		ao.setA(11);
		ao.setMsg("Raja");
		return ao;
	}
	@Bean
	public B createB() {
		B bo=new B(101,"I am Rama");
		return bo;
	}
	@Bean
	public Hello createHello(A ao,B bo) {
	Hello h=new Hello(bo);
	h.setAobj(ao);
	return h;
		
		
	}

}
