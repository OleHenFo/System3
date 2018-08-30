package classes;

import java.util.ArrayList;

public class SubtractionRoom extends Room {
    SubtractionRoom(User user){
        this.name = "Subtraction";
        this.userid = user.getID();
        this.tasks = new ArrayList<>();
        generateTasks();
    }

    void generateTasks(){
        int diff = 1;
        for (int i = 0; i < 25; i++) {
            if (i%5==0&&i!=0)diff++;
            SubtractionTask newTask = new SubtractionTask(diff);
            this.tasks.add(newTask);
        }
    }
}
