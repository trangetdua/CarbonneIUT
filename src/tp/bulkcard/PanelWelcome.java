package tp.bulkcard;
import javax.swing.*;
import java.awt.*;

public class PanelWelcome extends JPanel {
    private JButton btnStart;

    public PanelWelcome (UIHandler handler) {
        setLayout(new FlowLayout());
        JLabel lbl = new JLabel("Bienvenue !");
        btnStart = new JButton("Commencer");

        btnStart.addActionListener(new ControllerButtons(handler));

        add(lbl);
        add(btnStart);
    }
}
