/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;


import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Implements view methods with Swing.
 * @author 2dam
 */
public class SwingViewImplementation implements View {
    private static final Logger LOGGER = Logger
            .getLogger("holamundoconcapas.view.SwingViewImplementation");
    /**
     * Displays the greeting in the window.
     * @param greeting The greeting to show
     */
    @Override
    public void showGreeting (String greeting){
        try{
            LOGGER.info("Starting Swing view.");
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, greeting);
            LOGGER.info("Finished Swing view.");
        } catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }
}
