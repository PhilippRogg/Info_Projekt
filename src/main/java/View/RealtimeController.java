package View;

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

    public void startRealTime(){
        realtimeView.root.setLeft(searchView.root);
        //des Prinzip verfolgen
    }
}
