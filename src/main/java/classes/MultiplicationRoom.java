package classes;

import java.util.ArrayList;

public class MultiplicationRoom extends Room {
    MultiplicationRoom(User user){
        this.name = "Multiplication";
        this.userid = user.getID();
        this.tasks = new ArrayList<>();
        generateTasks();
    }

    void generateTasks(){
        int diff = 1;
        for (int i = 0; i < 25; i++) {
            if (i%5==0&&i!=0)diff++;
            MultiplicationTask newTask = new MultiplicationTask(diff);
            this.tasks.add(newTask);
        }
    }
}
