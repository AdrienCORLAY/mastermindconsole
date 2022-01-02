/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermindconsole_corlay_nobili;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author adrie
 */
public class Masterpartie {
    
    int valeurcouleur = 0;
    CouleurMaster couleurmaster = new CouleurMaster(0); 
    String [] tabbase = new String [4];
    Scanner scanner = new Scanner(System.in);
    GrilleMaster grillejeu;

    
    public void initialiserPartie(){
        
        grillejeu = new GrilleMaster();
        Random rdc = new Random();
        for (int i =0 ; i<=3 ; i++){
            int nbcouleur;
            nbcouleur = rdc.nextInt(7);
            tabbase [i] = couleurmaster.Tableaucouleur[nbcouleur];  
            //System.out.println(tabbase[i]);
        }

    }
    public void debuterPartie(){
        String [] CouleurJoue = new String[4];
        for (int i = 0; i<=11 ; i++){
            if (i > 6) {
                int u = 0;
            }
            int nbcouleurcom = 0;
            int nbplacecom = 0;
            int nbcouleur = 0;
            String couleur1;
            String couleur2;
            String couleur3;
            String couleur4;
            System.out.println("Entrez la premiere couleur");
            couleur1 = scanner.nextLine();
            CouleurJoue[0] = couleur1;
            System.out.println("Entrez la seconde couleur");
            couleur2 = scanner.nextLine();
            CouleurJoue[1] = couleur2;
            System.out.println("Entrez la troisieme couleur");
            couleur3 = scanner.nextLine();
            CouleurJoue[2] = couleur3;
            System.out.println("Entrez la quatrieme couleur");
            couleur4 = scanner.nextLine();
            CouleurJoue[3] = couleur4;
            
            
            
         

            for (int colonnejoue = 0; colonnejoue<=3; colonnejoue++){
                nbcouleur = couleurmaster.AttribuerNbACouleur(CouleurJoue[colonnejoue]);

                if (grillejeu.ajouterJeton(i, colonnejoue) == true){
                    grillejeu.grilleJeu[i][colonnejoue].pionCourant = couleurmaster.Tableaucouleur[nbcouleur];
                    
                }
            }
            grillejeu.afficherGrilleSurConsole();
           // Essaie sans celluleMASTER juste avec une grille de couleurmaster
            
            for (int k = 0; k <=3; k++){
                if (grillejeu.grilleJeu[i][k].pionCourant.equals(tabbase [k])){
                            nbplacecom = nbplacecom + 1;
                }
                else{
                    for (int q = 0; q <=3; q++){  
                        if (grillejeu.grilleJeu[i][k].pionCourant.equals(tabbase [q])){
                            nbcouleurcom++;
                            break;
                        }    
                    }
                }
            }
            if (nbplacecom == 4){
                System.out.println("Vous avez gagné!!");
                break;
            }
            System.out.println("");
            System.out.println("nb de bonnes couleurs:" + nbcouleurcom);
            System.out.println("nb de bonnes placess:" + nbplacecom);

        }
    }
    
}
