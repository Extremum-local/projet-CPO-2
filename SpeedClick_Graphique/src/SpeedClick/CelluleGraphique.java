package SpeedClick;



import SpeedClick.Bouton;
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
       ImageIcon carre_rouge = new javax.swing.ImageIcon(getClass().getResource("/images/carre-rouge.jpg"));
       ImageIcon carre_noir = new javax.swing.ImageIcon(getClass().getResource("/images/carre-noir.png"));

       public CelluleGraphique(Bouton unBouton) {
        BoutonAssocie = unBouton;

    }
      
        @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        
        if (BoutonAssocie.BoutonAllumé()==true) {
            setIcon(carre_rouge);
            
        }
        else {
            setIcon(carre_noir);
        }
        
        
    }

}
    
       

