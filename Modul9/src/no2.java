import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class no2 extends JFrame {
    TextField tf = new TextField("");
    Button b1 = new Button("1");
    Button b2 = new Button("2");
    Button b3 = new Button("3");
    Button b4 = new Button("4");
    Button b5 = new Button("5");
    Button b6 = new Button("6");
    Button b7 = new Button("7");
    Button b8 = new Button("8");
    Button b9 = new Button("9");
    Button b0 = new Button("0");
    Button bc = new Button("C");
    Button bplus = new Button("+");
    Button bmin = new Button("-");
    Button bkali = new Button("*");
    Button bbagi = new Button("/");
    Button bsmdengan = new Button("=");
    no2() {
        setTitle("Design Preview");
        setLocation(200, 100);
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek() {
        getContentPane().setLayout(null);
        getContentPane().add(tf);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        getContentPane().add(b6);
        getContentPane().add(b7);
        getContentPane().add(b8);
        getContentPane().add(b9);
        getContentPane().add(b0);
        getContentPane().add(bc);
        getContentPane().add(bplus);
        getContentPane().add(bmin);
        getContentPane().add(bkali);
        getContentPane().add(bbagi);
        getContentPane().add(bsmdengan);

        tf.setBounds(30, 30, 150, 20);
        b1.setBounds(30, 90, 150, 20);
        b4.setBounds(30, 150, 150, 20);
        b7.setBounds(30, 210, 150, 20);
        b0.setBounds(30, 270, 150, 20);
        b2.setBounds(90, 90, 150, 20);
        b5.setBounds(90, 150, 150, 20);
        b8.setBounds(90, 210, 150, 20);
        bc.setBounds(90, 270, 150, 20);
        b3.setBounds(150, 90, 150, 20);
        b6.setBounds(150, 150, 150, 20);
        b9.setBounds(150, 210, 150, 20);
        bsmdengan.setBounds(150, 270, 150, 20);
        bplus.setBounds(210, 90, 150, 20);
        bmin.setBounds(210, 150, 150, 20);
        bkali.setBounds(210, 210, 150, 20);
        bbagi.setBounds(210, 270, 150, 20);

        tf.setSize(230, 50);
        b1.setSize(50, 50);
        b2.setSize(50, 50);
        b3.setSize(50, 50);
        b4.setSize(50, 50);
        b5.setSize(50, 50);
        b6.setSize(50, 50);
        b7.setSize(50, 50);
        b8.setSize(50, 50);
        b9.setSize(50, 50);
        b0.setSize(50, 50);
        bc.setSize(50, 50);
        bplus.setSize(50, 50);
        bmin.setSize(50, 50);
        bkali.setSize(50, 50);
        bbagi.setSize(50, 50);
        bsmdengan.setSize(50, 50);
        setVisible(true);
    }
    String Angka = "";
    double jumlah, angka1, angka2;
    int pilih;

    void aksi() {
        b1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "1";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "2";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {             
            }
            @Override
            public void mouseEntered(MouseEvent me) {              
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "3";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "4";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "5";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b6.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "6";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "7";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b8.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "8";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b9.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "9";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        b0.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Angka += "0";
                tf.setText(Angka);
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        bc.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                tf.setText("");
                angka1 = 0.0;
                angka2 = 0.0;
                jumlah = 0.0;
                Angka = "";
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        bplus.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                angka1 = Double.parseDouble(Angka);
                tf.setText("+");
                Angka = "";
                pilih = 1;
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        bmin.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                angka1 = Double.parseDouble(Angka);
                tf.setText("-");
                Angka = "";
                pilih = 2;
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        bkali.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                angka1 = Double.parseDouble(Angka);
                tf.setText("*");
                Angka = "";
                pilih = 3;
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        bbagi.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                angka1 = Double.parseDouble(Angka);
                tf.setText("/");
                Angka = "";
                pilih = 4;
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
        bsmdengan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                switch (pilih) {
                    case 1:
                        angka2 = Double.parseDouble(Angka);
                        jumlah = angka1 + angka2;
                        Angka = Double.toString(jumlah);
                        tf.setText(Angka);
                        break;
                    case 2:
                        angka2 = Double.parseDouble(Angka);
                        jumlah = angka1 - angka2;
                        Angka = Double.toString(jumlah);
                        tf.setText(Angka);
                        break;
                    case 3:
                        angka2 = Double.parseDouble(Angka);
                        jumlah = angka1 * angka2;
                        Angka = Double.toString(jumlah);
                        tf.setText(Angka);
                        break;
                    case 4:
                        angka2 = Double.parseDouble(Angka);
                        jumlah = angka1 / angka2;
                        Angka = Double.toString(jumlah);
                        tf.setText(Angka);
                        break;
                    default:
                        break;
                }
            }
            @Override
            public void mousePressed(MouseEvent me) {
            }
            @Override
            public void mouseReleased(MouseEvent me) {
            }
            @Override
            public void mouseEntered(MouseEvent me) {
            }
            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
    }

    public static void main(String[] args) {
        no2 cc = new no2();
        cc.objek();
        cc.aksi();
    }
}
