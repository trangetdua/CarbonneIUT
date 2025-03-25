package controller;

import javax.swing.*;
import java.awt.*;
import View.*;

public class UIHandler {
    private Container c ;
    private CardLayout card;
    private PanelFinal panelFinal;

    public UIHandler (JFrame frame) {
        this.c = frame.getContentPane();
        this.card = new CardLayout();
        c.setLayout(card);

        c.add(new PanelWelcome(this), "Welcome");
        c.add(new PanelTransport(this), "Transport");

        panelFinal = new PanelFinal(this);
        c.add(panelFinal, "Final");

        c.add(new PanelThanks(this), "Thanks");
    }

    public void changerPanel(String panelName) {
        card.show(c,panelName);
    }

    public void updateFinalPanel(double co2Min, double co2Max) {
        panelFinal.updateResult(co2Min, co2Max);
    }
}
