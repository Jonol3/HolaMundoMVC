/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;


import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * The class that gets the model values from a properties file.
 * @author 2dam
 */
public class FileModelImplementation implements Model {
    /**
     * Gets a string with a greeting.
     * @return String with the greeting
     */
    @Override
    public String getGreeting(){
            return ResourceBundle.getBundle("holamundoconcapas.model.greeting")
                .getString("greeting");
    }
}
