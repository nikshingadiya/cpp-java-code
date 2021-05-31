package sample;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;

public class Main extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ImageView Experiment 1");
        Button B1=new Button();

        FileInputStream input = new FileInputStream("resources/n1.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        ImageView imageView2 = new ImageView(image);
        ImageView imageView3 = new ImageView(image);
        ImageView imageView4 = new ImageView(image);
       GridPane hbox = new GridPane();
       hbox.addRow(0,imageView);
       hbox.addRow(1,imageView3);
       hbox.setHgap(-22.0);
       hbox.setVgap(-22.0);
       hbox.addColumn(1,imageView2);
       hbox.addColumn(1,imageView4);


        Scene scene = new Scene(hbox, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        setV1(imageView, true, true);
        Thread.sleep(200);
        setV1(imageView2, true, false);

        setV1(imageView3, true, false);
        Thread.sleep(200);
        setV1(imageView4, true, true);
        B1.setActionCommand(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                setV1(imageView4,true,false);
            }
        });



    }
    public void setV1(ImageView imageView, boolean b1, boolean b) {
        if (b1) {
            RotateTransition rt = new RotateTransition(Duration.millis(5000), imageView);
            if (b == true) {

                rt.setByAngle(360f);
            } else {
                rt.setByAngle(-360f);
            }
            rt.setCycleCount(Animation.INDEFINITE);
            rt.setInterpolator(Interpolator.LINEAR);
            rt.play();
        }
        else
        {
            RotateTransition rt = new RotateTransition(Duration.millis(5000), imageView);
        }
    }



    public static void main(String[] args) {
        Application.launch(args);
    }

}
