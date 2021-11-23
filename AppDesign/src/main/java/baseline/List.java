/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Juan Guarnizo
 */
package baseline;

import javafx.collections.ObservableList;

import java.util.ArrayList;
//List class
//private ArrayList of Items
//private title

public class List {

    private ArrayList<Item> toDoList;

    private String titleList;

    //default constructor
    public List() {
        this.toDoList = new ArrayList<>();
        this.titleList = "Title goes here";
    }

    public List(String titleList) {
        this.toDoList = new ArrayList<>();
        this.titleList = verify(titleList);
    }

    //setters and getters

    public String getTitleList() {
        return titleList;
    }

    public void setTitleList(String titleList) {
        this.titleList = titleList;
    }

    public String verify(String title){

        //will verify that the title is at least 3 characters long
        //will return the title if it is valid,
        //otherwise it will return the following  default string

        return "title has to be at least 3 characters long";
    }
}
