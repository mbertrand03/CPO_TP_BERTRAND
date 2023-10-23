/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author marie
 */
public abstract class Arme {
    String nom;
    int niveau;

    public Arme(String nom, int niveau) {
        this.nom = nom;
        if (this.niveau<=100){
            this.niveau = niveau;
        }else{
            this.niveau=100;
        } 
    }
    
    
    @Override
    public String toString (){
        return "arme: "+nom+"; niveau : "+niveau;
            
    }
    
    
    
}
