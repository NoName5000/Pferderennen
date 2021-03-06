package pferderennen;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Lenno
 */
public class Pferd extends JButton{
    
    private int nummer;
    private Color farbe;
    Random rnd = new Random();
    public String name;
    
     
    public Pferd(int nummer, Color farbe){
        //this. = sagt dem Objekt was es machen soll benutzt man um sich nicht zu verschreiben (ausnahme bei der man this. benutzen muss: setter)
        this.nummer = nummer;
        this.farbe = farbe;
        Pferdenamengenerator pf = new Pferdenamengenerator();
        this.name = pf.getName();
        System.out.println(this.name);
        
        this.setSize(20, 20);
        this.setMargin(new Insets(0,0,0,0));
        this.setText("" + (nummer+1));
        this.setLocation(10, 30 * nummer +10);
        this.setBackground(Color.ORANGE);    
        this.setOpaque(true);
        
        this.addActionListener((ActionEvent af) -> {
         
         
            
       
        });

            
            
    }
    public void bewegen(int ziel){
         int x = rnd.nextInt(5)+(-2);
        if (this.getX()>ziel) {
            x = 1;
        }
        this.setLocation(this.getX() + rnd.nextInt(10 + x)+0, 30 * nummer + 10);
    
    }
    public int getNummer() {
        return nummer;
    }

    public String getName() {
        return name;
    } 
    public void reset(){
        this.setLocation(10 +0, 30 * nummer + 10);
        
    }   
}