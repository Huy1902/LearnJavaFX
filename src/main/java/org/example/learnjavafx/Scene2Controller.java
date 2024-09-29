package org.example.learnjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;


public class Scene2Controller {
  @FXML
  Label nameLabel;

  @FXML
  Label passLabel;

  String passWord;

  void setPassWord(String pass) {
    passWord = pass;
    passLabel.setText("Hidden");
  }

  public void displayName(String username) {
    nameLabel.setText("Hello: " + username);
  }

  public void showPassword(ActionEvent event) throws IOException {
    passLabel.setText("Your password is: " + passWord);
  }
}
