package services;

import classes.Teacher;
import classes.TempTeacher;
import classes.UserDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("/teachers")
public class TeacherService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<Integer, Teacher> getTeachers() {
        return UserDAO.getTeachers();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher newTeacher(TempTeacher teacher){
        return UserDAO.addTeacher(teacher.getName());
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher getTeacher(@PathParam("id") int id){
        return UserDAO.getTeacher(id);
    }
}
