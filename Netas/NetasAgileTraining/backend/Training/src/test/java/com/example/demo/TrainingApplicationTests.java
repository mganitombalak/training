package com.example.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainingApplicationTests {

	@Before
	public void Setup(){
		System.out.println("Before");
	}

	@Test
	public void ShouldCate() {
	}

	@After
	public void TearDown(){

	}

}
