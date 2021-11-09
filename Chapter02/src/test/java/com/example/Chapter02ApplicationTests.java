package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

import com.example.controller.BoardController;

@SpringBootTest(classes=BoardController.class, properties= {"author.name=Gurum","author.age=45","author.nation=Korea"})
class Chapter02ApplicationTests {
	
	@Autowired
	Environment environmont;

	@Test
	public void testMethod() {
		System.out.println("이름 : " + environmont.getProperty("author.name"));
		System.out.println("나이 : " + environmont.getProperty("author.age"));
		System.out.println("국가 : " + environmont.getProperty("author.nation"));
	}

}
