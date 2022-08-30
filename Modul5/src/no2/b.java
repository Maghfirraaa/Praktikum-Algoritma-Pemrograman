package no2;
public class b {
public static void main(String[] args) {
   long batas1,batas2,faktorial1,faktorial2,hasil1,hasil2,total;
    batas1=5;
    batas2=4;
    faktorial1=1;
    faktorial2=1;
    for(int i=0;i<=batas1;i++){
       faktorial1=1;
       for(int faktor=2;faktor<=i;faktor++)
           faktorial1 *= faktor;
           hasil1=faktorial1;
       }
     System.out.println("hasil1="+faktorial1);
   for (int i=0;i<=batas2;i++){
       faktorial2=1;
       for(int faktor=2;faktor<=i;faktor++)
           faktorial2 *= faktor;
           hasil2=faktorial2;
   }
    System.out.println("hasil2="+faktorial2);
    
    total=faktorial1+faktorial2;
    System.out.println("5!+4!="+total);
    
}
}