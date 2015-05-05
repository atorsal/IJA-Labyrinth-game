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
public class volnyPokladGUI extends JPanel
{   
    public void vytvorVolnuPGui()
    {
        removeAll();
        revalidate();
        repaint();
        MazeCard volnaKarta = ALL.hraciePole.getFreeCard();
        if(ALL.hraciePole.volnaKarta.uloha != -1)
        {
            Image dimg = nacitanieObrazky.obrazkyPoklady[ALL.hraciePole.volnaKarta.uloha].getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
            add(new JLabel(new ImageIcon(dimg)));   
        }
        setOpaque(false);
    }
    
}
