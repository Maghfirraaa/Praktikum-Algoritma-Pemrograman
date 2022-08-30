 import javax.swing.JOptionPane;
public class NO4 {
    public static void main(String[] args) {
   int[][]matriksA={{2,9},{1,5}};
   int[][]matriksB={{5,17},{10,4}};                 
   int[][]hasil   =new int[2][2];    
   System.out.println("matriks A");
           for(int a=0;a<2;a++){
           for(int b=0;b<2;b++){
           System.out.print(matriksA[a][b]+"  ");
}
System.out.println();
}
  System.out.println("matriks b");
          for(int c=0;c<2;c++){
          for(int d=0;d<2;d++){
          System.out.print(matriksB[c][d]+"  ");
}
          System.out.println();
}//a.mencari posisi indeks 
  String nilai=JOptionPane.showInputDialog(null,"masukkan nilai");
  int cari=Integer.parseInt(nilai);
   for(int a=0;a<2;a++){
   for(int b=0;b<2;b++){
  if (matriksA[a][b]==cari){
  System.out.println("nilai= " +matriksA[a][b]+" indeks ke-"+a+ " pada baris dan indeks ke-"+b+ " pada kolom");
   }	
    }
}            //b.jumlahkan dua matrik
  for(int x=0;x<2;x++){
  for(int y=0;y<2;y++){
  hasil[x][y]=matriksA[x][y]+ matriksB[x][y];
}
} System.out.println("===================================================");
  System.out.println("Proses Penjumlahan Matriks A Dan B =");
  for(int x=0;x<2;x++){
  for(int y=0;y<2;y++){
  System.out.print(matriksA[x][y]+"+"+ matriksB[x][y]+"="+hasil[x][y]+"  " );
}
System.out.println();
}
System.out.println("Hasil Penjumlahan Matriks A Dan B =");

     for(int x=0;x<2;x++){
     for(int y=0;y<2;y++){
     System.out.print(hasil[x][y]+"  " );
}
System.out.println();
}
}
}
   
