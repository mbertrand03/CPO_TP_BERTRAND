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
public class Baton extends Arme {
    int age;


    public Baton(String nom, int niveau, int age) {
        super(nom, niveau);
        //age=0;
        if (age<=100){
            this.age = age;
        }
        else{
            this.age=100;

        }
    
    }
    @Override
    public String toString (){
        return  "nom:"+nom+", niveau de l'attaque"+niveau+", age du baton: "+ age;
    }
    
    
}
