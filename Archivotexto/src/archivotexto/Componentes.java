
package archivotexto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Componentes extends JFrame {

      
    public JLabel texto1 = new JLabel();
    public JPanel panel = new JPanel();
    public JTextField cajatexto = new JTextField();
    public JButton boton = new JButton();
    public FileReader re;
    public BufferedReader bui;
    
    public Componentes ()  {
    
        this.setSize(800,200);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel();
        
    }
       
        public void panel() {
          
        panel.setLayout(null);
        this.getContentPane().add(panel);
        panel.setBackground(Color.white);
        
        texto1.setBounds(300, 10, 200,20);
        texto1.setText("Buscar archivo TXT");
        texto1.setFont(new Font("arial",3, 14));
        panel.add(texto1);
        
        cajatexto.setBounds(50, 70, 400, 20);
        panel.add(cajatexto);
        
        boton.setBounds(500, 70,100,20);
        boton.setText("Abrir");
        panel.add(boton);
        
        
            ActionListener ejecutar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                JFileChooser abrir = new JFileChooser();
                abrir.showOpenDialog(boton);
                File archivo = abrir.getSelectedFile();
                if(archivo != null){
                    cajatexto.setText(archivo.getAbsolutePath());                               
                    
                    metodo me = new metodo();
                    me.Leer(archivo.getAbsolutePath());
                }
                
            }
        };
          
          boton.addActionListener(ejecutar);
        
        }
   
    
    
    
}
