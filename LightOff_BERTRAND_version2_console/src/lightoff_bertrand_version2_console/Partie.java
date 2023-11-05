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
    int dim;
    int nbCoupmax=0;
    //int dim=this.grille.nbColonnes;
    
    public Partie(int dimParDefaut) {
        
        this.dim=dimParDefaut;
        this.grille=new GrilleDeCellules(dimParDefaut,dimParDefaut);
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
    //dim=this.NiveauDeJeu();
    Scanner scanner = new Scanner(System.in); 
    int coup=0;
    int num=0;
    do{
        do{
        System.out.println(this.grille.toString()); // Afficher l'état de la grille
        System.out.print("Entrez votre coup: 1 pour ligne, 2 pour colonne, 3 pour diagonale montante ou 4 pour diagonale descendante) : ");
        
        do{
        coup = scanner.nextInt();
        }while (coup<1 || coup>4);
            
                if(coup==1){
                    
                        System.out.println("choisissez le numero de la ligne");
                        do{
                            num=scanner.nextInt();
                        }while (num<0 || num>this.grille.nbLignes);
                        this.grille.activerLigneDeCellules(num);
                        System.out.println(grille);
                        this.nbCoups+=1;
                        System.out.print(nbCoups);
                    }
                    
                else if (coup==2){
                        System.out.println("choisissez le numero de la colonne");
                        do{
                            num=scanner.nextInt();
                        }while(num<0 || num>this.grille.nbColonnes);
                        this.grille.activerColonneDeCellules(num);
                        System.out.println(grille);
                        this.nbCoups+=1;
                        System.out.print(nbCoups);
                     
                    }
                else if (coup==3){
                        this.grille.activerDiagonaleMontante();
                        System.out.println(grille);
                        this.nbCoups+=1;
                        System.out.print(nbCoups);
                    }  
                else{
                        this.grille.activerDiagonaleDescendante();
                        System.out.println(grille);
                        this.nbCoups+=1;
                        System.out.print(nbCoups);
                    }    

        }while(nbCoups<nbCoupmax);
            //break;   
    //System.out.println("perdu");   
    }while (!this.grille.cellulesToutesEteintes());
    return "bien joué";
    //System.out.println("Toutes les cellules sont éteintes !");
    //System.out.println("Nombre de coups nécessaires : " + nbCoups);
    }    
    
    public int NiveauDeJeu (){
        
        Scanner scanner = new Scanner(System.in); 
        int dim=this.grille.nbLignes;
        int niveau=0;
        
        
        System.out.print("choisisser le niveau de difficulté entre 1, 2 ou 3: ");
        niveau=scanner.nextInt();
        switch (niveau) {
            case 1:
                dim=4;
                nbCoupmax=20;
                System.out.println("vous avez max "+nbCoupmax+" coups pour gagner la partie");
                //System.out.println(grille);
                this.grille = new GrilleDeCellules(dim, dim);
                break;
            case 2:
                dim=7;
                nbCoupmax=15;
                System.out.println("vous avez max "+nbCoupmax+" coups pour gagner la partie");
                //System.out.println(grille);
                this.grille = new GrilleDeCellules(dim, dim);
                break;
            case 3:
                dim=10;
                nbCoupmax=10;
                System.out.println("vous avez max "+nbCoupmax+" coups pour gagner la partie");
                //System.out.println(grille);
                this.grille = new GrilleDeCellules(dim, dim);
                break;
                default :{
                
                }
        }
        return dim;
    }

    
        
}

    
    

