package simulationmodus;

<<<<<<< HEAD:src/main/java/MainModel/SimulationMode.java
package MainModel;
=======
package simulationmodus;
>>>>>>> 0dab554dbdfd64e63a8e00443dcdd4cb8a8f4956:src/main/java/simulationmodus/SimulationMode.java

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class SimulationMode extends Application {
    // Simualtionmode
    // Button change Realtime mode
    Group SimulationRoot;
    Rectangle GraphBox;
    Scene scene;
    VBox vBox;
    HBox hBox;
    @Override
    public void start(Stage stage) throws IOException {



        SimulationRoot = new Group();

        GraphBox = new Rectangle();

        GraphBox.setHeight(100);
        GraphBox.setWidth(150);
        GraphBox.setFill(Color.GREEN);

        SimulationRoot.getChildren().add(GraphBox);


        scene = new Scene(SimulationRoot, 320, 240);
        stage.setTitle("Simulation");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }




}
