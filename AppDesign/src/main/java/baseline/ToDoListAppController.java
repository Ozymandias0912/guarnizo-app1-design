/*
 *  UCF COP3330 Fall 2021 Application Assignment 1 Solution
 *  Copyright 2021 Juan Guarnizo
 */
package baseline;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;


public class ToDoListAppController implements Initializable {

//Pseudocode
    //create a table column for the description of the item
    //create a table column for the due date of the item
    //create a table column for the completed boolean of the item

    //create a textfield to get the description input from the user
    //create a textfield to get the title of the list input from the user
    //create a datepicker to get the input for the due date from the user
    //create a file chooser



    //create a tableview to get all of these columns
    //create an observable list called list,
    // and set it to be the array list of items in the List class

    //create a second tableview to show the different lists in the app
    //create a table column for this list that will display the list's title
    //create a second observable list for this table view called arrayLists

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //initialize the text fields, table columns the tableview, etc
    }
    //functions to manage the to do lists
    public void addList(ActionEvent ae){
        //create a List object
        //add it to arrayLists
    }

    public void deleteList(ActionEvent ae){
        //get selected List on arrayLists
        //remove it from arrayLists
    }

    public void editList(ActionEvent ae){
        //keep track of the index of the List in arrayLists
        //delete the List
        //add a List with the new data from the user at the same position in arrayLists
        //using the index saved on step 1
    }

    public void removeAllLists(ActionEvent ae){
        //remove all Lists in arrayLists
    }

    public void save(ActionEvent ae){
        //initialize file chooser
        //open save window with the file chooser
        //save the information from the list into a text file
    }

    public void load(ActionEvent ae){
        //initialize file chooser
        //open load window with the file chooser
        //copy the information from the text file to list
    }

    //functions to manage the items inside a given to do list
    public void addItem(ActionEvent ae) {
        //create an item object using the user's input
        //add it to list
    }

    public void deleteItem(ActionEvent ae){
        //get selected item in the list
        //remove it from list
    }

    public void editItem(ActionEvent ae){
        //keep track of the index of the item in list
        //delete the item
        //add an item with the new data from the user at the same position in list
        //using the index saved on step 1
    }

    public void removeAllItems(ActionEvent ae){
        //remove all items in list
    }


    public void markComplete(ActionEvent ae){
        //get selected item in the list
        //call complete setter from the Item class
        //set the complete field to true
    }

    public void markIncomplete(ActionEvent ae){
        //get selected item in the list
        //call complete setter from the Item class
        //set the complete field to false
    }





}//end class controller
