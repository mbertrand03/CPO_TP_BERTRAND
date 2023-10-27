/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version2_console;

import java.util.Scanner;

/**
 *
 * @author marie
 */
public class Partie {
    GrilleDeCellules grille;
    int nbCoups;

    public Partie(int nbCoups) {
        this.nbCoups = 0;
    }
    
    public void initaliserPartie(GrilleDeCellules grille){
        grille.MelangerMatriceAleatoirement(nbCoups);
    }
    
    public void lancerPartie(){
      do{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre coup : ");
        String coup = scanner.nextLine(); 
        
        if(coup=="0"){
            grille.activerLigneDeCellules(coup);
            nbCoups+=1;
        }
        else if (coup=="1"){
            this.activerColonneDeCellules();
        }
      }while(grille!=cellulesToutesEteintes()); 
      System.out.println("Toutes les cellules sont éteintes !");
    System.out.println("Nombre de coups nécessaires : " + nbCoups);
    }
    
    
}
