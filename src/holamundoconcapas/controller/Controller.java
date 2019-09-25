/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.view.*;
import holamundoconcapas.model.*;
import java.util.logging.Logger;

/**
 * Controller class for Hello World application with layers.
 * @author 2dam
 */
public class Controller {
    private static final Logger LOGGER = Logger
            .getLogger("holamundoconcapas.controller.Controller");
    /**
     * This method executes the application's logic.
     * @param view the view object
     * @param model the model object
     */
    public void run(View view, Model model){
        try{
            LOGGER.info("Starting run method.");
            String greeting = model.getGreeting();
            view.showGreeting(greeting);
            LOGGER.info("Ending run method.");
        } catch (Exception e) {
            LOGGER.severe(e.getMessage());
        }
        
    }
    
}
