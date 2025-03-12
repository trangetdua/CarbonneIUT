package presentation ;

import model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerButtons implements ActionListener {
    private UIHandler uiHandler;
    private Integer transport;
    private static Model model = new Model();

    public ControllerButtons(int mode, UIHandler handler) {
        this.transport = mode;
        this.uiHandler = handler;
    }

    public ControllerButtons(UIHandler handler) {
        this.uiHandler = handler;
        this.transport = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.add(transport);
        uiHandler.updateFinalPanel(model.getCo2Min(), model.getCo2Max());
        uiHandler.changerPanel("Final"); //A ajouter le second panel
    }

    public static Model getModel(){
        return model;
    }
}
