import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Kalkulator extends JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilih;    
    public Kalkulator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tombol1 = new javax.swing.JButton();
        tombol2 = new javax.swing.JButton();
        tombol3 = new javax.swing.JButton();
        tombol4 = new javax.swing.JButton();
        tombol5 = new javax.swing.JButton();
        tombol6 = new javax.swing.JButton();
        tombol7 = new javax.swing.JButton();
        tombol8 = new javax.swing.JButton();
        tombol9 = new javax.swing.JButton();
        tombol0 = new javax.swing.JButton();
        tombolC = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        kali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tombol1.setText("1");
        tombol1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol1MouseReleased(evt);
            }
        });
        tombol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol1ActionPerformed(evt);
            }
        });

        tombol2.setText("2");
        tombol2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol2MouseReleased(evt);
            }
        });
        tombol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol2ActionPerformed(evt);
            }
        });

        tombol3.setText("3");
        tombol3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol3MouseReleased(evt);
            }
        });
        tombol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol3ActionPerformed(evt);
            }
        });

        tombol4.setText("4");
        tombol4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol4MouseReleased(evt);
            }
        });
        tombol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol4ActionPerformed(evt);
            }
        });

        tombol5.setText("5");
        tombol5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol5MouseReleased(evt);
            }
        });
        tombol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol5ActionPerformed(evt);
            }
        });

        tombol6.setText("6");
        tombol6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol6MouseReleased(evt);
            }
        });
        tombol6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol6ActionPerformed(evt);
            }
        });

        tombol7.setText("7");
        tombol7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol7MouseReleased(evt);
            }
        });
        tombol7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol7ActionPerformed(evt);
            }
        });

        tombol8.setText("8");
        tombol8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol8MouseReleased(evt);
            }
        });
        tombol8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol8ActionPerformed(evt);
            }
        });

        tombol9.setText("9");
        tombol9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol9MouseReleased(evt);
            }
        });
        tombol9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol9ActionPerformed(evt);
            }
        });

        tombol0.setText("0");
        tombol0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombol0MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombol0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombol0MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombol0MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombol0MouseReleased(evt);
            }
        });
        tombol0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol0ActionPerformed(evt);
            }
        });

        tombolC.setText("C");
        tombolC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombolCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombolCMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tombolCMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tombolCMouseReleased(evt);
            }
        });
        tombolC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCActionPerformed(evt);
            }
        });

        samadengan.setText("=");
        samadengan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                samadenganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                samadenganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                samadenganMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                samadenganMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                samadenganMouseReleased(evt);
            }
        });
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        tambah.setText("+");
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tambahMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tambahMouseReleased(evt);
            }
        });
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        bagi.setText("/");
        bagi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bagiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bagiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bagiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bagiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bagiMouseReleased(evt);
            }
        });
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        kurang.setText("-");
        kurang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kurangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kurangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kurangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kurangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kurangMouseReleased(evt);
            }
        });
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        kali.setText("*");
        kali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kaliMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kaliMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                kaliMouseReleased(evt);
            }
        });
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tombol1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(tombol4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tombol7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tombol0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tombolC, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(tombol2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tombol5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tombol8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tombol6, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(tombol9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(kali, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tombol3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(samadengan, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tombol7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tombol9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tombol8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tombolC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tombol0, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombol8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol8ActionPerformed

    private void tombol9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol9ActionPerformed

    private void tombol0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol0ActionPerformed

    private void tombolCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_samadenganActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagiActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliActionPerformed

    private void tombol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol2ActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_tombol2ActionPerformed

    private void tombol1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol1MouseClicked
       angka += "1";
        jTextField1.setText(angka);  // TODO add your handling code here:
    }//GEN-LAST:event_tombol1MouseClicked

    private void tombol1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol1MouseEntered

    private void tombol1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol1MouseExited

    private void tombol1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol1MousePressed

    private void tombol1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol1MouseReleased

    private void tombol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol1ActionPerformed

    private void tombol2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol2MouseClicked
       angka += "2";
       jTextField1.setText(angka);         // TODO add your handling code here:
    }//GEN-LAST:event_tombol2MouseClicked

    private void tombol2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol2MouseEntered

    private void tombol2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol2MouseExited

    private void tombol2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol2MousePressed

    private void tombol2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol2MouseReleased

    private void tombol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol3ActionPerformed

    private void tombol3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol3MouseClicked
        angka += "3";
       jTextField1.setText(angka);  // TODO add your handling code here:
    }//GEN-LAST:event_tombol3MouseClicked

    private void tombol3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol3MouseEntered

    private void tombol3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol3MouseExited

    private void tombol3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol3MousePressed

    private void tombol3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol3MouseReleased

    private void tombol4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol4MouseClicked
       angka += "4";
       jTextField1.setText(angka);    // TODO add your handling code here:
    }//GEN-LAST:event_tombol4MouseClicked

    private void tombol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol4ActionPerformed

    private void tombol4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol4MouseEntered

    private void tombol4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol4MouseExited

    private void tombol4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol4MousePressed

    private void tombol4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol4MouseReleased

    private void tombol5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol5MouseClicked
       angka += "5";
       jTextField1.setText(angka);         // TODO add your handling code here:
    }//GEN-LAST:event_tombol5MouseClicked

    private void tombol5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol5ActionPerformed

    private void tombol5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol5MouseEntered

    private void tombol5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol5MouseExited

    private void tombol5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol5MousePressed

    private void tombol5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol5MouseReleased

    private void tombol6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol6ActionPerformed

    private void tombol6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol6MouseClicked
       angka += "6";
       jTextField1.setText(angka);         // TODO add your handling code here:
    }//GEN-LAST:event_tombol6MouseClicked

    private void tombol6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol6MouseEntered

    private void tombol6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol6MouseExited

    private void tombol6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol6MousePressed

    private void tombol6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol6MouseReleased

    private void tombol7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol7MouseClicked
        angka += "7";
       jTextField1.setText(angka);         // TODO add your handling code here:
    }//GEN-LAST:event_tombol7MouseClicked

    private void tombol7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol7MouseEntered

    private void tombol7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol7MouseExited

    private void tombol7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol7MousePressed

    private void tombol7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol7MouseReleased

    private void tombol8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol8MouseClicked
 angka += "8";
       jTextField1.setText(angka);         // TODO add your handling code here:
    }//GEN-LAST:event_tombol8MouseClicked

    private void tombol8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol8MouseEntered

    private void tombol8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol8MouseExited

    private void tombol8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol8MousePressed

    private void tombol8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol8MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol8MouseReleased

    private void tombol9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol9MouseClicked
       angka += "9";
       jTextField1.setText(angka);         // TODO add your handling code here:
    }//GEN-LAST:event_tombol9MouseClicked

    private void tombol7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol7ActionPerformed

    private void tombol9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol9MouseEntered

    private void tombol9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol9MouseExited

    private void tombol9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol9MousePressed

    private void tombol9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol9MouseReleased

    private void tombol0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol0MouseClicked
       angka += "0";
       jTextField1.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_tombol0MouseClicked

    private void tombol0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol0MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol0MouseEntered

    private void tombol0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol0MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol0MouseExited

    private void tombol0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol0MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombol0MousePressed

    private void tombol0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombol0MouseReleased

    }//GEN-LAST:event_tombol0MouseReleased

    private void tombolCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCMouseClicked
