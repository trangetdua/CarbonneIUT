package view;
import presentation.*;

import javax.swing.*;
import java.awt.*;

public class PanelThanks extends JPanel {
    private JButton btnNew;

    public PanelThanks() {
        setLayout(new FlowLayout());
        JLabel lblThanks = new JLabel("Merci !");
        btnNew = new JButton("Nouveau");

        add(lblThanks);
        
    }
    
    public JButton getNew() {
		return this.btnNew;
	}
    
}
