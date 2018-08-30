package classes;

import java.util.ArrayList;

public class DivisionRoom extends Room {
    DivisionRoom(User user){
        this.name = "Division";
        this.userid = user.getID();
        this.tasks = new ArrayList<>();
        generateTasks();
    }

    void generateTasks(){
        int diff = 1;
        for (int i = 0; i < 25; i++) {
            if (i%5==0&&i!=0)diff++;
            DivisionTask newTask = new DivisionTask(diff);
            this.tasks.add(newTask);
        }
    }
}
