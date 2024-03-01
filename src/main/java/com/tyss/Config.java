package com.tyss;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tyss")
public class Config {
	@Bean
	public ArrayList subjects() {
		ArrayList a1= new ArrayList();
		a1.add("maths");
		a1.add("english");
		a1.add("science");
		a1.add("social");
		a1.add("telugu");
		a1.add("hindi");
		return a1;
	}
}
