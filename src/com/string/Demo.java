package com.string;

public class Demo {
	public boolean compareString(String first, String second){
		if(first.equalsIgnoreCase(second)){
			return true;
		}
		else{
			return false;
		}
	}
	public String concatString(String s1, String s2){
		return s1.concat(s2);
	}
	public int[] addOneToArray(int[] numbers){
		int length = numbers.length;
		int output[] = new int[length];
		for(int i = 0;i<numbers.length;i++){
			output[i] = numbers[i]+1;
		}
		return output;
	}
}
