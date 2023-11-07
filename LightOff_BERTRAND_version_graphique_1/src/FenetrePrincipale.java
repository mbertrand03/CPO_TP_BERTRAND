
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import lightoff_bertrand_version2_console.GrilleDeCellules;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author marie
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    
    GrilleDeCellules grille;
    int nbCoups;
    int i;
    int nbLignes;
    int nbColonnes;
    public FenetrePrincipale() {
        
        initComponents();
        this.nbLignes = 10;
        this.nbColonnes = 10;
        
        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);
        
        
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        for (int i=0; i < nbLignes; i++) {
            for (int j=0; j < nbColonnes; j++ ) {
                //JButton bouton_cellule = new JButton(); // création d'un bouton
                CellulesGraphique bouton_cellule = new CellulesGraphique( grille.matriceCellules[i][j], 36,36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille
               
            } 
        }
        initialiserPartie();
        PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for ( i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                   repaint();
                   VerificationCellulesEteintes();
                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonVerticaux.add(bouton_ligne);

 }

        PanneauBoutonHorizontaux.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, nbColonnes * 40, 1 * 40 ));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for ( i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;
                @Override
                public void actionPerformed(ActionEvent e) {
                   grille.activerColonneDeCellules(j);
                   repaint();
                   VerificationCellulesEteintes();
                   //label.setText("bravo vous avez gagné");
                    
                  
                }
            };
            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonHorizontaux.add(bouton_colonne);

 }
             

 
    }
    public void initialiserPartie() {
                grille.eteindreToutesLesCellules();
                grille.MelangerMatriceAleatoirement(10);
            }
    
    public void VerificationCellulesEteintes(){
        nbCoups++;
        if (this.grille.cellulesToutesEteintes()==true){
            for (int i=0; i<grille.getNbLignes();i++){
                JButton btn=(JButton) PanneauBoutonVerticaux.getComponent(i);
                btn.setVisible(false);
            }
            for (int j=0; j<grille.getNbColonnes();j++){
                JButton btn=(JButton) PanneauBoutonHorizontaux.getComponent(j);
                btn.setVisible(false);
            }
            DiagD.setVisible(false);
            DiagM.setVisible(false);
            label.setText("bravo vous avez gagné");
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        DiagD = new javax.swing.JButton();
        PanneauBoutonVerticaux = new javax.swing.JPanel();
        PanneauBoutonHorizontaux = new javax.swing.JPanel();
        DiagM = new javax.swing.JButton();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 410, 400));

        DiagD.setBackground(new java.awt.Color(153, 51, 0));
        DiagD.setText("DiagD");
        DiagD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagDActionPerformed(evt);
            }
        });
        getContentPane().add(DiagD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 50));

        PanneauBoutonVerticaux.setBackground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout PanneauBoutonVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonVerticaux);
        PanneauBoutonVerticaux.setLayout(PanneauBoutonVerticauxLayout);
        PanneauBoutonVerticauxLayout.setHorizontalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PanneauBoutonVerticauxLayout.setVerticalGroup(
            PanneauBoutonVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 60, 400));

        PanneauBoutonHorizontaux.setBackground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout PanneauBoutonHorizontauxLayout = new javax.swing.GroupLayout(PanneauBoutonHorizontaux);
        PanneauBoutonHorizontaux.setLayout(PanneauBoutonHorizontauxLayout);
        PanneauBoutonHorizontauxLayout.setHorizontalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        PanneauBoutonHorizontauxLayout.setVerticalGroup(
            PanneauBoutonHorizontauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 410, 50));

        DiagM.setBackground(new java.awt.Color(153, 51, 0));
        DiagM.setText("diagM");
        DiagM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagMActionPerformed(evt);
            }
        });
        getContentPane().add(DiagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 60, 50));

        label.setText("jLabel1");
        getContentPane().add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiagDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagDActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleDescendante();
        repaint();
        this.VerificationCellulesEteintes();
    }//GEN-LAST:event_DiagDActionPerformed

    private void DiagMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagMActionPerformed
        // TODO add your handling code here:
        this.grille.activerDiagonaleMontante();
        repaint();
        this.VerificationCellulesEteintes();
    }//GEN-LAST:event_DiagMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
        
        //grille.initialiserPartie();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DiagD;
    private javax.swing.JButton DiagM;
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
