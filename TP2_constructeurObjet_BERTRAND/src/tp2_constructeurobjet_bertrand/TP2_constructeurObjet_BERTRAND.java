/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_constructeurobjet_bertrand;

import java.util.Scanner;

/**
 *
 * @author marie
 */
public class TP2_constructeurObjet_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur objet1=new Convertisseur ();
        objet1.CelciusVersFarenheit(12.0);
        System.out.println(objet1);
        
        Convertisseur objet2=new Convertisseur ();
        objet2.CelciusVersFarenheit(36.0);
        System.out.println(objet2);
        
        double variable1;
        double tempK;
        int conv;
        double res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur:");
        variable1=sc.nextDouble(); // On demande a sc de donner le prochain entier
        
        Convertisseur objet=new Convertisseur ();
        
        do{
            System.out.println("saisissez la conversion que vous souhaiter effectuer:");
            conv=sc.nextInt();
            
        } while (conv>6);
        
        if (conv==1){
            res=objet.CelciusVersKelvin (variable1);
            System.out.println(variable1+"en degré celcius vaut"+res+"en degre kelvin");
            System.out.println(objet);
        }
        
        if (conv==2){
            res=objet.KelvinVersCelcius(variable1);
            System.out.println(variable1+"en degré kelvin vaut"+res+"en degre celcius"); 
            System.out.println(objet);
        }
        
        if (conv==3){
            res=objet.FarenheitVersCelcius(variable1);
            System.out.println(variable1+"en degré farenheit vaut"+res+"en degre celcius");    
            System.out.println(objet);
        }
        
        if (conv==4) {
            res=objet.CelciusVersFarenheit(variable1);
            System.out.println(variable1+"en degré celcius vaut"+res+"en degre farenheit");
            System.out.println(objet);
        }
        
        if (conv==5){
            res=objet.KelvinVersFarenheit(variable1);
            System.out.println(variable1+"en degré kelvin vaut"+res+"en degre farenheit");
            System.out.println(objet);
        }
        
        if (conv==6){
            res=objet.FarenheitVersKelvin(variable1);
            System.out.println(variable1+"en degré farenheit vaut"+res+"en degre kelvin");
            System.out.println(objet);
        }
        
        tempK = variable1+ 273.0;
    }
    
}
