package baseline;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;

public class Item {
    //create Item class

//private Title
    private String title;
//private description
    private String description;
//private dueDate (YYYY-MM-DD)
    private GregorianCalendar dueDate;
//private complete
    private boolean complete;

    private String dueDateString;

// public Item()
    public Item(){
        //constructor that initializes the private fields
        this.title = "Title of your task goes here";

        this.description = "Notes about the task goes here";
        this.dueDate = (GregorianCalendar) GregorianCalendar.getInstance();
        //how can I make this optional?
        //format YYYY-MM-DD?
        this.dueDateString = this.dueDate.toString();

        this.complete = false;
    }

//also add many constructors with different parameters
    public Item(String newTitle){
        this.title = newTitle;

        this.description = "Notes about the task goes here";

        this.dueDate = (GregorianCalendar) Calendar.getInstance();//create a method that receives input and creates a valid dueDate

        this.dueDateString = this.dueDate.toString();

        this.complete = false;
    }


    public Item(String newTitle, String newDescription){
        this.title = newTitle;

        editDescription(newDescription);

        this.dueDate = (GregorianCalendar) Calendar.getInstance();//create a method that receives input and creates a valid dueDate

        this.dueDateString = this.dueDate.toString();

        this.complete = false;
    }

    public Item(String newTitle, String newDescription, int year, int month, int day){
        this.title = newTitle;

        this.description = newDescription;

        this.dueDate = setValidDueDate(year, month, day);//create a method that receives input and creates a valid dueDate

        this.dueDateString = this.dueDate.toString();

        this.complete = false;
    }


    public Item( String newTitle, int year, int month, int day){
        this.title = newTitle;

        this.description = "Notes about the task goes here";

        this.dueDate = setValidDueDate(year, month, day);//create a method that receives input and creates a valid dueDate

        this.dueDateString = this.dueDate.toString();

        this.complete = false;
    }

    //public void editTitle()
    public void editTitle(String newTitle){
        this.title = newTitle;
    }


//public void editDescription()
    public void editDescription(String newDescription){//takes a string and save it into the description field
        if(newDescription.length() >= 1 && newDescription.length() <= 256)
            this.description = newDescription;
        else
            throw new IllegalArgumentException("Maximum amount of characters allowed is 256");
    }




//public void setValidDueDate()
    public  GregorianCalendar setValidDueDate(int year, int month, int day){
        //the user will use this to set the due date of a new item object
        try{
            GregorianCalendar newDueDate = new GregorianCalendar(year, month, day);
            return newDueDate;
        }
        catch(InputMismatchException inputMismatchException){
            System.err.printf("One of your inputs (year, month, or day) was not valid," +
                    "today's date will be used instead.");
            return new GregorianCalendar();
        }


    }

    //public void editValidDueDate()
    public void editValidDueDate(int year, int month, int day){
        //the user will use this to edit the due date of an already existing item
        try{
            GregorianCalendar newDueDate = new GregorianCalendar(year, month, day);
            GregorianCalendar today = new GregorianCalendar();
            if(today.compareTo(newDueDate) <= 0 ){
                this.dueDate = newDueDate;
            }
            else
                throw new IllegalArgumentException("The date entered is in the past");

        }
        catch(InputMismatchException inputMismatchException){
            System.err.printf("One of your inputs (year, month, or day) was not valid," +
                    "today's date will be used instead.");
            this.dueDate = new GregorianCalendar();
        }

    }


    //public void markComplete()
    public void setComplete(){
        this.complete = true;
    }

    //public String getTitle()
    public String getTitle(){
        return this.title;
    }

    //public String getDescription()
    public String getDescription(){
        return this.description;
    }



    //public String getDueDate()
    public String getDueDate(){
        return this.dueDateString;
    }

    //public boolean getComplete()
    public boolean getComplete(){
        return this.complete;
    }

    //public void markIncomplete
    public void markIncomplete(){
        this.complete = false;
    }

//end Item class
}
