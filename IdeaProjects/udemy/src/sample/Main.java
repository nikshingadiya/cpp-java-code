package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn=new Button("click");
        StackPane root=new StackPane();
        root.setRotate(90);
        root.getChildren().add(btn);
        Scene scene= new Scene(root,200,250);
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage=new Stage();
        stage.setTitle("hello");
        stage.setScene(new Scene(new Button("nik"),400,500));
        stage.show();

        Stage stage2=new Stage();
        Circle circle=new Circle();
        Pane p1=new Pane();
        circle.centerXProperty().bind(p1.widthProperty().divide(2));
        circle.centerYProperty().bind(p1.heightProperty().divide(2));
        circle.setRadius(50);
//        circle.setStyle("-fx-stroke:red; -fx- fill:#6a51ff;");
          circle.setStroke(Color.GREEN);
          Color c1= new Color(14545,0.34);
        p1.getChildren().add(circle);
        Scene scene2=new Scene(p1,200,200);
        stage2.setTitle("CIRCLE");

        stage2.setScene(scene2);
        stage2.show();



    }


    public static void main(String[] args) {
        launch(args);
        System.out.println("nikhil");

    }
}
