/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version2_console;

import java.util.Random;

/**
 *permet de générer, d'activer, d'éteindre des lignes, colonnes, diagonales
 * @author marie
 */
public class GrilleDeCellules {
    CelluleLumineuse [][] matriceCellules;
    int nbLignes;
    int nbColonnes;

    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules=new CelluleLumineuse[nbLignes][nbColonnes];
    
        for (int i=0; i<nbLignes;i++){
            for (int j=0; j<nbColonnes ; j++){
                matriceCellules[i][j]=new CelluleLumineuse(true);
            }
        }
    }
    
    /**
     *parcourt toutes les cellules de la grille pour éteindre toutes les cellules
     *
     */
    public void eteindreToutesLesCellules(){
        for (int i=0; i<nbLignes;i++){
            for (int j=0; j<nbColonnes ; j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }
    /**
     *active les cellules d'une ligne spécifique de la matrice
     * @param idLigne identifie la ligne que l'on souhaite activer
     */
    public void activerLigneDeCellules(int idLigne){
        if (idLigne >= 0 && idLigne < matriceCellules.length) {
            for (int j = 0; j < matriceCellules[idLigne].length; j++) {
                matriceCellules[idLigne][j].activerCellule();
            }
        }
    }   
    
    /**
     *active les cellules d'une colonne spécifique de la matrice
     * @param idColonne identifie la colonne que l'on souhaite activer
     */
    public void activerColonneDeCellules(int idColonne){
        if (idColonne >= 0 && idColonne < matriceCellules.length) {
            for (int j = 0; j < matriceCellules[idColonne].length; j++) {
                matriceCellules[j][idColonne].activerCellule();
            }
        }
    }
    
    /**
     *permet d'activer la diagonale descendante de la matrice
     */
    public void activerDiagonaleDescendante(){
        for (int i=0; i<nbLignes;i++){
            for (int j=0; j<nbLignes;j++){
                if (i==j){
                    matriceCellules[i][j].activerCellule();
                }
            }
        }
    }
    
    /**
     *permet d'activer la diagonale descendante
     */
    public void activerDiagonaleMontante(){
        for (int i=0; i<nbLignes;i++){
            for (int j=0;j<nbLignes;j++){
                if(i+j==nbLignes-1){
                    matriceCellules[i][j].activerCellule();
                }
            }
        }
    }
    
    /**
     *genere de maniere aleatoire une ligne, une colonne ou diagonale inverse ou non
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random alea = new Random(); //permet de générer des nombres aléatoirement
        int choix=alea.nextInt(3);
        switch (choix){
                case 0 ->{
                    int ligne=alea.nextInt(nbLignes);
                    this.activerLigneDeCellules(ligne);
                }
                case 1-> {
                    int colonne=alea.nextInt(nbColonnes);
                    this.activerColonneDeCellules(colonne);
                }
                case 2->{
                    int diag=alea.nextInt(2);
                    if (diag==0){
                        this.activerDiagonaleDescendante();
                        break;
                    } 
                    else if (diag==1){
                        this.activerDiagonaleMontante();
                    }
            
                }
                default ->{
                }
            }         
        }
    
    
    /**
     *eteint toutes les cellules de la matrice puis melange la matrice aléatoirement
     * @param nbTours définit le nombre de tours a partir du nombre de fois on peut mélanger la matrice
     */
    public void MelangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int i = 0; i< nbTours; i++) {
            this.activerLigneColonneOuDiagonaleAleatoire();  
        }
    }
    
    /**
     *permet d'éteindre toutes les cellules de la grille
     * @return true si la grille éteinte
     */
    public boolean cellulesToutesEteintes(){
        for (int i=0; i<matriceCellules.length;i++ ){
            for (int j=0;j<matriceCellules.length;j++){
                if (matriceCellules[i][j].estEteint()==true){
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString(){ 
        String grilleStr = "  |";
        for (int i=0;i<nbColonnes;i++){
            grilleStr += " " + i + " |";}      
        grilleStr += "\n";
        for (int i=0;i<(nbColonnes+1)*4;i++){
            grilleStr += "-";}
        grilleStr+="\n";
        for (int i=0;i<nbLignes;i++){
            grilleStr += i+" |";
            for (int j=0;j<nbColonnes;j++){
                if(matriceCellules[i][j].getEtat()){
                    grilleStr += "\u001B[31m X \u001B[0m|";}
                else{
                    grilleStr += "\u001B[33m O \u001B[0m|";}}
            grilleStr += "\n";
            for (int j=0;j<(nbColonnes+1)*4;j++){
                grilleStr += "-";}
            grilleStr += "\n";}
        return grilleStr;
    }

}