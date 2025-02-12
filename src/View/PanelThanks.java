package View;
import controller.*;

import javax.swing.*;
import java.awt.*;

public class PanelThanks extends JPanel {
    private JButton btnNew;

    public PanelThanks(UIHandler handler) {
        setLayout(new FlowLayout());
        JLabel lblThanks = new JLabel("Merci !");
        JButton tksbut = new JButton("Nouveau");

        tksbut.addActionListener(new ControllerButtons(handler));

        add(lblThanks);
        add((tksbut));
    }
}
