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
        int n = generateurAleat.nextInt(101);
        
        int nb_choix;
        int temp;
        
        temp=0;
        //for (int i=0;i<5;i++){
        //    int nb_alea=generateurAleat.nextInt(101);
        //    System.out.println("nombre aléatoire"+(i+1)+":"+nb_alea);
        //}
        //int nb_choix=generateurAleat.nextInt(101);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("1: mode facil");
        System.out.println("2: mode normal");
        System.out.println("3: mode difficil");
        System.out.println("veuillez choisir votre niveau de difficulté");
        int choixNiveau=sc.nextInt();
        
        
        //System.out.println("Bonjour, choisissez un nombre entre 0 et 100:");
        
        
        //n=sc.nextInt();
        //mode facile
        switch (choixNiveau) {
            case 1:
                do{
                    n=11;
                    //int n = generateurAleat.nextInt(11);
                    System.out.println("choisissez un nombre entre 0 et 10:");
                    nb_choix=sc.nextInt(); // On demande a sc de donner le prochain entier
                    if (nb_choix<n){
                        if (nb_choix<=2*n){
                            System.out.println("vraiment trop petit, essayez encore!");
                        }
                        else{
                            System.out.println("trop petit, essayez encore!");
                        }
                        temp=temp+1;
                    }
                    else if (nb_choix>n){
                        if (nb_choix>=2*n){
                            System.out.println("vraiment trop grand, essayez encore!");
                        }
                        else{
                            System.out.println("trop grand, essayez encore!");
                        }
                        temp=temp+1;
                    }
                    else{
                        //System.out.println("choisissez un nombre entre 0 et 100:");
                        System.out.println("gagné, le nombre à deviner était:"+n);
                    }
                }while(nb_choix!=n);
                break;
            case 2:
                //int n = generateurAleat.nextInt(101);
                do{
                    n=101;
                    nb_choix=sc.nextInt(); // On demande a sc de donner le prochain entier
                    System.out.println("choisissez un nombre entre 0 et 100:");
                    if (nb_choix<n){
                        if (nb_choix<=2*n){
                            System.out.println("vraiment trop petit, essayez encore!");
                        }
                        else{
                            System.out.println("trop petit, essayez encore!");
                        }
                        
                        temp=temp+1;
                    }
                    else if (nb_choix>n){
                        if (nb_choix>=2*n){
                            System.out.println("vraiment trop grand, essayez encore!");
                        }
                        else{
                            System.out.println("trop grand, essayez encore!");
                        }
                        temp=temp+1;
                    }
                    else{
                        
                        System.out.println("gagné, le nombre à deviner était:"+n);
                        System.out.println("le nombre d'essaie est:"+temp);
                    }
                }while(nb_choix!=n);
                break;
            //mode difficile
            default:
                
                do{
                    n=1001;
                   //int n = generateurAleat.nextInt(1001);
                    nb_choix=sc.nextInt(); // On demande a sc de donner le prochain entier
                    System.out.println("choisissez un nombre entre 0 et 1000:");
                    if (nb_choix<n){
                        if (nb_choix<=2*n){
                            System.out.println("vraiment trop petit, essayez encore!");
                        }
                        else{
                            System.out.println("trop petit, essayez encore!");
                        }
                        temp=temp+1;
                    }
                    else if (nb_choix>n){
                        if (nb_choix>=2*n){
                            System.out.println("vraiment trop grand, essayez encore!");
                        }
                        else{
                            System.out.println("trop grand, essayez encore!");
                            
                        }
                        temp=temp+1;
                    }
                    else{
                        
                        System.out.println("gagné, le nombre à deviner était:"+n);
                        System.out.println("le nombre d'essaie est:"+temp);
                    }
                }while(nb_choix!=n);
                break;
        }
        //System.out.println("le nombre d'essaie est:"+temp);
            }
        }
    
