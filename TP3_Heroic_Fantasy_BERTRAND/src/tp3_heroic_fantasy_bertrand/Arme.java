/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_bertrand;

/**
 *
 * @author marie
 */
public abstract class Arme {
    String nom;
    int niveau;
    
    
    @Override
    public String toString (){
        return "l'arme choisie est "+nom+"d'un niveau de "+niveau;
            
    }
    
    
    
}
