/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version2_console;

import java.util.Random;

/**
 *
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
    
    public void activerLigneColonneOuDiagonalAleatoire(){
        Random generateurAleat = new Random(); //permet de générer des nombres aléatoirement
        int choix=generateurAleat.nextInt(4);
        int nbL = matriceCellules.length;
        int nbC = matriceCellules[0].length;
        
        if (choix==0){
            for (int i=0;i<matriceCellules[nbLignes].length;i++){
                int ligne=generateurAleat.nextInt(nbLignes);
                matriceCellules[ligne][i].activerCellule();
            }
        }
        else if (choix==1){
            for (int i=0;i<matriceCellules[nbColonnes].length;i++){
            int colonne=generateurAleat.nextInt(nbColonnes);
            matriceCellules[i][colonne].activerCellule();
            }
        }
        else if (choix==2){
            for (int i=0; i<nbLignes;i++){
                for (int j=0; j<nbColonnes ; j++){
                    if (i==j){
                         matriceCellules[i][j].activerCellule();
                    }
                }
                   
        }
        }else{
            for (int i=0; i<nbLignes;i++){
                for (int j=0; j<nbColonnes ; j++){
                    if (i+j==nbColonnes-1){
                         matriceCellules[i][j].activerCellule();
                    }
                }
            }
        }
    }
    
    
    public void MelangerMatriceAleatoirement(int nbTours){
        this.eteindreToutesLesCellules();
        for (int tour = 0; tour < nbTours; tour++) {
            //int i = rand.nextInt(numRows); // Générer un indice de ligne aléatoire
            //int j = rand.nextInt(numCols); // Générer un indice de colonne aléatoire

            matriceCellules[i][j].allumerOuEteindre(); /    
//this.activerLigneColonneOuDiagonaleAleatoire();
            
        }
        
    }
   
        
}
    
    
    

