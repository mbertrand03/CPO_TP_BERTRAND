/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author marie
 */
public class Magicien extends Personnage {
    String etat;

    public Magicien(String nomPers, int niveau_vie, String etat) {
        super(nomPers, niveau_vie);
        if (etat=="confirmé"){
            this.etat=etat;
        }
        else{
            this.etat="novice";
        }
    }
    
    
}
