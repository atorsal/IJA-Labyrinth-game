package ija.ui;

import ija.elements.ALL;
import ija.elements.hraci;
import ija.homework2.board.MazeBoard;
import ija.homework1.treasure.CardPack;
import ija.homework1.treasure.TreasureCard;
import ija.homework1.treasure.Treasure;
import ija.homework2.board.MazeCard;
import ija.homework2.board.MazeCard.CANGO;
import ija.homework2.board.MazeField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blaa
 */
public class menuGui extends javax.swing.JFrame {

    /**
     * Creates new form menuGui
     */
    public menuGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ParentPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pozadieMenu = new javax.swing.JLabel();
        NastaveniaPanel = new javax.swing.JPanel();
        pocetHracov = new javax.swing.JLabel();
        pocetHracovSlider = new javax.swing.JSlider();
        pocetHracovText = new javax.swing.JTextField();
        velkostPola = new javax.swing.JLabel();
        velkostPolaSlider = new javax.swing.JSlider();
        velkostPolaText = new javax.swing.JTextField();
        velkostPola1 = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        NavratDoMenu = new javax.swing.JButton();
        tlacitko12 = new javax.swing.JRadioButton();
        tlacitko24 = new javax.swing.JRadioButton();
        pozadieNastavenia = new javax.swing.JLabel();
        hraPanel = new javax.swing.JPanel();
        pohybDole = new javax.swing.JButton();
        volnyPokladGUI1 = new ija.ui.volnyPokladGUI();
        volnaKartaGUI1 = new ija.ui.volnaKartaGUI();
        pohybVpravo = new javax.swing.JButton();
        hracovaKartaGUI1 = new ija.ui.hracovaKartaGUI();
        zober = new javax.swing.JButton();
        pohybVlavo = new javax.swing.JButton();
        pohybHore = new javax.swing.JButton();
        hraciGUI1 = new ija.ui.hraciGUI();
        pokladyGUI1 = new ija.ui.pokladyGUI();
        hraciaPlochaGUI1 = new ija.ui.hraciaPlochaGUI();
        otocVpravo = new javax.swing.JButton();
        otocVlavo = new javax.swing.JButton();
        riadokText = new javax.swing.JLabel();
        stlpecText = new javax.swing.JLabel();
        stlpecZadanie = new javax.swing.JTextField();
        riadokZadanie = new javax.swing.JTextField();
        vlozVolnuKartu = new javax.swing.JButton();
        kartaHraca = new javax.swing.JLabel();
        balicekKarty = new javax.swing.JLabel();
        UkoncitHru = new javax.swing.JButton();
        ulozitHru = new javax.swing.JButton();
        potiahnutKartu = new javax.swing.JButton();
        dalsiHrac = new javax.swing.JButton();
        infoKarty = new javax.swing.JLabel();
        tah = new javax.swing.JLabel();
        naTahu = new javax.swing.JLabel();
        PocetHracoShow = new javax.swing.JLabel();
        skore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        infoScore = new javax.swing.JLabel();
        infoKarta = new javax.swing.JLabel();
        pozadieHry = new javax.swing.JLabel();
        VyhraPanel = new javax.swing.JPanel();
        vyherca = new javax.swing.JLabel();
        vyhralHrac1 = new javax.swing.JLabel();
        toMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        ParentPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        ParentPanel.setName(""); // NOI18N
        ParentPanel.setLayout(new java.awt.CardLayout());

        MenuPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        MenuPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
        MenuPanel.setLayout(null);

