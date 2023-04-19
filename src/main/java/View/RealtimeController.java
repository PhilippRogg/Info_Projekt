package View;

import java.io.Serializable;

public class RealtimeController {
    GroundView realtimeView = new GroundView();
    SearchView searchView = new SearchView();
    public void startRealTime(){
        realtimeView.root.setLeft(searchView.root);
        //des Prinzip verfolgen
    }
}
