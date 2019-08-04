package com.test.people;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.model.People;

public class PeopleTest {
	static People people;
	
	@BeforeClass
	public static void beforeClassStarts() {
		people = new People();
		//System.out.println(people+"has begun");
	}
	@Before
	public void setUp() {
		System.out.println("------=Before the testing begins=------");
	}
	@After
	public void tearDown() {
		System.out.println("------=after the testing ends=------");
	}
	@AfterClass
	public static void afterClassEnds() {
		System.out.println(people+"has ended");
	}
	
	@Test
	public void gettingAge() {
		System.out.println("in the age test");
		int age = 14;
		people.setAge(age);
		assertEquals("the age is as expected", age, people.getAge());
		assertEquals("the persons age increments", age+1,people.haveBirthday());
	}
	
	@Test
	public void gettingName() {
		String name="joe";
		people.setName(name);
		assertTrue("the name is correct", people.getName().equals(name));
		
	}
	
	@Test
	public void working() {
		String work="the railroad";
		assertNotNull("the work method returns an actual string", people.work(null));
		assertTrue(people.work(work).contains(work));
	}
	
	@Test
	public void differentObjects() {
		People person = new People(20,"Johnson");
		assertFalse("there are two objects", people==person);
	}
		
	
}
