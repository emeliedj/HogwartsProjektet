/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsprojektet;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author EmelieD
 */
public class HanteraLarare extends javax.swing.JFrame {
    
    private final InfDB idb;

    /**
     * Creates new form HanteraLarare
     * @param idb
     */
    public HanteraLarare(InfDB idb) {
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

        mainPanel = new javax.swing.JPanel();
        start = new javax.swing.JPanel();
        startTaBort = new javax.swing.JButton();
        startAndra = new javax.swing.JButton();
        startLaggTill = new javax.swing.JButton();
        startGeBehorighet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        laggTill = new javax.swing.JPanel();
        larareFornamn = new javax.swing.JTextField();
        larareEfternamn = new javax.swing.JTextField();
        larareLosen = new javax.swing.JPasswordField();
        larareAdmin = new javax.swing.JComboBox<>();
        larareLaggTill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        larareTillbaka = new javax.swing.JButton();
        andra = new javax.swing.JPanel();
        andraFornamn = new javax.swing.JTextField();
        andraEfternamn = new javax.swing.JTextField();
        andraTillbaka = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        andraEfterNamn = new javax.swing.JButton();
        larareBox = new javax.swing.JComboBox<>();
        ComboBox.cboxLaggTillLarare(larareBox);
        geBehorighet = new javax.swing.JPanel();
        behorighetGe = new javax.swing.JButton();
        behorighetTillbaka = new javax.swing.JButton();
        taBortAdmin = new javax.swing.JButton();
        adminLarareBox = new javax.swing.JComboBox<>();
        ComboBox.cboxLaggTillLarare(adminLarareBox);
        jLabel12 = new javax.swing.JLabel();
        taBort = new javax.swing.JPanel();
        bortFornamn = new javax.swing.JTextField();
        bortEfternamn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        taBortLarare = new javax.swing.JButton();
        bortTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        startTaBort.setText("Ta bort lärare");
        startTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTaBortActionPerformed(evt);
            }
        });

        startAndra.setText("Ändra namn");
        startAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startAndraActionPerformed(evt);
            }
        });

        startLaggTill.setText("Lägg till lärare");
        startLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startLaggTillActionPerformed(evt);
            }
        });

        startGeBehorighet.setText("Ändra behörighet");
        startGeBehorighet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGeBehorighetActionPerformed(evt);
            }
        });

        jButton1.setText("Tillbaka");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startTaBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startLaggTill, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startAndra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startGeBehorighet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(startLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startAndra, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(startTaBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startGeBehorighet, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(startLaggTill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        mainPanel.add(start, "start");

        larareAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T", "F" }));
        larareAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        larareLaggTill.setText("Lägg till");
        larareLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                larareLaggTillActionPerformed(evt);
            }
        });

        jLabel1.setText("Förnamn:");

        jLabel2.setText("Efternamn:");

        jLabel3.setText("Lösenord:");

        jLabel4.setText("Administratör:");

        larareTillbaka.setText("Tillbaka");
        larareTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                larareTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout laggTillLayout = new javax.swing.GroupLayout(laggTill);
        laggTill.setLayout(laggTillLayout);
        laggTillLayout.setHorizontalGroup(
            laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laggTillLayout.createSequentialGroup()
                .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(laggTillLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(larareTillbaka))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laggTillLayout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(60, 60, 60)))
                .addGap(12, 12, 12)
                .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(larareAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(larareEfternamn, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(larareFornamn)
                        .addComponent(larareLosen))
                    .addComponent(larareLaggTill))
                .addGap(59, 59, 59))
        );
        laggTillLayout.setVerticalGroup(
            laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laggTillLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(larareFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(larareEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(larareLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(larareAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(laggTillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laggTillLayout.createSequentialGroup()
                        .addComponent(larareTillbaka)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, laggTillLayout.createSequentialGroup()
                        .addComponent(larareLaggTill)
                        .addGap(26, 26, 26))))
        );

        mainPanel.add(laggTill, "laggTill");

        andraTillbaka.setText("Tillbaka");
        andraTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraTillbakaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nuvarande namn:");

        jLabel6.setText("Förnamn:");

        jLabel7.setText("Efternamn:");

        andraEfterNamn.setText("Uppdatera");
        andraEfterNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraEfterNamnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout andraLayout = new javax.swing.GroupLayout(andra);
        andra.setLayout(andraLayout);
        andraLayout.setHorizontalGroup(
            andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, andraLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(andraTillbaka)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(andraFornamn)
                        .addComponent(andraEfternamn, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(larareBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(andraEfterNamn))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        andraLayout.setVerticalGroup(
            andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andraLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(andraLayout.createSequentialGroup()
                        .addGroup(andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(larareBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(andraFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(andraEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(andraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraTillbaka)
                    .addComponent(andraEfterNamn))
                .addGap(29, 29, 29))
        );

        mainPanel.add(andra, "andra");

        behorighetGe.setText("Ge behörighet");
        behorighetGe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                behorighetGeActionPerformed(evt);
            }
        });

        behorighetTillbaka.setText("Tillbaka");
        behorighetTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                behorighetTillbakaActionPerformed(evt);
            }
        });

        taBortAdmin.setText("Ta bort behörighet");
        taBortAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAdminActionPerformed(evt);
            }
        });

        jLabel12.setText("Ange lärare:");

        javax.swing.GroupLayout geBehorighetLayout = new javax.swing.GroupLayout(geBehorighet);
        geBehorighet.setLayout(geBehorighetLayout);
        geBehorighetLayout.setHorizontalGroup(
            geBehorighetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geBehorighetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geBehorighetLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(behorighetTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(geBehorighetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(taBortAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(behorighetGe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminLarareBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
        );
        geBehorighetLayout.setVerticalGroup(
            geBehorighetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geBehorighetLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGroup(geBehorighetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(geBehorighetLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(behorighetTillbaka)
                        .addGap(17, 17, 17))
                    .addGroup(geBehorighetLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(adminLarareBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(taBortAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(behorighetGe)
                        .addGap(28, 28, 28))))
        );

        mainPanel.add(geBehorighet, "geBehorighet");

        jLabel10.setText("Förnamn:");

        jLabel11.setText("Efternamn:");

        taBortLarare.setText("Ta bort lärare");
        taBortLarare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortLarareActionPerformed(evt);
            }
        });

        bortTillbaka.setText("Tillbaka");
        bortTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bortTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout taBortLayout = new javax.swing.GroupLayout(taBort);
        taBort.setLayout(taBortLayout);
        taBortLayout.setHorizontalGroup(
            taBortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, taBortLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(taBortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(bortTillbaka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(taBortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bortEfternamn)
                    .addComponent(bortFornamn)
                    .addComponent(taBortLarare, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(108, 108, 108))
        );
        taBortLayout.setVerticalGroup(
            taBortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taBortLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(taBortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bortFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(45, 45, 45)
                .addGroup(taBortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bortEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(taBortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(taBortLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bortTillbaka)
                        .addGap(29, 29, 29))
                    .addGroup(taBortLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(taBortLarare)
                        .addContainerGap(55, Short.MAX_VALUE))))
        );

        mainPanel.add(taBort, "taBort");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void larareLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_larareLaggTillActionPerformed
    if(Validering.omRutaTom(larareFornamn) && Validering.omRutaTom(larareEfternamn) && Validering.omRutaTom(larareLosen)){     
        try {
            String lararId = idb.getAutoIncrement("LARARE", "LARAR_ID");
            String fornamnet = larareFornamn.getText();
            String efternamnet = larareEfternamn.getText();
            String losenord = larareLosen.getText();
            String admin = (String) larareAdmin.getSelectedItem();

            String andring = "INSERT INTO LARARE VALUES(" + lararId + "," + "'" + fornamnet + "','" + efternamnet + "','" + losenord + "','" + admin + "')";
            idb.insert(andring);
            JOptionPane.showMessageDialog(null, "Lärare med namnet " + fornamnet + " " + efternamnet + " har blivit tillagd");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }
    }
    }//GEN-LAST:event_larareLaggTillActionPerformed

    private void andraEfterNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraEfterNamnActionPerformed
    if(Validering.omRutaTom(andraFornamn) && Validering.omRutaTom(andraEfternamn)){     
        try {
            String nyttNamn = (String)larareBox.getSelectedItem();
            String larareFornamnet = nyttNamn.split(" ")[0];
            String larareEfternamnet = nyttNamn.split(" ")[1];
            String fornamnet = andraFornamn.getText();
            String efternamnet = andraEfternamn.getText();
            
            String fraga = "SELECT LARAR_ID FROM LARARE WHERE FORNAMN = '" + larareFornamnet + "' AND EFTERNAMN = '" + larareEfternamnet + "'; ";
            String lararID = idb.fetchSingle(fraga);

            
            String andring = "UPDATE LARARE SET FORNAMN = '" + fornamnet + "', EFTERNAMN = '" + efternamnet + "' WHERE LARAR_ID = '" + lararID + "'";
            idb.update(andring);
            ComboBox.cboxLaggTillLarare(larareBox);
            JOptionPane.showMessageDialog(null, "Namn ändrat till " + fornamnet + " " + efternamnet );
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }  
    }
    }//GEN-LAST:event_andraEfterNamnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void behorighetGeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_behorighetGeActionPerformed
        try {
             String larare = (String)adminLarareBox.getSelectedItem();
                String larareFornamnet = larare.split(" ")[0];
                String larareEfternamnet = larare.split(" ")[1];

                String fraga = "SELECT LARAR_ID FROM LARARE WHERE FORNAMN = '" + larareFornamnet + "' AND EFTERNAMN = '" + larareEfternamnet + "'; ";
                String lararID = idb.fetchSingle(fraga);
            
                String admin = "UPDATE LARARE SET ADMINISTRATOR = 'T' WHERE FORNAMN = '" + larareFornamnet + "' AND EFTERNAMN = '" + larareEfternamnet + "'";
            idb.update(admin);
            ComboBox.cboxLaggTillLarare(adminLarareBox);
            JOptionPane.showMessageDialog(null, "Lärare med namnet " + larareFornamnet + " " + larareEfternamnet + " har nu admin behörighet");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }
    }//GEN-LAST:event_behorighetGeActionPerformed

    private void taBortLarareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortLarareActionPerformed
    if(Validering.omRutaTom(bortFornamn) && Validering.omRutaTom(bortEfternamn)){     
        try {
            String fornamnet = bortFornamn.getText();
            String efternamnet = bortEfternamn.getText();

            String bortagning = "DELETE FROM LARARE WHERE LARARE.FORNAMN = '" + fornamnet + "' AND LARARE.EFTERNAMN = '" + efternamnet + "'";
            idb.delete(bortagning);
            JOptionPane.showMessageDialog(null, "Lärare med namnet " + fornamnet + " " + efternamnet + " har raderats");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }
    }
        
    }//GEN-LAST:event_taBortLarareActionPerformed

    private void bortTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bortTillbakaActionPerformed
      CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "start");
    }//GEN-LAST:event_bortTillbakaActionPerformed

    private void behorighetTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_behorighetTillbakaActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "start");
    }//GEN-LAST:event_behorighetTillbakaActionPerformed

    private void andraTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraTillbakaActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "start");
    }//GEN-LAST:event_andraTillbakaActionPerformed

    private void larareTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_larareTillbakaActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "start");
    }//GEN-LAST:event_larareTillbakaActionPerformed

    private void startTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTaBortActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "taBort");
    }//GEN-LAST:event_startTaBortActionPerformed

    private void startLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startLaggTillActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "laggTill");
    }//GEN-LAST:event_startLaggTillActionPerformed

    private void startAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startAndraActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "andra");
    }//GEN-LAST:event_startAndraActionPerformed

    private void startGeBehorighetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGeBehorighetActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
        card.show(mainPanel, "geBehorighet");
    }//GEN-LAST:event_startGeBehorighetActionPerformed

    private void taBortAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAdminActionPerformed
        try {
             String larare = (String)adminLarareBox.getSelectedItem();
                String larareFornamnet = larare.split(" ")[0];
                String larareEfternamnet = larare.split(" ")[1];

                String fraga = "SELECT LARAR_ID FROM LARARE WHERE FORNAMN = '" + larareFornamnet + "' AND EFTERNAMN = '" + larareEfternamnet + "'; ";
                String lararID = idb.fetchSingle(fraga);
            
            String admin = "UPDATE LARARE SET ADMINISTRATOR = 'F' WHERE FORNAMN = '" + larareFornamnet + "' AND EFTERNAMN = '" + larareEfternamnet + "'";
            idb.update(admin);
            JOptionPane.showMessageDialog(null, "Admin behörighet för " + larareFornamnet + " " + larareEfternamnet + " har tagits bort");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }
    }//GEN-LAST:event_taBortAdminActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adminLarareBox;
    private javax.swing.JPanel andra;
    private javax.swing.JButton andraEfterNamn;
    private javax.swing.JTextField andraEfternamn;
    private javax.swing.JTextField andraFornamn;
    private javax.swing.JButton andraTillbaka;
    private javax.swing.JButton behorighetGe;
    private javax.swing.JButton behorighetTillbaka;
    private javax.swing.JTextField bortEfternamn;
    private javax.swing.JTextField bortFornamn;
    private javax.swing.JButton bortTillbaka;
    private javax.swing.JPanel geBehorighet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel laggTill;
    private javax.swing.JComboBox<String> larareAdmin;
    private javax.swing.JComboBox<String> larareBox;
    private javax.swing.JTextField larareEfternamn;
    private javax.swing.JTextField larareFornamn;
    private javax.swing.JButton larareLaggTill;
    private javax.swing.JPasswordField larareLosen;
    private javax.swing.JButton larareTillbaka;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel start;
    private javax.swing.JButton startAndra;
    private javax.swing.JButton startGeBehorighet;
    private javax.swing.JButton startLaggTill;
    private javax.swing.JButton startTaBort;
    private javax.swing.JPanel taBort;
    private javax.swing.JButton taBortAdmin;
    private javax.swing.JButton taBortLarare;
    // End of variables declaration//GEN-END:variables
}
