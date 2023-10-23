/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author marie
 */
public class Epee extends Arme {
    int finesse;

    public Epee(String nom, int niveau,int finesse) {
        super(nom,niveau);
        //finesse=0;
        if (finesse<=100){
            this.finesse=finesse;
        }
        else{
            this.finesse=100;
        }
    }
    
    @Override
    public String toString (){
        return "nom:"+nom+", finesse de l'epee:"+finesse+", niveau d'attaque :"+niveau;
    }
}
