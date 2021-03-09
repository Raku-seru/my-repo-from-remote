/*Uncompiled java class
Created by : Raku-Seru (https://www.github.com/Raku-Seru @2021
*/
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserIOSumOfTwoValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //new Object (Scanner)
		InputStreamReader streamReader = new InputStreamReader(System.in); //new object (InputStreamReader)
		BufferedReader bufferedReader = new BufferedReader(streamReader); //new object (BufferedReader)
		
		System.out.println("Input data untuk dijumlah : ");
		int value = 0;int anotherValue -0; //Declare Variables to Sum
		try {
			System.out.print("Angka Pertama : ");
			value = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Angka Kedua : ");
			anotherValue = Integer.parseInt(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace(); //Auto Tracing error Exception
		}
		int result = value + anotherValue; //Process of Sum
		System.out.println("Result : "+result); //Print Result of Sum
		scan.nextLine(); //Pause before close
	}
}