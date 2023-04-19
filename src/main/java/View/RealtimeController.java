package View;

import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.Serializable;

public class RealtimeController {
    GroundView realtimeView = new GroundView();
    SearchView searchView = new SearchView();

    public GroundView getRealtimeView() {
        return realtimeView;
    }

    public SearchView getSearchView() {
        return searchView;
    }

    public Scene getScene(){
        return realtimeView.scene;
    }

    public RealtimeController() {
        Rectangle test = new Rectangle(20,20);
        test.setFill(Color.RED);
        realtimeView.root.setCenter(test);
        realtimeView.root.setLeft(searchView.root);
    }
}
