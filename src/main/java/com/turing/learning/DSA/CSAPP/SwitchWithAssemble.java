package com.turing.learning.DSA.CSAPP;

public class SwitchWithAssemble {

	public int BasicMathWithSwitch(int i, int j, int k) {
		int result = 0;
		
		switch(k){
		
		case(1):
			result = i + j;
			break;
		case(2):
			result = i - j;
			break;
		case(3):
			result = i * j;
			break;
		case(4):
			result = i / j;
			break;
		default:
			result = -1;
		
		}
		
		return result;
	}

}
