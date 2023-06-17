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
public class TDHeritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1 = new Rectangle(10, 5);
        Carre c1= new Carre(6);
        Cercle ce= new Cercle(8);
        
        System.out.println(r1.perimetre());
        System.out.println(c1.perimetre());
    }
    
}
