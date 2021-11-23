/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Juan Guarnizo
 */

package baseline;
//create Item class:
//private description
//private complete
//private dueDate (YYYY-MM-DD)
public class Item {

    private String description;
    private Boolean complete;
    private String dueDate;

    public Item(){
        //default constructor
        this.description = "description goes here";
        this.complete = false;
        this.dueDate = "YYYY-MM-DD";
    }

    public Item(String description, String dueDate){
        //constructor
        this.description = description;
        this.dueDate = dueDate;
        this.complete = false;
    }

    //setters and getters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


}//end Item class
