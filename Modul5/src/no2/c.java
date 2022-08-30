package no2;
public class c {
    public static void main(String[] args) {
        int angka1,angka2,pangkat1,pangkat2,hasil1,hasil2,total1,total2,total3;
      hasil1=1;
      hasil2=1;
      
      angka1=4;
      pangkat1=2;
      angka2=5;
      pangkat2=1;
    for(int i=1 ;i<=pangkat1;i++){     
    hasil1*=4;
    }
    for(int i=1 ;i<=pangkat2;i++){     
    hasil2*=5;
    }
    total1=hasil1 +hasil2;
    System.out.println("(4^2+5^1)="+total1);
    total2=hasil2+hasil1;
    System.out.println("5+4^2="+total2);
    total3=total1/total2;
    System.out.println("(4^2+5^1)/5+4^2="+total3);
    }
}

 
