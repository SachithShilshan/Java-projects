package Pack01;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelPlayerTurn = new javax.swing.JLabel();
        LabelPlayer1Score = new javax.swing.JLabel();
        LabelPlayer2Score = new javax.swing.JLabel();
        ButtonReset = new javax.swing.JButton();
        ButtonReload = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        localBoard7 = new javax.swing.JPanel();
        Button700 = new javax.swing.JButton();
        Button701 = new javax.swing.JButton();
        Button702 = new javax.swing.JButton();
        Button710 = new javax.swing.JButton();
        Button711 = new javax.swing.JButton();
        Button712 = new javax.swing.JButton();
        Button720 = new javax.swing.JButton();
        Button721 = new javax.swing.JButton();
        Button722 = new javax.swing.JButton();
        localBoard1 = new javax.swing.JPanel();
        Button100 = new javax.swing.JButton();
        Button101 = new javax.swing.JButton();
        Button102 = new javax.swing.JButton();
        Button110 = new javax.swing.JButton();
        Button111 = new javax.swing.JButton();
        Button112 = new javax.swing.JButton();
        Button120 = new javax.swing.JButton();
        Button121 = new javax.swing.JButton();
        Button122 = new javax.swing.JButton();
        localBoard2 = new javax.swing.JPanel();
        Button200 = new javax.swing.JButton();
        Button201 = new javax.swing.JButton();
        Button202 = new javax.swing.JButton();
        Button210 = new javax.swing.JButton();
        Button211 = new javax.swing.JButton();
        Button212 = new javax.swing.JButton();
        Button220 = new javax.swing.JButton();
        Button221 = new javax.swing.JButton();
        Button222 = new javax.swing.JButton();
        localBoard6 = new javax.swing.JPanel();
        Button600 = new javax.swing.JButton();
        Button601 = new javax.swing.JButton();
        Button602 = new javax.swing.JButton();
        Button610 = new javax.swing.JButton();
        Button611 = new javax.swing.JButton();
        Button612 = new javax.swing.JButton();
        Button620 = new javax.swing.JButton();
        Button621 = new javax.swing.JButton();
        Button622 = new javax.swing.JButton();
        localBoard5 = new javax.swing.JPanel();
        Button500 = new javax.swing.JButton();
        Button501 = new javax.swing.JButton();
        Button502 = new javax.swing.JButton();
        Button510 = new javax.swing.JButton();
        Button511 = new javax.swing.JButton();
        Button512 = new javax.swing.JButton();
        Button520 = new javax.swing.JButton();
        Button521 = new javax.swing.JButton();
        Button522 = new javax.swing.JButton();
        localBoard8 = new javax.swing.JPanel();
        Button800 = new javax.swing.JButton();
        Button801 = new javax.swing.JButton();
        Button802 = new javax.swing.JButton();
        Button810 = new javax.swing.JButton();
        Button811 = new javax.swing.JButton();
        Button812 = new javax.swing.JButton();
        Button820 = new javax.swing.JButton();
        Button821 = new javax.swing.JButton();
        Button822 = new javax.swing.JButton();
        localBoard3 = new javax.swing.JPanel();
        Button300 = new javax.swing.JButton();
        Button301 = new javax.swing.JButton();
        Button302 = new javax.swing.JButton();
        Button310 = new javax.swing.JButton();
        Button311 = new javax.swing.JButton();
        Button312 = new javax.swing.JButton();
        Button320 = new javax.swing.JButton();
        Button321 = new javax.swing.JButton();
        Button322 = new javax.swing.JButton();
        localBoard4 = new javax.swing.JPanel();
        Button400 = new javax.swing.JButton();
        Button401 = new javax.swing.JButton();
        Button402 = new javax.swing.JButton();
        Button410 = new javax.swing.JButton();
        Button411 = new javax.swing.JButton();
        Button412 = new javax.swing.JButton();
        Button420 = new javax.swing.JButton();
        Button421 = new javax.swing.JButton();
        Button422 = new javax.swing.JButton();
        localBoard9 = new javax.swing.JPanel();
        Button900 = new javax.swing.JButton();
        Button901 = new javax.swing.JButton();
        Button902 = new javax.swing.JButton();
        Button910 = new javax.swing.JButton();
        Button911 = new javax.swing.JButton();
        Button912 = new javax.swing.JButton();
        Button920 = new javax.swing.JButton();
        Button921 = new javax.swing.JButton();
        Button922 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PlyerWinLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe Ultimate");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Player1 Symbol : O");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Player2 Symbol : X ");

        LabelPlayerTurn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelPlayerTurn.setText("Player Turn : 1");

        LabelPlayer1Score.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelPlayer1Score.setText("Player1 Score : 0");

        LabelPlayer2Score.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelPlayer2Score.setText("Player2 Score : 0");

        ButtonReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        ButtonReload.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonReload.setText("Reload");
        ButtonReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonReloadActionPerformed(evt);
            }
        });

        localBoard7.setBackground(new java.awt.Color(255, 255, 255));
        localBoard7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard7.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard7.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard7.setPreferredSize(new java.awt.Dimension(100, 100));
        localBoard7.setLayout(new java.awt.GridLayout(3, 3));

        Button700.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button700.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button700ActionPerformed(evt);
            }
        });
        localBoard7.add(Button700);

        Button701.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button701.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button701ActionPerformed(evt);
            }
        });
        localBoard7.add(Button701);

        Button702.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button702.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button702ActionPerformed(evt);
            }
        });
        localBoard7.add(Button702);

        Button710.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button710.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button710ActionPerformed(evt);
            }
        });
        localBoard7.add(Button710);

        Button711.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button711.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button711ActionPerformed(evt);
            }
        });
        localBoard7.add(Button711);

        Button712.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button712.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button712ActionPerformed(evt);
            }
        });
        localBoard7.add(Button712);

        Button720.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button720.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button720ActionPerformed(evt);
            }
        });
        localBoard7.add(Button720);

        Button721.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button721.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button721ActionPerformed(evt);
            }
        });
        localBoard7.add(Button721);

        Button722.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button722.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button722ActionPerformed(evt);
            }
        });
        localBoard7.add(Button722);

        localBoard1.setBackground(new java.awt.Color(255, 255, 255));
        localBoard1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard1.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard1.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard1.setLayout(new java.awt.GridLayout(3, 3));

        Button100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button100.setPreferredSize(new java.awt.Dimension(33, 33));
        Button100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button100ActionPerformed(evt);
            }
        });
        localBoard1.add(Button100);

        Button101.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button101ActionPerformed(evt);
            }
        });
        localBoard1.add(Button101);

        Button102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button102ActionPerformed(evt);
            }
        });
        localBoard1.add(Button102);

        Button110.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button110ActionPerformed(evt);
            }
        });
        localBoard1.add(Button110);

        Button111.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button111ActionPerformed(evt);
            }
        });
        localBoard1.add(Button111);

        Button112.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button112ActionPerformed(evt);
            }
        });
        localBoard1.add(Button112);

        Button120.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button120ActionPerformed(evt);
            }
        });
        localBoard1.add(Button120);

        Button121.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button121ActionPerformed(evt);
            }
        });
        localBoard1.add(Button121);

        Button122.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button122ActionPerformed(evt);
            }
        });
        localBoard1.add(Button122);

        localBoard2.setBackground(new java.awt.Color(255, 255, 255));
        localBoard2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard2.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard2.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard2.setLayout(new java.awt.GridLayout(3, 3));

        Button200.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button200ActionPerformed(evt);
            }
        });
        localBoard2.add(Button200);

        Button201.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button201ActionPerformed(evt);
            }
        });
        localBoard2.add(Button201);

        Button202.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button202ActionPerformed(evt);
            }
        });
        localBoard2.add(Button202);

        Button210.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button210ActionPerformed(evt);
            }
        });
        localBoard2.add(Button210);

        Button211.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button211ActionPerformed(evt);
            }
        });
        localBoard2.add(Button211);

        Button212.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button212ActionPerformed(evt);
            }
        });
        localBoard2.add(Button212);

        Button220.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button220ActionPerformed(evt);
            }
        });
        localBoard2.add(Button220);

        Button221.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button221ActionPerformed(evt);
            }
        });
        localBoard2.add(Button221);

        Button222.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button222ActionPerformed(evt);
            }
        });
        localBoard2.add(Button222);

        localBoard6.setBackground(new java.awt.Color(255, 255, 255));
        localBoard6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard6.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard6.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard6.setLayout(new java.awt.GridLayout(3, 3));

        Button600.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button600ActionPerformed(evt);
            }
        });
        localBoard6.add(Button600);

        Button601.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button601.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button601ActionPerformed(evt);
            }
        });
        localBoard6.add(Button601);

        Button602.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button602.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button602ActionPerformed(evt);
            }
        });
        localBoard6.add(Button602);

        Button610.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button610.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button610ActionPerformed(evt);
            }
        });
        localBoard6.add(Button610);

        Button611.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button611.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button611ActionPerformed(evt);
            }
        });
        localBoard6.add(Button611);

        Button612.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button612.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button612ActionPerformed(evt);
            }
        });
        localBoard6.add(Button612);

        Button620.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button620.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button620ActionPerformed(evt);
            }
        });
        localBoard6.add(Button620);

        Button621.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button621.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button621ActionPerformed(evt);
            }
        });
        localBoard6.add(Button621);

        Button622.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button622.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button622ActionPerformed(evt);
            }
        });
        localBoard6.add(Button622);

        localBoard5.setBackground(new java.awt.Color(255, 255, 255));
        localBoard5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard5.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard5.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard5.setLayout(new java.awt.GridLayout(3, 3));

        Button500.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button500ActionPerformed(evt);
            }
        });
        localBoard5.add(Button500);

        Button501.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button501.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button501ActionPerformed(evt);
            }
        });
        localBoard5.add(Button501);

        Button502.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button502.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button502ActionPerformed(evt);
            }
        });
        localBoard5.add(Button502);

        Button510.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button510.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button510ActionPerformed(evt);
            }
        });
        localBoard5.add(Button510);

        Button511.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button511.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button511ActionPerformed(evt);
            }
        });
        localBoard5.add(Button511);

        Button512.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button512.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button512ActionPerformed(evt);
            }
        });
        localBoard5.add(Button512);

        Button520.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button520.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button520ActionPerformed(evt);
            }
        });
        localBoard5.add(Button520);

        Button521.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button521.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button521ActionPerformed(evt);
            }
        });
        localBoard5.add(Button521);

        Button522.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button522.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button522ActionPerformed(evt);
            }
        });
        localBoard5.add(Button522);

        localBoard8.setBackground(new java.awt.Color(255, 255, 255));
        localBoard8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard8.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard8.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard8.setLayout(new java.awt.GridLayout(3, 3));

        Button800.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button800ActionPerformed(evt);
            }
        });
        localBoard8.add(Button800);

        Button801.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button801.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button801ActionPerformed(evt);
            }
        });
        localBoard8.add(Button801);

        Button802.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button802.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button802ActionPerformed(evt);
            }
        });
        localBoard8.add(Button802);

        Button810.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button810.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button810ActionPerformed(evt);
            }
        });
        localBoard8.add(Button810);

        Button811.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button811.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button811ActionPerformed(evt);
            }
        });
        localBoard8.add(Button811);

        Button812.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button812.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button812ActionPerformed(evt);
            }
        });
        localBoard8.add(Button812);

        Button820.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button820.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button820ActionPerformed(evt);
            }
        });
        localBoard8.add(Button820);

        Button821.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button821.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button821ActionPerformed(evt);
            }
        });
        localBoard8.add(Button821);

        Button822.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button822.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button822ActionPerformed(evt);
            }
        });
        localBoard8.add(Button822);

        localBoard3.setBackground(new java.awt.Color(255, 255, 255));
        localBoard3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard3.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard3.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard3.setLayout(new java.awt.GridLayout(3, 3));

        Button300.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button300ActionPerformed(evt);
            }
        });
        localBoard3.add(Button300);

        Button301.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button301ActionPerformed(evt);
            }
        });
        localBoard3.add(Button301);

        Button302.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button302ActionPerformed(evt);
            }
        });
        localBoard3.add(Button302);

        Button310.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button310ActionPerformed(evt);
            }
        });
        localBoard3.add(Button310);

        Button311.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button311ActionPerformed(evt);
            }
        });
        localBoard3.add(Button311);

        Button312.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button312ActionPerformed(evt);
            }
        });
        localBoard3.add(Button312);

        Button320.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button320.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button320ActionPerformed(evt);
            }
        });
        localBoard3.add(Button320);

        Button321.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button321.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button321ActionPerformed(evt);
            }
        });
        localBoard3.add(Button321);

        Button322.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button322.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button322ActionPerformed(evt);
            }
        });
        localBoard3.add(Button322);

        localBoard4.setBackground(new java.awt.Color(255, 255, 255));
        localBoard4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard4.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard4.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard4.setLayout(new java.awt.GridLayout(3, 3));

        Button400.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button400ActionPerformed(evt);
            }
        });
        localBoard4.add(Button400);

        Button401.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button401.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button401ActionPerformed(evt);
            }
        });
        localBoard4.add(Button401);

        Button402.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button402.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button402ActionPerformed(evt);
            }
        });
        localBoard4.add(Button402);

        Button410.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button410.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button410ActionPerformed(evt);
            }
        });
        localBoard4.add(Button410);

        Button411.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button411.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button411ActionPerformed(evt);
            }
        });
        localBoard4.add(Button411);

        Button412.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button412.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button412ActionPerformed(evt);
            }
        });
        localBoard4.add(Button412);

        Button420.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button420.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button420ActionPerformed(evt);
            }
        });
        localBoard4.add(Button420);

        Button421.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button421.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button421ActionPerformed(evt);
            }
        });
        localBoard4.add(Button421);

        Button422.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button422.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button422ActionPerformed(evt);
            }
        });
        localBoard4.add(Button422);

        localBoard9.setBackground(new java.awt.Color(255, 255, 255));
        localBoard9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 255), 3, true));
        localBoard9.setMaximumSize(new java.awt.Dimension(40000, 40000));
        localBoard9.setMinimumSize(new java.awt.Dimension(40000, 40000));
        localBoard9.setLayout(new java.awt.GridLayout(3, 3));

        Button900.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button900.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button900ActionPerformed(evt);
            }
        });
        localBoard9.add(Button900);

        Button901.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button901.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button901ActionPerformed(evt);
            }
        });
        localBoard9.add(Button901);

        Button902.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button902.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button902ActionPerformed(evt);
            }
        });
        localBoard9.add(Button902);

        Button910.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button910.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button910ActionPerformed(evt);
            }
        });
        localBoard9.add(Button910);

        Button911.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button911.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button911ActionPerformed(evt);
            }
        });
        localBoard9.add(Button911);

        Button912.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button912.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button912ActionPerformed(evt);
            }
        });
        localBoard9.add(Button912);

        Button920.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button920.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button920ActionPerformed(evt);
            }
        });
        localBoard9.add(Button920);

        Button921.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button921.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button921ActionPerformed(evt);
            }
        });
        localBoard9.add(Button921);

        Button922.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Button922.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button922ActionPerformed(evt);
            }
        });
        localBoard9.add(Button922);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(localBoard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localBoard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localBoard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localBoard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(localBoard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(localBoard7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(localBoard8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(localBoard6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 232, Short.MAX_VALUE)
                    .addComponent(localBoard9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {localBoard1, localBoard2, localBoard3, localBoard4, localBoard5, localBoard6, localBoard7, localBoard8, localBoard9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(localBoard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(localBoard6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(localBoard2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(localBoard1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localBoard5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(localBoard4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localBoard8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localBoard7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(89, Short.MAX_VALUE)
                    .addComponent(localBoard9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {localBoard1, localBoard2, localBoard3, localBoard4, localBoard5, localBoard6, localBoard7, localBoard8, localBoard9});

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Description");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Marks");

        jLabel6.setText("Any move");

        jLabel7.setText("Wining a local board");

        jLabel8.setText("Wining the global board");

        jLabel9.setText("-5 per move");

        jLabel10.setText("100 per board Wining the");

        jLabel11.setText("700");

        jMenu1.setText("File");

        jMenuItem2.setText("Close");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPlayerTurn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel2)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel5)))
                        .addGap(0, 208, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlyerWinLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabelPlayer1Score)
                                .addComponent(LabelPlayer2Score))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonReset)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonReload)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(PlyerWinLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(LabelPlayerTurn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(LabelPlayer1Score)
                        .addGap(16, 16, 16)
                        .addComponent(LabelPlayer2Score)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonReset)
                            .addComponent(ButtonReload))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//Help Button
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Icon Ic = new ImageIcon("B.jpg");
        JOptionPane.showMessageDialog(Main.this, "TicTacToe Ultimate is a complex variation of the standard TicTacToe that is played by two players. \n"
                + "The rules for playing the game \\nare given below.\n"
                + "The game board consists of 3X3 standard TicTacToe boards, as shown in Figure 1.\\n\n"
                + "\n"
                + "Each small 3-by-3 tictactoe board is referred to as a local board, and the larger 3-by-3 board is \n"
                + "referred to as the global board.\n"
                + "The two players play by marking the slots with X and O alternately.\n"
                + "The game starts with X playing wherever they want in any of the 81 empty spots.\n"
                + "This move 'sends' their opponent to its relative location. For example, if X played in the top right \n"
                + "square of their local board, \\nthen O needs to play next in the local board at the top right of the \n"
                + "global board, as shown in Figure 2.\n"
                + "\n"
                + "\n"
                + "O can then play in any one of the nine available squares in that local board (with the orange border \n"
                + "in Figure 2), each move sending X to a different local board. For example, if O marks the bottom middle\n"
                + " square then X has to be marked in the bottom-middle local board as shown in Figure 3.\n"
                + "\n"
                + "If a move is played so that it is to win a local board by the rules of standard TicTacToe, then the\n"
                + "entire local board is marked as a victory for the player in the global board as shown in Figure 4.\n"
                + "\n"
                + "Once a local board is won by a player, or it is filled completely, no more moves may be played in \n"
                + "that board. If a player is sent to such a board, then that player may play on any other local board.\n"
                + " See such a case in Figure 5.\n"
                + "\n"
                + "Game play ends when either a player wins the global board, or there are no legal moves remaining,\n"
                + " in which case the game is a draw.", "HELP", HEIGHT, Ic);


    }//GEN-LAST:event_jMenuItem1ActionPerformed
//close Button
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        this.setVisible(false);
        Start.frame.setVisible(true);
        Start.resume.setVisible(true);
        Start.Player1labal.setVisible(false);
        Start.Player1Input.setVisible(false);
        Start.Player2labal.setVisible(false);
        Start.Player2Input.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

//Main1 Method
    void main1() {
         

        // TODO code application logic here

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

//Reset Button 
    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        reset();

    }//GEN-LAST:event_ButtonResetActionPerformed

//reset method     
    void reset() {
        setcolor();
        turn = 0;
        Play1Score = 0;
        Play2Score = 0;
        visible();
        unlockBoard();
        for (int i = 1; i < 10; i++) {
            boardes(i).remove(labalO);
            boardes(i).remove(labalX);
        }

        LabelPlayer1Score.setText("Player1 Score : 0");
        LabelPlayer2Score.setText("Player2 Score : 0");
        LabelPlayerTurn.setText("Player Turn : " + (turn + 1));
    }

    //Reload Button
    private void ButtonReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonReloadActionPerformed
        //if Reload the Game add 700 marks for most win localboard plyer in turn 1        
        if (o > x) {
            Play1Score += 700; //add 700 marks for player 1
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            PlyerWinLabel.setText("Global board Win = Player1");
            removeLabal();  // win x and win o labales remove

        }
        if (o < x) {
            Play2Score += 700;//add 700 marks for player 2
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            PlyerWinLabel.setText("Global board Win = Player2");
            removeLabal();// win x and win o labales remove

        }
        if (o == x) {
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            PlyerWinLabel.setText("Draw");
            removeLabal();

        }

        visible();//visible the all buttons
        unlockBoard();//unlock the all buttons and o,x integeres set value 0

        unlockBoard();

        turn = 0;
        LabelPlayerTurn.setText("Player Turn : " + (turn + 1)); //addition 1 for the turn 
       
    }//GEN-LAST:event_ButtonReloadActionPerformed

//remove labalO and labalX
    void removeLabal() {

        for (int i = 1; i < 10; i++) { //Remove the all labal in Won the localboards 
            boardes(i).remove(labalO);
            boardes(i).remove(labalX);
        }
    }

    //all localBoardes set to White color
    public void setcolor() {
        localBoard1.setBackground(Color.WHITE);
        localBoard2.setBackground(Color.WHITE);
        localBoard3.setBackground(Color.WHITE);
        localBoard4.setBackground(Color.WHITE);
        localBoard5.setBackground(Color.WHITE);
        localBoard6.setBackground(Color.WHITE);
        localBoard7.setBackground(Color.WHITE);
        localBoard8.setBackground(Color.WHITE);
        localBoard9.setBackground(Color.WHITE);
    }

    //Localboardes set to number and call it
    JPanel boardes(int Y) {
        if (Y == 1) {
            return localBoard1;
        }
        if (Y == 2) {
            return localBoard2;
        }
        if (Y == 3) {
            return localBoard3;
        }
        if (Y == 4) {
            return localBoard4;
        }
        if (Y == 5) {
            return localBoard5;
        }
        if (Y == 6) {
            return localBoard6;
        }
        if (Y == 7) {
            return localBoard7;
        }
        if (Y == 8) {
            return localBoard8;
        }
        if (Y == 9) {
            return localBoard9;
        }
        return null;
    }

//all localboardes first Button
    public void Button00(JButton B, int i) {

        setcolor();  //set white color for all lacalboard
        unlockLBoard(); //unlock all localboard and Cannot unmark/remark an already marked square

        if (turn % 2 == 0) {
            //plyer 1         
            B.setEnabled(false);
            B.setText("O"); //Button set to "O"
            Play1Score -= 5; //if move loss 5 marks
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score); //show loss 5 marks
            board[i][0][0] = 'O';
            if (checkWin('O', i)) {
                Play1Score += 100;//if win localboard add 100 marks for localboard win player
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);//show add 100 marks
            }
            turn++; //add 1 value for turn 
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            //plyer 2
            B.setEnabled(false);
            B.setText("X");//Button set to "X"
            Play2Score -= 5;//if move loss 5 marks
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score); //show loss 5 marks
            board[i][0][0] = 'X';
            if (checkWin('X', i)) {
                Play2Score += 100;//if win localboard add 100 marks for localboard win player
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);//show add 100 marks

            }
            turn++;//add 1 value for turn 
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));
        }

        localBoard1.setBackground(Color.red); //localboard 1 set to color red because of clicked any localboard first button
        unlockBoard1();// only click localboard 1 buttons and other buttons are lock

    }

    //all localboardes second Button
    public void Button01(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][0][1] = 'O';

            if (checkWin('O', i)) {
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            board[i][0][1] = 'X';
            if (checkWin('X', i)) {
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }

        localBoard2.setBackground(Color.red);
        unlockBoard2();
    }

    //all localboardes third Button
    public void Button02(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][0][2] = 'O';
            if (checkWin('O', i)) {
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][0][2] = 'X';
            if (checkWin('X', i)) {
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }
        localBoard3.setBackground(Color.red);
        unlockBoard3();
    }

    //all localboardes fourth Button
    public void Button10(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            board[i][1][0] = 'O';
            if (checkWin('O', i)) {
                //lockBoard();
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            board[i][1][0] = 'X';
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            if (checkWin('X', i)) {
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }
        localBoard4.setBackground(Color.red);
        unlockBoard4();
    }

    //all localboardes fifth Button
    public void Button11(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][1][1] = 'O';
            if (checkWin('O', i)) {
                // lockBoard();
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            board[i][1][1] = 'X';
            if (checkWin('X', i)) {
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }
        localBoard5.setBackground(Color.red);
        unlockBoard5();
    }

    //all localboardes sixth Button
    public void Button12(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][1][2] = 'O';
            if (checkWin('O', i)) {
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            board[i][1][2] = 'X';

            if (checkWin('X', i)) {
                //   lockBoard();
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }
        localBoard6.setBackground(Color.red);
        unlockBoard6();
    }

    //all localboardes seventh Button
    public void Button20(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][2][0] = 'O';
            if (checkWin('O', i)) {
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            board[i][2][0] = 'X';
            if (checkWin('X', i)) {
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }
        localBoard7.setBackground(Color.red);
        unlockBoard7();
    }

    //all localboardes eighth Button
    public void Button21(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][2][1] = 'O';

            if (checkWin('O', i)) {
                //  lockBoard();
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            board[i][2][1] = 'X';

            if (checkWin('X', i)) {
                // lockBoard();
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }
        localBoard8.setBackground(Color.red);
        unlockBoard8();
    }

    //all localboardes ninth Button
    public void Button22(JButton B, int i) {
        setcolor();
        unlockLBoard();
        if (turn % 2 == 0) {
            //Player1
            B.setEnabled(false);
            B.setText("O");
            Play1Score -= 5;
            LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
            board[i][2][2] = 'O';
            if (checkWin('O', i)) {
                Play1Score += 100;
                LabelPlayer1Score.setText("Player1 Score : " + Play1Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        } else {
            B.setEnabled(false);
            B.setText("X");
            Play2Score -= 5;
            LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
            board[i][2][2] = 'X';
            if (checkWin('X', i)) {
                Play2Score += 100;
                LabelPlayer2Score.setText("Player2 Score : " + Play2Score);
                unlockLBoard();
            }
            turn++;
            LabelPlayerTurn.setText("Player Turn : " + ((turn % 2) + 1));

        }
        localBoard9.setBackground(Color.red);
        unlockBoard9();
    }


    private void Button100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button100ActionPerformed
        JButton B = new JButton();
        B = Button100;
        Button00(B, 1);//B equal this Button,1 is localbord(1) number and it return to Button00

    }//GEN-LAST:event_Button100ActionPerformed

    private void Button101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button101ActionPerformed

        JButton B = new JButton();
        B = Button101;
        Button01(B, 1);

    }//GEN-LAST:event_Button101ActionPerformed

    private void Button102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button102ActionPerformed
        JButton B = new JButton();
        B = Button102;
        Button02(B, 1);
    }//GEN-LAST:event_Button102ActionPerformed

    private void Button110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button110ActionPerformed
        JButton B = new JButton();
        B = Button110;
        Button10(B, 1);
    }//GEN-LAST:event_Button110ActionPerformed

    private void Button111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button111ActionPerformed
        JButton B = new JButton();
        B = Button111;
        Button11(B, 1);
    }//GEN-LAST:event_Button111ActionPerformed

    private void Button112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button112ActionPerformed
        JButton B = new JButton();
        B = Button112;
        Button12(B, 1);
    }//GEN-LAST:event_Button112ActionPerformed

    private void Button120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button120ActionPerformed
        JButton B = new JButton();
        B = Button120;
        Button20(B, 1);
    }//GEN-LAST:event_Button120ActionPerformed


    private void Button121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button121ActionPerformed
        JButton B = new JButton();
        B = Button121;
        Button21(B, 1);

    }//GEN-LAST:event_Button121ActionPerformed

    private void Button122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button122ActionPerformed
        JButton B = new JButton();
        B = Button122;
        Button22(B, 1);
    }//GEN-LAST:event_Button122ActionPerformed

    private void Button200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button200ActionPerformed
        JButton B = new JButton();
        B = Button200;
        Button00(B, 2);

    }//GEN-LAST:event_Button200ActionPerformed

    private void Button300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button300ActionPerformed
        JButton B = new JButton();
        B = Button300;
        Button00(B, 3);

    }//GEN-LAST:event_Button300ActionPerformed

    private void Button511ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button511ActionPerformed
        JButton B = new JButton();
        B = Button511;
        Button11(B, 5);
    }//GEN-LAST:event_Button511ActionPerformed

    private void Button711ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button711ActionPerformed
        JButton B = new JButton();
        B = Button711;
        Button11(B, 7);
    }//GEN-LAST:event_Button711ActionPerformed

    private void Button201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button201ActionPerformed
        JButton B = new JButton();
        B = Button201;
        Button01(B, 2);
    }//GEN-LAST:event_Button201ActionPerformed

    private void Button202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button202ActionPerformed
        JButton B = new JButton();
        B = Button202;
        Button02(B, 2);
    }//GEN-LAST:event_Button202ActionPerformed

    private void Button212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button212ActionPerformed
        JButton B = new JButton();
        B = Button212;
        Button12(B, 2);
    }//GEN-LAST:event_Button212ActionPerformed

    private void Button211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button211ActionPerformed
        JButton B = new JButton();
        B = Button211;
        Button11(B, 2);
    }//GEN-LAST:event_Button211ActionPerformed

    private void Button210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button210ActionPerformed
        JButton B = new JButton();
        B = Button210;
        Button10(B, 2);
    }//GEN-LAST:event_Button210ActionPerformed

    private void Button220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button220ActionPerformed
        JButton B = new JButton();
        B = Button220;
        Button20(B, 2);
    }//GEN-LAST:event_Button220ActionPerformed

    private void Button221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button221ActionPerformed
        JButton B = new JButton();
        B = Button221;
        Button21(B, 2);
    }//GEN-LAST:event_Button221ActionPerformed

    private void Button222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button222ActionPerformed
        JButton B = new JButton();
        B = Button222;
        Button22(B, 2);
    }//GEN-LAST:event_Button222ActionPerformed

    private void Button301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button301ActionPerformed
        JButton B = new JButton();
        B = Button301;
        Button01(B, 3);
    }//GEN-LAST:event_Button301ActionPerformed

    private void Button302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button302ActionPerformed
        JButton B = new JButton();
        B = Button302;
        Button02(B, 3);
    }//GEN-LAST:event_Button302ActionPerformed

    private void Button310ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button310ActionPerformed
        JButton B = new JButton();
        B = Button310;
        Button10(B, 3);
    }//GEN-LAST:event_Button310ActionPerformed

    private void Button321ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button321ActionPerformed
        JButton B = new JButton();
        B = Button321;
        Button21(B, 3);
    }//GEN-LAST:event_Button321ActionPerformed

    private void Button322ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button322ActionPerformed
        JButton B = new JButton();
        B = Button322;
        Button22(B, 3);
    }//GEN-LAST:event_Button322ActionPerformed

    private void Button400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button400ActionPerformed
        JButton B = new JButton();
        B = Button400;
        Button00(B, 4);
    }//GEN-LAST:event_Button400ActionPerformed

    private void Button401ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button401ActionPerformed
        JButton B = new JButton();
        B = Button401;
        Button01(B, 4);
    }//GEN-LAST:event_Button401ActionPerformed

    private void Button402ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button402ActionPerformed
        JButton B = new JButton();
        B = Button402;
        Button02(B, 4);
    }//GEN-LAST:event_Button402ActionPerformed

    private void Button410ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button410ActionPerformed
        JButton B = new JButton();
        B = Button410;
        Button10(B, 4);
    }//GEN-LAST:event_Button410ActionPerformed

    private void Button411ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button411ActionPerformed
        JButton B = new JButton();
        B = Button411;
        Button11(B, 4);
    }//GEN-LAST:event_Button411ActionPerformed

    private void Button412ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button412ActionPerformed
        JButton B = new JButton();
        B = Button412;
        Button12(B, 4);
    }//GEN-LAST:event_Button412ActionPerformed

    private void Button420ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button420ActionPerformed
        JButton B = new JButton();
        B = Button420;
        Button20(B, 4);
    }//GEN-LAST:event_Button420ActionPerformed

    private void Button421ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button421ActionPerformed
        JButton B = new JButton();
        B = Button421;
        Button21(B, 4);
    }//GEN-LAST:event_Button421ActionPerformed

    private void Button422ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button422ActionPerformed
        JButton B = new JButton();
        B = Button422;
        Button22(B, 4);
    }//GEN-LAST:event_Button422ActionPerformed

    private void Button500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button500ActionPerformed
        JButton B = new JButton();
        B = Button500;
        Button00(B, 5);
    }//GEN-LAST:event_Button500ActionPerformed

    private void Button501ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button501ActionPerformed
        JButton B = new JButton();
        B = Button501;
        Button01(B, 5);
    }//GEN-LAST:event_Button501ActionPerformed

    private void Button502ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button502ActionPerformed
        JButton B = new JButton();
        B = Button502;
        Button02(B, 5);
    }//GEN-LAST:event_Button502ActionPerformed

    private void Button510ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button510ActionPerformed
        JButton B = new JButton();
        B = Button510;
        Button10(B, 5);    }//GEN-LAST:event_Button510ActionPerformed

    private void Button512ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button512ActionPerformed
        JButton B = new JButton();
        B = Button512;
        Button12(B, 5);
    }//GEN-LAST:event_Button512ActionPerformed

    private void Button520ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button520ActionPerformed
        JButton B = new JButton();
        B = Button520;
        Button20(B, 5);
    }//GEN-LAST:event_Button520ActionPerformed

    private void Button521ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button521ActionPerformed
        JButton B = new JButton();
        B = Button521;
        Button21(B, 5);
    }//GEN-LAST:event_Button521ActionPerformed

    private void Button522ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button522ActionPerformed
        JButton B = new JButton();
        B = Button522;
        Button22(B, 5);
    }//GEN-LAST:event_Button522ActionPerformed

    private void Button600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button600ActionPerformed
        JButton B = new JButton();
        B = Button600;
        Button00(B, 6);
    }//GEN-LAST:event_Button600ActionPerformed

    private void Button601ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button601ActionPerformed
        JButton B = new JButton();
        B = Button601;
        Button01(B, 6);
    }//GEN-LAST:event_Button601ActionPerformed

    private void Button602ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button602ActionPerformed
        JButton B = new JButton();
        B = Button602;
        Button02(B, 6);
    }//GEN-LAST:event_Button602ActionPerformed

    private void Button610ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button610ActionPerformed
        JButton B = new JButton();
        B = Button610;
        Button10(B, 6);
    }//GEN-LAST:event_Button610ActionPerformed

    private void Button611ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button611ActionPerformed
        JButton B = new JButton();
        B = Button611;
        Button11(B, 6);
    }//GEN-LAST:event_Button611ActionPerformed

    private void Button612ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button612ActionPerformed
        JButton B = new JButton();
        B = Button612;
        Button12(B, 6);
    }//GEN-LAST:event_Button612ActionPerformed

    private void Button620ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button620ActionPerformed
        JButton B = new JButton();
        B = Button620;
        Button20(B, 6);
    }//GEN-LAST:event_Button620ActionPerformed

    private void Button621ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button621ActionPerformed
        JButton B = new JButton();
        B = Button621;
        Button21(B, 6);
    }//GEN-LAST:event_Button621ActionPerformed

    private void Button622ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button622ActionPerformed
        JButton B = new JButton();
        B = Button622;
        Button22(B, 6);
    }//GEN-LAST:event_Button622ActionPerformed

    private void Button700ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button700ActionPerformed
        JButton B = new JButton();
        B = Button700;
        Button00(B, 7);
    }//GEN-LAST:event_Button700ActionPerformed

    private void Button701ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button701ActionPerformed
        JButton B = new JButton();
        B = Button701;
        Button01(B, 7);
    }//GEN-LAST:event_Button701ActionPerformed

    private void Button702ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button702ActionPerformed
        JButton B = new JButton();
        B = Button702;
        Button02(B, 7);
    }//GEN-LAST:event_Button702ActionPerformed

    private void Button710ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button710ActionPerformed
        JButton B = new JButton();
        B = Button710;
        Button10(B, 7);
    }//GEN-LAST:event_Button710ActionPerformed

    private void Button712ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button712ActionPerformed
        JButton B = new JButton();
        B = Button712;
        Button12(B, 7);
    }//GEN-LAST:event_Button712ActionPerformed

    private void Button720ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button720ActionPerformed
        JButton B = new JButton();
        B = Button720;
        Button20(B, 7);
    }//GEN-LAST:event_Button720ActionPerformed

    private void Button721ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button721ActionPerformed
        JButton B = new JButton();
        B = Button721;
        Button21(B, 7);
    }//GEN-LAST:event_Button721ActionPerformed

    private void Button722ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button722ActionPerformed
        JButton B = new JButton();
        B = Button722;
        Button22(B, 7);        // TODO add your handling code here:
    }//GEN-LAST:event_Button722ActionPerformed

    private void Button800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button800ActionPerformed
        JButton B = new JButton();
        B = Button800;
        Button00(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button800ActionPerformed

    private void Button802ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button802ActionPerformed
        JButton B = new JButton();
        B = Button802;
        Button02(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button802ActionPerformed

    private void Button810ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button810ActionPerformed
        JButton B = new JButton();
        B = Button810;
        Button10(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button810ActionPerformed

    private void Button811ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button811ActionPerformed
        JButton B = new JButton();
        B = Button811;
        Button11(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button811ActionPerformed

    private void Button812ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button812ActionPerformed
        JButton B = new JButton();
        B = Button812;
        Button12(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button812ActionPerformed

    private void Button820ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button820ActionPerformed
        JButton B = new JButton();
        B = Button820;
        Button20(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button820ActionPerformed

    private void Button821ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button821ActionPerformed
        JButton B = new JButton();
        B = Button821;
        Button21(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button821ActionPerformed

    private void Button822ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button822ActionPerformed
        JButton B = new JButton();
        B = Button822;
        Button22(B, 8);        // TODO add your handling code here:
    }//GEN-LAST:event_Button822ActionPerformed

    private void Button900ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button900ActionPerformed
        JButton B = new JButton();
        B = Button900;
        Button00(B, 9);
    }//GEN-LAST:event_Button900ActionPerformed

    private void Button920ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button920ActionPerformed
        JButton B = new JButton();
        B = Button920;
        Button20(B, 9);
    }//GEN-LAST:event_Button920ActionPerformed

    private void Button901ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button901ActionPerformed
        JButton B = new JButton();
        B = Button901;
        Button01(B, 9);
    }//GEN-LAST:event_Button901ActionPerformed

    private void Button902ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button902ActionPerformed
        JButton B = new JButton();
        B = Button902;
        Button02(B, 9);        // TODO add your handling code here:
    }//GEN-LAST:event_Button902ActionPerformed

    private void Button910ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button910ActionPerformed
        JButton B = new JButton();
        B = Button910;
        Button10(B, 9);        // TODO add your handling code here:
    }//GEN-LAST:event_Button910ActionPerformed

    private void Button911ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button911ActionPerformed
        JButton B = new JButton();
        B = Button911;
        Button11(B, 9);        // TODO add your handling code here:
    }//GEN-LAST:event_Button911ActionPerformed

    private void Button912ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button912ActionPerformed
        JButton B = new JButton();
        B = Button912;
        Button12(B, 9);        // TODO add your handling code here:
    }//GEN-LAST:event_Button912ActionPerformed

    private void Button921ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button921ActionPerformed
        JButton B = new JButton();
        B = Button921;
        Button21(B, 9);        // TODO add your handling code here:
    }//GEN-LAST:event_Button921ActionPerformed

    private void Button922ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button922ActionPerformed
        JButton B = new JButton();
        B = Button922;
        Button22(B, 9);        // TODO add your handling code here:
    }//GEN-LAST:event_Button922ActionPerformed

    private void Button311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button311ActionPerformed
        JButton B = new JButton();
        B = Button311;
        Button11(B, 3);
    }//GEN-LAST:event_Button311ActionPerformed

    private void Button312ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button312ActionPerformed
        JButton B = new JButton();
        B = Button312;
        Button12(B, 3);
    }//GEN-LAST:event_Button312ActionPerformed

    private void Button320ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button320ActionPerformed
        JButton B = new JButton();
        B = Button320;
        Button20(B, 3);
    }//GEN-LAST:event_Button320ActionPerformed

    private void Button801ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button801ActionPerformed
        JButton B = new JButton();
        B = Button801;
        Button01(B, 8);
    }//GEN-LAST:event_Button801ActionPerformed

    //unlock localBoard 1 and lock remaining localBoard because of click button00
    void unlockBoard1() {
        int k = 1;
        if (localBoard1.getComponent(1).isVisible()) { //if visible localBoard 1 then remaining localBoard are lock
            for (int i = 0; i < 9; i++) {
                //  localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
            // if localboard 1 all button set Text then unlock all localboardes
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
            //if invisible localBoard 1 then all localBoard are unlock
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard2() {
        int k = 2;
        if (localBoard2.getComponent(1).isVisible()) {
            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                // localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard3() {
        int k = 3;
        if (localBoard3.getComponent(1).isVisible()) {

            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                //localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard4() {
        int k = 4;
        if (localBoard4.getComponent(1).isVisible()) {

            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                // localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard5() {
        int k = 5;
        if (localBoard5.getComponent(1).isVisible()) {

            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                //  localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard6() {
        int k = 6;
        if (localBoard6.getComponent(1).isVisible()) {

            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                // localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard7() {
        int k = 7;
        if (localBoard7.getComponent(1).isVisible()) {

            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                // localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard8() {
        int k = 8;
        if (localBoard8.getComponent(1).isVisible()) {

            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                //  localBoard8.getComponent(i).setEnabled(false);
                localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    void unlockBoard9() {
        int k = 9;
        if (localBoard9.getComponent(1).isVisible()) {

            for (int i = 0; i < 9; i++) {
                localBoard1.getComponent(i).setEnabled(false);
                localBoard2.getComponent(i).setEnabled(false);
                localBoard3.getComponent(i).setEnabled(false);
                localBoard4.getComponent(i).setEnabled(false);
                localBoard5.getComponent(i).setEnabled(false);
                localBoard6.getComponent(i).setEnabled(false);
                localBoard7.getComponent(i).setEnabled(false);
                localBoard8.getComponent(i).setEnabled(false);
                //  localBoard9.getComponent(i).setEnabled(false);
            }
        } else if (board[k][0][0] == 'X' && board[k][0][0] == 'O' || board[k][0][1] == 'X' && board[k][0][1] == 'O'
                || board[k][0][2] == 'X' && board[k][0][2] == 'O' || board[k][1][0] == 'X' && board[k][1][0] == 'O'
                || board[k][1][1] == 'X' && board[k][1][1] == 'O' || board[k][1][2] == 'X' && board[k][1][2] == 'O'
                || board[k][2][0] == 'X' && board[k][2][0] == 'O' || board[k][2][1] == 'X' && board[k][2][1] == 'O'
                || board[k][2][2] == 'X' && board[k][2][2] == 'O') {
            unlockLBoard();
        } else {
            unlockLBoard();
        }
    }

    //this method used to unlock all localBoardes
    void unlockLBoard() {
        for (int i = 0; i < 9; i++) {
            localBoard1.getComponent(i).setEnabled(true);
            localBoard2.getComponent(i).setEnabled(true);
            localBoard3.getComponent(i).setEnabled(true);
            localBoard4.getComponent(i).setEnabled(true);
            localBoard5.getComponent(i).setEnabled(true);
            localBoard6.getComponent(i).setEnabled(true);
            localBoard7.getComponent(i).setEnabled(true);
            localBoard8.getComponent(i).setEnabled(true);
            localBoard9.getComponent(i).setEnabled(true);

        }
//Cannot unmark/remark an already marked square
        for (int k = 0; k < 10; k++) {
            if (board[k][0][0] == 'X' || board[k][0][0] == 'O') {
                boardes(k).getComponent(0).setEnabled(false);
            }
            if (board[k][0][1] == 'X' || board[k][0][1] == 'O') {
                boardes(k).getComponent(1).setEnabled(false);
            }
            if (board[k][0][2] == 'X' || board[k][0][2] == 'O') {
                boardes(k).getComponent(2).setEnabled(false);
            }
            if (board[k][1][0] == 'X' || board[k][1][0] == 'O') {
                boardes(k).getComponent(3).setEnabled(false);
            }
            if (board[k][1][1] == 'X' || board[k][1][1] == 'O') {
                boardes(k).getComponent(4).setEnabled(false);
            }
            if (board[k][1][2] == 'X' || board[k][1][2] == 'O') {
                boardes(k).getComponent(5).setEnabled(false);
            }
            if (board[k][2][0] == 'X' || board[k][2][0] == 'O') {
                boardes(k).getComponent(6).setEnabled(false);
            }
            if (board[k][2][1] == 'X' || board[k][2][1] == 'O') {
                boardes(k).getComponent(7).setEnabled(false);
            }
            if (board[k][2][2] == 'X' || board[k][2][2] == 'O') {
                boardes(k).getComponent(8).setEnabled(false);
            }
        }

    }

//this method used to unlock all localBoardes and all localBoard buttons remove text 
    void unlockBoard() {
        for (int i = 0; i < 9; i++) {
            localBoard1.getComponent(i).setEnabled(true);
            localBoard2.getComponent(i).setEnabled(true);
            localBoard3.getComponent(i).setEnabled(true);
            localBoard4.getComponent(i).setEnabled(true);
            localBoard5.getComponent(i).setEnabled(true);
            localBoard6.getComponent(i).setEnabled(true);
            localBoard7.getComponent(i).setEnabled(true);
            localBoard8.getComponent(i).setEnabled(true);
            localBoard9.getComponent(i).setEnabled(true);
        }
        Button100.setText("");
        Button101.setText("");
        Button102.setText("");
        Button110.setText("");
        Button111.setText("");
        Button112.setText("");
        Button120.setText("");
        Button121.setText("");
        Button122.setText("");

        Button200.setText("");
        Button201.setText("");
        Button202.setText("");
        Button210.setText("");
        Button211.setText("");
        Button212.setText("");
        Button220.setText("");
        Button221.setText("");
        Button222.setText("");

        Button300.setText("");
        Button301.setText("");
        Button302.setText("");
        Button310.setText("");
        Button311.setText("");
        Button312.setText("");
        Button320.setText("");
        Button321.setText("");
        Button322.setText("");

        Button400.setText("");
        Button401.setText("");
        Button402.setText("");
        Button410.setText("");
        Button411.setText("");
        Button412.setText("");
        Button420.setText("");
        Button421.setText("");
        Button422.setText("");

        Button500.setText("");
        Button501.setText("");
        Button502.setText("");
        Button510.setText("");
        Button511.setText("");
        Button512.setText("");
        Button520.setText("");
        Button521.setText("");
        Button522.setText("");

        Button600.setText("");
        Button601.setText("");
        Button602.setText("");
        Button610.setText("");
        Button611.setText("");
        Button612.setText("");
        Button620.setText("");
        Button621.setText("");
        Button622.setText("");

        Button700.setText("");
        Button701.setText("");
        Button702.setText("");
        Button710.setText("");
        Button711.setText("");
        Button712.setText("");
        Button720.setText("");
        Button721.setText("");
        Button722.setText("");

        Button800.setText("");
        Button801.setText("");
        Button802.setText("");
        Button810.setText("");
        Button811.setText("");
        Button812.setText("");
        Button820.setText("");
        Button821.setText("");
        Button822.setText("");

        Button900.setText("");
        Button901.setText("");
        Button902.setText("");
        Button910.setText("");
        Button911.setText("");
        Button912.setText("");
        Button920.setText("");
        Button921.setText("");
        Button922.setText("");

        turn = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    board[i][j][k] = ' ';
                }
            }
        }
       //X and Y to set value o  because who win the nextone in global board
        x = 0;
        o = 0;

    }
    
    
// visible all button
    void visible() {

        for (int i = 0; i < 9; i++) {
            localBoard1.getComponent(i).setVisible(true);
            localBoard2.getComponent(i).setVisible(true);
            localBoard3.getComponent(i).setVisible(true);
            localBoard4.getComponent(i).setVisible(true);
            localBoard5.getComponent(i).setVisible(true);
            localBoard6.getComponent(i).setVisible(true);
            localBoard7.getComponent(i).setVisible(true);
            localBoard8.getComponent(i).setVisible(true);
            localBoard9.getComponent(i).setVisible(true);

        }
    }

    JLabel labalX = new JLabel("X win"); //this label use to player1 win localboard

    JLabel labalO = new JLabel("O win");//this label use to player2 win localboard
    
   

    //check to win localboard
    boolean checkWin(char Symbol, int k) {
        for (int i = 0; i < 3; i++) {
            //Row win
            if ((board[k][i][0] == Symbol) && (board[k][i][1] == Symbol) && (board[k][i][2] == Symbol)) {

                for (int a = 0; a < 9; a++) {
                    boardes(k).getComponent(a).setVisible(false);//win localboard set invisible
                    if (Symbol == 'O') {
                        boardes(k).add(labalO);//if win player 1 add labal 
                        o = o + 1; //addition 1 for o integer because of win plyer1 in k board

                    }
                    if (Symbol == 'X') {
                        boardes(k).add(labalX);//if win player2 add labal
                        x = x + 1;//addition 1 for x integer because of win plyer1 in k board
                    }

                }
                return true;
            }

            //Collom win
            if ((board[k][0][i] == Symbol) && (board[k][1][i] == Symbol) && (board[k][2][i] == Symbol)) {

                for (int a = 0; a < 9; a++) {
                    boardes(k).getComponent(a).setVisible(false);
                    if (Symbol == 'O') {
                        boardes(k).add(labalO);
                        o = o + 1; //addition 1 for o integer because of win plyer1 in k board
                    }
                    if (Symbol == 'X') {
                        boardes(k).add(labalX);
                        x = x + 1;//addition 1 for x integer because of win plyer1 in k board
                    }
                }
                return true;
            }

        }
        //Left Diagonal win
        if ((board[k][0][0] == Symbol) && (board[k][1][1] == Symbol) && (board[k][2][2] == Symbol)) {

            for (int a = 0; a < 9; a++) {
                boardes(k).getComponent(a).setVisible(false);
                if (Symbol == 'O') {
                    boardes(k).add(labalO);
                    o = o + 1; //addition 1 for o integer because of win plyer1 in k board
                }
                if (Symbol == 'X') {
                    boardes(k).add(labalX);
                    x = x + 1;//addition 1 for x integer because of win plyer1 in k board
                }
            }
            return true;

        }
        //Right Diagonal win
        if ((board[k][0][2] == Symbol) && (board[k][1][1] == Symbol) && (board[k][2][0] == Symbol)) {

            for (int a = 0; a < 9; a++) {
                boardes(k).getComponent(a).setVisible(false);
                if (Symbol == 'O') {
                    boardes(k).add(labalO);
                    o = o + 1; //addition 1 for o integer because of win plyer1 in k board
                }
                if (Symbol == 'X') {
                    boardes(k).add(labalX);
                    x = x + 1;//addition 1 for x integer because of win plyer1 in k board
                }
            }
            return true;
        }

        return false;

    }

    char[][][] board = new char[11][9][9];
    int x = 0, o = 0;
    int turn = 0;
    int Play1Score = 0;
    int Play2Score = 0;

    //////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button100;
    private javax.swing.JButton Button101;
    private javax.swing.JButton Button102;
    private javax.swing.JButton Button110;
    private javax.swing.JButton Button111;
    private javax.swing.JButton Button112;
    private javax.swing.JButton Button120;
    private javax.swing.JButton Button121;
    private javax.swing.JButton Button122;
    private javax.swing.JButton Button200;
    private javax.swing.JButton Button201;
    private javax.swing.JButton Button202;
    private javax.swing.JButton Button210;
    private javax.swing.JButton Button211;
    private javax.swing.JButton Button212;
    private javax.swing.JButton Button220;
    private javax.swing.JButton Button221;
    private javax.swing.JButton Button222;
    private javax.swing.JButton Button300;
    private javax.swing.JButton Button301;
    private javax.swing.JButton Button302;
    private javax.swing.JButton Button310;
    private javax.swing.JButton Button311;
    private javax.swing.JButton Button312;
    private javax.swing.JButton Button320;
    private javax.swing.JButton Button321;
    private javax.swing.JButton Button322;
    private javax.swing.JButton Button400;
    private javax.swing.JButton Button401;
    private javax.swing.JButton Button402;
    private javax.swing.JButton Button410;
    private javax.swing.JButton Button411;
    private javax.swing.JButton Button412;
    private javax.swing.JButton Button420;
    private javax.swing.JButton Button421;
    private javax.swing.JButton Button422;
    private javax.swing.JButton Button500;
    private javax.swing.JButton Button501;
    private javax.swing.JButton Button502;
    private javax.swing.JButton Button510;
    private javax.swing.JButton Button511;
    private javax.swing.JButton Button512;
    private javax.swing.JButton Button520;
    private javax.swing.JButton Button521;
    private javax.swing.JButton Button522;
    private javax.swing.JButton Button600;
    private javax.swing.JButton Button601;
    private javax.swing.JButton Button602;
    private javax.swing.JButton Button610;
    private javax.swing.JButton Button611;
    private javax.swing.JButton Button612;
    private javax.swing.JButton Button620;
    private javax.swing.JButton Button621;
    private javax.swing.JButton Button622;
    private javax.swing.JButton Button700;
    private javax.swing.JButton Button701;
    private javax.swing.JButton Button702;
    private javax.swing.JButton Button710;
    private javax.swing.JButton Button711;
    private javax.swing.JButton Button712;
    private javax.swing.JButton Button720;
    private javax.swing.JButton Button721;
    private javax.swing.JButton Button722;
    private javax.swing.JButton Button800;
    private javax.swing.JButton Button801;
    private javax.swing.JButton Button802;
    private javax.swing.JButton Button810;
    private javax.swing.JButton Button811;
    private javax.swing.JButton Button812;
    private javax.swing.JButton Button820;
    private javax.swing.JButton Button821;
    private javax.swing.JButton Button822;
    private javax.swing.JButton Button900;
    private javax.swing.JButton Button901;
    private javax.swing.JButton Button902;
    private javax.swing.JButton Button910;
    private javax.swing.JButton Button911;
    private javax.swing.JButton Button912;
    private javax.swing.JButton Button920;
    private javax.swing.JButton Button921;
    private javax.swing.JButton Button922;
    private javax.swing.JButton ButtonReload;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JLabel LabelPlayer1Score;
    private javax.swing.JLabel LabelPlayer2Score;
    private javax.swing.JLabel LabelPlayerTurn;
    private javax.swing.JLabel PlyerWinLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel localBoard1;
    private javax.swing.JPanel localBoard2;
    private javax.swing.JPanel localBoard3;
    private javax.swing.JPanel localBoard4;
    private javax.swing.JPanel localBoard5;
    private javax.swing.JPanel localBoard6;
    private javax.swing.JPanel localBoard7;
    private javax.swing.JPanel localBoard8;
    private javax.swing.JPanel localBoard9;
    // End of variables declaration//GEN-END:variables
}
