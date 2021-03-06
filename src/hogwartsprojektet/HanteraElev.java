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
public class HanteraElev extends javax.swing.JFrame {
    
    private final InfDB idb;

    /**
     * Creates new form HanteraElev
     * @param idb
     */
    public HanteraElev(InfDB idb) {
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

        mainpanel = new javax.swing.JPanel();
        nyElev = new javax.swing.JPanel();
        fornamn = new javax.swing.JTextField();
        efternamn = new javax.swing.JTextField();
        nyElevLaggTill = new javax.swing.JButton();
        nyElevTillbaka = new javax.swing.JButton();
        nyElevAndraNamn = new javax.swing.JButton();
        nyElevAndraSovsal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sovsal = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        andraSovsal = new javax.swing.JPanel();
        andraSovsalTillbaka = new javax.swing.JButton();
        sovsalBox = new javax.swing.JComboBox<>();
        sovsalFornamn = new javax.swing.JTextField();
        sovsalEfternamn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nySovsal = new javax.swing.JButton();
        andraNamn = new javax.swing.JPanel();
        namnTillbaka = new javax.swing.JButton();
        namnNyttNamn = new javax.swing.JTextField();
        namnFornamn = new javax.swing.JTextField();
        namnEfternamn = new javax.swing.JTextField();
        nyFornamn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nyEfternamn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setLayout(new java.awt.CardLayout());

        nyElevLaggTill.setText("Lägg till elev");
        nyElevLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyElevLaggTillActionPerformed(evt);
            }
        });

        nyElevTillbaka.setText("Tillbaka");
        nyElevTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyElevTillbakaActionPerformed(evt);
            }
        });

        nyElevAndraNamn.setText("Ändra namn");
        nyElevAndraNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyElevAndraNamnActionPerformed(evt);
            }
        });

        nyElevAndraSovsal.setText("Ändra sovsal");
        nyElevAndraSovsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyElevAndraSovsalActionPerformed(evt);
            }
        });

        jLabel1.setText("Förnamn:");

        jLabel2.setText("Efternamn:");

        jLabel3.setText("Sovsal nr:");

        sovsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));
        sovsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sovsalActionPerformed(evt);
            }
        });

        jLabel10.setText("Skriv in elev information:");

        javax.swing.GroupLayout nyElevLayout = new javax.swing.GroupLayout(nyElev);
        nyElev.setLayout(nyElevLayout);
        nyElevLayout.setHorizontalGroup(
            nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nyElevLayout.createSequentialGroup()
                .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(nyElevLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(nyElevLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nyElevLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(nyElevTillbaka)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(nyElevLayout.createSequentialGroup()
                                .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nyElevAndraSovsal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nyElevAndraNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(25, 25, 25)))
                        .addGap(14, 14, 14)
                        .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nyElevLaggTill))))
                .addGap(56, 56, 56))
        );
        nyElevLayout.setVerticalGroup(
            nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nyElevLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nyElevLayout.createSequentialGroup()
                        .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(23, 23, 23))
                    .addComponent(nyElevAndraNamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(nyElevLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(nyElevAndraSovsal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sovsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(nyElevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nyElevLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(nyElevTillbaka))
                    .addGroup(nyElevLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(nyElevLaggTill)))
                .addGap(19, 19, 19))
        );

        mainpanel.add(nyElev, "nyElev");

        andraSovsalTillbaka.setText("Tillbaka");
        andraSovsalTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraSovsalTillbakaActionPerformed(evt);
            }
        });

        sovsalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" }));

        jLabel4.setText("Ny sovsal:");

        jLabel5.setText("Förnamn:");

        jLabel6.setText("Efternamn:");

        nySovsal.setText("Spara uppdatering");
        nySovsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nySovsalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout andraSovsalLayout = new javax.swing.GroupLayout(andraSovsal);
        andraSovsal.setLayout(andraSovsalLayout);
        andraSovsalLayout.setHorizontalGroup(
            andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, andraSovsalLayout.createSequentialGroup()
                .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(andraSovsalLayout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, andraSovsalLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(andraSovsalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(andraSovsalTillbaka)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sovsalFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sovsalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sovsalEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nySovsal))
                .addGap(37, 37, 37))
        );
        andraSovsalLayout.setVerticalGroup(
            andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andraSovsalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sovsalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(52, 52, 52)
                .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sovsalFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sovsalEfternamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
                .addGroup(andraSovsalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraSovsalTillbaka)
                    .addComponent(nySovsal))
                .addGap(24, 24, 24))
        );

        mainpanel.add(andraSovsal, "andraSovsal");

        namnTillbaka.setText("Tillbaka");
        namnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namnTillbakaActionPerformed(evt);
            }
        });

        nyFornamn.setText("Ny förnamn");
        nyFornamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyFornamnActionPerformed(evt);
            }
        });

        jLabel7.setText("Nytt namn:");

        jLabel8.setText("Förnamn:");

        jLabel9.setText("Efternamn:");

        nyEfternamn.setText("Ny efternamn");
        nyEfternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyEfternamnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout andraNamnLayout = new javax.swing.GroupLayout(andraNamn);
        andraNamn.setLayout(andraNamnLayout);
        andraNamnLayout.setHorizontalGroup(
            andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, andraNamnLayout.createSequentialGroup()
                .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(andraNamnLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(namnTillbaka))
                    .addGroup(andraNamnLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, andraNamnLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(andraNamnLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(nyFornamn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nyEfternamn)
                        .addGap(23, 23, 23))
                    .addGroup(andraNamnLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namnNyttNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(namnFornamn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(namnEfternamn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        andraNamnLayout.setVerticalGroup(
            andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(andraNamnLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namnNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namnEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(andraNamnLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(namnTillbaka))
                    .addGroup(andraNamnLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(andraNamnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nyFornamn)
                            .addComponent(nyEfternamn))))
                .addGap(20, 20, 20))
        );

        mainpanel.add(andraNamn, "andraNamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Stänger denna ruta
    private void nyElevTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyElevTillbakaActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_nyElevTillbakaActionPerformed

    //Ändrar namn på eleven med hjälp av fälten
    private void nyElevAndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyElevAndraNamnActionPerformed
        
        CardLayout card = (CardLayout)mainpanel.getLayout();
        card.show(mainpanel, "andraNamn");
    }//GEN-LAST:event_nyElevAndraNamnActionPerformed

    //Visar panelen nyElev
    private void andraSovsalTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraSovsalTillbakaActionPerformed
        CardLayout card = (CardLayout)mainpanel.getLayout();
        card.show(mainpanel, "nyElev");
    }//GEN-LAST:event_andraSovsalTillbakaActionPerformed

    //Lägger till eleven med hjälp av fälten, combobox och SQL frågor
    private void nyElevLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyElevLaggTillActionPerformed
    if(Validering.omRutaTom(fornamn) && Validering.omRutaTom(efternamn)){    
        try {

            String fornamnet = fornamn.getText();
            String efternamnet = efternamn.getText();
            String sovsalen = (String) sovsal.getSelectedItem();
            int sovsalInt = Integer.parseInt(sovsalen);
            String increment = idb.getAutoIncrement("ELEV", "ELEV_ID");

            String nyaElev = "INSERT INTO ELEV VALUES(" + increment + ",'" + fornamnet + "'," + "'" + efternamnet + "'," + sovsalInt + ")";
            System.out.println(nyaElev);
            idb.insert(nyaElev);
            JOptionPane.showMessageDialog(null, "Elev med namnet" + " " + fornamnet + " " + efternamnet + " är nu tillagd");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");
        }
    }

    }//GEN-LAST:event_nyElevLaggTillActionPerformed

    //Uppdaterar sovsalen med hjälp av combobox och SQL frågor
    private void nySovsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nySovsalActionPerformed
       
        try {
            if (Validering.omRutaTom(sovsalFornamn) && (Validering.omRutaTom(sovsalEfternamn) && Validering.omElevFinns(sovsalFornamn, sovsalEfternamn))) {

                String fornamnet = sovsalFornamn.getText();
                String efternamnet = sovsalEfternamn.getText();
                String sovsalen = (String) sovsalBox.getSelectedItem();
                int sovsalInt = Integer.parseInt(sovsalen);

                String sovsalandring = "UPDATE ELEV SET SOVSAL =" + sovsalInt + "WHERE ELEV.FORNAMN ='" + fornamnet + " AND ELEV.EFTERNAMN =" + efternamnet + "'";
                idb.update(sovsalandring);
                JOptionPane.showMessageDialog(null, "Sovsal för" + " " + fornamnet + " " + efternamnet + "har blivit uppdaterad");

            }
        } catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Något gick snett");
        }


    }//GEN-LAST:event_nySovsalActionPerformed

    //Uppdaterar elevens förnamn med hjälp av combobox och SQL frågor
    private void nyFornamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyFornamnActionPerformed
    if(Validering.omRutaTom(namnNyttNamn) && Validering.omRutaTom(namnEfternamn) && Validering.omRutaTom(namnFornamn)){    
        try {
           
          
            String nynamn = namnNyttNamn.getText();
            String efternamnet = namnEfternamn.getText();
            String fornamnet = namnFornamn.getText();
           

            String andring = "UPDATE ELEV SET ELEV.FORNAMN ='" + nynamn + "' WHERE ELEV.FORNAMN = '" + fornamnet + "' AND ELEV.EFTERNAMN = '" + efternamnet + "'";
            idb.update(andring);
            JOptionPane.showMessageDialog(null, "Elevens förnamn ändrat till" + " " + nynamn);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");

        }
    }
        
    }//GEN-LAST:event_nyFornamnActionPerformed

    //Uppdaterar elevens efternamn med hjälp av combobox och SQL frågor
    private void nyEfternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyEfternamnActionPerformed
    if(Validering.omRutaTom(namnNyttNamn) && Validering.omRutaTom(namnEfternamn) && Validering.omRutaTom(namnFornamn)){    
        try {
            String nynamn = namnNyttNamn.getText();
            String fornamnet = namnFornamn.getText();
            String efternamnet = namnEfternamn.getText();

            String andring = "UPDATE ELEV SET ELEV.EFTERNAMN ='" + nynamn + "' WHERE ELEV.FORNAMN = '" + fornamnet + "' AND ELEV.EFTERNAMN = '" + efternamnet + "'";
            idb.update(andring);
            JOptionPane.showMessageDialog(null, "Elevens efternamn ändrat till" + " " + nynamn);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick snett");

        }
    }
    }//GEN-LAST:event_nyEfternamnActionPerformed

    //Visar panelen nyElev
    private void namnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namnTillbakaActionPerformed
        CardLayout card = (CardLayout)mainpanel.getLayout();
        card.show(mainpanel, "nyElev");
    }//GEN-LAST:event_namnTillbakaActionPerformed

    //Ändrar sovsal för eleven med hjälp av fälten och comboboxer
    private void nyElevAndraSovsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyElevAndraSovsalActionPerformed

        CardLayout card = (CardLayout)mainpanel.getLayout();
        card.show(mainpanel, "andraSovsal");
    }//GEN-LAST:event_nyElevAndraSovsalActionPerformed

    private void sovsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sovsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sovsalActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel andraNamn;
    private javax.swing.JPanel andraSovsal;
    private javax.swing.JButton andraSovsalTillbaka;
    private javax.swing.JTextField efternamn;
    private javax.swing.JTextField fornamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField namnEfternamn;
    private javax.swing.JTextField namnFornamn;
    private javax.swing.JTextField namnNyttNamn;
    private javax.swing.JButton namnTillbaka;
    private javax.swing.JButton nyEfternamn;
    private javax.swing.JPanel nyElev;
    private javax.swing.JButton nyElevAndraNamn;
    private javax.swing.JButton nyElevAndraSovsal;
    private javax.swing.JButton nyElevLaggTill;
    private javax.swing.JButton nyElevTillbaka;
    private javax.swing.JButton nyFornamn;
    private javax.swing.JButton nySovsal;
    private javax.swing.JComboBox<String> sovsal;
    private javax.swing.JComboBox<String> sovsalBox;
    private javax.swing.JTextField sovsalEfternamn;
    private javax.swing.JTextField sovsalFornamn;
    // End of variables declaration//GEN-END:variables
}
