/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_constructeurobjet_bertrand;

/**
 *
 * @author marie
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur(){
        nbConversions=0;
    }
    public double CelciusVersKelvin (double tCelcius) {
        double kelvin= tCelcius + 273.0;
        nbConversions+=1;
        return kelvin;
        
    }
    public double KelvinVersCelcius (double tKelvin){
        double tCelcius= tKelvin-273.0;
        nbConversions+=1;
        return tCelcius;
    }
    public double FarenheitVersCelcius(double tFaren) {
        double tCelcius=(tFaren-32.0)*(5/9);
        nbConversions+=1;
        return tCelcius;
    }
    
    public double CelciusVersFarenheit(double tCelcius) {
        double tFaren= tCelcius*1.8+32.0;
        nbConversions+=1;
        return tFaren;
    }
    public double KelvinVersFarenheit (double tKelvin){
        double tFaren= (tKelvin-273.15)*1.8 +32.00;
        nbConversions+=1;
        return tFaren;
    }
    
    public double FarenheitVersKelvin (double tFaren){
    double tKelvin= ((tFaren-32.0)/1.8) +273.15;
    nbConversions+=1;
    return tKelvin;
    }
    
    @Override
    public String toString () {
        return "nb de conversions"+ nbConversions;
    }
}
