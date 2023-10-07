package com.springguru.spring6di;

import com.springguru.spring6di.controllers.MyController;
import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring6diApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController(){
		System.out.println(myController.sayHello());
	}
	@Test
	void testController() {
		MyController controller = (MyController) applicationContext.getBean("myController");
		System.out.println(controller.sayHello());
	}
	@Test
	void contextLoads() {
	}

}
