package no3;
import java.util.Scanner;
public class B {
public static void main(String[] args) {
     //membuat variabel dan scaner
    Scanner input=new Scanner(System.in);
    //input angka
    System.out.print("Masukkan angka : ");
    int a= input.nextInt();
    switch(a){
            case 1:
                System.out.println("SATU");
                break;
            case 2:
                System.out.println("DUA");
                break;
            case 3:
                System.out.println("TIGA");
                break;
            case 4:
                System.out.println("EMPAT");
                break;
            case 5:
                System.out.println("LIMA");
                break;
            case 6:
                System.out.println("ENAM");
                break;
            case 7:
                System.out.println("TUJUH");
                break;
            case 8:
                System.out.println("DELAPAN");
                break;
            case 9:
                System.out.println("SEMBILAN");
                break;
            case 10:
                System.out.println("SEPULUH");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}
    

