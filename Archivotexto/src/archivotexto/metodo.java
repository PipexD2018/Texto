
package archivotexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import jdk.jfr.events.FileWriteEvent;






public class metodo {
  
    
    public void Escribir(String nombre){
        
        File fw;
        FileWriter es;
        BufferedWriter bu;
        PrintWriter pr;
        
        try {
            
         fw = new File(nombre);
         es = new FileWriter(fw);
         bu = new BufferedWriter(es);
         pr = new PrintWriter(bu);
         
         pr.write("Esta es la primera linea de codigo \n");
         pr.append("Esta es la segúnda linea de codigo \n");
         pr.append("Esta es la tercera linea de codigo \n");
         
         JOptionPane.showMessageDialog(null,"Se ha creado el archivo de texto correctamente");
         pr.close();
         bu.close();
         
          
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Ha sucedido un error " + ex);
        }  
        
    }
    
    
    
    public void Leer(String nombrearchivo){
        
        File archivo;
        FileReader re;
        BufferedReader bui;
        
        try {
        
           archivo = new File(nombrearchivo);
           re = new FileReader(archivo);
           bui = new BufferedReader(re);
           String linea; 
           
           while((linea=bui.readLine() )!= null){
               System.out.println(linea);
           }
           
           JOptionPane.showMessageDialog(null,"El proceso a sido realizado correctamente");
            
           
           bui.close();
           re.close();
           
           
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null,"Se ha presentado un error al leer el archivo la falla es : "+ e);
        }
        
    }
    
    
    
}
