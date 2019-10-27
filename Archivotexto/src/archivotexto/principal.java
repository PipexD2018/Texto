
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivotexto;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Pipe Araque
 */
public class principal {
 
    
     public static void main(String[] args) throws ClassNotFoundException {
        
         try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
             Componentes co = new Componentes();
             co.setVisible(true);
             
             //metodo me = new metodo();
             //me.Escribir("Primerarchivo.txt");
             //me.Leer("Primerarchivo.txt");
         } catch (InstantiationException ex) {
             Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
}
