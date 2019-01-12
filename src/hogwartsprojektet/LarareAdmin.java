/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsprojektet;

import oru.inf.InfDB;

/**
 *
 * @author EmelieD
 * 
 */
public class LarareAdmin extends javax.swing.JFrame {
    
    private final InfDB idb;

    /**
     * Creates new form NewJFrame
     * @param idb
     */
    public LarareAdmin(InfDB idb) {
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

        hanteraElev = new javax.swing.JButton();
        taBortElev = new javax.swing.JButton();
        poang = new javax.swing.JButton();
        hanteraLarare = new javax.swing.JButton();
        kursBetyg = new javax.swing.JButton();
        hanteraKurs = new javax.swing.JButton();
        andraLosen = new javax.swing.JButton();
        prefektForestandare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hanteraElev.setText("Hantera elev");
        hanteraElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraElevActionPerformed(evt);
            }
        });

        taBortElev.setText("Ta bort elev");
        taBortElev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortElevActionPerformed(evt);
            }
        });

        poang.setText("Poäng");
        poang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poangActionPerformed(evt);
            }
        });

        hanteraLarare.setText("Hantera lärare");
        hanteraLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraLarareActionPerformed(evt);
            }
        });

        kursBetyg.setText("Kursbetyg");
        kursBetyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursBetygActionPerformed(evt);
            }
        });

        hanteraKurs.setText("Hantera kurs");
        hanteraKurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraKursActionPerformed(evt);
            }
        });

        andraLosen.setText("Ändra lösenord");
        andraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenActionPerformed(evt);
            }
        });

        prefektForestandare.setText("Prefekt/ Föreståndare");
        prefektForestandare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefektForestandareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(poang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hanteraElev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kursBetyg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(andraLosen, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hanteraKurs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hanteraLarare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(taBortElev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prefektForestandare, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taBortElev)
                    .addComponent(hanteraElev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poang, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hanteraLarare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kursBetyg)
                    .addComponent(hanteraKurs))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prefektForestandare)
                    .addComponent(andraLosen))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Visar JFramen för HanteraElev
    private void hanteraElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraElevActionPerformed
        
        new HanteraElev(idb).setVisible(true);
    }//GEN-LAST:event_hanteraElevActionPerformed

    //Visar JFramen för Poang
    private void poangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poangActionPerformed
     
        new Poang(idb).setVisible(true);
    }//GEN-LAST:event_poangActionPerformed

    //Visar JFramen för KursBetyg
    private void kursBetygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursBetygActionPerformed
     
        new KursBetyg(idb).setVisible(true);
    }//GEN-LAST:event_kursBetygActionPerformed

    private void andraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenActionPerformed
     
        new AndraLosenord(idb).setVisible(true);
    }//GEN-LAST:event_andraLosenActionPerformed

    private void prefektForestandareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefektForestandareActionPerformed
    
        new PrefektForestandare(idb).setVisible(true);
    
    }//GEN-LAST:event_prefektForestandareActionPerformed

    private void hanteraLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraLarareActionPerformed
     
        new HanteraLarare(idb).setVisible(true);
    }//GEN-LAST:event_hanteraLarareActionPerformed

    private void taBortElevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortElevActionPerformed
        
        new RaderaElev(idb).setVisible(true);
    }//GEN-LAST:event_taBortElevActionPerformed

    private void hanteraKursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraKursActionPerformed
        new HanteraKurs(idb).setVisible(true);
    }//GEN-LAST:event_hanteraKursActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton andraLosen;
    private javax.swing.JButton hanteraElev;
    private javax.swing.JButton hanteraKurs;
    private javax.swing.JButton hanteraLarare;
    private javax.swing.JButton kursBetyg;
    private javax.swing.JButton poang;
    private javax.swing.JButton prefektForestandare;
    private javax.swing.JButton taBortElev;
    // End of variables declaration//GEN-END:variables
}
