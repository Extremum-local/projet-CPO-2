package SpeedClick;

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
    String vide;
    boolean boutonAllumé;
    
    Bouton() {
    boutonAllumé=false;
    vide=null;
}
    
    
    public boolean Allumé (Bouton boutonCourant) {
        if (boutonCourant.BoutonAllumé()==true) {
            return false;
        }
        else {
            boutonAllumé=true; //on allume le bouton s'il ne l'est pas déjà
            return true; 
        }
        
    }
    public boolean Eteindre(Bouton boutonCourant) {
        if (boutonCourant.BoutonAllumé()==false) {
            return true;
        }
        else {
            boutonAllumé=false; //on eteint le bouton s'il ne l'est pas déjà
            return false; 
        }
        
    }
    
    public boolean BoutonAllumé(){ //on demande si le bouton est déjà allumé ou non
        return boutonAllumé;
    }
}
