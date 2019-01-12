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
public class HogwartsProjektet {
    
    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         try{
                idb = new InfDB("C:\\Users\\EmelieD\\Documents\\HT 2018 Delkurs 4\\NetBeansProjects\\HOGDB.FDB");
            }
            catch(InfException e){
              JOptionPane.showMessageDialog(null, "Något gick fel");
            }
         
         new Startsida(idb).setVisible(true);
    }
    
}
