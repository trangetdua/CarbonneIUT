package presentation;

import javax.swing.*;
import java.awt.*;
import view.*;
import model.*;

public class UIHandler {
    private Container c ;
    private CardLayout card;
    private PanelFinal panelFinal;
    private PanelThanks pt;
    private PanelWelcome pw;
    private PanelTransport ptrans;
    private PanelRepas panelR;
    private ModelFood modelFood;
    private final Model model = ControllerButtons.getModel();
    private PanelOrdinateur panelOrdinateur;



    public UIHandler (JFrame frame) {
        this.c = frame.getContentPane();
        this.card = new CardLayout();
        c.setLayout(card);
        this.modelFood = new ModelFood();
        
        //panelWelcom
        
        pw= new PanelWelcome();
        pw.getStartBtn().addActionListener(e -> this.changerPanel("Transport"));
        pw. add(pw.getStartBtn());
       
        // panel transport
        ptrans= new PanelTransport();
        ptrans.addButton( ptrans.getBtnCar(), Data.voiture, this);
        ptrans.addButton(ptrans.getBtnCoVoiturage(), Data.co_voiturage, this);
        ptrans.addButton(ptrans.getBtnVelo(), Data.velo, this);
        ptrans.addButton(ptrans.getBtnTransportCommun(), Data.transport_commun, this);
        ptrans.addButton(ptrans.getBtnAutres(), Data.autre, this);


        //Panel thanks
        pt=new PanelThanks();
        pt.getNew().addActionListener(new ControllerButtons(this));
        pt.add(pt.getNew());
        
        //panel final
        panelFinal= new PanelFinal();
        panelFinal.getRestart().addActionListener(e -> this.changerPanel("Transport"));
        panelFinal.add(panelFinal.getRestart());


        panelOrdinateur = new PanelOrdinateur();
        panelOrdinateur.getSuivantBtn().addActionListener(e -> {
            updateFinalPanel(model.getCo2Min(), model.getCo2Max());
            changerPanel("Final");
        });



        //Panel Food
         panelR= new PanelRepas();
        panelR.getButtonNex().addActionListener(e -> {
            updateFinalPanel(model.getCo2Min(), model.getCo2Max());
        });




        // le conteneur

        c.add(pw, "Welcome");
        c.add(ptrans, "Transport");

        c.add(panelR,"Repas");
        c.add(panelOrdinateur, "Ordinateur");

        c.add(pt, "Thanks");
        c.add(panelFinal, "Final");

    }

    public void changerPanel(String panelName) {
        card.show(c,panelName);
    }

    public void updateFinalPanel(double co2Min, double co2Max) {
        try {
            String veganText = panelR.getJTVegan().getText().trim();
            String vegetarienText = panelR.getJTvegetarien().getText().trim();
            String boeufText = panelR.getJTboeuf().getText().trim();
            String autreText = panelR.getJTautre().getText().trim();

            System.out.println("Saisie: " + veganText + ", " + vegetarienText + ", " + boeufText + ", " + autreText);

            int nbVegan = Integer.parseInt(veganText);
            int nbVegetarien = Integer.parseInt(vegetarienText);
            int nbBoeuf = Integer.parseInt(boeufText);
            int nbAutre = Integer.parseInt(autreText);

            if (nbVegan < 0 || nbVegetarien < 0 || nbBoeuf < 0 || nbAutre < 0) {
                panelR.afficherMessageErreurSurBouton("Vous devez entrer des valeurs entières positives ou nulles");
                return;
            }

            panelR.reinitialiserTexteBouton();

            modelFood.setNbVegan(nbVegan);
            modelFood.setNbVegetarien(nbVegetarien);
            modelFood.setNbBoeuf(nbBoeuf);
            modelFood.setNbAutreViandePoisson(nbAutre);

            // Tính CO2 repas + CO2 transport
            double co2repas = modelFood.computeCO2();
            double co2Numerique = panelOrdinateur.getCO2Numerique();
            double totalMin = co2Min + co2repas + co2Numerique;
            double totalMax = co2Max + co2repas + co2Numerique;

            panelFinal.updateResult(totalMin, totalMax);

            changerPanel("Ordinateur");

        } catch (NumberFormatException e) {
            panelR.afficherMessageErreurSurBouton("Vous devez entrer des valeurs entières positives ou nulles");
            return;
        }
    }

}
