import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BulkCard extends JFrame implements ActionListener {

    private static final long serialVersionUID = -4009538197145142809L;

    CardLayout card;
    Container c;

    public BulkCard() {
        c = getContentPane();
        card = new CardLayout();
        c.setLayout(card);

        JPanel panelwelcome = new JPanel(new FlowLayout());
        JPanel panelthanks = new JPanel(new FlowLayout());
        JLabel l = new JLabel("Bienvenue !");
        JButton b1 = new JButton("Commencer");
        JLabel ack = new JLabel("Merci !");
        JButton b2 = new JButton("Nouveau");

        panelwelcome.add(l);
        panelwelcome.add(b1);
        panelthanks.add(ack);
        panelthanks.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        c.add(panelwelcome);
        c.add(panelthanks);
    }

    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
        BulkCard frame = new BulkCard();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 100);
        frame.setLocationRelativeTo(null);  // Start the window in the middle of the screen
        frame.setVisible(true);
    }

}
