package SpeedClick;



import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KAEPPELIN Mayeul
 */
class CelluleGraphique extends JButton {
        Bouton BoutonAssocie;
       ImageIcon carre_rouge = new javax.swing.ImageIcon(getClass().getResource("/images/carre-rouge.jpg")); //on importe nos deux images jpg
       ImageIcon carre_noir = new javax.swing.ImageIcon(getClass().getResource("/images/carre-noir.jpg"));

       public CelluleGraphique(Bouton unBouton) {
        BoutonAssocie = unBouton;

    }
      
        @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        
        if (BoutonAssocie.BoutonAllumé()==true) { //si le bouton est allumé, alors il y aura le carré rouge
            setIcon(carre_rouge);
            
        }
        else {
            setIcon(carre_noir); //sinon le carré noir
        }
        
        
    }

}
    
       

