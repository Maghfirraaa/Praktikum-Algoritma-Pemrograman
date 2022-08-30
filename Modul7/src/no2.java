import javax.swing.JOptionPane;
public class no2 {
    //fungsi
    public void luaspersegipanjang(int panjang,int lebar){
        int luas = (panjang*lebar);
        System.out.println("luas persegi panjang = "+luas);
    }
    public void luasSegitiga(int alas,int tinggi){
        int luas = ((alas*tinggi)/2);
        System.out.println("luas Segitiga = "+luas);
    }
   public void luasLingkaran(int jari2){
        double luas =(Math.PI*Math.pow(jari2, 2));
        System.out.println("luas Lingkaran= "+luas);
    }
    public static void main(String[] args) {
        inputconsole ic = new inputconsole ();
        no2 hit = new no2 ();
        System.out.println("=============================================");
   int gambar=Integer.parseInt(JOptionPane.showInputDialog("masukkan gambar ke-"));
   if(gambar==1){
       System.out.println("1.persegipanjang");
       int panjang=Integer.parseInt(JOptionPane.showInputDialog("panjang = "));
       System.out.println("panjang = "+panjang);
       int lebar=Integer.parseInt(JOptionPane.showInputDialog("lebar = "));
       System.out.println("Lebar = "+lebar);
       hit.luaspersegipanjang(panjang, lebar);
   }else if(gambar==2){
       System.out.println("2.Segitiga");
       int alas=Integer.parseInt(JOptionPane.showInputDialog("alas = "));
       System.out.println("alas = "+alas);
       int tinggi=Integer.parseInt(JOptionPane.showInputDialog("tinggi = "));
       System.out.println("tinggi = "+tinggi);
       hit.luasSegitiga(alas, tinggi);
   }else if(gambar==3){
       System.out.println("3.Lingkaran");
       int jari2=Integer.parseInt(JOptionPane.showInputDialog("jari-jari = "));
       System.out.println("jari-jari = "+jari2);
      hit.luasLingkaran(jari2);
    }else{
       System.out.println("input yang anda masukkan salah");
       }      
    }
    }




