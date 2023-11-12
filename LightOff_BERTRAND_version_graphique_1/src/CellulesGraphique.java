
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import lightoff_bertrand_version2_console.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marie
 */
public class CellulesGraphique extends JButton {
    CelluleLumineuse CelluleLumineuseAssociee;
    int largeur;
    int longueur;

    public CellulesGraphique(CelluleLumineuse CelluleLumineuseAssociee, int l, int h) {
        this.CelluleLumineuseAssociee = CelluleLumineuseAssociee;
        this.largeur = l;
        this.longueur = h;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setText(CelluleLumineuseAssociee.toString());
        
        int w = this.getWidth();
        int h = this.getHeight();
        if (CelluleLumineuseAssociee.estEteint() == true) {
            g.setColor(Color.red);
        } else {
            g.setColor(Color.yellow);
        }
        g.fillOval(2, 2, w - 4, h - 4);

    }

    }
    

