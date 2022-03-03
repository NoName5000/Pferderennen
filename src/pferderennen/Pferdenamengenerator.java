package pferderennen;

import java.util.Random;

/**
 *
 * @author Lenno
 */
 public class Pferdenamengenerator {
    private String vorname[] = {"Tobias", "Nelson", "Jannis", "Kinem", "Benedict", "Mika", "Dustin", "Thorsten", "Malte", "Thomas"};
    private String nachname[] = {"Schimpl", "Kühl", "Wulff", "Ay", "Russmann", "Pagels", "Rudloff", "Ventzke", "Frenz", "Jedtberg"};
    
    
    
    public String getName() {
        Random rnd = new Random();
        return vorname[rnd.nextInt(vorname.length)] + " " + nachname[rnd.nextInt(vorname.length)];
        //String vn = vorname[x];
        //String nn = nachname[y];
        //String name = vn + "" + nn;
    }
 }
