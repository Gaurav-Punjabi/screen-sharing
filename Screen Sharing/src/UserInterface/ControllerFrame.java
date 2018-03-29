package UserInterface;

import BackEnd.Controller;
import BackEnd.ScreenSharingConstants;
import BackEnd.ScreenSharingEventHandling;

import javax.swing.*;
import java.awt.*;
import java.net.InetAddress;


/**
 * This class will be run at the controller's end.
 * It will display a label of the respective screen size that will display
 * the victim's screen.
 * It will also capture all events performed by the controller and will send
 * them to the victim.
 */
public class ControllerFrame extends JFrame {

    /**
     * ******************************************************************
     *                            CONSTRUCTOR
     * ******************************************************************
     */
    /**
     * The constructor will create a Frame and add a label of the controller's
     * screen size to display the victim's screen.
     * @throws Exception : In case any Exception occurs.
     */
    public ControllerFrame() throws Exception {
        super("My Teamviewer");
        Dimension myScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(myScreenSize);
        jlDisplay = new JLabel();
        jlDisplay.setBounds(0,0, (int) myScreenSize.getWidth(), (int) myScreenSize.getHeight());
        this.setLayout(null);
        this.add(jlDisplay);
        this.setVisible(true);
        ScreenSharingEventHandling eh = new ScreenSharingEventHandling(new Controller(this,InetAddress.getByName("192.168.0.131")));
        this.addMouseListener(eh);
        this.addMouseMotionListener(eh);
        this.addKeyListener(eh);
    }

    public static void main(String[] args) throws Exception {
        new ControllerFrame().setVisible(true);
    }


    /**
     * This method will be called by the Controller class to display the victim's
     * screen on the label.
     * @param i : The ImageIcon that will contain the image of the victim's screen.
     */
    public void setDisplayIcon(Icon i) {
        jlDisplay.setIcon(i);
        System.out.println("Icon set.");
    }

    //Variable Declarations
    private JLabel jlDisplay;
}