package atmin;

import java.time.LocalDateTime;

public class EditAction {
    String description;
    LocalDateTime time;

    public EditAction(String description, LocalDateTime time) {
        this.description = description;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Description: " + description + ", Time: " + time;
    }
}
