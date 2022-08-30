package no5;
import javax.swing.JOptionPane;
public class b2 {
    public static void main(String[] args) {
    String angka=JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan :");
    int n=Integer.parseInt(angka);
    for(int i=1;i<=n;i++){
        for(int j=5;j>=i;j--){
            System.out.print("*");
        }
        System.out.print("\t");
    for(int j=n;j>=i;j--){
        if(j==n){
            System.out.print("*");
        }else if(i==n){
         System.out.print("\b*");
        }else{
            System.out.print("*");
        }
}            System.out.println();
}
}
}