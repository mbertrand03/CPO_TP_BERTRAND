
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
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
    int nbCoupsMax;
    
    public FenetrePrincipale() {

        initComponents();
        afficherGrille(false);
        lbl_finDePartie.setVisible(false);
        lbl_bienvenue.setVisible(true);
        lbl_choix.setText("Quelle difficulté choisissez-vous?");
        lbl_choix.setVisible(true);
         
         
        
        
    }

    public void afficherGrille(boolean etat) {
        PanneauGrille.setVisible(etat);
        PanneauBoutonVerticaux.setVisible(etat);
        PanneauBoutonHorizontaux.setVisible(etat);
        DiagD.setVisible(etat);
        DiagM.setVisible(etat);
        lbl_nbCoupsRestants.setVisible(etat);
    }

    public void genererGrille(int difficulte) {
        
        
        lbl_bienvenue.setVisible(false);
        lbl_choix.setVisible(false);
        Niveau_facil.setVisible(false);
        Niveau_inter.setVisible(false);
        Niveau_diff.setVisible(false);

        switch (difficulte) {
            case 1:
                this.nbLignes = 4;
                this.nbColonnes = 4;
                nbCoupsMax = 50;
                break;
            case 2:
                this.nbLignes = 7;
                this.nbColonnes = 7;
                nbCoupsMax = 20;
                break;

            default:
                this.nbLignes = 10;
                this.nbColonnes = 10;
                nbCoupsMax = 15;
                break;

        }

        lbl_nbCoupsRestants.setText("Coups restants : " + nbCoupsMax);

        this.grille = new GrilleDeCellules(nbLignes, nbColonnes);

        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));
        this.initialiserPartie();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                //JButton bouton_cellule = new JButton(); // création d'un bouton
                CellulesGraphique bouton_cellule = new CellulesGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule); // ajout au Jpanel PanneauGrille

            }
        }
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonVerticaux.setLayout(new GridLayout(nbLignes, 1));

        getContentPane().add(PanneauBoutonVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            JButton bouton_ligne = new JButton();
               bouton_ligne.setText("→");
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
        getContentPane().add(PanneauBoutonHorizontaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, nbColonnes * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbColonnes; i++) {
            JButton bouton_colonne = new JButton();
            bouton_colonne.setText("↓");
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    VerificationCellulesEteintes();
                }

            };

            bouton_colonne.addActionListener(ecouteurClick);
            PanneauBoutonHorizontaux.add(bouton_colonne);

        }

        getContentPane().add(DiagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, nbLignes * (40 + 1) + 70, 60, 50));

        afficherGrille(true);
    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.MelangerMatriceAleatoirement(10);
    }

    public void VerificationCellulesEteintes() {
        nbCoups++;

        int nbCoupsRestants = nbCoupsMax - nbCoups;
        lbl_nbCoupsRestants.setText("Coups restants : " + nbCoupsRestants);

 
        if (this.grille.cellulesToutesEteintes() == true) {

            afficherGrille(false);
            lbl_finDePartie.setText("BRAVOO vous avez gagné !");
            lbl_finDePartie.setFont(new Font("Arial", Font.BOLD, 14));
            lbl_finDePartie.setForeground(Color.BLUE);
            lbl_finDePartie.setVisible(true);
        } else if (nbCoups == nbCoupsMax) {
            afficherGrille(false);
            lbl_finDePartie.setText("Vous avez perdu! essayez encore!!!");
            lbl_finDePartie.setFont(new Font("Arial", Font.BOLD, 14));
            lbl_finDePartie.setForeground(Color.RED);
            lbl_finDePartie.setVisible(true);
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
        lbl_nbCoupsRestants = new javax.swing.JLabel();
        Niveau_facil = new javax.swing.JButton();
        Niveau_inter = new javax.swing.JButton();
        Niveau_diff = new javax.swing.JButton();
        lbl_finDePartie = new javax.swing.JLabel();
        lbl_bienvenue = new javax.swing.JLabel();
        lbl_choix = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(0, 0, 0));

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

        DiagD.setBackground(new java.awt.Color(153, 153, 255));
        DiagD.setText(" ↘");
        DiagD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagDActionPerformed(evt);
            }
        });
        getContentPane().add(DiagD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 50));

        PanneauBoutonVerticaux.setBackground(new java.awt.Color(204, 204, 255));

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

        PanneauBoutonHorizontaux.setBackground(new java.awt.Color(204, 204, 255));

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

        DiagM.setBackground(new java.awt.Color(153, 153, 255));
        DiagM.setText(" ↗");
        DiagM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagMActionPerformed(evt);
            }
        });
        getContentPane().add(DiagM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 60, 50));

        lbl_nbCoupsRestants.setBackground(new java.awt.Color(255, 255, 204));
        lbl_nbCoupsRestants.setText("nombre de coups restants");
        getContentPane().add(lbl_nbCoupsRestants, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 160, 40));

        Niveau_facil.setBackground(new java.awt.Color(51, 204, 0));
        Niveau_facil.setForeground(new java.awt.Color(255, 255, 255));
        Niveau_facil.setText("Niveau facile");
        Niveau_facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Niveau_facilActionPerformed(evt);
            }
        });
        getContentPane().add(Niveau_facil, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 110, 30));

        Niveau_inter.setBackground(new java.awt.Color(255, 102, 0));
        Niveau_inter.setForeground(new java.awt.Color(255, 255, 255));
        Niveau_inter.setText("Niveau Intermediaire");
        Niveau_inter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Niveau_interActionPerformed(evt);
            }
        });
        getContentPane().add(Niveau_inter, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, 30));

        Niveau_diff.setBackground(new java.awt.Color(255, 0, 0));
        Niveau_diff.setForeground(new java.awt.Color(255, 255, 255));
        Niveau_diff.setText("Niveau difficile");
        Niveau_diff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Niveau_diffActionPerformed(evt);
            }
        });
        getContentPane().add(Niveau_diff, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, 30));

        lbl_finDePartie.setBackground(new java.awt.Color(255, 153, 153));
        lbl_finDePartie.setText("message Fin de partie");
        getContentPane().add(lbl_finDePartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 210, 40));

        lbl_bienvenue.setText("Bienvenue dans Light Off");
        getContentPane().add(lbl_bienvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        lbl_choix.setText("Quelle difficulté choisissez-vous?");
        getContentPane().add(lbl_choix, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));

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

    private void Niveau_facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Niveau_facilActionPerformed
        genererGrille(1);
    }//GEN-LAST:event_Niveau_facilActionPerformed

    private void Niveau_interActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Niveau_interActionPerformed
        genererGrille(2);
    }//GEN-LAST:event_Niveau_interActionPerformed

    private void Niveau_diffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Niveau_diffActionPerformed
        genererGrille(3);
    }//GEN-LAST:event_Niveau_diffActionPerformed

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
    private javax.swing.JButton Niveau_diff;
    private javax.swing.JButton Niveau_facil;
    private javax.swing.JButton Niveau_inter;
    private javax.swing.JPanel PanneauBoutonHorizontaux;
    private javax.swing.JPanel PanneauBoutonVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JLabel lbl_bienvenue;
    private javax.swing.JLabel lbl_choix;
    private javax.swing.JLabel lbl_finDePartie;
    private javax.swing.JLabel lbl_nbCoupsRestants;
    // End of variables declaration//GEN-END:variables
}
