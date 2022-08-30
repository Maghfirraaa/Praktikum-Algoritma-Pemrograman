import javax.swing.JOptionPane;
public class no2 {
public static void main(String[] args) {
//a.cetak iterasi/tampilan data array pada kode dibawah dengan menggunakan
//perulangan while dan do-while , gunakan nested loop.
   int data2[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
   for (int a=0;a<data2.length;a++){
       for(int b=0;b<data2[0].length;b++){
           System.out.print(data2[a][b]+" ");
       }
       System.out.print("\n");
   }
        System.out.println();
        System.out.println("==========================");
        //while
        System.out.println("menampilkan data array menggunakan perulangan while");
        int a = 0;
        int b = 0;
        while (a < data2.length) {
            while (b < data2[0].length) {
                System.out.print(data2[a][b] + " ");
                b++;
            }
            a++;
            b = 0;
            System.out.println();
        }
        System.out.println("==========================");
        //do while
        System.out.println("menampilkan array menggunakan do while");
        int c = 0;
        int d = 0;
        do {
            do {
                System.out.print(data2[c][d] + " ");
                d++;
            } while (d < data2[0].length);
            System.out.println();
            d = 0;
            c++;
        } while (c < data2.length);
        System.out.println();
       
//b.cari nilai rata-rata array tersebut!
System.out.println("==========================");
System.out.println("b.mencari nilai rata-rata array");
        int jumlah = 0;
        int ratarata=0;
        for (int h = 0; h < data2.length ; h++) {
            for (int i = 0; i < data2[0].length; i++) {
                jumlah += data2[h][i];
                ratarata=jumlah/(data2.length*data2[0].length);
            }
        }
        System.out.println(jumlah);
        System.out.println("rata-rata = " + ratarata);
//c.tambah perintah pencarian posisi index & menukar
System.out.println("==========================");
System.out.println("c.mencari posisi indeks dan menukar dengan nilai baru");
int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan elemen yang dicari : "));
    System.out.println("elemen yang dicari = "+cari);
        for (int k = 0; k < data2.length; k++) {
        for (int j = 0; j < data2[0].length; j++) {
          if (data2[k][j] == cari) {
System.out.println("elemen yang anda cari berada pada index [" + k + "]" + "[" + j + "]");
                }
            }

        }
        System.out.println("==========================");
int ubah = Integer.parseInt(JOptionPane.showInputDialog("Masukkan elemen baru"));
    System.out.println("elemen diubah menjadi = "+ubah);
        for (int k = 0; k < data2.length; k++) {
        for (int j = 0; j < data2[0].length; j++) {
                if (data2[k][j] == cari) {
                    data2[k][j] = ubah;
 System.out.println("elemen pada index ke [" + k + "][" + j + "] berubah menjadi " + data2[k][j]);
                }
            }
        }
  System.out.println("memunculkan nilai array yang ditukar nilainya");
        for (int k = 0; k < data2.length; k++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[k][j] + " ");
            }
            System.out.print("\n");
        }
//d.tambahkan kode yang bisa menjumlahkan semua element  yg mempunyai 
//yg mempunyai indeks kolom genap(nilai genap)
 System.out.println("==========================");
  System.out.println("d.menjumlahkan array pada kolom genap=");
            int total=0;
            for (int k = 0; k < data2.length; k++) {
            for (int j = 0; j < data2[0].length; j+=2){
                total += data2[k][j];
            }
            }
            System.out.println("hasil dari array pada kolom genap ="+total);
        }
    }


   

