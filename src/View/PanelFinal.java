package View;

import javax.swing.*;
import controller.*;
import java.awt.*;

public class PanelFinal  extends JPanel {
    private JButton restart;
    private double nbMin;
    private double nbMax;


    public PanelFinal(UIHandler handler){
        setLayout(new FlowLayout());
        nbMax=3;
        nbMin= 1;
        JLabel consommation = new JLabel("Vous émettez entre "+nbMin+" et "+nbMax+"kg de CO2 par semaine");
         restart = new JButton("Recommencer");

        restart.addActionListener(new ControllerButtons(handler));

        add(consommation);
        add((restart));

    }




}
