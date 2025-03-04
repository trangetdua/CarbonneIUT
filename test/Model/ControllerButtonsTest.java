package Model;

import controller.*;
import org.junit.*;

import javax.swing.*;

import static org.junit.Assert.*;

public class ControllerButtonsTest {
    private Model model;
    private UIHandler uiHandler;

    @Before
    public void setUp() {
        model = new Model();
        uiHandler = new UIHandler(new JFrame());
        ControllerButtons.getModel().init(); // Reset Model để tránh cộng dồn dữ liệu
    }

    @Test
    public void testVoitureButton() {
        ControllerButtons controller = new ControllerButtons(Data.voiture, uiHandler);
        controller.actionPerformed(null);

        assertEquals(4.5, ControllerButtons.getModel().getCo2Min(), 0.01);
        assertEquals(20.0, ControllerButtons.getModel().getCo2Max(), 0.01);
    }

    @Test
    public void testCovoiturageButton() {
        ControllerButtons controller = new ControllerButtons(Data.co_voiturage, uiHandler);
        controller.actionPerformed(null);

        assertEquals(2.0, ControllerButtons.getModel().getCo2Min(), 0.01);
        assertEquals(10.0, ControllerButtons.getModel().getCo2Max(), 0.01);
    }

    @Test
    public void testVeloButton() {
        ControllerButtons controller = new ControllerButtons(Data.velo, uiHandler);
        controller.actionPerformed(null);

        assertEquals(0.001, ControllerButtons.getModel().getCo2Min(), 0.01);
        assertEquals(0.22, ControllerButtons.getModel().getCo2Max(), 0.01);
    }

    @Test
    public void testTransportsButton() {
        ControllerButtons controller = new ControllerButtons(Data.transport_commun, uiHandler);
        controller.actionPerformed(null);

        assertEquals(0.2, ControllerButtons.getModel().getCo2Min(), 0.01);
        assertEquals(1.0, ControllerButtons.getModel().getCo2Max(), 0.01);
    }

    @Test
    public void testAutreButton() {
        ControllerButtons controller = new ControllerButtons(Data.autre, uiHandler);
        controller.actionPerformed(null);

        assertEquals(0.0, ControllerButtons.getModel().getCo2Min(), 0.01);
        assertEquals(20.0, ControllerButtons.getModel().getCo2Max(), 0.01);
    }

    @Test
    public void testRecommencerButton() {
        ControllerButtons controller = new ControllerButtons(Data.voiture, uiHandler);
        controller.actionPerformed(null);

        ControllerButtons.getModel().init(); // Reset model

        assertEquals(0.0, ControllerButtons.getModel().getCo2Min(), 0.01);
        assertEquals(0.0, ControllerButtons.getModel().getCo2Max(), 0.01);
    }
}
