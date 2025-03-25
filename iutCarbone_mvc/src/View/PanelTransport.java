package View;

import controller.*;
import Model.Data;

import javax.swing.*;
import java.awt.*;

public class PanelTransport extends JPanel {
    public PanelTransport(UIHandler handler) {
        JLabel cap = new JLabel("Transport pour venir à IUT :");
        add(cap);

        addButton("Voiture perso", Data.voiture, handler);
        addButton("Covoiturage", Data.co_voiturage, handler);
        addButton("Vélo", Data.velo, handler);
        addButton("Transports en commun", Data.transport_commun, handler);
        addButton("Autre", Data.autre, handler);
    }

    private void addButton(String label, int mode, UIHandler handler) {
        JButton button = new JButton(label);
        button.addActionListener(new ControllerButtons(mode, handler));
        add(button);
    }
}
