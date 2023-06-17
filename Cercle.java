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
public class Cercle extends Forme  {
    private int rayon;
    

    public Cercle(int rayon) {
        this.rayon = rayon;
        
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

  public String afficher()
  {
      return "Cercle :" +rayon;
  }
/*
    public int perimetre()
    {
        return 2*rayon;
    }
    
    public int aire(){
        return rayon * rayon;
}
*/

    @Override
    public int aire() {
         return rayon * rayon;//To change body of generated methods, choose Tools | Templates.
    }
    
   

    
}
