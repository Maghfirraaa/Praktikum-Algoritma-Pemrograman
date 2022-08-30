import javax.swing.*;
import java.awt.*;
class CobaGUI extends JFrame {
    Checkbox cb1 =  new Checkbox ("Pilih A");
    Checkbox cb2 =  new Checkbox ("Pilih B");
    Checkbox cb3 =  new Checkbox ("Pilih C");
    CobaGUI() {
        setTitle("Program GUI Pertamaku");
        setLocation(200,100);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 void objek(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30,90,150,20);
        cb2.setBounds(30,120,150,20);
        cb3.setBounds(30,150,150,20);
        setVisible(true);
 }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void main(String[] args) {
        CobaGUI ZZ=new CobaGUI();
        ZZ.objek();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}