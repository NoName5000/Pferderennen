package pferderennen;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import javax.swing.JButton;

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
        });
        this.add(start);
        this.pack();
        this.setVisible(true);
        
        //text ausgabe
            
           // txaAusgabe.setText(this.pferd);
            txaAusgabe.setEditable(false);
          txaAusgabe.setLocation(10, 80);
            txaAusgabe.setSize(700, 400);
            this.add(txaAusgabe);
            
           // txaAusgabe.setText(this.pferd);
            txaAusgabe.setEditable(false);
            this.setVisible(true);
            
            //txa.Rangliste.
             txaRangliste.setEditable(false);
            txaRangliste.setLocation(600, 320);
            txaRangliste.setSize(200, 160);
            this.add(txaRangliste);
            this.setVisible(true);
            
       
    }

    private void StarteRennen() {
        t = new Timer(50, (ActionEvent ae) -> {
           this.GameLoop();
        });
            t.start();
    }  
  public void GameLoop(){
      //merk dir die Zeit
      //renchne aus, wie viel Zeit seit dem letzten vergangen ist
      if(rennbahn.bewegeDiePferde()){
          t.stop();
        }
      txaRangliste.setText(rennbahn.getRangliste());
    }
}
        
