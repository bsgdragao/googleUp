package com;

import org.junit.Test;



public class TestSequenceExecution {
	
	public static int ERROR_COUNT = 0;
			
	@Test
	public void loopExecution(){	
		
		int times = 10000;
		Case1Test2 case1Test2 = new Case1Test2();
		for(int x = 1; x < times; x++) {
			System.out.println("Test nº " + (x));
			case1Test2.findAndClose();				
		}
	}

}
