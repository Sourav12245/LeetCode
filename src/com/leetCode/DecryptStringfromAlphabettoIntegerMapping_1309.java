package com.leetCode;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class DecryptStringfromAlphabettoIntegerMapping_1309 {

	public static void main(String[] args) {
		String s = "1259";
		
		//execution start
		long start = System.nanoTime();
		
		System.out.println(freqAlphabets(s));
		
		//execution ends
		long end = System.nanoTime();
		timer_Checker(start, end);
	}
	
	
	 public static String freqAlphabets(String s) {
	        Stack<String> stString = new Stack<String>();
			Stack<Character> st = new Stack<Character>();
	        for(int i = 0;i<=s.length()-1;i++) {
	        	st.push(s.charAt(i));
	        }
	        
	        String q = "";
	        String str = "";
	        int count = 0;
	        while(st.empty() == false) {
	        	char v = st.pop();
	        	char[] arr = new char[2];
	        	if(v == '#') {
	        		for(int i = 0;i<=1;i++) {
	           			arr[i] = st.pop();
	        		}
	        		
	        		for(int i = arr.length-1;i>=0;i--) {
	        			str = str + arr[i];
	        		}
	        	}else {
	        		str = Character.toString(v);
	        	}
	        	
	        	stString.push(numb_to_char(str)); 
	        	str = "";
	        	count++;
	        }
	        
	        for(int i = 0;i<=count-1;i++) {
	        	q = q + stString.pop();
	        }
			
			return q;
	    }
	    
	    private static String numb_to_char(String num) {
			int value = 96;
			int k = Integer.parseInt(num);
			value = value + k;
			String str = Character.toString((char)value);
			return str;
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    private static void timer_Checker(long start, long end) {
	    	long fi = end-start;
	    	System.out.println("=========================================");
	    	System.out.println("Nano :"+fi/1000+"k ns");
	    	System.out.println("Mili :"+TimeUnit.MILLISECONDS.convert(fi, TimeUnit.NANOSECONDS)+" ms");
	    	System.out.println("Sec  :"+TimeUnit.SECONDS.convert(fi, TimeUnit.NANOSECONDS)+ " s");
	    }
	    
	    
	    
	    
	    
	    
	    

}
