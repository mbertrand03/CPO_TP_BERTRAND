/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_bertrand_version2_console;

/**
 *bertrand
 * tdB
 * 05/11/2023
 * @author marie
 */
public class LightOff_BERTRAND_version2_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        CelluleLumineuse test1=new CelluleLumineuse(true);
        CelluleLumineuse test2=new CelluleLumineuse(false);
        //test1.activerCellule();
        //test1.eteindreCellule();
        //test1.estEteint();
        //test2.activerCellule();
        //test2.eteindreCellule();
        //test2.estEteint();
    
     //GrilleDeCellules grille1=new GrilleDeCellules(7,7);
     Partie grille2=new Partie(4);
     //grille1.activerLigneDeCellules(2);
     //grille1.activerColonneDeCellules(2);
     //grille1.activerDiagonaleDescendante();
     //grille1.activerDiagonaleMontante();
     //grille1.activerLigneColonneOuDiagonaleAleatoire();
     //grille1.MelangerMatriceAleatoirement(5);
     //grille1.cellulesToutesEteintes();
     //grille1.eteindreToutesLesCellules();
     
     
     grille2.NiveauDeJeu();
     grille2.initialiserPartie(3);
     grille2.lancerPartie();
     
    }
    
}
