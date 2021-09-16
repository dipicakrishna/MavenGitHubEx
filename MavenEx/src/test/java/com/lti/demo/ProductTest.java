
package com.lti.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
  
	@Test 
	void test()
	{
		Product p=new Product(1,"eraser",2000);
		Assertions.assertEquals("DMART",p.getCompanyName());
	}
}