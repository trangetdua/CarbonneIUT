package View;

import controller.*;
import javax.swing.*;
import java.awt.*;

public class PanelWelcome extends JPanel {
    public PanelWelcome (UIHandler handler) {
        setLayout(new FlowLayout());

        JLabel lblText = new JLabel("Bienvenue");
        JButton startBtn = new JButton("Commencer");

        startBtn.addActionListener(e -> handler.changerPanel("Transport"));

        add(lblText);
        add(startBtn);
    }
}
