/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author marie
 */
public class Guerrier extends Personnage {
    String type;

    public Guerrier(String nomPers, int niveau_vie, String type) {
        super(nomPers, niveau_vie);
        if (type=="a cheval"){
            this.type=type;
        }
        else{
            this.type="a pied";
        }
    }
    
    
    
}
