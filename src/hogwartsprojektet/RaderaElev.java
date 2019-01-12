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
public class RaderaElev extends javax.swing.JFrame {
    
    private final InfDB idb;

    /**
     * Creates new form RaderaElev
     * @param idb
     */
    public RaderaElev(InfDB idb) {
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

        raderaFornamn = new javax.swing.JTextField();
        raderaEfternamn = new javax.swing.JTextField();
        raderaTaBort = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        raderaTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        raderaTaBort.setText("Ta bort elev");
        raderaTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raderaTaBortActionPerformed(evt);
            }
        });

        jLabel1.setText("Förnamn:");

        jLabel2.setText("Efternamn:");

        raderaTillbaka.setText("Tillbaka");
        raderaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raderaTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(raderaTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(raderaTaBort)
                    .addComponent(raderaFornamn)
                    .addComponent(raderaEfternamn, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(raderaFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addComponent(raderaEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(raderaTaBort)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(raderaTillbaka)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raderaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raderaTillbakaActionPerformed
        this.dispose();
    }//GEN-LAST:event_raderaTillbakaActionPerformed

    private void raderaTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raderaTaBortActionPerformed
        try {
        String fornamnet = raderaFornamn.getText();
        String efternamnet = raderaEfternamn.getText();
        String radera = "DELETE FROM ELEV WHERE ELEV.FORNAMN = '" + fornamnet + "' AND ELEV.EFTERNAMN = '" + efternamnet + "'";
        idb.delete(radera);
        JOptionPane.showMessageDialog(null, "Elev med " + fornamnet + " " + efternamnet + " har tagits bort");
    }
    
    catch(InfException e){
        JOptionPane.showMessageDialog(null, "Något gick snett");
    }
    }//GEN-LAST:event_raderaTaBortActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField raderaEfternamn;
    private javax.swing.JTextField raderaFornamn;
    private javax.swing.JButton raderaTaBort;
    private javax.swing.JButton raderaTillbaka;
    // End of variables declaration//GEN-END:variables
}
