/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdheritage;

/**
 *
 * @author HP
 */
public class Carre extends Rectangle {
    private int cote;

    public Carre(int cote) {
        super(cote,cote);
        
    }
    public String aficher()
    {
        return "Carre :" +getLongueur();
    }

}
