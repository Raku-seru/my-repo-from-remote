/*Uncompiled java class (For syntax Educational purposes)
Created by : Raku-Seru (https://www.github.com/Raku-Seru @2021
*/
import java.util.Scanner;
public class EmployeeSalaryCount
{
    public static void main(String[] args){
        Scanner bacaInput = new Scanner(System.in);
        System.out.print("Masukan golongan anda (A, B, atau C) = ");
        String golongan = bacaInput.nextLine();
        switch (golongan.toLowerCase()){
            case "a" : System.out.print("Masukan jumlah hari kerja (per bln) = ");
            int hariA = bacaInput.nextInt();
            if (hariA <= 20)
            {
                int total = 3000000+(hariA*15000);
                System.out.println("Total gaji per bulan = "+total);
            }
            else
            {
                System.out.println("Jumlah hari tidak bisa lebih dari 20!");
            }
            break;
            
            case "b" : System.out.print("Masukan jumlah hari kerja (per bln) = ");
            int hariB = bacaInput.nextInt();
            if (hariB <= 20)
            {
                int total = 2500000+(hariB*10000);
                System.out.println("Total gaji per bulan = "+total);
            }
            else
            {
                System.out.println("Jumlah hari tidak bisa lebih dari 20!");
            }
            break;
            
            case "c" : System.out.print("Masukan jumlah hari kerja (per bln) = ");
            int hariC = bacaInput.nextInt();
            if (hariC <= 20)
            {
                int total = 2000000+(hariC*5000);
                System.out.println("Total gaji per bulan = "+total);
            }
            else
            {
                System.out.println("Jumlah hari tidak bisa lebih dari 20!");
            }
            break;
            
            default : System.out.print("Golongan anda tidak terdaftar!");
    }
}
}