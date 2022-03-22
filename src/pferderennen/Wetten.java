package pferderennen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
      
     public JTextField sGeld = new JTextField();
     //Geld ausgabe des Gewinnes mit der Warscheinlichkeit auf den Sieger
     private JTextField oGeld = new JTextField();
     
     
     //Wette eingabe bestätigen
     JButton oButton = new JButton();
     private String wetteinsatz;
     private int kontostand;
     private int wert3;
          
     //Kontostand
     private JLabel kKonto = new JLabel();
     
     //Auswahl pferd zum bieten
     String pferdeListe[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
     public JComboBox aPferd = new JComboBox(pferdeListe);
     
  
     public Wetten(){
         //Geld auf Wert eingabe
         this.setLayout(null);
         this.setLocation(10, 430);
         this.setSize(250, 210);
         
            sGeld.setLocation(10, 100);
            sGeld.setSize(50, 20);
            sGeld.setText(wetteinsatz);
            sGeld.setBackground(Color.red);
            
           // if(Integer.parseInt(sGeld.getText()) <= 0){
            //    int wert2 = Integer.parseInt(sGeld.getText());
           // }else {System.out.println("it dosent work");
                 //   }
            sGeld.setEditable(true);            
            sGeld.setVisible(true);
            this.add(sGeld);
            int kontostand = 5000;
            
            //aPferd auswahl des Pferdes zum wetten
            aPferd.setLocation(70, 100);
            aPferd.setSize(100, 20);
            aPferd.setVisible(true);
            this.add(aPferd);
            
            //oGewinn ausgabe Wert des Gewinns + Warscheinlichkeit
            oGeld.setLocation(230, 100);
            oGeld.setSize(50, 20);
            oGeld.setEditable(false);
            oGeld.setText((Integer.parseInt(wetteinsatz)*2));            
            oGeld.setVisible(true);
            this.add(oGeld);
            
            //oButton bestätigen der eingabe
             
            oButton.setLocation(170, 100);
            oButton.setSize(60, 20);
            oButton.setText("Bid");
            oButton.addActionListener(new ActionListener() {
             @Override
                public void actionPerformed(ActionEvent ab) {
                    while((Integer.parseInt(sGeld.getText()) > 0)&&
                          (aPferd.isEnabled() == true)&&
                          (Integer.parseInt(kKonto.getText()) > 0)){
                            oButton.setEnabled(false);
                    }
                    int wert3 = kontostand;
                    if(oButton.isSelected() == true){
                        int kontostand =  (Integer.parseInt(wetteinsatz) + wert3);
                    }
                    
                        //Button befehl
                    //if(Integer.parseInt(sGeld.getText()) > 0){
                         //int kontostand = Integer.parseInt(sGeld.getText());
                            //System.out.println("a");
                               
                    
                        
                    // }else if(Integer.parseInt(sGeld.getText()) < 0){
                        // System.out.println("it dosent work");
                    //}else if(aPferd.isShowing() == true){
                        // oGeld.setText(kontostand *2 + "€");
                        // System.out.println("b");
                    // }else{
                    
               // }
               // int wetteinsatz = + kontostand;
            }
            });
            oButton.setVisible(true);
            this.add(oButton);
            
              
            
            //kKonto
            kKonto.setLocation(50, 10);
            kKonto.setSize(100, 20);
            kKonto.setVisible(true);
            kKonto.setText(kontostand + "€");
            this.add(kKonto);
           
     }

}
