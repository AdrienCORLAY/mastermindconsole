/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mastermindconsole_corlay_nobili;

import java.util.Scanner;

/**
 *
 * @author adrie
 */
public class Mastermind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bonjour vous avez decidé de commencer une partie de Mastermind");
        System.out.println("Lorsque vous rentrez une couleur vous devez l'ecrire en toute lettre en minuscules");
        System.out.println("Vous avez le droit aux couleurs suivantes:jaune,rouge,vert,bleu,rose,blanc,orange,noir,magenta");
        System.out.println("Les couleurs seront ajoutées de gauche à droite");
        Masterpartie partie =  new Masterpartie();
        partie.initialiserPartie();
        partie.debuterPartie();  
    }  
}
