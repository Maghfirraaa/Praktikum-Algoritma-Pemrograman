package modul10;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static modul10.koneksi.con;

public class data_mahasiswa extends javax.swing.JFrame {
    private void GetData(){ // menampilkan data dari database
    try {
        Connection con =(Connection)modul10.koneksi.koneksiDB();
        Statement stm = (Statement) con.createStatement();
        ResultSet sql = stm.executeQuery("select * from maghfira_200605110036");    
    }
    catch (Exception e) {
    }
}
    public data_mahasiswa() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        NIM = new javax.swing.JLabel();
        Tnim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        kelas = new javax.swing.JLabel();
        TA = new javax.swing.JRadioButton();
        TB = new javax.swing.JRadioButton();
        TC = new javax.swing.JRadioButton();
        Tcari = new javax.swing.JButton();
        matkul = new javax.swing.JLabel();
        TMatkul = new javax.swing.JComboBox<>();
        Tedit = new javax.swing.JButton();
        Tsimpan = new javax.swing.JButton();
        Thapus = new javax.swing.JButton();
        Tkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maghfira_200605110036\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NIM.setText("NIM");
        getContentPane().add(NIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 32, 52, 23));

        Tnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnimActionPerformed(evt);
            }
        });
        getContentPane().add(Tnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 33, 187, -1));

        jLabel2.setText("Nama ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 69, -1, -1));
        getContentPane().add(Tnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 66, 244, -1));

        kelas.setText("Kelas ");
        getContentPane().add(kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 104, 52, 23));

        buttonGroup1.add(TA);
        TA.setText("A");
        TA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAActionPerformed(evt);
            }
        });
        getContentPane().add(TA, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 104, -1, -1));

        buttonGroup1.add(TB);
        TB.setText("B");
        TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBActionPerformed(evt);
            }
        });
        getContentPane().add(TB, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 104, -1, -1));

        buttonGroup1.add(TC);
        TC.setText("C");
        getContentPane().add(TC, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 104, -1, -1));

        Tcari.setText("Cari");
        Tcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcariActionPerformed(evt);
            }
        });
        getContentPane().add(Tcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 32, -1, -1));

        matkul.setText("Matakuliah");
        getContentPane().add(matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 141, -1, -1));

        TMatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kalkulus", "Matematika Diskrit", "ICS", "Filsafat Ilmu" }));
        TMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TMatkulActionPerformed(evt);
            }
        });
        getContentPane().add(TMatkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 138, 134, -1));

        Tedit.setText("Edit");
        Tedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeditActionPerformed(evt);
            }
        });
        getContentPane().add(Tedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 176, 65, -1));

        Tsimpan.setText("Simpan");
        Tsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Tsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 176, -1, -1));

        Thapus.setText("Hapus");
        Thapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThapusActionPerformed(evt);
            }
        });
        getContentPane().add(Thapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 176, -1, -1));

        Tkeluar.setText("Keluar");
        Tkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Tkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 176, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsimpanActionPerformed
        buttonGroup1.add(TA);
        buttonGroup1.add(TB);
        buttonGroup1.add(TC);
        TA.setActionCommand("A");
        TB.setActionCommand("B");
        TC.setActionCommand("C");
         try {
          String sql ="insert into maghfira_200605110036 values('"+Tnim.getText()+"',"
                    + "'"+Tnama.getText()+"',"
                    + "'"+buttonGroup1.getSelection().getActionCommand()+"',"
                    + "'"+TMatkul.getSelectedItem().toString()+"')";
            Connection conn = modul10.koneksi.koneksiDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil disimpan");
        Tnim.setText("");
        Tnama.setText("");
        buttonGroup1.clearSelection();
        TMatkul.setSelectedIndex(0);
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TsimpanActionPerformed
       String TNIM = "";
    private void TcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcariActionPerformed
      TNIM = Tnim.getText();
        try {
            Connection conn  = (Connection)modul10.koneksi.koneksiDB();
            Statement ppt = (Statement) conn.createStatement();
            ResultSet sql = ppt.executeQuery("SELECT * FROM maghfira_200605110036"
                         + " WHERE NIM=" + TNIM);
            
            if (sql.next()) {
            String  nim =sql.getString("NIM");
            Tnim.setText(nim);
            String namaa=sql.getString("Nama");
            Tnama.setText(namaa);
            String kelass = sql.getString("Kelas");
            switch(kelass){                                    
                case "A":
                    TA.setSelected(true);
                    TB.setSelected(false);
                    TC.setSelected(false);
                break;
                case "B":
                    TA.setSelected(false);
                    TB.setSelected(true);
                    TC.setSelected(false);
                break;
                case "C":
                    TA.setSelected(false);
                    TB.setSelected(false);
                    TC.setSelected(true);
                break;
                default:
                break;
             }
            String Matkul = sql.getString("Mata kuliah");
            switch(Matkul){
                case"Kalkulus":
                    TMatkul.setSelectedIndex(0);
                break;
                case"Matematika Diskrit":
                    TMatkul.setSelectedIndex(1);
                break;
                case"ICS":
                    TMatkul.setSelectedIndex(2);
                break;
                case"Filsafat Ilmu":
                    TMatkul.setSelectedIndex(3);
                break;
            }          
            }
        }catch (Exception e) {
    }
 // TODO add your handling code here:
    }//GEN-LAST:event_TcariActionPerformed
        
    private void ThapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThapusActionPerformed
       buttonGroup1.add(TA);
       buttonGroup1.add(TB);
       buttonGroup1.add(TC);   
        TA.setActionCommand("A");
        TB.setActionCommand("B");
        TC.setActionCommand("C");
          try { // hapus data
          String sql ="DELETE FROM `maghfira_200605110036` WHERE NIM='"+Tnim.getText()+"'";
          java.sql.Connection conn =(java.sql.Connection) modul10.koneksi.koneksiDB();
          java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil dihapus");
        Tnim.setText("");
        Tnama.setText("");
        buttonGroup1.clearSelection();
        TMatkul.setSelectedIndex(0); // TODO add your handling code here:
          }catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }     
    }//GEN-LAST:event_ThapusActionPerformed

    private void TkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TkeluarActionPerformed
         System.exit(0); 
         
    }//GEN-LAST:event_TkeluarActionPerformed

    private void TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBActionPerformed

    private void TMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TMatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TMatkulActionPerformed

    private void TeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeditActionPerformed
        buttonGroup1.add(TA);
        buttonGroup1.add(TB);
        buttonGroup1.add(TC);
        
        TA.setActionCommand("A");
        TB.setActionCommand("B");
        TC.setActionCommand("C");
         try {
          String sql = "UPDATE `maghfira_200605110036` SET `NIM`='"+Tnim.getText()+"',"
                  + "`Nama`='"+Tnama.getText()+"',"
                  + "`Kelas`='"+buttonGroup1.getSelection().getActionCommand()+"',"
                  + "`Mata Kuliah`='"+TMatkul.getSelectedItem().toString()+
                  "' WHERE NIM="+Tnim.getText();
                  
            Connection conn = modul10.koneksi.koneksiDB();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil diedit");
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }          }//GEN-LAST:event_TeditActionPerformed

    private void TAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TAActionPerformed

    private void TnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnimActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data_mahasiswa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NIM;
    private javax.swing.JRadioButton TA;
    private javax.swing.JRadioButton TB;
    private javax.swing.JRadioButton TC;
    private javax.swing.JComboBox<String> TMatkul;
    private javax.swing.JButton Tcari;
    private javax.swing.JButton Tedit;
    private javax.swing.JButton Thapus;
    private javax.swing.JButton Tkeluar;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tnim;
    private javax.swing.JButton Tsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kelas;
    private javax.swing.JLabel matkul;
    // End of variables declaration//GEN-END:variables
}
