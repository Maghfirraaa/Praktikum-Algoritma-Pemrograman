public class perhitungan { 
    public static void main(String[] args) {
/*Hitunng soal ini
  1.2^8 + 4^4
  2.2^2 + 4^1 / 2^2
  Hitung pangkat (math.pow)
*/
 //Hitung nomor 1
    int a = (int)Math.pow(2,8);
    int b = (int)Math.pow(4,4);
    int hasilnomor1 = a+b ;
    System.out.println("Hasil1="+ hasilnomor1);
 //Hitung nomor 2
    int c = (int) Math.pow (2,2) ;
    int d = (int)Math.pow (4,1);
    int e = (int)Math.pow (2,2) ;
    int hasilnomor2 = c+d /e ;
    System.out.println("Hasil2="+hasilnomor2 );
    }
 // Hitung nomor 3
    
    
}
