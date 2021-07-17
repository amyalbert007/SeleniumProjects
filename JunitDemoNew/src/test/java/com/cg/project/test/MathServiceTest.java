package com.cg.project.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.project.exceptions.InValidNumberRangeException;
import com.cg.project.services.MathService;
import com.cg.project.services.MathServiceImpl;
public class MathServiceTest {
    private static MathService service ;

	
	
	//@Before annotation base method will be executed by Junit framework before every test cases	
	@Before
	public void setUpTestMockDataEnv(){
	}

	@Test(expected = InValidNumberRangeException.class)
	public void testAddForFirstNumberInvalid() throws InValidNumberRangeException {
		int  firstInvalidNo = -102;
		int secondNo =373; 
		service.add(firstInvalidNo, secondNo);
	}
	
	@Test(expected = InValidNumberRangeException.class)
	public void testAddForSecondNumberInvalid() throws InValidNumberRangeException {
		int  firstNo = 102;
		int secondNoInvalid = -373; 
		service.add(firstNo, secondNoInvalid);
	}
	
	@Test
	public void testAddForBothNumberValid() throws InValidNumberRangeException {
		int  firstNo = 100;
		int secondNo =200; 
		int expectedAns=300;
		int actualAns=service.add(firstNo, secondNo);
		
		Assert.assertEquals(expectedAns, actualAns);
		//Assert.assertNotEquals(expectedAns, actualAns);
		//Assert.assertNotNull(actualAns);
		//Assert.assertNotSame(expectedAns, actualAns);
	}
	
	//@After annotation base method will be executed by Junit framework after  every test cases		
	@After
	public void tearDownMockDataEnv(){
		
	}
	

	//@AfterClass annotation base method will be executed by Junit framework "only once after all test cases"
	//method must be declare static 
	@AfterClass
	public static void tearDownTestEnv(){
		service= null;
	}
	
	//@BeforeClass annotation base method will be executed by Junit framework "only once before all test cases"
		//method must be declare static 
		@BeforeClass	
		public static void setUpTestEnv(){
			service = new MathServiceImpl();
		}

}
