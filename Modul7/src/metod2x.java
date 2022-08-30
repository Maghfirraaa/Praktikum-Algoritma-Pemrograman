import java.util.Scanner;
public class metod2x {
    //fungsi
    private static double volumeTabung(int jari2,int tinggi){
        double hasil = ( Math.PI*Math.pow(jari2, 2)*tinggi);
        return hasil;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int jari2,tinggi;
        double volume;
        System.out.print("masukkan jari2 = ");
        jari2 = s.nextInt();
        System.out.print("masukkan tinggi = ");
        tinggi = s.nextInt();
        
        volume = volumeTabung(jari2,tinggi);
        System.out.println("volume tabung = "+volume);
    }   
}


