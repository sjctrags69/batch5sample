package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.MathOps;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestMathOps {
	private MathOps mo;
	
	
	@BeforeEach
	public void setup() {
		mo = new MathOps();
	}
	
	@AfterEach
	public void teardown() {
		mo = null;
	}
	
	@Test
	public void testDivOp() {
		assertDoesNotThrow(() -> {
			int result = mo.div(10, 2);
			assertEquals(5, result);
		});
	}
	
	@Test
	public void testDivOpRainy() {
		assertThrows(ArithmeticException.class, () -> {
			int result = mo.div(10, 0);
			assertEquals(0, result);
		});
	}
	
	@Test
	public void testDisplayArray() {
		int[] testdata = {10, 20, 30 , 40};
		int[] result = mo.displayArray(testdata);
		assertSame(testdata, result);
	}
	
	@Test
	public void testDisplayArrayRainy() {
		int[] testdata = null;
		int[] result = mo.displayArray(testdata);
		assertSame(testdata, result);
	}
	
	@Test
	public void testAddOp() {
		int result = mo.add(2, 3);
		assertEquals(5, result);
	}

}
