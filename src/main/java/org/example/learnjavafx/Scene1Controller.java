package org.example.learnjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

  @FXML
  TextField nameTextField;

  @FXML
  PasswordField passwordField;

  private Stage stage;
  private Scene scene;
  private Parent root;

  public void login(ActionEvent event) throws IOException {
    try {
      String username = nameTextField.getText();
      String password = passwordField.getText();

      FXMLLoader loader = new FXMLLoader(getClass().getResource("/Scene2.fxml"));
      root = loader.load();

      Scene2Controller scene2Controller = loader.getController();
      scene2Controller.displayName(username);
      scene2Controller.setPassWord(password);

      //Parent root = FXMLLoader.load(getClass().getResource("/Scene2.fxml"));
      stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
