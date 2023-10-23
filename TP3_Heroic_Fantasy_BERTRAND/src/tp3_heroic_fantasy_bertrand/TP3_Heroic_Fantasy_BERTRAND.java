/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_bertrand;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *bertrand
 * TDB
 * 18/102023
 * @author marie
 */
public class TP3_Heroic_Fantasy_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epee epee1=new Epee("Excalibur",7,4);
        Epee epee2=new Epee("Durandal",4,5);
        Baton baton1=new Baton("Chene",7,4);
        Baton baton2=new Baton("Charme",4,5);
        
        ArrayList<Arme>tabArmes=new ArrayList<Arme>(4);
        tabArmes.add(epee1);
        tabArmes.add(epee2);
        tabArmes.add(baton1);
        tabArmes.add(baton2);
        
        //for (int i=0; i<=tabArmes.size(); i++){
          //  System.out.println("Epee :"+tabArmes.get(0)+" niveau d'attaque :"+tabArmes.get(1)+ tabArmes.get(2));
        //}
        for (Arme arme : tabArmes) {
            System.out.println(arme);
        }
    }
    
}
