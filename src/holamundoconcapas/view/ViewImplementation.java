/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

/**
 * Implements the methods of the view.
 * @author 2dam
 */
public class ViewImplementation implements View {
    /**
     * Shows the greeting on the console.
     * @param greeting The greeting to show.
     */
    @Override
    public void showGreeting (String greeting){
        System.out.println(greeting);
    }
}
