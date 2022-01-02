/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermindconsole_corlay_nobili;

/**
 *
 * @author adrie
 */
public class CelluleMaster {
    String pionCourant;
    CouleurMaster couleur;
    String [] Tableaucouleur = {"jaune","rouge","vert","bleu","rose","blanc","orange","magenta"};
    
    public CelluleMaster(){
        pionCourant = "vide" ;           
    }
    
    public boolean affecterJeton(int i){
        if("vide".equals(pionCourant)){
            pionCourant = Tableaucouleur[i];
            return true;
        }
        else{
            return false ;
        }
    }
    
    public String lireCouleurPion(){
        return pionCourant;
    }
}
