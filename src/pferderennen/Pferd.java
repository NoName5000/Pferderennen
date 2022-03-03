/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pferderennen;

import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;

import javax.swing.JPanel;

/**
 *
 * @author Lenno
 */
class Pferd extends JLabel{
    
    private int nummer;
    private Color farbe;
    Random rnd = new Random();
    public String name;
    
     
    public Pferd(int nummer, Color farbe){
        this.nummer = nummer;
        this.farbe = farbe;
        Pferdenamengenerator pf = new Pferdenamengenerator();
        this.name = pf.getName();
        System.out.println(this.name);
        
        this.setSize(20, 20);
        this.setText("" + nummer);
        this.setLocation(10, 30 * nummer +10);
        this.setBackground(Color.ORANGE);    
        this.setOpaque(true);
            
            
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
       
}