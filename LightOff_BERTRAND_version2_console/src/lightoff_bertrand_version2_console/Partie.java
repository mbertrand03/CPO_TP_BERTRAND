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
    
    public Partie(int dimParDefaut) {
        
        this.dim=dimParDefaut;
        this.grille=new GrilleDeCellules(dimParDefaut,dimParDefaut);
        this.nbCoups = 0;
        
    }
    
    /**
     *permet d'initialiser la partie en mélangeant de la manière aleatoire la grille
     * @mix permet de connaitre le nombre de fois que l'on souhaite mélanger la grille
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
     * @num permet de savoir quelle ligne/colonne le joueur veut activer/désactiver
     * @coup permet de connaitre quelle action veut effectuer le joueur
     * @r permet desvoir combien il reste de coups possibles au joueur
     */
    public String lancerPartie(){
    
    Scanner scanner = new Scanner(System.in); 
    int coup=0;
    int num=0;
    do{
        do{
        System.out.println(this.grille.toString()); 
        System.out.print("Entrez votre coup: 1 pour ligne, 2 pour colonne, 3 pour diagonale montante ou 4 pour diagonale descendante) : ");
        coup = scanner.nextInt();
                if(coup==1){
                    
                        System.out.println("choisissez le numero de la ligne");
                        do{
                            num=scanner.nextInt();
                        }while (num<0 || num>this.grille.nbLignes);
                        this.grille.activerLigneDeCellules(num);
                        System.out.println(grille);
                        this.nbCoups+=1;
                        int r=nbCoupmax-nbCoups;
                        System.out.println("il vous reste "+r+" coups\n");
                    }
                    
                else if (coup==2){
                        System.out.println("choisissez le numero de la colonne");
                        do{
                            num=scanner.nextInt();
                        }while(num<0 || num>this.grille.nbColonnes);
                        this.grille.activerColonneDeCellules(num);
                        System.out.println(grille);
                        this.nbCoups+=1;
                        int r=nbCoupmax-nbCoups;
                        System.out.println("il vous reste "+r+" coups\n");
                     
                    }
                else if (coup==3){
                        this.grille.activerDiagonaleMontante();
                        System.out.println(grille);
                        this.nbCoups+=1;
                        int r=nbCoupmax-nbCoups;
                        System.out.println("il vous reste "+r+" coups\n");
                    }  
                else{
                        this.grille.activerDiagonaleDescendante();
                        System.out.println(grille);
                        this.nbCoups+=1;
                        int r=nbCoupmax-nbCoups;
                        System.out.println("il vous reste "+r+" coups\n");
                    }    
        
        }while(nbCoups<nbCoupmax);
        break;      
    }while (!this.grille.cellulesToutesEteintes());
    
    if (this.grille.cellulesToutesEteintes()){
        return "bien joué, toutes les cellules sont éteintes. il vous a fallu "+nbCoups+"coups";
        }
    else{
        return "perdu";
    }
    }    
    
    /**
     *permet de demander au joueur quel niveau de difficulté il choisit, il a le choix entre facile(1), intermédiaire(2) et difficile(3)
     * @return la dimension de la grille
     */
    public int NiveauDeJeu (){
        
        Scanner scanner = new Scanner(System.in); 
        int niveau=0;
        
        
        System.out.print("choisisser le niveau de difficulté entre 1, 2 ou 3: ");
        niveau=scanner.nextInt();
        switch (niveau) {
            case 1:
                dim=4;
                nbCoupmax=20;
                System.out.println("vous avez max "+nbCoupmax+" coups pour gagner la partie");
                this.grille = new GrilleDeCellules(dim, dim);
                break;
            case 2:
                dim=7;
                nbCoupmax=15;
                System.out.println("vous avez max "+nbCoupmax+" coups pour gagner la partie");
                this.grille = new GrilleDeCellules(dim, dim);
                break;
            case 3:
                dim=10;
                nbCoupmax=10;
                System.out.println("vous avez max "+nbCoupmax+" coups pour gagner la partie");
                this.grille = new GrilleDeCellules(dim, dim);
                break;
                default :{
                
                }
        }
        return dim;
    }

    
        
}

    
    

