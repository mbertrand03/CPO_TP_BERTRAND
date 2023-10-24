/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import java.util.ArrayList;

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
    
    public void ajouterArmes(Arme armes){
        ArrayList<Arme>tabArmurie=new ArrayList<Arme>();
        
      
        if (tabArmurie.size() < 5) {
            tabArmurie.add(armes);
            System.out.println(tabArmurie);
        } 
    }

    public void choisirArme( Arme armeActuelle, ArrayList<Arme> tabArmurie) {
        armeActuelle=null;
        for (int i=0; i <= tabArmurie.size(); i++) {
            if (tabArmurie.get(i)==armeActuelle){
                armeActuelle = tabArmurie.get(i);
            }  
        break;
        }
    }
    
    public Arme getArmeEnMain() {
        
        return armeEnMain;
    }
    
    //public void afficherInventaire(String nomArme,ArrayList<Arme> tabArmurie) {
        //System.out.println("Inventaire de " + nomArme + ":");
     //   for (Arme arme : tabArmurie[5]) {
       //     if(arme==tabArmurie[arme]){
         //       nomArme=tabArmurie(arme);
           //     System.out.println("l'arme portée est bien dans l'inventaire");
         //   }
    ///    break;    
       // }
    //}
    public void afficherInventaire(String nomArme, ArrayList<Arme> tabArmurie) {
        boolean trouve = false;

        for (Arme arme : tabArmurie) {
            if (tabArmurie.get(arme)==nomArme) {
                System.out.println("L'arme portée est bien dans l'inventaire.");
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("L'arme portée n'a pas été trouvée dans l'inventaire.");
        }
    }
    
        
    
}
