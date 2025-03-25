package View;

import javax.swing.*;
import java.awt.*;
import controller.*;

public class PanelFinal  extends JPanel {
    private JButton restart;
    private JLabel consommation;
    private UIHandler handler;


    public PanelFinal(UIHandler handler){
        this.handler = handler;
        setLayout(new FlowLayout());

        consommation = new JLabel("Sélectionner un mode de transport");
        restart = new JButton("Recommencer");

        restart.addActionListener(e -> handler.changerPanel("Transport"));

        add(consommation);
        add((restart));

    }

    public void updateResult(double nbMin, double nbMax) {
        consommation.setText("Vous émettez entre " + nbMin + " et " + nbMax + " kg de CO₂ par semaine.");
    }




}
