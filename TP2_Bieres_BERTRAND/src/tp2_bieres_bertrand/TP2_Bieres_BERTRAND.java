/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_bertrand;

/**
 *bertrand
 * 06/10/2023
 * tdB
 * création de class et d'objets
 * @author marie
 */
public class TP2_Bieres_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //BouteilleBiere uneBiere = new BouteilleBiere() ;
        //uneBiere.nom = "Cuvée des trolls";
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.brasserie="Dubuisson";
        //uneBiere.ouverte=false;
        //uneBiere.lireEtiquette();
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        System.out.println(uneBiere) ;
        
        //BouteilleBiere deuxiemeBiere = new BouteilleBiere();
        //deuxiemeBiere.nom="Leffe";
        //deuxiemeBiere.degreAlcool=6.6;
        //deuxiemeBiere.brasserie="Abbaye de Leffe";
        //deuxiemeBiere.lireEtiquette();
        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe") ;
        deuxiemeBiere.decapsuler();
        System.out.println(deuxiemeBiere) ;
        
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Heineken",5.0 ,"Pascal Gilet") ;
        troisiemeBiere.decapsuler();
        System.out.println(troisiemeBiere) ;
        
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Chouffe",8.0 ,"Achouffe") ;
        quatriemeBiere.decapsuler();
        System.out.println(quatriemeBiere) ;
        
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("1667",5.5 ,"Kronenbourg") ;
        cinquiemeBiere.decapsuler();
        System.out.println(cinquiemeBiere) ;
        
        
        

}


    }
    

