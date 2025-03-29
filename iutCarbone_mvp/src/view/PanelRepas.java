package view;

import javax.swing.*;
import java.awt.*;
import presentation.*;

public class PanelRepas extends JPanel  {
    private JButton next;
    private JTextField JTvegan;
    private JTextField JTvegetarien;
    private JTextField JTboeuf;
    private JTextField JTautre;
    private JLabel vegan;
    private JLabel vegetarien;
    private JLabel boeuf;
    private JLabel autre;
    private JLabel presentation;

    public PanelRepas(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();



        next= new JButton("Suivant") ;
        JTvegan= new JTextField();
        JTvegetarien= new JTextField();
        JTboeuf= new JTextField();
         JTautre= new JTextField();

        presentation  = new JLabel("Indiquez le nombre de repas de chaque type pris par semaine");;
        vegan= new JLabel("vegan");
         vegetarien = new JLabel("vegetarien");
          boeuf = new JLabel("à base de boeuf");
         autre = new JLabel("à base d'une autre viande ou du poisson");


        // Configuration du GridBagConstraints
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // marges entre les composants

        // Position du JLabel de présentation en haut du panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        add(presentation, gbc);

        // Position des JLabels (vegan, vegetarien, boeuf, autre) sur la ligne 1
        gbc.gridwidth = 1;  // Chaque JLabel aura une largeur de 1 cellule
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(vegan, gbc);

        gbc.gridx = 1;
        add(vegetarien, gbc);

        gbc.gridx = 2;
        add(boeuf, gbc);

        gbc.gridx = 3;
        add(autre, gbc);

        // Position des JTextFields (JTvegan, JTvegetarien, JTboeuf, JTautre) sur la ligne 2
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(JTvegan, gbc);

        gbc.gridx = 1;
         add(JTvegetarien, gbc);

        gbc.gridx = 2;
        add(JTboeuf, gbc);

        gbc.gridx = 3;
        add(JTautre, gbc);

        // Position du bouton "Suivant" centré en bas
        gbc.gridx = 2;           // Positionnement du bouton en colonne 0
        gbc.gridy = 3;           // Positionnement du bouton en ligne 3 (juste en dessous des JTextFields)
        gbc.gridwidth = 1;       // Le bouton occupe une seule cellule en largeur
        gbc.gridheight = 1;      // Le bouton occupe une seule cellule en hauteur
        gbc.anchor = GridBagConstraints.CENTER;  // Centrer le bouton
        add(next, gbc);

    }

    public JButton getButtonNex() {
        return this.next;
    }
    public JTextField  getJTvegetarien() {
        return this.JTvegetarien;
    }
    public JTextField getJTboeuf() {
        return this. JTboeuf;
    }

    public JTextField  getJTVegan() {
        return this.JTvegan;
    }
    public JTextField  getJTautre() {
        return this.JTautre;
    }

    public void afficherMessageErreurSurBouton(String msg) {
        next.setText(msg);
    }

    public void reinitialiserTexteBouton() {
        next.setText("Suivant");
    }



}
