package pferderennen;

//Lenno


import java.awt.Color;
import javax.swing.JPanel;

class Rennbahn extends JPanel {
    Pferd pferde[] = new Pferd[10];
    public Rennbahn(){
      this.setLayout(null);
      this.setSize(780, 310);
      this.setLocation(10, 10);
      this.setBackground(Color.LIGHT_GRAY);
        
        for (int i = 0; i < pferde.length; i++){
            pferde[i] = new Pferd(i, Color.yellow);
            this.add(pferde[i]);
        }   
    }
    public String getRangliste () {
        Pferd ps[] = this.pferde;
        String ausgabe = " ";
        //Bubblesort
        for(int i = 0; i < ps.length; i++){
            for (int j = 0; j < ps.length - 1; j++){
                if(ps[j + 1].getX() > ps[j].getX()){
                Pferd temp = ps[j];
                ps[j] =ps[j+1];
                ps[j+1] = temp;
                }
            }
            
            
        }
        for (int i = 0; i< ps.length; i++){
            ausgabe += (i+1) +"\t" + ps[i].getName() +"\t" + ps[i].getText()+"\n";
        }
        
        
        return ausgabe;
    }
    
    public boolean bewegeDiePferde() {
        boolean istZuende = true;
        
        for (int i = 0; i < pferde.length; i++) {
            pferde[i].bewegen(this.getWidth() - pferde[i].getWidth());
            if (pferde[i].getX()<this.getWidth() - pferde[i].getWidth()) {
                istZuende = false;
            }
        }
        return istZuende;
    }
    public void nochmal(){
        for (int i = 0; i < pferde.length; i++) {
            pferde[i].reset();
        }
    }
    
}
