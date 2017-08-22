/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_analyser;

import java.awt.Toolkit;
import java.io.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

/**
 *
 * @author HP
 */
public class recordman extends javax.swing.JFrame {

    /**
     * Creates new form recordman
     */
    public recordman() {
        initComponents();
        setIcon();
        Date d = new Date();
        //while(new recordman().isVisible()==false)
        systime.setText("" + d);
        /*int stat = JOptionPane.showConfirmDialog(null, "Do you wish to record sessions ?", "Record Manager Confirrmation", 2, QUESTION_MESSAGE);
        if (stat == 0) {
            save.setEnabled(true);
            out.setEnabled(true);
        } else {
            save.setEnabled(false);
            out.setEnabled(false);
        }*/
        save.setEnabled(false);
        out.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        systime = new javax.swing.JLabel();
        spenttime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        report = new javax.swing.JTextArea();
        out = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        back = new javax.swing.JButton();
        loadadapter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        disadap = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        tout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Session Recorder : Server Analyser");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("Session Record Manager");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Time Displays"));
        jPanel1.setToolTipText("Displays various timings.");

        jLabel2.setText("Current time :");

        jLabel3.setText("Elapsed Time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spenttime, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(systime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(systime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spenttime, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Recording Panel"));

        jLabel4.setText("Enter filename of recorded output file(*.sa)");

        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/server_analyser/assets/recobtn.jpg"))); // NOI18N
        start.setToolTipText("Start recording a session.");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/server_analyser/assets/stopbtn.jpg"))); // NOI18N
        stop.setToolTipText("Stop recording the current session.");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        report.setColumns(20);
        report.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        report.setRows(5);
        report.setToolTipText("Displays current session activity");
        jScrollPane2.setViewportView(report);

        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        save.setText("save");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(save)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(153, 153, 153));
        back.setText("<");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        loadadapter.setText("Load Active Adapters on Server");
        loadadapter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadadapterActionPerformed(evt);
            }
        });

        disadap.setEditable(false);
        disadap.setBackground(new java.awt.Color(153, 153, 153));
        disadap.setColumns(20);
        disadap.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        disadap.setRows(5);
        disadap.setToolTipText("Displays active/enabled adapters on server/machine.");
        jScrollPane1.setViewportView(disadap);

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tout.setText("Test Output (Developer Use Only)");
        tout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(loadadapter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 200, Short.MAX_VALUE)))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tout, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(444, 444, 444)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loadadapter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(tout)
                        .addGap(0, 255, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        new Options().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void loadadapterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadadapterActionPerformed
//var that stores read data from file ...
        int ch;
//check if file exists or not...
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\Biswajit Roy\\Documents\\ServerAnalyser-master\\src\\server_analyser\\serverdump\\optionfile.alia");
            //read from FileReader till the end of file.
            BufferedInputStream bin = new BufferedInputStream(fin);
            //ch=bin.read();
            while ((ch = fin.read()) != -1) {
                //System.out.print((char)ch);
                disadap.append("" + (char) ch);
            }
            //closing the file - optionfile.alia
            bin.close();
        } catch (FileNotFoundException fe) {
            JOptionPane.showMessageDialog(null, "Error-Cannot resolve dependencies !\nSoftware integrity compromised !");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException Occured !", "Server Analyser says...", ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_loadadapterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new logout().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        controlfunc(1);

    }//GEN-LAST:event_startActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        if (stop.isSelected() == true) {
            JOptionPane.showConfirmDialog(rootPane, "Stop listening on adapter ?", "Record manager Alert !", 3, QUESTION_MESSAGE);
            save.setEnabled(true);
            out.setEnabled(true);
            controlfunc(0);
        }
    }//GEN-LAST:event_stopActionPerformed

    private void toutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toutActionPerformed
        //var that stores read data from file ...
        int ch;
//check if file exists or not...
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\Biswajit Roy\\Documents\\ServerAnalyser-master\\src\\server_analyser\\serverdump\\prec.alia");
            //read from FileReader till the end of file.
            BufferedInputStream bin = new BufferedInputStream(fin);
            //ch=bin.read();
            while ((ch = fin.read()) != -1) {
                //System.out.print((char)ch);
                report.append("" + (char) ch);
            }
            //closing the file - optionfile.alia
            bin.close();
        } catch (FileNotFoundException fe) {
            JOptionPane.showMessageDialog(null, "Error-Cannot resolve dependencies !\nSoftware integrity compromised !");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "IOException Occured !", "Server Analyser says...", ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_toutActionPerformed

    public void controlfunc(int n) {
        String input = JOptionPane.showInputDialog(null, "Please enter the device serial number you want to start listening to ?", "Record manager Query", QUESTION_MESSAGE);
        int id = Integer.parseInt(input);
        //send id value to a batch file for processing with tshark...
        try {
            Runtime runtime = Runtime.getRuntime();
            Process proc = runtime.exec("powershell.exe TSHARK -i " + id + " >> C:\\Users\\Biswajit Roy\\Documents\\ServerAnalyser-master\\src\\server_analyser\\sreverdump\\prec.alia");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error in processing command !\nCheck Software Integrity !", "FATAL ERROR OCCURED !", ERROR_MESSAGE);
            e.printStackTrace();
        }

        //get output data from prec.alia to text area output...
        try {
            int ch;
            FileInputStream fin = new FileInputStream("C:\\Users\\Biswajit Roy\\Documents\\ServerAnalyser-master\\src\\server_analyser\\serverdump\\prec.alia");
            BufferedInputStream bin = new BufferedInputStream(fin);
            while ((ch = bin.read()) != -1) {
                report.append("" + (char) ch);
            }

            if (n == 0) {
                bin.close();
                Runtime runtime = Runtime.getRuntime();
                Process proc = runtime.exec("powershell.exe killproc tshark.exe");
            }

        } catch (FileNotFoundException fe) {
            JOptionPane.showMessageDialog(null, "Source file is corrupted or lost !");
        } catch (IOException ex) {
            Logger.getLogger(recordman.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "The program has encountered an IOException !", "record manager Error ", ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(recordman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recordman().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextArea disadap;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loadadapter;
    private javax.swing.JTextField out;
    private javax.swing.JTextArea report;
    private javax.swing.JButton save;
    private javax.swing.JLabel spenttime;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    private javax.swing.JLabel systime;
    private javax.swing.JButton tout;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("prgicon.png")));
    }
}
