/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_gessmynumber_bertrand;

import java.util.Random;
import java.util.Scanner;

/**
 *02/10/2023
 * bertrand
 * TDB
 * coder un jeu permettant à l'utilisateur de deviner un nombre aléatoire
 * @author marie
 */
public class TP1_gessMyNumber_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random generateurAleat = new Random(); //permet de générer des nombres aléatoirement
        int n = generateurAleat.nextInt(100);
        int nb_choix;
        //for (int i=0;i<5;i++){
        //    int nb_alea=generateurAleat.nextInt(101);
        //    System.out.println("nombre aléatoire"+(i+1)+":"+nb_alea);
        //}
        //int nb_choix=generateurAleat.nextInt(101);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, choisissez un nombre entre 0 et 100:");
        n=sc.nextInt();
        do{
            nb_choix=sc.nextInt(); // On demande a sc de donner le prochain entier
          if (nb_choix<n){
                System.out.println("trop petit, essayez encore!");
            }else{
                if (nb_choix>n){
                    System.out.println("trop grand, essayez encore!");
            }else{
                System.out.println("gagné, le nombre à deviner était:"+n);
                }
            }
        }
        
        while(nb_choix!=n);
                }
             
          
        }
        
    }
    
}
