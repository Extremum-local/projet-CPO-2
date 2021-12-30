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
    String Couleur ;
    
    
     public String lireCouleurbouton() {
        if (boutonCourant.Couleur!= "noir"){ //on consid
            return boutonCourant.Couleur; //on renvoie la couleur du bouton s'il est allumé
        }
        else{
            return "noir"; //s'il ne l'est pas, on renvoie noir
        }
    }
    
    public boolean Allumé (Bouton boutonCourant) {
        if (boutonCourant.Couleur!="vert") {
            boutonCourant.Couleur="vert"; //on allume le bouton s'il ne l'est pas déjà
            return true;
        }
        else {
            return false; //s'il l'est déjà, on return false
        }
        
    }
    
    public boolean Eteindre(Bouton boutonCourant) {
        if (boutonCourant.Couleur!="noir") {
            boutonCourant.Couleur="noir"; //on eteint le bouton s'il ne l'est pas déjà
            return true;
        }
        else {
            return false; //s'il l'est déjà, on return false
        }

    }
    
    public boolean BoutonAllumé(Bouton boutonCourant){ //on demande si le bouton est déjà allumé ou non
        if (boutonCourant.Couleur=="vert") {
            return true;
        }
        else {
            return false;
            
        }
        
    }
}
