package SpeedClick;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KAEPPELIN Mayeul
 */
public class Bouton { // création de la classe bouton 
    Bouton boutonCourant;// création de boutonCourant qui est un objet de type Bouton
    boolean boutonAllumé;// le bouton sera donc allumé ou pas 
    
    Bouton() { // constructeur Bouton qui possède le même nom que la classe
    boutonAllumé=false;
}
    
    
    public boolean Allumé (Bouton boutonCourant) { // méthode qui va nous servir a voir si le bouton de jeu sera allumé ou non.
        if (boutonCourant.BoutonAllumé()==true) {// si le bouton de jeu cad le boutonCourant alors il retourne vrai
            
            return false;// retourne false donc 
        }
        else {
            boutonAllumé=true; //on allume le bouton s'il ne l'est pas déjà
            return true; // else true 
        }
        
    }
    public boolean Eteindre(Bouton boutonCourant) {// méthode qui va éteindre le bouton
        if (boutonCourant.BoutonAllumé()==false) {// cette méthode est par définition le total inverse de Allumé
            return true;
        }
        else {
            boutonAllumé=false; //on eteint le bouton s'il ne l'est pas déjà
            return false; 
        }
        
    }
    
    public boolean BoutonAllumé(){ //on demande si le bouton est déjà allumé ou non
        return boutonAllumé;// bouton allumé oui ou non?
    }
}
