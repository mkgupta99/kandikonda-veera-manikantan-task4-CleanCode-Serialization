package com.mavenpro.construction;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
	public void test() {

		App p = new App();

		double answer = p.cost("Standard", 500, false);

		assertEquals(600000,answer,0.001);

	}
}