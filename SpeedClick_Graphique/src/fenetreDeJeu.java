
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import java.util.Timer;
import java.util.TimerTask;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vedie
 */
public class fenetreDeJeu extends javax.swing.JFrame {
    Grille GrilleJeu=new Grille();
    Joueur JoueurCourant;
    Bouton BoutonJeu[][];
    Bouton boutonCourant;
    String Couleur ;
    static int second =0;
    static int millisecond =0;
    int Compteur=0;
    Timer chronometre =new Timer();

    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
       
        initComponents();
        panneau_grille.setVisible(false);
        infopartie.setVisible(false);
        info_joueur.setVisible(false);
        
        
        scoreJoueur.setText(""+Compteur);
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_grille = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        infopartie = new javax.swing.JPanel();
        informations = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scoreJoueur = new javax.swing.JLabel();
        chronoJoueur = new javax.swing.JLabel();
        info_joueur = new javax.swing.JPanel();
        meilleur_score = new javax.swing.JLabel();
        nomJoueur = new javax.swing.JLabel();
        pseudoJoueur = new javax.swing.JLabel();
        Début = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pseudo = new javax.swing.JTextField();
        lancerPartie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_grille.setBackground(new java.awt.Color(204, 204, 204));
        panneau_grille.setPreferredSize(new java.awt.Dimension(100, 100));
        panneau_grille.setLayout(new java.awt.GridLayout(4, 4));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton1);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton2);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton3);
        panneau_grille.add(jButton4);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton5);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton6);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton7);
        panneau_grille.add(jButton8);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton9);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton10);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton11);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton12);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton13);

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton14);

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton15);

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        panneau_grille.add(jButton16);

        getContentPane().add(panneau_grille, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 400));

        infopartie.setBackground(new java.awt.Color(102, 153, 255));
        infopartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informations.setFont(new java.awt.Font("Lucida Handwriting", 1, 12)); // NOI18N
        informations.setText("Informations partie :");
        infopartie.add(informations, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 40));

        jLabel2.setText("Chronomètre :");
        infopartie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setText("Score :");
        infopartie.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        scoreJoueur.setText("scoreJoueur");
        infopartie.add(scoreJoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        chronoJoueur.setText("chronoJoueur");
        infopartie.add(chronoJoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        getContentPane().add(infopartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 230, 240));

        info_joueur.setBackground(new java.awt.Color(0, 153, 204));
        info_joueur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        info_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meilleur_score.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        meilleur_score.setText("Meilleur score :");
        info_joueur.add(meilleur_score, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));

        nomJoueur.setFont(new java.awt.Font("Lucida Calligraphy", 1, 11)); // NOI18N
        nomJoueur.setText("Nom du joueur :");
        info_joueur.add(nomJoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        pseudoJoueur.setText("pseudoJoueur");
        info_joueur.add(pseudoJoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        getContentPane().add(info_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 230, 135));

        Début.setBackground(new java.awt.Color(204, 204, 255));
        Début.setForeground(new java.awt.Color(204, 204, 255));
        Début.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel4.setText("Votre pseudo :");
        Début.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 50));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 1, 36)); // NOI18N
        jLabel5.setText("SPEED CLICK");
        Début.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 360, 90));

        Pseudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PseudoActionPerformed(evt);
            }
        });
        Début.add(Pseudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 40));

        lancerPartie.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        lancerPartie.setText("Démarrer");
        lancerPartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lancerPartieActionPerformed(evt);
            }
        });
        Début.add(lancerPartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 160, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel1.setText("Mayeul Kaeppelin");
        Début.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel6.setText("Manon Védie");
        Début.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 70, 20));

        getContentPane().add(Début, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 530, 330));

        setBounds(0, 0, 789, 491);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        //initialiserPartie();

        //GrilleJeu.AllumerBouton(1,1);
        //panneau_grille.repaint();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PseudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PseudoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PseudoActionPerformed

    private void lancerPartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lancerPartieActionPerformed
        // TODO add your handling code here:
        panneau_grille.setVisible(true);
        infopartie.setVisible(true);
        info_joueur.setVisible(true);
        Début.setVisible(false);
    }//GEN-LAST:event_lancerPartieActionPerformed
       
    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }
    
    public void initialiserPartie() {
       
        //GrilleJeu.eteindreGrille(); //on eteint toute la grille avant chaque début de partie
        Scanner sc= new Scanner(System.in);
        //System.out.print("Pseudo: "); //on demande au joueur de rentrer son nom
        
        String nom_J = Pseudo.getText();
        Joueur J = new Joueur(nom_J);
        pseudoJoueur.setText(nom_J);
        
        JoueurCourant=J;
        
        Random r = new Random();
        int lig1 = r.nextInt(4); //on choisit un nb entre 1 et 4 pour définir le bouton qui va s'allumer dès le début
        int col1 = r.nextInt(4);
        GrilleJeu.AllumerBouton(lig1, col1); //des le début, on aura un de nos boutons allumé.
        panneau_grille.repaint();// permet de rafraichir l'écran afin de pouvoir jouer normalement. si l'on ne l'utilise pas il faut passer sur les cases a la souris afin de voir les jetons s'afficher

    }
    
    
    public void Grille() {
        BoutonJeu = new Bouton [4][4]; //on crée notre première grille de jeu
        for (int i = 0; i<4; i++){ // Bouton[0][0] en bas à gauche
            for (int j = 0; j<4 ;j++){
                BoutonJeu[i][j] = new Bouton (); // dimensions 4x4
            }
        }
    }
    
    public void eteindreGrille(){ //on eteint tous les boutons de la grille
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4 ;j++){
                BoutonJeu[i][j].Couleur = "noir"; 
        }   
       } 
    }
   

    public void FinPartie() {
        for(int i=3; i>=0; i--) {
            for (int j=0; j<4; j++) {
                GrilleJeu.eteindreGrille();
                panneau_grille.repaint();
                
            }
        }
    }
    public boolean chronometre(){
    Timer chronome =new Timer();
        chronome.schedule(new TimerTask() {
            int time=20;
            @Override
            public void run() {
                chronoJoueur.setText(""+time);
                if (time==0){
                    FinPartie();
                    cancel();// stoppe le chrono au bout de 20 s
                }
                time--;
            }
        }, 1000, 1000);
        return true;
}
    
    public String lireCouleurbouton() {
        if (boutonCourant.Couleur!= "noir"){ 
            return boutonCourant.Couleur; //on renvoie la couleur du bouton s'il est allumé
        }
        else{
            return "noir"; //s'il ne l'est pas, on renvoie noir
        }
    }
    
    public boolean AllumerBouton(int ligne, int col) {
        if (BoutonJeu[ligne][col].lireCouleurbouton()!="vert") {
            BoutonJeu[ligne][col].Couleur="vert";
            return true;
            
        }
        return false;
    }
    
    public boolean EteindreBouton(int ligne, int col) {
        if (BoutonJeu[ligne][col].lireCouleurbouton()!="noir") {
            BoutonJeu[ligne][col].Couleur="noir";
            return true;
        }
        return false;
    }
    
//    public String lireCouleurbouton() {
//        if (boutonCourant.Couleur!= "noir"){ //on consid
//            return boutonCourant.Couleur; //on renvoie la couleur du bouton s'il est allumé
//        }
//        else{
//            return "noir"; //s'il ne l'est pas, on renvoie noir
//        }
//    }
    
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
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Début;
    private javax.swing.JTextField Pseudo;
    private javax.swing.JLabel chronoJoueur;
    private javax.swing.JPanel info_joueur;
    private javax.swing.JPanel infopartie;
    private javax.swing.JLabel informations;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton lancerPartie;
    private javax.swing.JLabel meilleur_score;
    private javax.swing.JLabel nomJoueur;
    private javax.swing.JPanel panneau_grille;
    private javax.swing.JLabel pseudoJoueur;
    private javax.swing.JLabel scoreJoueur;
    // End of variables declaration//GEN-END:variables
    }  
