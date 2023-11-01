/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_bertrand_version2_console;

import java.util.Scanner;

/**
 *permet au joueur d'effectuer une partie
 * @author marie
 */
public class Partie {
    GrilleDeCellules grille;
    int nbCoups;

    public Partie(int nbCoups) {
        this.grille=grille;
        this.nbCoups = 0;
    }
    
    /**
     *permet d'initialiser la partie en mélangeant de la manière aleatoire la grille
     */
    public void initialiserPartie(){
        
        grille.MelangerMatriceAleatoirement(nbCoups);
    }
    
    /**
     *permet au joueur de jouer: il choisit quel coup effectuer et son numero attribuer à l'action si besoin
     * un chaque coup effectuer le nombre de coup effectué est incrementé de un
     * le joueur gagne quand toutes les cellules sont eteintes
     */
    public String lancerPartie(){
    Scanner scanner = new Scanner(System.in); // Créez le scanner en dehors de la boucle
    
    
    do {
        System.out.println(this.grille.toString()); // Afficher l'état de la grille
        System.out.print("Entrez votre coup (ligne, colonne, diagonale montante ou diagonale descendante) : ");
        String coup = scanner.nextLine();
        

        if (coup=="ligne") {
            System.out.println("choisissez le numero de la ligne");
            int num=scanner.nextInt();
            grille.activerLigneDeCellules(num);
            System.out.println(grille);
            nbCoups+=1;
        } 
        else if (coup=="colonne") {
            System.out.println("choisissez le numero de la colonne");
            int num=scanner.nextInt();
            grille.activerColonneDeCellules(num);
            System.out.println(grille);
            nbCoups+=1;
        } 
        else if (coup=="diagonale montante") {
            grille.activerDiagonaleMontante();
            System.out.println(grille);
            nbCoups+=1;
        } 
        else if (coup=="diagonale descendante") {
            grille.activerDiagonaleDescendante();
            System.out.println(grille);
            nbCoups+=1;
        } 
        else {
            System.out.println("Coup invalide. Veuillez entrer 'ligne', 'colonne', 'diagonale montante', ou 'diagonale descendante'.");
        }
    } while (this.grille.cellulesToutesEteintes());

    // Une fois que toutes les cellules sont éteintes, le jeu se termine
    System.out.println(grille);
    System.out.println("Toutes les cellules sont éteintes !");
    System.out.println("Nombre de coups nécessaires : " + nbCoups);

    scanner.close(); // N'oubliez pas de fermer le scanner.
        return "bien joué";
}

    
    
}
