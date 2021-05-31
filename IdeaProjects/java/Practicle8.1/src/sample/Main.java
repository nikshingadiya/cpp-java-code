package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import  javafx.scene.control.Label;
import   javafx.scene.text.Font;
import java.awt.*;
import   javafx.scene.control.Button;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*Button b1=new Button("kio");

        Label bk= new Label("nik");
        bk.setTranslateX(b1.getTranslateX()-30);
        bk.setTranslateY(b1.getTranslateY()-20);

*/
        Label l1=new Label("Java");
        l1.setRotate(90);
        Color c2=new Color(0.8,0.5,0.9,0.9);
        l1.setTextFill(c2);
        l1.setFont(new Font("Bold", 22));

        Label l2=new Label("Java");
        Color c1=new Color(0.5,0.27,0.28,0.9);
        l2.setTextFill(c1);
        l2.setRotate(90);
        l2.setFont(new Font("Italic", 22));


        Label l3=new Label("Java");
        Color c3=new Color(0.5,0.8,0.28,0.9);
        l3.setTextFill(c3);
        l3.setRotate(90);
        l3.setFont(new Font("Roman", 22));


        Label l4=new Label("Java");
        Color c4=new Color(0.1,0.27,0.8,0.9);
        l4.setTextFill(c4);
        l4.setRotate(90);
        l4.setFont(new Font("Bold", 22));

        Label l5=new Label("Java");
        Color c5=new Color(0.9,0.9,0.3,0.9);
        l5.setTextFill(c5);
        l5.setRotate(90);
        l5.setFont(new Font("Italic", 22));
        
      
        HBox V1=new HBox(5,l1,l2,l3,l4,l5);
        V1.setAlignment(Pos.CENTER);

        Scene root= new Scene(V1,600,200);
        primaryStage.setTitle("P-8.1");
        primaryStage.setScene(root);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
