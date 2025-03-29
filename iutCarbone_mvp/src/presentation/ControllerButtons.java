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
        if (transport != null) {
            model.add(transport);
        }
        uiHandler.changerPanel("Repas");
    }


    public static Model getModel(){
        return model;
    }

    public static  void setTransport (int t) {
        model.add(t);
    }
}
