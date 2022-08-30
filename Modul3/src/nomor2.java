import javax.swing.JOptionPane ;
public class nomor2 {
public static void main(String[] args) {
    
    String nilai1 = JOptionPane.showInputDialog("masukan nilai pertama");
    JOptionPane.showMessageDialog(null, nilai1);
    String nilai2 = JOptionPane.showInputDialog("masukan nilai kedua");
    JOptionPane.showMessageDialog(null, nilai2); 
    String nilai3 = JOptionPane.showInputDialog("masukan nilai ketiga");
    JOptionPane.showMessageDialog(null, nilai3);
    String inputdata =JOptionPane.showInputDialog("nilai-nilai yang dimasukkan="
    +nilai1+","+nilai2+","+ nilai3 );
    JOptionPane.showMessageDialog(null, inputdata );
    
    System.out.println("nilai-nilai yang dimasukkan="+nilai1+","+nilai2+","+ nilai3) ;
    
    
    
    
    }
    
}
