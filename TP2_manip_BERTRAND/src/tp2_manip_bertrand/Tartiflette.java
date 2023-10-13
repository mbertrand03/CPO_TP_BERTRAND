/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_bertrand;

/**
 *
 * @author marie
 */
public class Tartiflette {
    int nbCalories;

    public Tartiflette(int nbCalories) {
        this.nbCalories = nbCalories;
        
    }
    
    @Override
    public String toString () {
        return "nb de calories dans la tartiflette"+ nbCalories;
    }
    
    
    
}
