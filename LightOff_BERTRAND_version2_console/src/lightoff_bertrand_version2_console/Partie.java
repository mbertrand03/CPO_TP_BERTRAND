/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version2_console;

import java.util.Scanner;

/**
 *permet au joueur d'effectuer une partie
 * @author marie
 */
public class Partie {
    GrilleDeCellules grille;
    int nbCoups;

    public Partie(int nbCoups) {
        this.grille=new GrilleDeCellules(7,7);
        this.nbCoups = 0;
    }
    
    /**
     *permet d'initialiser la partie en mélangeant de la manière aleatoire la grille
     */
    public GrilleDeCellules initialiserPartie(int mix){
        this.grille.activerLigneColonneOuDiagonaleAleatoire();
        this.grille.MelangerMatriceAleatoirement(mix);
        return grille;
    }
    
    /**
     *permet au joueur de jouer: il choisit quel coup effectuer et son numero attribuer à l'action si besoin
     * un chaque coup effectuer le nombre de coup effectué est incrementé de un
     * le joueur gagne quand toutes les cellules sont eteintes
     */
    public String lancerPartie(){
    
        Scanner scanner = new Scanner(System.in); // Créez le scanner en dehors de la boucle
    int coup=0;
    int num=0;
    do{
        do{
        System.out.println(this.grille.toString()); // Afficher l'état de la grille
        System.out.print("Entrez votre coup: 1 pour ligne, 2 pour colonne, 3 pour diagonale montante ou 4 pour diagonale descendante) : ");
        
        do{
        coup = scanner.nextInt();
        }while (coup<1 || coup>4);
            switch (coup) {
                
                case 1:
                    {
                        System.out.println("choisissez le numero de la ligne");
                        do{
                            num=scanner.nextInt();
                        }while (num<0 || num>this.grille.nbLignes);
                        this.grille.activerLigneDeCellules(num);
                        System.out.println(grille);
                        this.nbCoups+=1;
                        
                    }
                case 2:
                    {
                        System.out.println("choisissez le numero de la colonne");
                        do{
                            num=scanner.nextInt();
                        }while(num<0 || num>this.grille.nbColonnes);
                        this.grille.activerColonneDeCellules(num);
                        System.out.println(grille);
                        this.nbCoups+=1;
                     
                    }
                case 3:
                    this.grille.activerDiagonaleMontante();
                    //System.out.println(grille);
                    this.nbCoups+=1;
                    
                case 4:
                    this.grille.activerDiagonaleDescendante();
                    //System.out.println(grille);
                    this.nbCoups+=1;
                    
                default:
                    break;
            }
   
        }while(nbCoups<1);
            break;   
    //return "perdu";   
    }while (!this.grille.cellulesToutesEteintes());
    return "bien joué";
    }    
    

    // Une fois que toutes les cellules sont éteintes, le jeu se termine
    //System.out.println(grille);
    //System.out.println("Toutes les cellules sont éteintes !");
    //System.out.println("Nombre de coups nécessaires : " + nbCoups);

    //scanner.close(); // N'oubliez pas de fermer le scanner.
        
}

    
    

