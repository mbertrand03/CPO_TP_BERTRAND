/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_bertrand;

import java.util.Random;
import java.util.Scanner;

/**
 *bertrand
 * tdB
 * 04/10/2023
 * vérifier le caractère aléatoire d'un générateur de variables aléatoires en simulant avec un lancer de dé
 * @author marie
 */
public class TP1_stats_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [] tab=new double[6];
        double m;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez un entier:");
        m=sc.nextInt();
        
        Random generateurAleat = new Random();
        double pourcentage;
        
        for (int i=0; i<m;i++){
            int n = generateurAleat.nextInt(6);
            for (int j=0;j<6;j++){
                if (n==j){
                    tab[j]=tab[j]+1;   
                }
            }
        }
        
        for (int k=0;k<tab.length;k++){
            tab[k]=(tab[k]*100)/m;
            pourcentage=tab[k];
            System.out.print(tab[k]+"% ");

        }
        
    }
    
}
