package com.google.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Firstclass {
	
	
	@BeforeClass
	public static void sample1 () {
		
		System.out.println("befor class");
		
	}
	@AfterClass
public static void sample2 () {
		
		System.out.println("After class");
		
	}

@Before
public  void sample3 () {
	
	System.out.println("Before");
	
}
@After
public  void sample4 () {
	
	System.out.println("After");
	
}
@Before
public  void sample5 () {
	
	System.out.println("Before");
	
}
	@Test
	public void sample6 () {
		
		System.out.println("i'm second");
	}
		@Test
		public void sample7 () {
			
			System.out.println("i'm Third");
		}
			@Test 
			//@Ignore
			public void sample8 () {
				
				System.out.println("I'm Last");
			
}

}
