import javax.swing.JOptionPane ;
public class nomor1 {
    public static void main(String[] args) {
    String nilai1 = JOptionPane.showInputDialog("masukan jumlah pendapatan");
    JOptionPane.showMessageDialog(null, nilai1); 
    
    Double uangjasa , gaji ,komisi ;
    Double nilai1_konvers= Double.parseDouble(nilai1);
    if(nilai1_konvers <= 2000000){
        uangjasa =100000.0;
        komisi   = 0.1 ;
        komisi*= nilai1_konvers;
        gaji     = uangjasa + komisi;
        String hasil = "jadi pendapatan dari sales tersebut adalah=" + gaji;
        JOptionPane.showMessageDialog(null,hasil); 
    }
    else if (nilai1_konvers > 2000000 && nilai1_konvers <= 5000000){
        uangjasa  = 200000.0;
        komisi    = 0.15;
        komisi*= nilai1_konvers;
        gaji      = uangjasa + komisi;
        String hasil = "jadi pendapatan dari sales tersebut adalah="+gaji;
        JOptionPane.showMessageDialog(null,hasil); 
    }
    else if (nilai1_konvers > 5000000){
        uangjasa  = 300000.0;
        komisi    = 0.2;
        komisi*= nilai1_konvers;
        gaji      = uangjasa + komisi;
        String hasil = "jadi pendapatan dari sales tersebut adalah="+gaji;
        JOptionPane.showMessageDialog(null,hasil); 
    }
    }
}