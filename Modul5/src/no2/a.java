package no2;
public class a {
    public static void main(String[] args) {
      int angka1,angka2,pangkat1,pangkat2,hasil1,hasil2,total;
      hasil1=1;
      hasil2=1;
      
      angka1=4;
      pangkat1=3;
      angka2=5;
      pangkat2=2;
      for(int i=1 ;i<=pangkat1;i++){     
        hasil1*=4;
    }
      System.out.println("hasil1="+hasil1);
 
    for(int i=1 ;i<=pangkat2;i++){     
   hasil2*=5;
    }
    System.out.println("hasil2="+hasil2);
       
    total =hasil1 +hasil2;
    System.out.println("4^3+5^2="+total);
    }
}

