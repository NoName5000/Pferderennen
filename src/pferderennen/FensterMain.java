package pferderennen;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import pferderennen.Pferd;



public class FensterMain extends JFrame{
     
      private Rennbahn rennbahn = new Rennbahn();
      private final JButton start = new JButton(); 
      private final JTextField tfeld = new JTextField();
      private Timer t;
      private final JTextArea txaAusgabe = new JTextArea();
      private JTextArea txaRangliste = new JTextArea();
      boolean debounce = false;
      
      
      //Wette
      
      public int j[] = {1, 10, 20, 30, 40, 50   
     };
      public String betrag[] ={ "1€", "10€", "20€", "30€", "40€", "50€"
          
      };
      
      int betragArray[] = Integer.parseInt(betrag.length);
      
      public void StringToInt() {
          for (int i = 0; i < betrag.length; i++) {
            betragArray[i] = Integer.parseInt(betrag[i]);
        }
      }
     
     private JComboBox sGeld = new JComboBox(betrag);

        
      
    
        
      
      
        
        
        
    public FensterMain() {
        
        
         
         this.setLayout(null);
         this.getContentPane().setPreferredSize(new Dimension (800, 600));
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("Pferderennbahn");
           
         
         this.add(rennbahn);
         this.pack();
         this.setVisible(true);
         
         
         //Schaltfläche (Button)
        start.setLocation(10, 340);
        start.setSize(150, 30);
        start.setText("Start");
        this.add(start);
          //Event (Was passiert wenn man denn Button anklickt, kann aber auch eine Tasten kombi oder Mausklick sein)
        start.addActionListener((ActionEvent ae) -> {
           
           this.StarteRennen();
           start.setEnabled(false);
           
           
        });
        this.add(start);
        this.pack();
        this.setVisible(true);
        
       
            
            //txa.Rangliste.
            txaRangliste.setEditable(false);
            txaRangliste.setLocation(600, 320);
            txaRangliste.setSize(200, 160);
            this.add(txaRangliste);
            this.setVisible(true);
            
            
            //Geld auf Wert eingabe
            sGeld.setLocation(10, 390);
            sGeld.setSize(180, 20);
            sGeld.setEditable(false);
            this.add(sGeld);
            sGeld.setVisible(true);
            

            
            
            
            
            
       
    }

    private void StarteRennen() {
        rennbahn.nochmal();
        t = new Timer(50, (ActionEvent ae) -> {
            start.setEnabled(false);
           this.GameLoop();
        });
            t.start();
    }  
  public void GameLoop(){
      //merk dir die Zeit
      //renchne aus, wie viel Zeit seit dem letzten vergangen ist
      if(rennbahn.bewegeDiePferde()){
          t.stop();
          start.setEnabled(true);
        }
      txaRangliste.setText(rennbahn.getRangliste());
    }
}
        
