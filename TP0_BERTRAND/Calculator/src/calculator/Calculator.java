/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 * bertrand 25/09/2023 tdB
 *
 * @author marie
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter the operator");
        System.out.println("1) add");
        System.out.println("2) susbstract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        int operateur;
        int operande1;
        int operande2;
        int result;
        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("quelle valeur enière souhaitez-vous?");
        operateur = sc.nextInt();

        System.out.println("choisissez une première valeur");
        operande1 = sc.nextInt();

        System.out.println("qchoisissez une première valeur");
        operande2 = sc.nextInt();
        do{
           Systeme.out.println("error") ;
        }while(operateur>5);

        if (operateur == 1) {
            result = operande1 + operande2;
        } 
        if (operateur == 2) {
            result = operande1 - operande2;
            }
    
        if (operateur==3) {
            result=operande1*operande2;       
            }
        
        if ((operateur==4)&&(operande2!=0)) {
            result=operande1/operande2;
            }
        if (operateur==5) {
                result=operande1%operande2;
            }
    }
}

