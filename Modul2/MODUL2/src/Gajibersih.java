public class Gajibersih {
//    program untuk menghitung gaji bersih setelah di potong pajak 10%
    public static void main(String[] args) {
      double pajak , gajikotor, potongan , gajibersih ;
                
      pajak    = 0.1 ;
      gajikotor = 5000000 ;
      potongan = pajak * gajikotor ;
      gajibersih =(gajikotor - potongan);
      
      System.out.println("gajibersih ="+ gajibersih);
       
    }
    
}
