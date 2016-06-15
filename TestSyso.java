//package com.sx.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestSyso {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(URLEncoder.encode("", "UTF-8"));
		System.out.println(URLDecoder.decode("[Ljava.lang.String;@c56236","UTF-8"));
	System.out.println("----------------------------");
/*String a = "aaa";
		String b = a;
		a = "bbb";
		System.out.println(a+"--"+b);*/
		int count = 1;
		int c = 10;
		int c2 = c/2;
		for(int i = 0;i<=c;i++){
			for(int j = i;j<c2;j++){
				System.out.print("  ");
			}
			if(i<c2)
			for(int k = 0;k<=i;k++){
				System.out.print("  "+count+++" ");
			}
			
			for(int j =  i;j>c2;j--){
				System.out.print("  ");
			}
			if(i>=c2)
			for(int k = c;k>=i;k--){
				System.out.print("  "+count+++" ");
			}
			System.out.println();
		}
		
		int num = 1;
		for(int i=10;i>0;i=i-2){

			for(int j=0;j<num;j++){
				System.out.print("*"+" ");
			}
			System.out.println("");
			num++;
		}

	}

}
