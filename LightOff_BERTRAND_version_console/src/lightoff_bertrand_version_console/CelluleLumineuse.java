/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version_console;

/**
 *représente l'etat de la cellule (allumée ou eteinte)
 * @author marie
 */
public class CelluleLumineuse {
        private boolean etat;

    /**
     *initialise lors de la creation d'une cellule à l'etat eteinte
     * @param etat donne l'etat de la cellule
     */
    public CelluleLumineuse(boolean etat) {
        this.etat = false;
    }
    
    /**
     *bascule l'etat de la cellule
     */
    public void activerCellule(){
        if (etat==false){
            etat=true;
        }
    }
    
    /**
     *eteint la cellule si elle est allumée
     */
    public void eteindreCellule(){
        if (etat==true){    
            etat=false;
        }
    }
    
    /**
     *permet de connaitre l'etat de la cellule
     * @return true si la cellule est bien eteint et inversement
     */
    public boolean estEteint(){
        if (etat==false){
            return true;
        }
        return false;
        
    }
    
    /**
     *permet de connaitre l'etat courant de la cellule
     * @return true si elle est allumée et inversement
     */
    public boolean getEtat(){
        if (etat==false){
            return true;
        }
        return false;
    }
}
