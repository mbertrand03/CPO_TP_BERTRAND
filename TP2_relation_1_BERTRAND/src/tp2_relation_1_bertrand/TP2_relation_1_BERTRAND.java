/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_bertrand;

/**
 *BERTRAND
 * tdB
 * 13/10/2023
 * coder une relation entre deux objets
 * @author marie
 */
public class TP2_relation_1_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic hereVoiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        System.out.println("liste des voitures disponibles "+ uneClio +
        "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
       
        bob.nbVoitures = 2 ;
        uneClio.Proprietaire = bob ;
        bob.liste_voitures[0] = uneClio ;
     
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
        une2008.Proprietaire = bob ;
        bob.liste_voitures[1] = une2008 ;
     
        System.out.println("la deuxieme voiture de Bob est " + bob.liste_voitures[1] ) ;
        
        reno.nbVoitures=2;
        uneMicra.Proprietaire=reno;
        reno.liste_voitures[0] = uneMicra ;
        System.out.println("la premiere voiture de Reno est " + reno.liste_voitures[0] ) ;
        uneClio.Proprietaire = reno ;
        reno.liste_voitures[1] = uneClio ;
        System.out.println("la deuxieme voiture de reno est " + reno.liste_voitures[1] ) ;
  
    }
    
}
