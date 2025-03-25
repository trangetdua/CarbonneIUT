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

    
    

    public UIHandler (JFrame frame) {
        this.c = frame.getContentPane();
        this.card = new CardLayout();
        
        
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

        //Panel Food
         panelR= new PanelRepas();
        panelR.getButtonNex().addActionListener(e -> this.changerPanel("Final"));

        
        
        
        // le conteneur
           
        c.setLayout(card);
        c.add(pw, "Welcome");
        c.add(ptrans, "Transport");

        c.add(panelR,"Repas");

        c.add(pt, "Thanks");
        c.add(panelFinal, "Final");
    }

    public void changerPanel(String panelName) {
        card.show(c,panelName);
    }

    public void updateFinalPanel(double co2Min, double co2Max) {
        panelFinal.updateResult(co2Min, co2Max);
    }
}
