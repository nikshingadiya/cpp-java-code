package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Path p1= new Path();
        MoveTo o1= new MoveTo();
        LineTo t1= new LineTo (200,300);
        LineTo t2= new LineTo(160,200);
        LineTo t3= new LineTo(180,299);
        LineTo t4= new LineTo(290,190);
        p1.getElements().addAll(o1,t1,t2,t3,t4);
        Group g1= new Group(p1);
        Scene s1= new Scene( g1,400,400);
        primaryStage.setScene(s1);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
