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
    
    
    public void Cellule(){
        boutonCourant = null;
        Couleur = "noir";
        
    }

    public String lireCouleurbouton() {
        if (boutonCourant!= null){
            return boutonCourant.Couleur;
        }
        else{
            return "noir";
        }
    }
}
