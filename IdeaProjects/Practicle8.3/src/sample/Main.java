package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.NodeOrientation;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.scene.paint.Material;
import javafx.geometry.Point3D;

import java.security.cert.X509Certificate;

import static javafx.scene.paint.Color.GREEN;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("creating box");
        int a=200;
        int b=300;
        // create a box
        Box box = new Box(40.0f, 40.0f, 140.0f);
        // create a Group
        Group group = new Group(box);

        // translate the box to a position
        box.setTranslateX(100);
        box.setTranslateY(150);
        box.setTranslateZ(-100);









        // create a perspective camera
        PerspectiveCamera perspectivecamera = new PerspectiveCamera(false);
        perspectivecamera.setTranslateX(0);
        perspectivecamera.setTranslateY(0);
        perspectivecamera.setTranslateZ(100);



        // create a scene
        Scene scene = new Scene(group,a,b);
        scene.setFill(Color.INDIGO);


        // set camera for scene
        scene.setCamera(perspectivecamera);

        // set the scene
        primaryStage.setScene(scene);

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
