/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version2_console;

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
    }
    
    
    
    
}
