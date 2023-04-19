package View;

import javafx.scene.control.Button;

import java.nio.Buffer;
import java.util.ArrayList;

public class WatchListView {
    int articleAmount;
    ArrayList<Button> buttonList = new ArrayList<>();

    public WatchListView(int articleAmount) {
        this.articleAmount = articleAmount;
    }

    /**
     * Methode zum setzen der Artikel-Namen in der buttonList
     * @param articleNames Enthält die Namen von den Artikeln die angezeigt werden sollen
     *
     */
    public void setArticles(ArrayList<String> articleNames){
        for (String str :articleNames) {
            buttonList.add(new Button(str));
        }
    }
    public void addArticle(String articleName){
        buttonList.add(new Button(articleName));
    }
    public void removeArticle(String articleName){
        for (Button b :buttonList) {
            if(b.getText().equals(articleName)){
                buttonList.remove(b);
            }
        }
    }
}
