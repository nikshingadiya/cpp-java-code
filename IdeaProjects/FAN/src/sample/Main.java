package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button Btn= new Button("play");
        Btn.setTranslateX(200);
        Btn.setTranslateY(200);
        Button Btn1= new Button("Pause");
        Btn1.setTranslateX(240);
        Btn1.setTranslateY(200);

    /*    Circle c = new Circle(100,100,50);
        c.setFill(Color.GREEN);
        c.setStroke(Color.BLACK);*/
        Label l4= new Label("Programing is fun");
        l4.setFont(new Font("Regular",15));
        //l4.setAlignment(Pos.CENTER);
        l4.setTranslateY(100);
        l4.setTranslateX(0);

        TranslateTransition trans = new TranslateTransition();
        trans.setAutoReverse(false);
        trans.setByX(400);
        trans.setCycleCount(100);
        trans.setDuration(Duration.millis(3000));
        trans.setNode(l4);
        EventHandler<ActionEvent> actionEventEventHandler =new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(event.getSource()==Btn)
                trans.play();
                else {
                    trans.pause();
                }
            }
        } ;
        Btn.setOnAction(actionEventEventHandler);
        Btn1.setOnAction(actionEventEventHandler);
        Group root = new Group();
        root.getChildren().addAll(l4,Btn,Btn1);
        Scene sc=new Scene(root,400,400);
        primaryStage.setScene(sc );
        primaryStage.setTitle("Tio");
        primaryStage.show();

    }
   /* EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {

        @Override
        public void handle(MouseEvent event) {
            System.out.println("nikhil");
        }

    };*/
    

    public static void main(String[] args) {
        launch(args);

    }
}


