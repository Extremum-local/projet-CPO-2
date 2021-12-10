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
        BoutonJeu = new Bouton [4][4];
             
    for (int i = 0; i<4; i++){
        for (int j = 0; j<4 ;j++){
            BoutonJeu[i][j] = new Bouton ();
            
            
    }
}
}
    public void vidergrille(){
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4 ;j++){
                BoutonJeu[i][j].boutonCourant = null;
                
        }
            
       }
        
        
    }
    public String lireCouleur(int ligne , int col){
        if ("vert".equals(BoutonJeu[ligne][col].lireCouleurbouton())){
            return "vert";
        }
        else{
            return "autre";
        }
    }
    
}
