/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pferderennen;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Wetten extends JPanel {
    
        private String betrag[] ={ "0", "1", "10", "20", "30", "40", "50"};
        int betragArray[] = new int[betrag.length];

        public void StringToInt() {
            for (int i = 0; i < betrag.length; i++) {
              betragArray[i] = Integer.parseInt(betrag[i]);
          }
        }
      
     private JComboBox sGeld = new JComboBox(betrag);
     
     
     //Geld ausgabe des Gewinnes mit der Warscheinlichkeit auf den Sieger
     private JTextField oGeld = new JTextField();
     
     
     //Wette eingabe bestätigen
     private JButton oButton = new JButton();
     
     public Wetten(){
         //Geld auf Wert eingabe
         this.setLayout(null);
         this.setLocation(10, 430);
         this.setSize(250, 210);
         this.setBackground(Color.LIGHT_GRAY);
            sGeld.setLocation(10, 390);
            sGeld.setSize(180, 20);
            sGeld.setEditable(false);            
            sGeld.setVisible(true);
            this.add(sGeld);
            
            //oGewinn ausgabe Wert des Gewinns + Warscheinlichkeit
            oGeld.setLocation(190, 390);
            oGeld.setSize(180, 20);
            oGeld.setEditable(false);
            oGeld.setText("hier muss das Arry sGeld rein");            
            oGeld.setVisible(true);
            this.add(oGeld);
    
     }

}
