/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsprojektet;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author EmelieD
 */
public class Poang extends javax.swing.JFrame {
    
    private final InfDB idb;

    /**
     * Creates new form Poang
     * @param idb
     */
    public Poang(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vilketElevhem = new javax.swing.JComboBox<>();
        antalPoang = new javax.swing.JTextField();
        poangTillbaka = new javax.swing.JButton();
        draAv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        laggTill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vilketElevhem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gryffindor", "Slytherin", "Ravenclaw", "Hufflepuff" }));

        poangTillbaka.setText("Tillbaka");
        poangTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poangTillbakaActionPerformed(evt);
            }
        });

        draAv.setText("Dra av");
        draAv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                draAvActionPerformed(evt);
            }
        });

        jLabel1.setText("Skriv in antal poäng:");

        jLabel2.setText("Till vilket elevhem:");

        laggTill.setText("Lägg till");
        laggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vilketElevhem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(antalPoang))
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(poangTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(draAv)
                        .addGap(18, 18, 18)
                        .addComponent(laggTill)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(antalPoang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vilketElevhem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(draAv)
                    .addComponent(laggTill))
                .addGap(1, 1, 1)
                .addComponent(poangTillbaka)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void draAvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_draAvActionPerformed
        try {
            String elevhemmet = (String)vilketElevhem.getSelectedItem();
            String poangen = antalPoang.getText();
            int intpoangen = Integer.parseInt(poangen);

            String andring = "UPDATE ELEVHEM SET HUSPOANG = -" + intpoangen + "WHERE ELEVHEMSNAMN = '" + elevhemmet + "'";
            idb.update(andring);
            JOptionPane.showMessageDialog(null, " Poäng avdragna från " + elevhemmet);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }
    }//GEN-LAST:event_draAvActionPerformed

    private void laggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillActionPerformed
        try {
            String elevhemmet = (String)vilketElevhem.getSelectedItem();
            String poangen = antalPoang.getText();
            int intpoangen = Integer.parseInt(poangen);

            String andring = "UPDATE ELEVHEM SET HUSPOANG = +" + intpoangen + "WHERE ELEVHEMSNAMN = '" + elevhemmet + "'";
            idb.update(andring);
            JOptionPane.showMessageDialog(null, " Poäng tillagda till " + elevhemmet);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }
    }//GEN-LAST:event_laggTillActionPerformed

    private void poangTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poangTillbakaActionPerformed
    
        this.dispose();
    }//GEN-LAST:event_poangTillbakaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antalPoang;
    private javax.swing.JButton draAv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton laggTill;
    private javax.swing.JButton poangTillbaka;
    private javax.swing.JComboBox<String> vilketElevhem;
    // End of variables declaration//GEN-END:variables
}