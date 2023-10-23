/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_bertrand;

/**
 *
 * @author marie
 */
public class Magicien extends Personnage {
    Boolean Param=true;
    String etat;

    public Magicien(String nomPers, int niveau_vie, Boolean Param, String etat) {
        super(nomPers, niveau_vie);
        if (Param=true){
            etat="confirmé";
        }
        else{
            etat=null;
        }
    }
    
    
}
