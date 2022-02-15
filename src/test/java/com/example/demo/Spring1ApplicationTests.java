package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class Spring1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void printBeans() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Spring1Application.class);

		System.out.println("[BEANS]");

		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		System.out.println("[END OF BEANS]");
	}

}
