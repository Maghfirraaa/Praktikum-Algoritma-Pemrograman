public class metodx {
//fungsi
public double luas_lingkaran (int diameter){
    int jari2=diameter/2;
    double luas=Math.PI*Math.pow(jari2,2);
    return luas;
}   
//prosedure
public void hitungLuasLingkaran(int jari2){
    double luas=Math.PI*Math.pow(jari2,2);
    System.out.println(luas);
}
public void hitungvolumetabung(double luas,int tinggi) {
   double volume=luas*tinggi;
    System.out.println("volume tabung adalah = "+volume);
}
public static void main(String[] args) {
   metodx mt=new metodx();
   mt.hitungLuasLingkaran(10);
    System.out.print(mt.luas_lingkaran(20));
    System.out.println("===volume tabung===");
    inputconsole ic=new inputconsole();
    System.out.println("diameter tabung = ");
    int diameter = ic.readInt();
    System.out.println("Tinggi Tabung = ");
    int tinggi = ic.readInt();
    double a = mt.luas_lingkaran(diameter);
    mt.hitungvolumetabung(a, tinggi);
}
}
