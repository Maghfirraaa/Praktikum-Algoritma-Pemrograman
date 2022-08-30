package no4;
import java.io.Console;
public class ganjil {
    public static void main(String[] args) {
        Console con=System.console() ;
        int NIM = Integer.parseInt(con.readLine());
        
        System.out.println("MASUKAN ANGKA");
        for (int i=0;i<38;i++){
            if(NIM%2==0){
                System.out.println(NIM+"GENAP");
            }else if(NIM%2==1){
                System.out.println(NIM+"GANJIL");
        }
    }
       
}
}

