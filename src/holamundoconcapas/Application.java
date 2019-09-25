/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;
import holamundoconcapas.controller.*;
import holamundoconcapas.view.*;
import holamundoconcapas.model.*;
import java.util.logging.Logger;
/**
 * The main application class.
 * @author 2dam
 */
public class Application {
    private static final Logger LOGGER = Logger
            .getLogger("holamundoconcapas.Application");
    /**
     * The main method of the application.
     * @param args Arguments for the execution
     */
    public static void main(String[] args){
        try {
            LOGGER.info("Starting main method.");
            View view = ViewFactory.getView();
            Model model = ModelFactory.getModel();
            Controller controller = new Controller();
            controller.run(view, model);
            LOGGER.info("Finishing main method.");
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
    }
}
