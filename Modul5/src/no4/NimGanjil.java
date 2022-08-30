package no4;
import javax.swing.JOptionPane;
public class NimGanjil {
    public static void main(String[] args) {
    String nim = JOptionPane.showInputDialog("Masukkan NIM");
    JOptionPane.showMessageDialog(null,nim);
    int NIM = Integer.parseInt(nim);
    if (NIM % 2 == 1) {
         System.out.println(NIM +" adalah NIM Ganjil");
    }else{
         System.out.println(NIM+" adalah NIM Genap");
        
    }
    }
}
