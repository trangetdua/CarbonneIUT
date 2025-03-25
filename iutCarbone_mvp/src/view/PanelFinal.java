package view;

import javax.swing.*;
import java.awt.*;
import presentation.*;

public class PanelFinal  extends JPanel {
    private JButton restart;
    private JLabel consommation;
  


    public PanelFinal(){
        
        setLayout(new FlowLayout());

        consommation = new JLabel("Sélectionner un mode de transport");
        restart = new JButton("Recommencer");
        add(consommation);
     

    }

    public JButton getRestart() {
		return restart;
	}

	public void setRestart(JButton restart) {
		this.restart = restart;
	}

	public void updateResult(double nbMin, double nbMax) {
        if (nbMin >= 0 && nbMax >=0) {
            consommation.setText("Vous émettez entre " + nbMin + " et " + nbMax + " kg de CO₂ par semaine.");
        } else {
            consommation.setText("Entrer des valeurs entièrement positives");
        }

    }




}
