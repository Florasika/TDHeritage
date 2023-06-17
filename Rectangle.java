/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdheritage;

import java.util.logging.Logger;

/**
 *
        this.longueur = longueur;
        this.largeur = largeur;
    }
 * @author HP
 */
public class Rectangle extends Forme {
    private int longueur;
    private int largeur;
  
    public Rectangle(int longueur, int largeur) {
        this.longueur=longueur;
        this.largeur=largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    /*
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    
    public String afficher(){
        return "Rectangle : longueur :" +getLongueur()+ "largeur :" +getLargeur();
    }
   public int perimetre(){
       
       return 2*(longueur + largeur);
       
   }
   
   public int aire(){
     return longueur*largeur;
       
   }
*/

    @Override
    public String afficher() {
        return "Rectangle : longueur :" +getLongueur()+ "largeur :" +getLargeur(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int perimetre() {
        return 2*(longueur + largeur); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int aire() {
        return longueur*largeur; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
