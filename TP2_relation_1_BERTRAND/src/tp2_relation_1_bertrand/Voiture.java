/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_bertrand;

/**
 *
 * @author marie
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    @Override
    public String toString () {
    return "le modele de la voiture est:"+Modele+" ,sa marque est:"+Marque+" et la puissanceCV est de "+ PuissanceCV;
    }

    public Voiture(String Modele, String Marque, int PuissanceCV) {
        this.Modele = Modele;
        this.Marque = Marque;
        this.PuissanceCV = PuissanceCV;
        this.Proprietaire=null;
    }
    
    
}
