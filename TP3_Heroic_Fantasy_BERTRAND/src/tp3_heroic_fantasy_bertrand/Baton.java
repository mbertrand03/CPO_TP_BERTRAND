/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_bertrand;

/**
 *
 * @author marie
 */
public class Baton extends Arme {
    int age;

    public Baton(int age) {
        this.age = age;
        age=0;
        if ((age>=0)&&(age<100)){
            System.out.print("age = "+age);
        }
        else{
            System.out.print("Error");
        }
    }
    @Override
    public String toString (){
        return  nom+","+ age;
    }
}
