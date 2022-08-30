public class no2 {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        
        int adi =70;
        int budi=65;
        int caca=90;
        int deny=75;
        
    //membuat nilai adi
    if(adi>=36 && adi<=45){
        System.out.println("nilai adi="+adi+"\tnilai huruf=D");
    }else if(adi>=46 && adi<=55){
         System.out.println("nilai adi="+adi+"\tnilai huruf=C");
    }else if(adi>=56 && adi<=65){
        System.out.println("nilai adi="+adi+"\tnilai huruf=C+");
    }else if(adi>=66 && adi<=75){
        System.out.println("nilai adi="+adi+"\tnilai huruf=B");
    }else if(adi>=76 && adi<=85){
        System.out.println("nilai adi="+adi+"\tnilai huruf=B+");
    }else if(adi>=86 && adi<=100){
        System.out.println("nilai adi="+adi+"\tnilai huruf=A");
    }else{
        System.out.println("nilai adi="+adi+"\tnilai huruf=E");
    }
    //membuat nilai budi
     if(budi>=36 && budi<=45){
        System.out.println("nilai budi="+budi+"\tnilai huruf=D");
    }else if(budi>=46 && budi<=55){
         System.out.println("nilai budi="+budi+"\tnilai huruf=C");
    }else if(budi>=56 && budi<=65){
        System.out.println("nilai budi="+budi+"\tnilai huruf=C+");
    }else if(budi>=66 && budi<=75){
        System.out.println("nilai budi="+budi+"\tnilai huruf=B");
    }else if(budi>=76 && budi<=85){
        System.out.println("nilai budi="+budi+"\tnilai huruf=B+");
    }else if(budi>=86 && budi<=100){
        System.out.println("nilai budi="+budi+"\tnilai huruf=A");
    }else{
        System.out.println("nilai budi="+budi+"\tnilai huruf=E");
    }
    //membuat nilai caca 
    if(caca>=36 && caca<=45){
        System.out.println("nilai caca="+caca+"\tnilai huruf=D");
    }else if(caca>=46 && caca<=55){
         System.out.println("nilai caca="+caca+"\tnilai huruf=C");
    }else if(caca>=56 &&caca<=65){
        System.out.println("nilai caca="+caca+"\tnilai huruf=C+");
    }else if(caca>=66 && caca<=75){
        System.out.println("nilai caca="+caca+"\tnilai huruf=B");
    }else if(caca>=76 && caca<=85){
        System.out.println("nilai caca="+caca+"\tnilai huruf=B+");
    }else if(caca>=86 && caca<=100){
        System.out.println("nilai caca="+caca+"\tnilai huruf=A");
    }else{
        System.out.println("nilai caca="+caca+"\tnilai huruf=E");
    }
    //membuat nilai deny
    if(deny>=36 && deny<=45){
        System.out.println("nilai deny="+deny+ "\tnilai huruf=D");
    }else if(deny>=46 &&deny<=55){
         System.out.println("nilai deny="+deny+ "\tnilai huruf=C");
    }else if(deny>=56 &&deny<=65){
        System.out.println("nilai deny="+deny+ "\tnilai huruf=C+");
    }else if(deny>=66 && deny<=75){
        System.out.println("nilai deny="+deny+ "\tnilai huruf=B");
    }else if(deny>=76 && deny<=85){
        System.out.println("nilai deny="+deny+ "\tnilai huruf=B+");
    }else if(deny>=86 && deny<=100){
        System.out.println("nilai deny="+deny+ "\tnilai huruf=A");
    }else{
        System.out.println("nilai deny="+deny+ "\tnilai huruf=E");
    }
    //mencari nilai terkecil/terendah
    if(adi<budi){
        if (adi<caca){
            if(adi<deny){
                min=adi;
          }else{
             min=deny;   
         }
    }else{
        if(caca<deny){
            min=caca;
        }else{
            min=deny;
        }
        }
    }else{
        if(budi<caca){
            if(budi<deny){
             min=budi;
        }else{
             min=deny;  
        }
    }else{
        if(caca<deny){
          min=caca;
        }else{
            min=deny;
        }
        }
    }
      //mencari nilai tertinggi
      if(adi>budi){
        if (adi>caca){
            if(adi>deny){
                max=adi;
        }else{
              max=deny;
       }
       }else{
        if(caca>deny){
            max=caca;
        }else{
            max=deny;
        }
        }
      }else{
        if(budi>caca){
            if(budi>deny){
             max=budi;
        }else{
            max=deny; 
         }
      }else{
        if(caca>deny){
          max=caca;
        }else{
          max=deny;
    }
}
}
        System.out.println("nilai terendah="+min);
        System.out.println("nilai tertinggi="+max);
    }
}
    

   
