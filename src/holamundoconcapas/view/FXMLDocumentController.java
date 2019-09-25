/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author 2dam
 */
public class FXMLDocumentController {
    private String greeting;
    private Stage stage;
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    public void handleButtonAction(ActionEvent event) {
        Platform.exit();
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    public void handleWindowShowing(WindowEvent e) {
        label.setText(greeting);
    }

    void setStage(Stage stage) {
        this.stage=stage;
    }

    void initStage(Parent root) {
        stage.setOnShowing(this::handleWindowShowing);
        //button.setOnAction(this::handleButtonAction);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
