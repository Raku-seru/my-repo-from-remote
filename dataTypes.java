import java.util.*;
import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.IOException;

public class dataTypes {
	public static void main(String[] args) {
		byte valueByte = 10;
		/*	Size 8-bit
			Range : -128 to 127, default 0
			Ratio compare to Int (4 bytes : 1 int) */
		
		short valueShort = 10;
		/*	Size 16-bit
			Range : -32768 to 32767, default 0
			Ratio compare to Int (2 shorts : 1 int) */
			
		int valueInt = 100;
		/*	Size 32-bit
			Range : -2,147,483,648 to 2,147,483,647, default 0
			Ratio is 1:1 to int */
			
		long valueLong = 10000L;
		/*	Size 64-bit
			Range :  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, default 0L
			Example : 1969L, -53420L */
			
		float valueFloat = 6.9f;
		/*	Can contain decimals,default 0.0f Ex : 3.5f,99.9f */
		
		double valueDouble = 5.0d;
		/* Same as float but has bigger capacity, default 0.0d */
		
		boolean valueTrue = true;
		boolean valueFalse = false;
		/* Only contain 'True' or 'False',default 'False' */
		
		char valueChar = 'A';
		/* Only contain a character and contained between '' */
		
		System.out.println(valueByte);System.out.println(valueShort);
		System.out.println(valueInt);System.out.println(valueLong);
		System.out.println(valueFloat);System.out.println(valueDouble);
		System.out.println(valueTrue);System.out.println(valueFalse);
		}
	}