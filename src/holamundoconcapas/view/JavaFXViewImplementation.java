/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * Inplements the view mwthods using JavaFX
 * @author 2dam
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View {
    private static final Logger LOGGER = Logger
            .getLogger("holamundoconcapas.view.JavaFXViewImplementation");
   
    private String greeting;
    /**
     * Displays the greeting in the window.
     * @param greeting The greeting to show
     */
    @Override
    public void showGreeting(String greeting) {
        launch(greeting);
    }
    /**
     * Gets the greeting from the parameters.
     * @throws Exception Errors on getting the parameters
     */
    @Override
    public void init() throws Exception {
        this.greeting=getParameters().getRaw().get(0);
    }
    
    
    /**
     * Creates the window with JavaFX.
     * @param stage The stage to create the window
     * @throws Exception Errors on creating the window
     */
    @Override
    public void start(Stage stage) throws Exception {
        try{
            LOGGER.info("Starting JavaFX application.");
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("FXMLDocument.fxml"));
            Parent root = (Parent)loader.load();
            FXMLDocumentController viewController = loader.getController();
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
            LOGGER.info("Finished JavaFX application start.");
        } catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    
    
}
