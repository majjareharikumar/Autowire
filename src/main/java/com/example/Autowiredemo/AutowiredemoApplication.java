package com.example.Autowiredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AutowiredemoApplication {

	public static void main(String[] args) {
		ApplicationContext apc =new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=apc.getBean("emp", Employee.class);

		emp.ishike();
	}

}
