/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_bertrand;

/**
 *
 * @author marie
 */
public class BouteilleBiere {
        
        String nom;
        float degreAlcool;
        String brasserie;
        boolean ouverte;
        
        public void lireEtiquette() {
            System.out.println("Bouteille de " + nom +" (" + degreAlcool +
            " degres) \nBrasserie : " + brasserie ) ;
        }
        
        public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
            nom = unNom;
            degreAlcool = unDegre;
            brasserie = uneBrasserie;
            ouverte = false;
        }
        
        public boolean decapsuler(){
            if (ouverte=false){
                return true;
            }
            else{
                System.out.println("Erreur: la bouteille est déja ouverte");
                return false;
            }
            }
        @Override
        public String toString() {
            String chaine_a_retourner;
            chaine_a_retourner = nom + " (" + degreAlcool + " degrés)Ouverte ? ";
            if (ouverte == true ) chaine_a_retourner += "oui" ;
            else chaine_a_retourner += "non" ;
            return chaine_a_retourner ;
        }
                

}

