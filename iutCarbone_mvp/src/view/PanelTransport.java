package view;

import presentation.*;
import model.*;

import javax.swing.*;
import java.awt.*;

public class PanelTransport extends JPanel {
	
	JButton car;
	JButton velo;
	JButton transport_commun;
	JButton autres;
	JButton coVoiturage;
	
	
    public PanelTransport() {
        JLabel cap = new JLabel("Transport pour venir à IUT :");
        add(cap);
  car= new JButton("Voiture perso");
  velo= new JButton("Vélo");
  transport_commun= new JButton("Transports en commun");
  autres= new JButton("Autre");
  coVoiturage= new JButton("Covoiturage");
        
    }

    
    public void addButton(JButton btn , int mode, UIHandler handler) {
        
        btn.addActionListener(new ControllerButtons(mode, handler));
        add(btn);
    }
    
    public JButton getBtnCar() {
		return this.car;
	}
    public JButton getBtnVelo() {
		return this. velo;
	}
    public JButton getBtnTransportCommun() {
		return this.transport_commun;
	}
    public JButton getBtnAutres() {
		return this.autres;
	}
    public JButton getBtnCoVoiturage() {
		return this.coVoiturage;
	}
}
