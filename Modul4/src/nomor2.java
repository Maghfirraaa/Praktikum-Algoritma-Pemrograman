public class nomor2 {
public static void main(String[] args) {
    
   //membuat listing program untuk memberikan nilai huruf pada mahasiswa
     int a,b,c,d  ;
     String Aa,Bb,Cc,Dd;
     a = 70 ;
     b = 65;
     c = 90;
     d = 75;
     //nilai dari nilai Adi
     if(a>=36 && a<=45){
         Aa = "D";
     }else if(a>=46 && a<=55){
         Aa ="C";
     }else if(a>=56 && a<=65){
         Aa= "C+";
    }else if(a>=66 && a<=75){
         Aa= "B";
    }else if(a>=76 && a<=85){
         Aa= "B+";
    }else if(a>=86 && a<=100){
         Aa= "A";
    }else {
        Aa="-";
    }
     //nilai untuk budi
     if(b>=36 && b<=45){
         Bb= "D";
     }else if(b>=46 && b<=55){
         Bb ="C";
     }else if(b>=56 && b<=65){
         Bb= "C+";
    }else if(b>=66 && b<=75){
         Bb= "B";
    }else if(b>=76 && b<=85){
         Bb= "B+";
    }else if(b>=86 && b<=100){
         Bb= "A";
    }else {
        Bb="-";
    }
     //nilai untuk caca
     if(c>=36 && c<=45){
         Cc= "D";
     }else if(c>=46 && c<=55){
         Cc ="C";
     }else if(c>=56 && c<=65){
         Cc= "C+";
    }else if(c>=66 && c<=75){
         Cc= "B";
    }else if(c>=76 && c<=85){
         Cc= "B+";
    }else if(c>=86 && c<=100){
         Cc= "A";
    }else {
        Cc="-";
    }
    // menghitung nilai deny  
     if(d>=36 && d<=45){
         Dd= "D";
     }else if(d>=46 && d<=55){
         Dd ="C";
     }else if(d>=56 && d<=65){
         Dd= "C+";
    }else if(d>=66 && d<=75){
         Dd= "B";
    }else if(d>=76 && d<=85){
         Dd= "B+";
    }else if(d>=86 && d<=100){
         Dd= "A";
    }else {
        Dd="-";
}
     System.out.println("\nNama       nilai     huruf\n");
     System.out.println("Adi          "+a+"       "+Aa);
     System.out.println("Budi         "+b+"       "+Bb);
     System.out.println("Caca         "+c+"       "+Cc);
     System.out.println("Deny         "+d+"       "+Dd);   
     //mencari nilai terendah
     if(a>=b && a>=c && a>=d && b<=c && b<=d){
         System.out.println("Nilaimax=adi"+a+ "\nNilaimin=budi"+b );
     }else if (a>=b && a>=c && a>=d && c<=b && c<=d){
         System.out.println("Nilaimax=adi"+a+ "\nNilaimin=caca"+c);
     }else if(a>=b && a>=c && a>=d && d<=b && d<=c){
         System.out.println("Nilaimax=adi"+a+ "\nNilaimin=deny"+d);
     }else if(b>=a && b>=c && b>=d && a<=b && a<=d){
         System.out.println("Nilaimax=budi"+b+ "\nNilaimin=adi"+a);
     }else if(b>=a && b>=c && b>=d && c<=a && c<=d){
         System.out.println("Nilaimax=budi"+b+ "\nNilaimin=caca"+c);
     }else if(b>=a && b>=c && b>=d && d<=a && d<=c){
         System.out.println("Nilaimax=budi"+b+ "\nNilaimin=deny"+d);
     }else if(c>=a&& c>=b && c>=d && a<=b && a<=d){
         System.out.println("Nilaimax=caca"+c+ "\nNilaimin=Adi"+a);
     }else if(c>=a&& c>=b && c>=d && b<=a && b<=d){
         System.out.println("Nilaimax=caca"+c+ "\nNilaimin=budi"+b);
     }else if(c>=a&& c>=b && c>=d && d<=a && d<=b){
         System.out.println("Nilaimax=caca"+c+ "\nNilaimin=deny"+d);
     }else if(d>=a && d>=b && d>=c && a<=b && a<=c){
         System.out.println("Nilaimax=deny"+d+ "\nNilaimin=adi"+a);
     }else if(d>=a && d>=b && d>=c && b<=a && b<=c){
         System.out.println("Nilaimax=deny"+d+ "\nNilaimin=budi"+b);
     }else if(d>=a && d>=b && d>=c && c<=a && c<=a && c<=b){
         System.out.println("Nilaimax=deny"+d+ "\nNilaimin=budi"+b);
     }
}
     }
    

     
       

