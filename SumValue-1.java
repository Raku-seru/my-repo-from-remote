/*Uncompiled java class (For syntax Educational purposes)
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
		int value = 0;int anotherValue = 0; //Declare Variables to Sum
		try {
			System.out.print("Angka Pertama : ");
			value = Integer.parseInt(bufferedReader.readLine());
			System.out.print("Angka Kedua : ");
			anotherValue = Integer.parseInt(bufferedReader.readLine());
		} catch (IOException e) {
			e.printStackTrace(); //Auto Correct to FBI Database if there any error
		}
		int result = sumFormula(value,anotherValue); //Process of Sum using Function
		System.out.println("Result : "+result); //Print Result of Sum
		scan.nextLine(); //Pause before close
	}
	
	public static int sumFormula(int numberOne,int numberTwo) { //Function to process the Sum
		int resul = numberOne + numberTwo;
		return resul;
	}
}