package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeTest {
	@Test
    public void evaluatesExpression() {
		Prime p = new Prime();
		boolean ans = p.checkPrime(4);
		assertEquals(false, ans);
		boolean ans2 = p.checkPrime(9);
		assertEquals(false, ans2);
		boolean ans3 = p.checkPrime(90);
		assertEquals(false, ans3);
    }
}
