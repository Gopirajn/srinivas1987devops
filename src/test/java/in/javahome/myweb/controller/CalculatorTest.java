package in.javahome.myweb.controller;
import in.javahome.myweb.controller.Calculator;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();
	public void testAdd(){
		Assert.assertEquals(cal.add(10, 20), 30);
	}
	public void testMultiply(){
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
}
