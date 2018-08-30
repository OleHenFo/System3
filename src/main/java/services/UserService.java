package services;

import classes.TempUser;
import classes.User;
import classes.UserDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;

@Path("/users")
public class UserService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HashMap<Integer, User> getUsers() {
        return UserDAO.getUsers();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("id") int id){
        return UserDAO.getUser(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User newUser(TempUser user){
        return UserDAO.addUser(user.getName(),user.getTeacher());
    }
}
