package caching.springaop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;

	@Before
	public void setup() {
		calc = new Calculator();
	}

	@Test
	public void testSum() {
		assertEquals(calc.sum(1, 2), 3);
	}

}
