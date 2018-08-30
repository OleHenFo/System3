package classes;

import java.util.ArrayList;

public class AdditionRoom extends Room {
    AdditionRoom(User user){
        this.name = "Addition";
        this.userid = user.getID();
        this.tasks = new ArrayList<>();
        generateTasks();
    }

    void generateTasks(){
        int diff = 1;
        for (int i = 0; i < 25; i++) {
            if (i%5==0&&i!=0)diff++;
            AdditionTask newTask = new AdditionTask(diff);
            this.tasks.add(newTask);
        }
    }
}
