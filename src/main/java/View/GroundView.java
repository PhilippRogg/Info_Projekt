package View;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GroundView {
    //Border Pane erstellen
    BorderPane root = new BorderPane();

    //Scene erstellen
    Scene scene;

    //Buttons erstellen
    Button simulationModeButton = new Button();
    Button oneDayButton = new Button();
    Button fiveDayButton = new Button();
    Button oneMonthButton = new Button();
    Button threeMonthButton = new Button();
    Button sixMonthButton = new Button();
    Button ytdButton = new Button();
    Button oneYearButton = new Button();
    Button fiveYearButton = new Button();
    Button searchButton = new Button();

    //Input (Textfeld) erstellen
    TextField searchInputTextField = new TextField();

    //Ausgabe Textfeld erstellen
    Text shareNameText = new Text();
    Text watchlistText = new Text();
    Text sharePriceText = new Text();
    Text sharePercentText = new Text();

    VBox leftGroupBox = new VBox();

    public GroundView() {
        root.setLeft(leftGroupBox);
    }

    /*
    new Scene(controller.view.root)
     */


    /**
     * Zeigt den Realtime Modus auf dem Bildschirm.
     *
     */
    public void displayGraphic(Stage stage){
        root.getChildren().add(simulationModeButton);
        scene = new Scene(root, 500, 500);
        stage.setTitle("Realtime Mode");
        stage.setScene(scene);
        stage.show();
    }
}
