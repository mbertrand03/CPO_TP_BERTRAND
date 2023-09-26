/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_bertrand;

import java.util.Scanner;

/**
 *bertrand
 * tdb
 * 26/09/2023
 * convertir les temperatures avec differentes méthodes
 * @author marie
 */
public class TP1_convertisseur_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double variable1;
        double tempK;
        int conv;
        double res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bonjour, saisissez une valeur:");
        variable1=sc.nextDouble(); // On demande a sc de donner le prochain entier
        
        do{
            System.out.println("saisissez la conversion que vous souhaiter effectuer:");
            conv=sc.nextInt();
        } while (conv>6);
        
        if (conv==1){
            res=CelciusVersKelvin (variable1);
            System.out.println(variable1+"en degré celcius vaut"+res+"en degre kelvin");
        }
        
        if (conv==2){
            res=KelvinVersCelcius(variable1);
            System.out.println(variable1+"en degré kelvin vaut"+res+"en degre celcius"); 
        }
        
        if (conv==3){
            res=FarenheitVersCelcius(variable1);
            System.out.println(variable1+"en degré farenheit vaut"+res+"en degre celcius");    
        }
        
        if (conv==4) {
            res=CelciusVersFarenheit(variable1);
            System.out.println(variable1+"en degré celcius vaut"+res+"en degre farenheit");
        }
        
        if (conv==5){
            res=KelvinVersFarenheit(variable1);
            System.out.println(variable1+"en degré kelvin vaut"+res+"en degre farenheit");
        }
        
        if (conv==6){
            res=FarenheitVersKelvin(variable1);
            System.out.println(variable1+"en degré farenheit vaut"+res+"en degre kelvin");
        }
        
        tempK = variable1+ 273.0;
        
    }
    public static double CelciusVersKelvin (double tCelcius) {
        double kelvin= tCelcius + 273.0;
        return kelvin;
        
    }
    public static double KelvinVersCelcius (double tKelvin){
        double tCelcius= tKelvin-273.0;
        return tCelcius;
    }
    public static double FarenheitVersCelcius(double tFaren) {
        double tCelcius=(tFaren-32.0)*(5/9);
        return tCelcius;
    }
    
    public static double CelciusVersFarenheit(double tCelcius) {
        double tFaren= tCelcius*1.8+32.0;
        return tFaren;
    }
    public static double KelvinVersFarenheit (double tKelvin){
        double tFaren= (tKelvin-273.15)*1.8 +32.00;
        return tFaren;
    }
    
    public static double FarenheitVersKelvin (double tFaren){
    double tKelvin= ((tFaren-32.0)/1.8) +273.15;
    return tKelvin;
    }

}