jTextField1.setText("");
        angka1 =0.0 ;
        angka2 =0.0 ;
        jumlah =0.0 ;
        angka = "" ;          // TODO add your handling code here:
    }//GEN-LAST:event_tombolCMouseClicked

    private void tombolCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCMouseEntered

    private void tombolCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCMouseExited

    private void tombolCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCMousePressed

    private void tombolCMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCMouseReleased

    private void tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseClicked
      angka1 = Double.parseDouble(angka);
       jTextField1.setText("+");
        angka = ""; 
        pilih = 1;              // TODO add your handling code here:
    }//GEN-LAST:event_tambahMouseClicked

    private void tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahMouseEntered

    private void tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahMouseExited

    private void tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahMousePressed

    private void tambahMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahMouseReleased

    private void kurangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurangMouseClicked
        angka1 = Double.parseDouble(angka);
        jTextField1.setText("-");
        angka = "" ;
        pilih = 2;              // TODO add your handling code here:
    }//GEN-LAST:event_kurangMouseClicked

    private void kurangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurangMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_kurangMouseEntered

    private void kurangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurangMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_kurangMouseExited

    private void kurangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurangMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kurangMousePressed

    private void kurangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurangMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_kurangMouseReleased

    private void kaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaliMouseClicked
        angka1 = Double.parseDouble(angka);
        jTextField1.setText("*");
        angka = "";
        pilih = 3;             // TODO add your handling code here:
    }//GEN-LAST:event_kaliMouseClicked

    private void kaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaliMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliMouseEntered

    private void kaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaliMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliMouseExited

    private void kaliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaliMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliMousePressed

    private void kaliMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaliMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliMouseReleased

    private void samadenganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samadenganMouseClicked
switch (pilih) {
            case 1 :
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 + angka2 ;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 2 :
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 - angka2 ;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 3 :
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 * angka2 ;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 4 :
                angka2 = Double.parseDouble(angka);
                jumlah = angka1/angka2 ;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
                default:
                break;        // TODO add your handling code here:
    }                             // TODO add your handling code here:
    }//GEN-LAST:event_samadenganMouseClicked

    private void samadenganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samadenganMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_samadenganMouseEntered

    private void samadenganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samadenganMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_samadenganMouseExited

    private void samadenganMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samadenganMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_samadenganMousePressed

    private void samadenganMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_samadenganMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_samadenganMouseReleased

    private void bagiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagiMouseClicked
angka1 = Double.parseDouble(angka);
        jTextField1.setText("/");
        angka = "";
        pilih = 4;          // TODO add your handling code here:
    }//GEN-LAST:event_bagiMouseClicked

    private void bagiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bagiMouseEntered

    private void bagiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bagiMouseExited

    private void bagiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagiMousePressed

    private void bagiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagiMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bagiMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton tambah;
    private javax.swing.JButton tombol0;
    private javax.swing.JButton tombol1;
    private javax.swing.JButton tombol2;
    private javax.swing.JButton tombol3;
    private javax.swing.JButton tombol4;
    private javax.swing.JButton tombol5;
    private javax.swing.JButton tombol6;
    private javax.swing.JButton tombol7;
    private javax.swing.JButton tombol8;
    private javax.swing.JButton tombol9;
    private javax.swing.JButton tombolC;
    // End of variables declaration//GEN-END:variables
}
