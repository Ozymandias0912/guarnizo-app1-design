package baseline;

public class Item {
    //create Item class


    //private Title
    private String title;
    //private description
    private String description;
    //private complete
    private Boolean complete;
    //private dueDate (YYYY-MM-DD)
    private String dueDateString;

    public Item() {
        this.title = validateTitle("UCF");
        this.description = "add description";
        this.complete = false;
    }

    //constructor for optional date
    public Item(String title, String description, Boolean complete) {
        this.title = validateTitle(title);
        this.description = description;
        this.complete = complete;
    }

    public Item(String title, String description, Boolean complete, String dueDateString) {

        this.title = validateTitle(title);
        this.description = description;
        this.complete = complete;
        this.dueDateString = dueDateString;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = validateTitle(title);
    }

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

    public String getDueDateString() {
        return dueDateString;
    }

    public void setDueDateString(String dueDateString) {
        this.dueDateString = dueDateString;
    }

    public String validateDescription(String input) {

        int inputLength = input.length();
        String defaultDescription = "Try a description between 1 and 256 characters";

        if (inputLength < 1 || inputLength > 256) {

            return defaultDescription;
        } else {
            return input;
        }
    }

    public String validateTitle(String title) {

        if (title.length() >= 3) {
            return title;
        } else {
            return "Title should have at least 3 characters";
        }
    }
}//end Item class
