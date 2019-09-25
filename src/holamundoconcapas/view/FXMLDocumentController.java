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
 * The controller of the FXML document.
 * @author 2dam
 */
public class FXMLDocumentController {
    private String greeting;
    private Stage stage;
    @FXML
    private Label label;
    @FXML
    private Button button;
    /**
     * Closes the window when clicking the button.
     * @param event The event of clicking.
     */
    @FXML
    public void handleButtonAction(ActionEvent event) {
        Platform.exit();
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    /**
     * Sets the label text to the greeting.
     * @param e The event of window showing.
     */
    public void handleWindowShowing(WindowEvent e) {
        label.setText(greeting);
    }

    void setStage(Stage stage) {
        this.stage=stage;
    }
    /**
     * Initializes the window.
     * @param root The parent of the window
     */
    void initStage(Parent root) {
        stage.setOnShowing(this::handleWindowShowing);
        //button.setOnAction(this::handleButtonAction);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
