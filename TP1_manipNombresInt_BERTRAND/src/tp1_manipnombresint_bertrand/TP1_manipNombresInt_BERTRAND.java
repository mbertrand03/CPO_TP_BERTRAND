/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_bertrand;

import java.util.Scanner;

/**
 *bertrand
 * 26/09/2023
 * tdB
 * saisir et manipuler les nombres
 * @author marie
 */
public class TP1_manipNombresInt_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int variable1;
        int variable2;
        int somme;
        int dif;
        int mult;
        int quotient;
        int reste;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir un entier");
        variable1=sc.nextInt(); // On demande a sc de donner le prochain entier
        System.out.println("saisir un deuxième entier");
        variable2=sc.nextInt();
        
        somme=variable1 + variable2;
        System.out.println("la somme vaut"+somme);
        dif= variable1 - variable2;
        System.out.println("la différence vaut"+dif);
        mult= variable1 * variable2; 
        System.out.println("la multiplication vaut"+mult);
        
        quotient=variable1 + variable2;
        reste= variable1%variable2;
    }
    
}
