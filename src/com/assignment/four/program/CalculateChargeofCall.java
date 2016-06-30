package com.assignment.four.program;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This Junit test case of calculating the charge of call.
 * 
 */


public class CalculateChargeofCall {

	@Test
	public void test() {

		JunitTestingForCDR test = new JunitTestingForCDR();
		int durationofCall = CallDetailsRecord.duration;
		int calculateCharge = test.calculateChargeofCall(durationofCall);
		System.out.println(calculateCharge);
		System.out.println(CallDetailsRecord.duration);
		assertEquals(calculateCharge, CallDetailsRecord.duration);
	}

}
