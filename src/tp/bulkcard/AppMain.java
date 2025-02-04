package tp.bulkcard;

import javax.swing.*;

public class AppMain {
    private JFrame frame;

    public AppMain() {
        frame = new JFrame("BulkCard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,100);
        frame.setLocationRelativeTo(null);

        UIHandler uiHandler = new UIHandler(frame);
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        new AppMain();
    }
}
