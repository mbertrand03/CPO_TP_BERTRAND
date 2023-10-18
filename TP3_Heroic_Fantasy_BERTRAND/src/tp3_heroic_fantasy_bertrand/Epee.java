/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_bertrand;

/**
 *
 * @author marie
 */
public class Epee extends Arme {
    int finesse;

    public Epee(int finesse) {
        this.finesse = finesse;
        finesse=0;
        if ((finesse>=0)&&(finesse<100)){
            System.out.print("finesse = "+finesse);
        }
        else{
            System.out.print("Error");
        }
    }
    
    @Override
    public String toString (){
        return nom+","+finesse;
    }
    
    
    
}
