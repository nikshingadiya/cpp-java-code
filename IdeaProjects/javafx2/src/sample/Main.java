package sample;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import  javafx.scene.control.Button;
import  javafx.scene.layout.StackPane;

public class Main extends  Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn=new Button();
        primaryStage.setTitle("nikhil_hunter" );
        Button exit=new Button("exit");
        exit.setOnAction(e -> {
            System.out.println("exit your applications");
        System.exit(0);
        }
        );
        btn.setText("click me");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("nik");
            }
        });
        VBox root=new VBox();
        root.getChildren().addAll(btn,exit);
        Scene scene=new Scene(root,700,200, Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
