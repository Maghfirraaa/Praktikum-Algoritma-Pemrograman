package no4;
import java.util.Scanner;
public class NimGenap {
    public static void main(String[] args) {
     
    //membuat inputan console
     Scanner bilangan =new Scanner(System.in);
     System.out.print("input bilangan=");
     int FIRA = bilangan.nextInt();
     if (FIRA % 2 == 0) {
         System.out.println(FIRA +"adalah NIM GENAP");
    }else{
         System.out.println(FIRA+"adalah NIM GANJIL");
     }
    }
}
