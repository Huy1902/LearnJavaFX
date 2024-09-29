package org.example.learnjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

  private Stage stage;
  private Scene scene;
  private Parent root;

  public void switchToScene1(ActionEvent event) {
    try {
      Parent root = FXMLLoader.load(getClass().getResource("/Scene1.fxml"));
      stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public void switchToScene2(ActionEvent event) throws IOException {
    try {
      Parent root = FXMLLoader.load(getClass().getResource("/Scene2.fxml"));
      stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
