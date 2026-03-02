package atmin.b6;

public class EditAction {
    String description;
    String editedBy;
    String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    @Override
    public String toString() {
        return "Description: " + description + ", Edited By: " + editedBy + ", Edit Time: " + editTime;
    }
}
