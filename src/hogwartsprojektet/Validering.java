/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsprojektet;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author EmelieD
 */
public class Validering {
    
     private static InfDB idb;
    
    
    public Validering(InfDB idb){
        this.idb = idb;
    }


    
     //Kollar om rutan är tom.
    public static boolean omRutaTom(JTextField angivenRuta) {
        boolean resultat = true;
 
        if (angivenRuta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rutan är tom");
            angivenRuta.requestFocus();
            resultat = false;
        }
        return resultat;
    }
    
     //Kollar om man angivit korrekta tecken.
    public static boolean omString(JTextField angivenRuta) {
        boolean resultat = true;
 
        if (!angivenRuta.getText().matches("[a-zA-Z]")) {
            JOptionPane.showMessageDialog(null, "Vänligen använd endast bokstäver mellan A-Z");
            angivenRuta.requestFocus();
            resultat = false;
        }
        return resultat;
    }
    
    //Kollar om det angivna talet är negativt.
    public static boolean omNegativtTal(JTextField angivenRuta) {
        boolean resultat = true;
 
        if (angivenRuta.getText().substring(0, 1).equals("-")) {
            JOptionPane.showMessageDialog(null, "Ange ett positivt tal");
            angivenRuta.requestFocus();
            resultat = false;
        }
        return resultat;
    }
 
    //Kollar om ett heltal är angivet.
    public static boolean omInt(JTextField angivenRuta) {
        boolean resultat = true;
 
        try {
            String tempString = angivenRuta.getText();
            Integer.parseInt(tempString);
            angivenRuta.requestFocus();
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Vänligen ange ett heltal");
            System.out.println("Internt felmeddelande" + e.getMessage());
            resultat = false;
        }
        return resultat;
    }
 
    //Kollar om användarnamnet finns.
    public static boolean omAnvandareFinns(JTextField angivenRuta) {
        boolean resultat = false;
        try {
         
            String fraga = "SELECT FORNAMN FROM LARARE";
            ArrayList <String> fornamnen = idb.fetchColumn(fraga);
            System.out.println(fornamnen);
            for (String ettNamn : fornamnen){
            if (ettNamn.equals(angivenRuta.getText())) {

                resultat = true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Fel användarnamn!");
                angivenRuta.requestFocus();
            }

        } }catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return resultat;
    }
   
    //Kollar om lösenordet stämmer överens med användarnamnet.
    public static boolean omLosenordStammer(JTextField angivetAnvNamn, JTextField angivetLosenord){
        boolean resultat = true;
       
        try {
            String anvandare = angivetAnvNamn.getText();
            String losenord = angivetLosenord.getText();
            String fraga = "SELECT * from LARARE WHERE FORNAMN = '" + anvandare + "' AND LOSENORD = '" + losenord + "'";
            HashMap<String, String> inloggning = idb.fetchRow(fraga);
            angivetAnvNamn.requestFocus();
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Användarnamnet eller lösenordet är felaktigt");
            System.out.println("Internt felmeddelande" + e.getMessage());
            resultat = false;
        }
        return resultat;
}
   
    //Kollar om eleven finns.
    public static boolean omElevFinns(JTextField angivetFornamn, JTextField angivetEfternamn){
        boolean resultat = false;
       
        try {
            String fornamn = angivetFornamn.getText();
            String efternamn = angivetEfternamn.getText();
            String fraga = "SELECT ELEV_ID from ELEV WHERE FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "'";
            System.out.println(fraga);

            String id = idb.fetchSingle(fraga);
            System.out.println(id);
            
            angivetFornamn.requestFocus();
            
            if(id != null){
           
            resultat = true;
            }
            if(resultat == false){
                 JOptionPane.showMessageDialog(null, "Eleven finns inte");
            }
            }
        
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + e.getMessage());
            
        }
        return resultat;
}
   
    //Kollar om läraren finns.
    public static boolean omLarareFinns(JTextField angivetFornamn, JTextField angivetEfternamn){
        boolean resultat = true;
       
        try {
            String fornamn = angivetFornamn.getText();
            String efternamn = angivetEfternamn.getText();
            String fraga = "SELECT * from LARARE WHERE FORNAMN = '" + fornamn + "' AND EFTERNAMN = '" + efternamn + "'";
            HashMap<String, String> sokLarare = idb.fetchRow(fraga);
            angivetFornamn.requestFocus();
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Läraren finns inte");
            System.out.println("Internt felmeddelande" + e.getMessage());
            resultat = false;
        }
        return resultat;
    }
   
    //Kollar om kursen finns.
    public static boolean omKursFinns(JTextField angivenRuta){
        boolean resultat = true;
       
        try {
            String namnet = angivenRuta.getText();
            String kursen = "SELECT KURSNAMN FROM KURS WHERE KURSNAMN= '" + namnet + "'";
            String svar = idb.fetchSingle(kursen);
            angivenRuta.requestFocus();
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kursen finns inte");
            System.out.println("Internt felmeddelande" + e.getMessage());
            resultat = false;
        }
        return resultat;
    }
   
    //Kollar om betyget finns.
    public static boolean omBetygFinns(JTextField angivenRuta){
        boolean resultat = true;
       
        try {
            String namnet = angivenRuta.getText();
            String betyget = "SELECT BETYGSBESKRIVNING FROM BETYG WHERE BETYGSBESKRIVNING= '" + namnet + "'";
            String svar = idb.fetchSingle(betyget);
            angivenRuta.requestFocus();
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Betyget finns inte");
            System.out.println("Internt felmeddelande" + e.getMessage());
            resultat = false;
        }
        return resultat;
    }
    
}
