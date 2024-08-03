package ecoflick;
import java.util.ArrayList;

public class User {
    //Instance Variables
    private String username;
    private String password;
    private ArrayList<User> FriendsList = new ArrayList<User>();
    //Constructor
    User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public boolean sendFriendRequest(){ 
    return true;}
    
    public boolean acceptFriendRequest(){ 
    return true;}
    
    public boolean declineFriendRequest(){ 
    return true;}
    
    public boolean comment(){ 
    return true;}
    
    public boolean like(){ 
    return true;}
    
    public boolean putUpPost(){ 
    return true;}
    
    public boolean deletePost(){ 
    return true;}
       
}
