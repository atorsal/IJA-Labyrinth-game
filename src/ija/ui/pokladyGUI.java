/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ija.ui;
import ija.elements.ALL;
import ija.homework2.board.MazeBoard;
import ija.homework2.board.MazeCard;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author user
 */
public class pokladyGUI extends JPanel
{
    JPanel pokladyGui[][];
    MazeBoard hraciaPlocha;
    
    public pokladyGUI()
    {
        this.hraciaPlocha = null;
        setLayout(null);
        this.pokladyGui = new JPanel[12][12];
        //vytvorGui();
    }
    
    public void vytvorPokladyGui()
    {
        removeAll();
        revalidate();
        repaint();
        this.hraciaPlocha = ALL.hraciePole;
        setLayout(new GridLayout(this.hraciaPlocha.riadky, this.hraciaPlocha.riadky, 0, 0));
        for(int i = 1; i <= this.hraciaPlocha.riadky; i++)
        {
            for(int j = 1; j <= this.hraciaPlocha.riadky; j++)
            {
                
                this.pokladyGui[i][j] = new JPanel();
                if(ALL.hraciePole.plocha[i][j].karta.uloha != - 1)
                {
                    System.out.println("Toto je ono: " + ALL.hraciePole.plocha[i][j].karta.uloha);
                    try {
                        BufferedImage obrazok = ImageIO.read(getClass().getResource("/ija/ui/" + Integer.toString(ALL.hraciePole.plocha[i][j].karta.uloha) + ".png"));
                        Image dimg = obrazok.getScaledInstance(this.getWidth()/this.hraciaPlocha.riadky - 2, this.getHeight()/this.hraciaPlocha.riadky, Image.SCALE_SMOOTH);
                        this.pokladyGui[i][j].add(new JLabel(new ImageIcon(dimg)));
                    } catch (IOException ex) {
                        Logger.getLogger(hraciaPlochaGUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                setOpaque(false);
                this.pokladyGui[i][j].setOpaque(false);
                add(this.pokladyGui[i][j]);
                //add(new JButton());5
            }
        }
    }
    
}