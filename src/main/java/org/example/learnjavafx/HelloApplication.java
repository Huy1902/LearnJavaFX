package org.example.learnjavafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws Exception {
    Stage stage1 = new Stage();

    Group node = new Group();

    Scene scene = new Scene(node, Color.BLACK);

    stage1.setWidth(640);
    stage1.setHeight(480);
    //stage1.setResizable(false);
    stage1.setFullScreen(true);
    stage1.setTitle("Demo prog");

    Image image = new Image("profile.jpg");
    stage1.getIcons().add(image);
    stage1.setFullScreenExitHint("Q to exit");
    stage1.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
    stage1.setScene(scene);
    stage1.show();
  }

  public static void main(String[] args) {
    launch();
  }
}