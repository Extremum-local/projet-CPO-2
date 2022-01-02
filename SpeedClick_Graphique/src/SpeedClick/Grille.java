package SpeedClick;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KAEPPELIN Mayeul
 */
public class Grille {
    Bouton BoutonJeu[][];
    
    
    public Grille() {
        BoutonJeu = new Bouton [4][4]; //on crée notre première grille de jeu
        for (int i = 0; i<4; i++){ // Bouton[0][0] en bas à gauche
            for (int j = 0; j<4 ;j++){
                BoutonJeu[i][j] = new Bouton (); // dimensions 4x4
            }
        }
    }
    
    public void eteindreGrille() { //on eteint tous les boutons de la grille
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                BoutonJeu[i][j].vide = null;
                EteindreBouton(i,j);             
            }
        }
    }
    
    public boolean AllumerBouton(int ligne, int col) {
        if (!BoutonJeu[ligne][col].boutonAllumé) {
        BoutonJeu[ligne][col].boutonAllumé = true;;
        return true;
    }
    return false;
    }
    
    public boolean EteindreBouton(int ligne, int col) {
            BoutonJeu[ligne][col].boutonAllumé=false;
            return true;
        
    }
    
    
}
