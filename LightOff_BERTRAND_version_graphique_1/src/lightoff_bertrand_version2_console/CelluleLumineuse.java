/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version2_console;



/**
 *permet de définir les transitions entre une cellule allumée et eteinte
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
            //System.out.println(etat);
            
        }
        else if (etat==true){
            etat=false;
        }
    }
    
    /**
     *eteint la cellule si elle est allumée
     */
    public void eteindreCellule(){
        if (etat==true){    
            etat=false;
            
        }
        //System.out.println(etat);
        
    }
    
    /**
     *permet de connaitre l'etat de la cellule
     * @return true si la cellule est bien eteint et inversement
     */
    public boolean estEteint(){
        return !etat;
    }
    
    /**
     *permet de connaitre l'etat courant de la cellule
     * @return true si elle est allumée et inversement
     */
    public boolean getEtat(){
        return etat;
    }
    
    
    @Override
    public String toString(){
                if(this.etat==true){
                    return "X";
                }
                else {
                    return "O";
                }
        } 
}
    
        



