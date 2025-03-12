package view;

import presentation.*;
import javax.swing.*;
import java.awt.*;

public class PanelWelcome extends JPanel {
	
	JButton startBtn;
    public PanelWelcome () {
        setLayout(new FlowLayout());

        JLabel lblText = new JLabel("Bienvenue");
         startBtn = new JButton("Commencer");
        add(lblText);
        add(startBtn);
        
    }
    
    public JButton getStartBtn() {
		return this.startBtn;
	}
}
