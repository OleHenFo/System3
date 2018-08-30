package classes;

import java.util.ArrayList;

public class Teacher {
    static int teacherCount;
    int ID;
    String name;
    ArrayList<User> students;

    Teacher(String name){
        this.ID=teacherCount;
        teacherCount++;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<User> students) {
        this.students = students;
    }

    public void addStudent(User student){
        this.students.add(student);
    }
}
