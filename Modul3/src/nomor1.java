 import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;

public class nomor1 {
public static void main(String[] args) {
  BufferedReader nilai = new BufferedReader (new InputStreamReader(System.in));
  
  System.out.println("===input bilangan===");
  try{ 
      
  System.out.print("masukan nilai pertama =");
  String nilai1 = nilai.readLine();
  System.out.print("masukan nilai kedua=");
  String nilai2 = nilai.readLine ();
  System.out.print("masukan nilai ketiga=");
  String nilai3 = nilai.readLine () ;
  System.out.println("nilai yang dimasukkan=" + nilai1 + "," +nilai2 + "," +nilai3);
      }catch( IOException e ){ 
      System.out.println("Error!");
} 
  }
    }
   
