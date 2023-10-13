/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_bertrand;

/**
 *bertrand 
 * TDB
 * 13/10/2023
 * manipuler les objets
 * @author marie
 */
public class TP2_manip_BERTRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tartiflette assiette1 = new Tartiflette(500) ;
        System.out.println("nb de calories dans l'assiete1: "+assiette1);
        
        Tartiflette assiette2 = new Tartiflette(600) ;
        System.out.println("nb de calories dans l'assiete2: "+assiette2);
        
        Tartiflette assiette3 = assiette2 ; 
        System.out.println("nb de calories dans l'assiete3: "+assiette3);
        //trois tartiflettes ont été crées
        //tartiflette 2 et 3 référencent à la même tartiflettes
        
        Tartiflette temp=new Tartiflette(1);
        temp=assiette2;
        assiette2=assiette1;
        assiette1=temp;
        
        
        
        //question 6: la ligne 2 est correcte
        //oui
        
        //question 7:oui,oui
        Moussaka [] tab= new Moussaka[10];
        for (int i=0; i<10;i++){
            tab[i]=new Moussaka(i*100);
        }
        
        
        
        
        
        
        

    }
    
}
