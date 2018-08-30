package classes;

import java.util.ArrayList;

public class User {
    static int userCount;
    int ID;
    String name;
    int score;
    int cash;
    ArrayList<Room> rooms;
    int teacher;

    User(String name,int teacher){
        this.ID = userCount;
        userCount++;
        this.name = name;
        this.teacher = teacher;
        this.score = 0;
        this.cash = 50;
        this.rooms = new ArrayList<>();

        rooms.add(new AdditionRoom(this));
        rooms.add(new SubtractionRoom(this));
        rooms.add(new MultiplicationRoom(this));
        rooms.add(new DivisionRoom(this));
    }

    public int getID() {
        return ID;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }
}
