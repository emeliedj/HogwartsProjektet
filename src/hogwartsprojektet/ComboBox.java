/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hogwartsprojektet;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author EmelieD
 */
public class ComboBox {
    
     private static InfDB idb;
     ComboBox swag;
    
     public static void cboxLaggTillKurs(JComboBox cboxKurs) {
            //Importerar databasen
            try {
                idb = new InfDB("C:\\Users\\EmelieD\\Documents\\HT 2018 Delkurs 4\\NetBeansProjects\\HOGDB.FDB");
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
            try {
                //Hämtar alla kursnamn
                String fraga = "SELECT KURSNAMN FROM KURS;";
                ArrayList<String> kurslista = idb.fetchColumn(fraga);
                cboxKurs.removeAllItems();
                for (String currentKurs : kurslista) {
                    //Loopar igenom alla kursnamn och lägger till dem i den valda Comboboxen
                    cboxKurs.addItem(currentKurs);
                }
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
 
        }
 
        public static void cboxLaggTillAmne(JComboBox cboxAmne) {
            //Importerar databasen
            try {
                idb = new InfDB("C:\\Users\\EmelieD\\Documents\\HT 2018 Delkurs 4\\NetBeansProjects\\HOGDB.FDB");
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
 
            try {
                String fraga = "SELECT AMNESNAMN FROM AMNE;";
                ArrayList<String> amnelista = idb.fetchColumn(fraga);
                cboxAmne.removeAllItems();
                for (String currentAmne : amnelista) {
                    cboxAmne.addItem(currentAmne);
                }
 
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
        }
 
        public static void cboxLaggTillLarare(JComboBox cboxLarare) {
            //Importerar databasen
            try {
                idb = new InfDB("C:\\Users\\EmelieD\\Documents\\HT 2018 Delkurs 4\\NetBeansProjects\\HOGDB.FDB");
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
 
            try {
                String fornamn = "SELECT FORNAMN FROM LARARE;";
                String efternamn = "SELECT EFTERNAMN FROM LARARE;";
                ArrayList<String> fornamnArray = idb.fetchColumn(fornamn);
                ArrayList<String> efternamnArray = idb.fetchColumn(efternamn);
 
                cboxLarare.removeAllItems();
                for (int i = 0; i < fornamnArray.size(); i++) {
                    String output = fornamnArray.get(i) + " " + efternamnArray.get(i);
                    cboxLarare.addItem(output);
                }
 
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
        }
 
        public static void cboxLaggTillElev(JComboBox cboxElev) {
            //Importerar databasen
            try {
                idb = new InfDB("C:\\Users\\EmelieD\\Documents\\HT 2018 Delkurs 4\\NetBeansProjects\\HOGDB.FDB");
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
 
            try {
                String fornamn = "SELECT FORNAMN FROM ELEV;";
                String efternamn = "SELECT EFTERNAMN FROM ELEV;";
                ArrayList<String> fornamnArray = idb.fetchColumn(fornamn);
                ArrayList<String> efternamnArray = idb.fetchColumn(efternamn);
 
                cboxElev.removeAllItems();
                for (int i = 0; i < fornamnArray.size(); i++) {
                    String output = fornamnArray.get(i) + " " + efternamnArray.get(i);
                    cboxElev.addItem(output);
                }
 
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
        }
 
        public static void cboxLaggTillSovsal(JComboBox cboxSovsal) {
            //Importerar databasen
            try {
                idb = new InfDB("C:\\Users\\EmelieD\\Documents\\HT 2018 Delkurs 4\\NetBeansProjects\\HOGDB.FDB");
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
 
            try {
                String sovsal = "SELECT SOVSAL_ID FROM SOVSAL;";
                ArrayList<String> sovsalArray = idb.fetchColumn(sovsal);
 
                cboxSovsal.removeAllItems();
                for (int i = 0; i < sovsalArray.size(); i++) {
                    String output = sovsalArray.get(i);
                    cboxSovsal.addItem(output);
                }
 
            } catch (InfException u) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + u.getMessage());
            }
        }
    }
    

