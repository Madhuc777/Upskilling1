package com.cg.StudentsDatas;

import com.cg.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentsDatasApplicationTests {

	@Test
	void contextLoads() {
		String name = "Reddy";
		int age = 23;
		int salary = 50000;

		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setSalary(salary);

		assertEquals(name, student.getName());
		assertEquals(age, student.getAge());
		assertEquals(salary, student.getSalary());
	}
	}


