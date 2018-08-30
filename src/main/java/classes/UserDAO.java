package classes;

import java.util.HashMap;

public class UserDAO {
    static HashMap<Integer,User> users;
    static HashMap<Integer,Teacher> teachers;

    public static User addUser(String name,int teacher){
        if (users==null)users=new HashMap<>();
        if (teachers==null)teachers=new HashMap<>();
        if (teachers.size()<=teacher||teachers.get(teacher)==null)return null;
        User user = new User(name,teacher);
        users.put(user.getID(),user);
        teachers.get(teacher).addStudent(user);
        return user;
    }

    public static Teacher addTeacher(String name){
        if (teachers==null)teachers=new HashMap<>();
        if (users==null)users=new HashMap<>();
        Teacher teacher = new Teacher(name);
        teachers.put(teacher.getID(),teacher);
        return teacher;
    }

    public static User getUser(int id){
        return users.get(id);
    }

    public static Teacher getTeacher(int id){
        return teachers.get(id);
    }

    public static HashMap<Integer, User> getUsers() {
        return users;
    }

    public static HashMap<Integer, Teacher> getTeachers() {
        return teachers;
    }
}
