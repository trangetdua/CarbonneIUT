package View;

import Model.Data;
import controller.ControllerButtons;
import controller.UIHandler;

import javax.swing.*;
import java.awt.*;

public class PanelTransport extends JPanel {
    public PanelTransport(UIHandler main) {

        JLabel cap = new JLabel("Transport pour venir à IUT:");

        JButton voitureBtn = new JButton("Voiture perso");
        voitureBtn.addActionListener(new ControllerButtons(Data.voiture, main));

        JButton covoiBtn = new JButton("Covoiturage");
        covoiBtn.addActionListener(new ControllerButtons(Data.co_voiturage, main));

        JButton veloBtn = new JButton("Vélo");
        veloBtn.addActionListener(new ControllerButtons(Data.velo, main));

        JButton communBtn = new JButton("Transports en commun");
        communBtn.addActionListener(new ControllerButtons(Data.transport_commun, main));

        JButton autreBtn = new JButton("Autre");
        autreBtn.addActionListener(new ControllerButtons(Data.autre, main));

        add(cap);
        add(voitureBtn);
        add(covoiBtn);
        add(voitureBtn);
        add(communBtn);
        add(autreBtn);
    }
}
