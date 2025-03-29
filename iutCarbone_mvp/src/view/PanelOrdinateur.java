package view;

import javax.swing.*;
import java.awt.*;

public class PanelOrdinateur extends JPanel {
    private JRadioButton persoBtn;
    private JRadioButton iutBtn;
    private JButton suivantBtn;
    private ButtonGroup group;

    public PanelOrdinateur() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel question = new JLabel("Quel ordinateur utilisez-vous ?");
        persoBtn = new JRadioButton("Ordinateur portable personnel");
        iutBtn = new JRadioButton("Ordinateur de l'IUT");

        group = new ButtonGroup();
        group.add(persoBtn);
        group.add(iutBtn);

        suivantBtn = new JButton("Suivant");

        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 0; add(question, gbc);
        gbc.gridy = 1; add(persoBtn, gbc);
        gbc.gridy = 2; add(iutBtn, gbc);
        gbc.gridy = 3; add(suivantBtn, gbc);
    }

    public JButton getSuivantBtn() {
        return suivantBtn;
    }

    public double getCO2Numerique() {
        if (persoBtn.isSelected()) {
            return 2.5 + 0.6;
        } else if (iutBtn.isSelected()) {
            return 5.0 + 0.6;
        }
        return 0.0; // rien sélectionné
    }
}
