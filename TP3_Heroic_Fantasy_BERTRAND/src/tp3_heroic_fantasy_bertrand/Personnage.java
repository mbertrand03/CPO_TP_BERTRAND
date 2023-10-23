/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_bertrand;

/**
 *
 * @author marie
 */
public abstract class Personnage {
    String nomPers;
    int niveau_vie;

    public Personnage(String nomPers, int niveau_vie) {
        this.nomPers = nomPers;
        this.niveau_vie = niveau_vie;
    }
    
    @Override
    public String toString (){
        return "nom: "+nomPers+"; niveau de vie : "+niveau_vie;
            
    }
    
}
