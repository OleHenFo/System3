package classes;

import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<Task> tasks;
    int userid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }
    public Task removeTask(int index) {
        return tasks.remove(index);
    }

    public int getUserid() {
        return userid;
    }
}
