/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

/**
 * The factory of the model.
 * @author 2dam
 */
public class ModelFactory {
    /**
     * Gets a model object.
     * @return a model object
     */
    public static Model getModel (){
        Model model = new FileModelImplementation();
        return model;
    }
}
