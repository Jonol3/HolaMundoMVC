/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;
import holamundoconcapas.controller.*;
import holamundoconcapas.view.*;
import holamundoconcapas.model.*;
/**
 * 
 * @author 2dam
 */
public class Application {
    public static void main(String[] args){
        View view = ViewFactory.getView();
        Model model = ModelFactory.getModel();
        Controller controller = new Controller();
        controller.run(view, model);
    }
}
