package tp.bulkcard;

import javax.swing.*;
import java.awt.*;

public class UIHandler {
    private Container c ;
    private CardLayout card;

    public UIHandler (JFrame frame) {
        this.c = frame.getContentPane();
        this.card = new CardLayout();
        c.setLayout(card);

        c.add(new PanelWelcome(this), "Welcome");
        c.add(new PanelThanks(this), "Thanks");
    }

    public void changerPanel() {
        card.next(c);
    }
}
