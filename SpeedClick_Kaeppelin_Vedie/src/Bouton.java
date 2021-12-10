/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KAEPPELIN Mayeul
 */
public class Bouton {
    Bouton boutonCourant;
    String Couleur ;
    
    

    public String lireCouleurbouton() {
        if (boutonCourant!= null){
            return boutonCourant.Couleur;
        }
        else{
            return "noir";
        }
    }
    
    public boolean BoutonAllumé(int i,int j){
        if (boutonCourant.Couleur=="vert") {
            return true;
        }
        else {
            return false;
            
        }
        
    }
}
