/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

/**
 * The implementation of the model methods.
 * @author 2dam
 */
public class ModelImplementation implements Model {
    /**
     * Gets a string with a greeting.
     * @return String with the greeting
     */
    @Override
    public String getGreeting(){
        return "Hello, World!";
    }
}
