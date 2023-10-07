package com.springguru.spring6di;

import com.springguru.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6diApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6diApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In Main Method");

		System.out.println(controller.sayHello());
	}

}
