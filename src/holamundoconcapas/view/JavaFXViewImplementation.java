/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View {

   
    private String greeting;
    
    @Override
    public void showGreeting(String greeting) {
        launch(greeting);
    }

    @Override
    public void init() throws Exception {
        this.greeting=getParameters().getRaw().get(0);
    }
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        try{
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("FXMLDocument.fxml"));
            Parent root = (Parent)loader.load();
            FXMLDocumentController viewController = loader.getController();
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    
    
}
