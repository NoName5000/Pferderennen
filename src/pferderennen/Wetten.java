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
      
     private JTextField sGeld = new JTextField();
     
     
     //Geld ausgabe des Gewinnes mit der Warscheinlichkeit auf den Sieger
     private JTextField oGeld = new JTextField();
     
     
     //Wette eingabe bestätigen
     private JButton oButton = new JButton();
     private int zahlen;
     private int wert2;
     
     
     //Wetten bestätigen Button
  
     public Wetten(){
         //Geld auf Wert eingabe
         this.setLayout(null);
         this.setLocation(10, 430);
         this.setSize(250, 210);
         
            sGeld.setLocation(10, 100);
            sGeld.setSize(50, 20);
            sGeld.setText(zahlen +"");
            sGeld.setBackground(Color.red);
           
            if(Integer.parseInt(sGeld.getText()) <= 0){
                int wert2 = Integer.parseInt(sGeld.getText());
            }else {System.out.println("it dosent work");
                    }
     
            
              
            sGeld.setEditable(true);            
            sGeld.setVisible(true);
            this.add(sGeld);
            
            //oGewinn ausgabe Wert des Gewinns + Warscheinlichkeit
            oGeld.setLocation(60, 100);
            oGeld.setSize(100, 20);
            oGeld.setEditable(false);
            oGeld.setText(wert2 *2 + "€");            
            oGeld.setVisible(true);
            this.add(oGeld);
            
            //oButton bestätigen der eingabe
            oButton.setLocation(60, 100);
            oButton.setSize(10, 20);
            oButton.setVisible(true);
            this.add(oButton);
                   
     }

}
