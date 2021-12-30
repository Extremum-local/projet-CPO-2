
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vedie
 */
public class Partie {
    Grille GrilleJeu=new Grille();
    Joueur JoueurCourant;
    
   
    public void initialiserPartie() {
       
        GrilleJeu.eteindreGrille(); //on eteint toute la grille avant chaque début de partie
        Scanner sc= new Scanner(System.in);
        System.out.print("Pseudo: "); //on demande au joueur de rentrer son nom
        JoueurCourant = new Joueur(sc.nextLine());
        
        Random r = new Random();
        int lig1 = r.nextInt(4); //on choisit un nb entre 1 et 4 pour définir le bouton qui va s'allumer dès le début
        int col1 = r.nextInt(4);
        GrilleJeu.AllumerBouton(lig1, col1); //des le début, on aura un de nos boutons allumé.
    }
     
    
    
    public void debuterPartie() {
        initialiserPartie();
        
    }
}
