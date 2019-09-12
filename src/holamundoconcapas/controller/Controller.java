/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.view.*;
import holamundoconcapas.model.*;

/**
 *
 * @author 2dam
 */
public class Controller {
    public void run(View view, Model model){
        String greeting = model.getGreeting();
        view.showGreeting(greeting);
    }
    
}
