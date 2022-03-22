package pferderennen;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;




public class FensterMain extends JFrame{
     
      private final Rennbahn rennbahn = new Rennbahn();
      public JButton sStart = new JButton(); 
     // private final JTextField tfeld = new JTextField();
      private Timer t;
      private final JTextArea txaAusgabe = new JTextArea();
      private JTextArea txaRangliste = new JTextArea();
      boolean debounce = false;
      private Wetten wetten = new Wetten();
      
     //Geld ausgabe des Gewinnes mit der Warscheinlichkeit auf den Sieger
     private JTextField oGeld = new JTextField();
     
     

     
    public FensterMain() {
        
        
         
         this.setLayout(null);
         this.getContentPane().setPreferredSize(new Dimension (800, 600));
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setTitle("Pferderennbahn");
         this.add(rennbahn);
         this.add(wetten);
         this.pack();
         this.setVisible(true);
         
         
         
         
         
         //Schaltfläche (Button)
        sStart.setLocation(10, 340);
        sStart.setSize(150, 30);
        sStart.setText("Start");
        this.add(sStart);
          //Event (Was passiert wenn man denn Button anklickt, kann aber auch eine Tasten kombi oder Mausklick sein)
        sStart.addActionListener((ActionEvent ae) -> {
           //sGeld.setEnabled(false);
           this.StarteRennen();
           sStart.setEnabled(false);
           wetten.oButton.setEnabled(false);
           wetten.aPferd.setEnabled(false);
           wetten.sGeld.setEditable(false);
           
           
           
           
           
        });
        this.add(sStart);
        this.pack();
        this.setVisible(true);
        
        
       
            
            //txa.Rangliste.
            txaRangliste.setEditable(false);
            txaRangliste.setLocation(500, 330);
            txaRangliste.setSize(250, 210);
            this.add(txaRangliste);
            this.setVisible(true);
    }

    private void StarteRennen() {
       rennbahn.nochmal();
        t = new Timer(50, (ActionEvent ae) -> {
            sStart.setEnabled(false);
           this.GameLoop();
        });
       t.start();
    }  
  public void GameLoop(){
      //merk dir die Zeit
      //renchne aus, wie viel Zeit seit dem letzten vergangen ist
      if(rennbahn.bewegeDiePferde()){
          t.stop();
          sStart.setEnabled(true);
          wetten.oButton.setEnabled(true);
          wetten.aPferd.setEnabled(true);
          wetten.sGeld.setEditable(true);
       }
      txaRangliste.setText(rennbahn.getRangliste());
    }

}
        
