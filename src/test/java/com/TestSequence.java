package com;

import org.junit.Test;

public class TestSequence {
	

	
	@Test
	public void loopExecution(){	
		int times = 10000;
		Case1Test2 case1Test2 = new Case1Test2();
		for(int x = 1; x < times; x++) {
			case1Test2.findAndClose();		
			System.out.println("Test nº " + (x));
		}
	}

}
