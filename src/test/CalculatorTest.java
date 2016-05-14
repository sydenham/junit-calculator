package test;

import main.Calculator;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("Metoda testowa");
		double a = 4.0;
		double b = 7.5;
		
		double wynik = classUnderTest.sum(a,  b);
		
		assertEquals(11.5, wynik, 0.001);
		
	}
	@Test
	public void testSumowanieTrzech() throws Exception {
		double a = 1.0;
		double b = 2.0;
		double c = 1.33;
		
		double wynik = classUnderTest.sum(a, classUnderTest.sum (b,c));
		
		assertEquals(4.33, wynik, 0.001);
		
	}
	@Test
	public void testOdejmowanie() throws Exception {
	
		double a = 4.0;
		double b = 7.0;
		
		double wynik = classUnderTest.subtract(a,  b);
		
		assertEquals(-3, wynik, 0.001);
		
	}

	
	@Test
	public void testDzielenie() throws Exception {
	
		double a = 10.0;
		double b = 5.0;
		
		double wynik = classUnderTest.divide(a,  b);
		
		assertEquals(2, wynik, 0.001);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDzielenieZero() throws Exception {
		
		double a = 10.0;
		double b = 0;
		
		double wynik = classUnderTest.divide(a,  b);
		
		assertEquals(0, wynik, 0.001);
		
	}
}