        jButton1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jButton1.setText("NOVA HRA");
        jButton1.setMaximumSize(new java.awt.Dimension(90, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(90, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MenuPanel.add(jButton1);
        jButton1.setBounds(370, 200, 260, 90);

        jButton2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jButton2.setText("NACITAT HRU");
        jButton2.setMaximumSize(new java.awt.Dimension(90, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(90, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(90, 25));
        MenuPanel.add(jButton2);
        jButton2.setBounds(370, 360, 260, 90);

        jButton4.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jButton4.setText("OPUSTIT HRU");
        jButton4.setMaximumSize(new java.awt.Dimension(90, 25));
        jButton4.setMinimumSize(new java.awt.Dimension(90, 25));
        jButton4.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        MenuPanel.add(jButton4);
        jButton4.setBounds(370, 530, 260, 90);

        pozadieMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ija/ui/black.jpg"))); // NOI18N
        MenuPanel.add(pozadieMenu);
        pozadieMenu.setBounds(0, 0, 1024, 768);

        ParentPanel.add(MenuPanel, "card3");

        NastaveniaPanel.setMaximumSize(new java.awt.Dimension(1024, 768));
        NastaveniaPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        NastaveniaPanel.setLayout(null);

        pocetHracov.setFont(new java.awt.Font("Dodger", 1, 18)); // NOI18N
        pocetHracov.setForeground(new java.awt.Color(240, 240, 240));
        pocetHracov.setText("pocet hracov:");
        NastaveniaPanel.add(pocetHracov);
        pocetHracov.setBounds(370, 180, 260, 30);

        pocetHracovSlider.setMaximum(4);
        pocetHracovSlider.setMinimum(2);
        pocetHracovSlider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pocetHracovSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pocetHracovSliderStateChanged(evt);
            }
        });
        NastaveniaPanel.add(pocetHracovSlider);
        pocetHracovSlider.setBounds(360, 210, 260, 50);

        pocetHracovText.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        pocetHracovText.setText("2");
        NastaveniaPanel.add(pocetHracovText);
        pocetHracovText.setBounds(640, 210, 50, 50);

        velkostPola.setFont(new java.awt.Font("Dodger", 1, 18)); // NOI18N
        velkostPola.setForeground(new java.awt.Color(240, 240, 240));
        velkostPola.setText("velkost pola:");
        NastaveniaPanel.add(velkostPola);
        velkostPola.setBounds(370, 300, 260, 30);

        velkostPolaSlider.setMaximum(11);
        velkostPolaSlider.setMinimum(5);
        velkostPolaSlider.setValue(7);
        velkostPolaSlider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        velkostPolaSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                velkostPolaSliderStateChanged(evt);
            }
        });
        NastaveniaPanel.add(velkostPolaSlider);
        velkostPolaSlider.setBounds(360, 330, 260, 50);

        velkostPolaText.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        velkostPolaText.setText("7");
        NastaveniaPanel.add(velkostPolaText);
        velkostPolaText.setBounds(640, 330, 50, 50);

        velkostPola1.setFont(new java.awt.Font("Dodger", 1, 20)); // NOI18N
        velkostPola1.setForeground(new java.awt.Color(240, 240, 240));
        velkostPola1.setText("Pocet KARIET/Predmetov:");
        NastaveniaPanel.add(velkostPola1);
        velkostPola1.setBounds(290, 430, 470, 30);

        Start.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        Start.setText("START");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        NastaveniaPanel.add(Start);
        Start.setBounds(800, 640, 170, 60);

        NavratDoMenu.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        NavratDoMenu.setText("NAVRAT DO MENU");
        NavratDoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NavratDoMenuActionPerformed(evt);
            }
        });
        NastaveniaPanel.add(NavratDoMenu);
        NavratDoMenu.setBounds(40, 640, 170, 60);

        buttonGroup1.add(tlacitko12);
        tlacitko12.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        tlacitko12.setSelected(true);
        tlacitko12.setText("12");
        tlacitko12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        NastaveniaPanel.add(tlacitko12);
        tlacitko12.setBounds(320, 490, 60, 40);

        buttonGroup1.add(tlacitko24);
        tlacitko24.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        tlacitko24.setText("24");
        tlacitko24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        NastaveniaPanel.add(tlacitko24);
        tlacitko24.setBounds(610, 490, 60, 40);

        pozadieNastavenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ija/ui/black2.jpg"))); // NOI18N
        NastaveniaPanel.add(pozadieNastavenia);
        pozadieNastavenia.setBounds(0, -40, 1030, 840);

        ParentPanel.add(NastaveniaPanel, "card2");

        hraPanel.setMaximumSize(new java.awt.Dimension(1024, 768));
        hraPanel.setMinimumSize(new java.awt.Dimension(1024, 768));
        hraPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
        hraPanel.setLayout(null);

        pohybDole.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pohybDole.setPreferredSize(new java.awt.Dimension(60, 60));
        pohybDole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pohybDoleActionPerformed(evt);
            }
        });
        hraPanel.add(pohybDole);
        pohybDole.setBounds(770, 380, 60, 60);
        hraPanel.add(volnyPokladGUI1);
        volnyPokladGUI1.setBounds(720, 570, 100, 100);
        hraPanel.add(volnaKartaGUI1);
        volnaKartaGUI1.setBounds(720, 570, 100, 100);

        pohybVpravo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pohybVpravo.setPreferredSize(new java.awt.Dimension(60, 60));
        pohybVpravo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pohybVpravoActionPerformed(evt);
            }
        });
        hraPanel.add(pohybVpravo);
        pohybVpravo.setBounds(830, 320, 60, 60);
        hraPanel.add(hracovaKartaGUI1);
        hracovaKartaGUI1.setBounds(910, 150, 80, 80);

        zober.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zober.setPreferredSize(new java.awt.Dimension(60, 60));
        zober.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoberActionPerformed(evt);
            }
        });
        hraPanel.add(zober);
        zober.setBounds(770, 320, 60, 60);

        pohybVlavo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pohybVlavo.setPreferredSize(new java.awt.Dimension(60, 60));
        pohybVlavo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pohybVlavoActionPerformed(evt);
            }
        });
        hraPanel.add(pohybVlavo);
        pohybVlavo.setBounds(710, 320, 60, 60);

        pohybHore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ija/ui/up.png"))); // NOI18N
        pohybHore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pohybHore.setPreferredSize(new java.awt.Dimension(60, 60));
        pohybHore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pohybHoreActionPerformed(evt);
            }
        });
        hraPanel.add(pohybHore);
        pohybHore.setBounds(770, 260, 60, 60);
        hraPanel.add(hraciGUI1);
        hraciGUI1.setBounds(40, 30, 610, 620);
        hraPanel.add(pokladyGUI1);
        pokladyGUI1.setBounds(40, 30, 610, 620);
        hraPanel.add(hraciaPlochaGUI1);
        hraciaPlochaGUI1.setBounds(40, 30, 610, 620);

        otocVpravo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otocVpravoMouseClicked(evt);
            }
        });
        hraPanel.add(otocVpravo);
        otocVpravo.setBounds(790, 690, 60, 50);

        otocVlavo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otocVlavoMouseClicked(evt);
            }
        });
        otocVlavo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otocVlavoActionPerformed(evt);
            }
        });
        hraPanel.add(otocVlavo);
        otocVlavo.setBounds(690, 690, 60, 50);

        riadokText.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        riadokText.setForeground(new java.awt.Color(255, 255, 255));
        riadokText.setText("riadok");
        hraPanel.add(riadokText);
        riadokText.setBounds(860, 460, 70, 22);

        stlpecText.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        stlpecText.setForeground(new java.awt.Color(255, 255, 255));
        stlpecText.setText("stlpec");
        hraPanel.add(stlpecText);
        stlpecText.setBounds(870, 500, 80, 22);
        hraPanel.add(stlpecZadanie);
        stlpecZadanie.setBounds(940, 490, 59, 30);

        riadokZadanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riadokZadanieActionPerformed(evt);
            }
        });
        hraPanel.add(riadokZadanie);
        riadokZadanie.setBounds(940, 450, 60, 30);

        vlozVolnuKartu.setText("VLOZIT VOLNY KAMEN");
        vlozVolnuKartu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vlozVolnuKartuMouseClicked(evt);
            }
        });
        vlozVolnuKartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vlozVolnuKartuActionPerformed(evt);
            }
        });
        hraPanel.add(vlozVolnuKartu);
        vlozVolnuKartu.setBounds(680, 470, 170, 50);

        kartaHraca.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        kartaHraca.setForeground(new java.awt.Color(240, 240, 240));
        hraPanel.add(kartaHraca);
        kartaHraca.setBounds(1010, 280, 80, 50);

        balicekKarty.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        balicekKarty.setForeground(new java.awt.Color(240, 240, 240));
        balicekKarty.setText("0");
        hraPanel.add(balicekKarty);
        balicekKarty.setBounds(960, 110, 90, 40);

        UkoncitHru.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        UkoncitHru.setText("UKONCIT HRU >> NAVRAT DO MENU");
        UkoncitHru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UkoncitHruActionPerformed(evt);
            }
        });
        hraPanel.add(UkoncitHru);
        UkoncitHru.setBounds(700, 10, 310, 30);

        ulozitHru.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        ulozitHru.setText("ULOZIT HRU");
        hraPanel.add(ulozitHru);
        ulozitHru.setBounds(700, 50, 310, 30);

        potiahnutKartu.setText("POTIAHNUT KARTU");
        potiahnutKartu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));
        potiahnutKartu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potiahnutKartuActionPerformed(evt);
            }
        });
        hraPanel.add(potiahnutKartu);
        potiahnutKartu.setBounds(880, 240, 140, 40);

        dalsiHrac.setText("DALSI HRAC");
        dalsiHrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalsiHracActionPerformed(evt);
            }
        });
        hraPanel.add(dalsiHrac);
        dalsiHrac.setBounds(900, 610, 110, 120);

        infoKarty.setBackground(new java.awt.Color(0, 0, 0));
        infoKarty.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        infoKarty.setForeground(new java.awt.Color(240, 240, 240));
        infoKarty.setText("POCET KARIET V BALICKU:");
        infoKarty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        hraPanel.add(infoKarty);
        infoKarty.setBounds(660, 120, 290, 26);

        tah.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        tah.setForeground(new java.awt.Color(240, 240, 240));
        tah.setText("1");
        tah.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hraPanel.add(tah);
        tah.setBounds(230, 670, 20, 40);

        naTahu.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        naTahu.setForeground(new java.awt.Color(240, 240, 240));
        naTahu.setText("na tahu je hrac: =>");
        naTahu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hraPanel.add(naTahu);
        naTahu.setBounds(30, 670, 200, 40);

        PocetHracoShow.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        PocetHracoShow.setForeground(new java.awt.Color(240, 240, 240));
        PocetHracoShow.setText("...");
        PocetHracoShow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hraPanel.add(PocetHracoShow);
        PocetHracoShow.setBounds(30, 710, 360, 40);

        skore.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        skore.setForeground(new java.awt.Color(240, 240, 240));
        skore.setText("0");
        hraPanel.add(skore);
        skore.setBounds(380, 690, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ija/ui/example.JPG"))); // NOI18N
        hraPanel.add(jLabel1);
        jLabel1.setBounds(50, 40, 600, 600);

        infoScore.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        infoScore.setForeground(new java.awt.Color(240, 240, 240));
        infoScore.setText("TVOJE SKORE JE :");
        infoScore.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        hraPanel.add(infoScore);
        infoScore.setBounds(300, 660, 200, 20);

        infoKarta.setBackground(new java.awt.Color(0, 0, 0));
        infoKarta.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        infoKarta.setForeground(new java.awt.Color(240, 240, 240));
        infoKarta.setText("TVOJA KARTA JE:");
        infoKarta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        hraPanel.add(infoKarta);
        infoKarta.setBounds(690, 180, 200, 26);

        pozadieHry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ija/ui/black3.jpg"))); // NOI18N
        hraPanel.add(pozadieHry);
        pozadieHry.setBounds(0, 0, 1024, 768);

        ParentPanel.add(hraPanel, "card4");

        VyhraPanel.setLayout(null);

        vyherca.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        vyherca.setText("--");
        VyhraPanel.add(vyherca);
        vyherca.setBounds(160, 140, 60, 50);

        vyhralHrac1.setFont(new java.awt.Font("Century", 1, 36)); // NOI18N
        vyhralHrac1.setText("Vyhral hrac");
        VyhraPanel.add(vyhralHrac1);
        vyhralHrac1.setBounds(80, 60, 250, 80);

        toMenu.setText("Menu");
        toMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toMenuActionPerformed(evt);
            }
        });
        VyhraPanel.add(toMenu);
        toMenu.setBounds(310, 260, 73, 23);

        ParentPanel.add(VyhraPanel, "card5");

        getContentPane().add(ParentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ParentPanel.removeAll();
        ParentPanel.add(NastaveniaPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NavratDoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NavratDoMenuActionPerformed
        ParentPanel.removeAll();
        ParentPanel.add(MenuPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_NavratDoMenuActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        ParentPanel.removeAll();
        ParentPanel.add(hraPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
        PocetHracoShow.setText("POCET HRACOV JE -> "+Integer.toString(pocetHracovSlider.getValue()));
        if(tlacitko12.isSelected())
        {
            CardPack novybalicek = new CardPack(12,12);
            ALL.balicekKariet = novybalicek;
            balicekKarty.setText(Integer.toString(novybalicek.size()));
            ALL.pocetUloh = 12;
        }
        else
        {
            //vygeneruj 24 kariet
            CardPack novybalicek = new CardPack(24,24);
            ALL.balicekKariet = novybalicek;
            balicekKarty.setText(Integer.toString(novybalicek.size()));
            ALL.pocetUloh = 24;
        }
        ALL.balicekKariet.shuffle();
        //hraciaPlochaGUI1.removeAll();
        MazeBoard hraciaPlocha = MazeBoard.createMazeBoard(velkostPolaSlider.getValue());
        ALL.hraciePole = hraciaPlocha;
        hraciaPlocha.newGame();
        hraci zoznamHracov = hraci.vytvorHracov(pocetHracovSlider.getValue(),velkostPolaSlider.getValue(),velkostPolaSlider.getValue());
        ALL.poleHracov = zoznamHracov;
        hraciaPlochaGUI1.vytvorGui();
        volnaKartaGUI1.vytvorVolnuGui();
        pokladyGUI1.vytvorPokladyGui();
        hraciGUI1.vytvorHraciGui();
        volnyPokladGUI1.vytvorVolnuPGui();
        
    }//GEN-LAST:event_StartActionPerformed

    private void pocetHracovSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pocetHracovSliderStateChanged
        pocetHracovText.setText(Integer.toString(pocetHracovSlider.getValue()));
    }//GEN-LAST:event_pocetHracovSliderStateChanged

    private void velkostPolaSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_velkostPolaSliderStateChanged
        velkostPolaText.setText(Integer.toString(velkostPolaSlider.getValue()));
    }//GEN-LAST:event_velkostPolaSliderStateChanged

    private void UkoncitHruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UkoncitHruActionPerformed
        ParentPanel.removeAll();
        ParentPanel.add(MenuPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_UkoncitHruActionPerformed

    private void dalsiHracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalsiHracActionPerformed
        ALL.hracNaTahu = ALL.hracNaTahu + 1;
        
        if(pocetHracovSlider.getValue() >= ALL.hracNaTahu)
        {
           tah.setText(Integer.toString(ALL.hracNaTahu));
           
        }
        else
        {
           ALL.hracNaTahu = 1;
           tah.setText(Integer.toString(ALL.hracNaTahu));
           
        }
        if(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha == -1)
        {
            kartaHraca.setText("");
        }
        else
        {
            kartaHraca.setText(Integer.toString(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha));
        }
        hracovaKartaGUI1.vytvorHracKartGui();
        skore.setText(Integer.toString(ALL.poleHracov.poleHracov[ALL.hracNaTahu].ziskaneBody));
        vlozVolnuKartu.setVisible(true);
        
        // + treba pridat podmienku 
        // ak nasledujuci hrac (s cislom hracTeraz) ma kartu tak sa nastavi
        // potiahnutie karty na disable ... 
        // potiahnutKartu.setEnabled(false);
    }//GEN-LAST:event_dalsiHracActionPerformed

    private void potiahnutKartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potiahnutKartuActionPerformed
        //if(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha == -1)
        //{
        // ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha = ALL.balicekKariet.popCard().getCard().getCode();
        //kartaHraca.setText(Integer.toString(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha));
        //}
        if(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha == -1)
        {

            if( ALL.balicekKariet.size() != 0) 
            {
                //kartaHraca.setText(Integer.toString(ALL.balicekKariet.popCard().getCard().getCode()));
                ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha = ALL.balicekKariet.popCard().getCard().getCode();
                kartaHraca.setText(Integer.toString(ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha));
                balicekKarty.setText(Integer.toString(ALL.balicekKariet.size()));
            }
        }
        hracovaKartaGUI1.vytvorHracKartGui();
    }//GEN-LAST:event_potiahnutKartuActionPerformed

    private void pohybHoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pohybHoreActionPerformed
        int yPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX;
        int xPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY;
        if(1 != xPozH)
        {
          if ((ALL.hraciePole.plocha[xPozH][yPozH].karta.up != CANGO.NULL) && (ALL.hraciePole.plocha[xPozH-1][yPozH].karta.down != CANGO.NULL) )
            {
            ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY = ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY - 1;
            hraciGUI1.vytvorHraciGui();  
            }  
        }
        
        
        
        
    }//GEN-LAST:event_pohybHoreActionPerformed

    private void pohybVpravoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pohybVpravoActionPerformed
        int yPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX;
        int xPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY;
        if(ALL.hraciePole.riadky != yPozH)
        {
          if ((ALL.hraciePole.plocha[xPozH][yPozH].karta.right != CANGO.NULL) && (ALL.hraciePole.plocha[xPozH][yPozH+1].karta.left != CANGO.NULL) )
            {
            ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX = ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX + 1;
            hraciGUI1.vytvorHraciGui();  
            }  
        }
        
        
        
    }//GEN-LAST:event_pohybVpravoActionPerformed

    private void pohybDoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pohybDoleActionPerformed
        int yPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX;
        int xPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY;
        if(ALL.hraciePole.stlpce != xPozH)
        {
          if ((ALL.hraciePole.plocha[xPozH][yPozH].karta.down != CANGO.NULL) && (ALL.hraciePole.plocha[xPozH+1][yPozH].karta.up != CANGO.NULL) )
            {
            ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY = ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY + 1;
            hraciGUI1.vytvorHraciGui();  
            }  
        }
        
    }//GEN-LAST:event_pohybDoleActionPerformed

    private void riadokZadanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riadokZadanieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_riadokZadanieActionPerformed

    private void otocVlavoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otocVlavoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otocVlavoActionPerformed

    private void vlozVolnuKartuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vlozVolnuKartuMouseClicked
        // TODO add your handling code here: Integer.parseInt(3)
        MazeField pomocny = ALL.hraciePole.get(Integer.parseInt(riadokZadanie.getText()), Integer.parseInt(stlpecZadanie.getText()));
	ALL.hraciePole.shift(pomocny);
        hraciaPlochaGUI1.vytvorGui();
        volnaKartaGUI1.vytvorVolnuGui();
        pokladyGUI1.vytvorPokladyGui();
        volnyPokladGUI1.vytvorVolnuPGui();
        hraciGUI1.vytvorHraciGui();
        vlozVolnuKartu.setVisible(false);
    }//GEN-LAST:event_vlozVolnuKartuMouseClicked

    private void pohybVlavoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pohybVlavoActionPerformed
        int yPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX;
        int xPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY;
        if(1 != yPozH)
        {
          if ((ALL.hraciePole.plocha[xPozH][yPozH].karta.left != CANGO.NULL) && (ALL.hraciePole.plocha[xPozH][yPozH-1].karta.right != CANGO.NULL) )
            {
            ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX = ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX - 1;
            hraciGUI1.vytvorHraciGui();  
            }  
        }
        
        
       
    }//GEN-LAST:event_pohybVlavoActionPerformed

    private void zoberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoberActionPerformed
        int yPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaX;
        int xPozH=ALL.poleHracov.poleHracov[ALL.hracNaTahu].poziciaY;
        if((ALL.hraciePole.plocha[xPozH][yPozH].karta.uloha == ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha) && (ALL.hraciePole.plocha[xPozH][yPozH].karta.uloha != -1))
        {
            ALL.hraciePole.plocha[xPozH][yPozH].karta.uloha = -1;
            ALL.poleHracov.poleHracov[ALL.hracNaTahu].uloha = -1;
            ALL.poleHracov.poleHracov[ALL.hracNaTahu].ziskaneBody = ALL.poleHracov.poleHracov[ALL.hracNaTahu].ziskaneBody + 1;
            skore.setText(Integer.toString(ALL.poleHracov.poleHracov[ALL.hracNaTahu].ziskaneBody));
            pokladyGUI1.vytvorPokladyGui();
            hracovaKartaGUI1.vytvorHracKartGui();
            
            
            if(ALL.poleHracov.poleHracov[ALL.hracNaTahu].ziskaneBody == ALL.balicekKariet.maxSize/pocetHracovSlider.getValue())
            {
                ParentPanel.removeAll();
                ParentPanel.add(VyhraPanel);
                ParentPanel.repaint();
                ParentPanel.revalidate();
                vyherca.setText(Integer.toString(ALL.hracNaTahu));
            }
            
            
        }
    }//GEN-LAST:event_zoberActionPerformed

    private void otocVpravoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otocVpravoMouseClicked
        ALL.hraciePole.volnaKarta.turnRight();
        volnaKartaGUI1.vytvorVolnuGui();
    }//GEN-LAST:event_otocVpravoMouseClicked

    private void otocVlavoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otocVlavoMouseClicked
        ALL.hraciePole.volnaKarta.turnLeft();
        volnaKartaGUI1.vytvorVolnuGui();
    }//GEN-LAST:event_otocVlavoMouseClicked

    private void toMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toMenuActionPerformed
        ParentPanel.removeAll();
        ParentPanel.add(MenuPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_toMenuActionPerformed

    private void vlozVolnuKartuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vlozVolnuKartuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vlozVolnuKartuActionPerformed

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
            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuGui().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel NastaveniaPanel;
    private javax.swing.JButton NavratDoMenu;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JLabel PocetHracoShow;
    private javax.swing.JButton Start;
    private javax.swing.JButton UkoncitHru;
    private javax.swing.JPanel VyhraPanel;
    private javax.swing.JLabel balicekKarty;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton dalsiHrac;
    private javax.swing.JPanel hraPanel;
    private ija.ui.hraciGUI hraciGUI1;
    private ija.ui.hraciaPlochaGUI hraciaPlochaGUI1;
    private ija.ui.hracovaKartaGUI hracovaKartaGUI1;
    private javax.swing.JLabel infoKarta;
    private javax.swing.JLabel infoKarty;
    private javax.swing.JLabel infoScore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kartaHraca;
    private javax.swing.JLabel naTahu;
    private javax.swing.JButton otocVlavo;
    private javax.swing.JButton otocVpravo;
    private javax.swing.JLabel pocetHracov;
    private javax.swing.JSlider pocetHracovSlider;
    private javax.swing.JTextField pocetHracovText;
    private javax.swing.JButton pohybDole;
    private javax.swing.JButton pohybHore;
    private javax.swing.JButton pohybVlavo;
    private javax.swing.JButton pohybVpravo;
    private ija.ui.pokladyGUI pokladyGUI1;
    private javax.swing.JButton potiahnutKartu;
    private javax.swing.JLabel pozadieHry;
    private javax.swing.JLabel pozadieMenu;
    private javax.swing.JLabel pozadieNastavenia;
    private javax.swing.JLabel riadokText;
    private javax.swing.JTextField riadokZadanie;
    private javax.swing.JLabel skore;
    private javax.swing.JLabel stlpecText;
    private javax.swing.JTextField stlpecZadanie;
    private javax.swing.JLabel tah;
    private javax.swing.JRadioButton tlacitko12;
    private javax.swing.JRadioButton tlacitko24;
    private javax.swing.JButton toMenu;
    private javax.swing.JButton ulozitHru;
    private javax.swing.JLabel velkostPola;
    private javax.swing.JLabel velkostPola1;
    private javax.swing.JSlider velkostPolaSlider;
    private javax.swing.JTextField velkostPolaText;
    private javax.swing.JButton vlozVolnuKartu;
    private ija.ui.volnaKartaGUI volnaKartaGUI1;
    private ija.ui.volnyPokladGUI volnyPokladGUI1;
    private javax.swing.JLabel vyherca;
    private javax.swing.JLabel vyhralHrac1;
    private javax.swing.JButton zober;
    // End of variables declaration//GEN-END:variables
}
