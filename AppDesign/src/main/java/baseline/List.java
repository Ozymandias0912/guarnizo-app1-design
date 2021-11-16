package baseline;

import javafx.collections.ObservableList;

import java.util.ArrayList;

public class List {

    private ArrayList<Item> lists = new ArrayList<Item>();

    private String titleList = new String();

    public List(ArrayList<Item> lists, String title) {
        this.lists = lists;
        this.titleList = validateTitle(title);
    }

    public ArrayList<Item> getLists() {
        return lists;
    }

    public void setLists(ArrayList<Item> lists) {
        this.lists = lists;
    }

    public String getTitle() {
        return titleList;
    }

    public void setTitle(String title) {
        this.titleList = validateTitle(title);
    }

    public String validateTitle(String title) {

        if (title.length() >= 3) {
            return title;
        } else {
            return "Title should have at least 3 characters";
        }
    }
}
