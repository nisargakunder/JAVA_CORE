package Q5;

import java.util.ArrayList;
import java.util.List;

public class Registration {
    private String username;
    private String usercountry;
    public List<Registration> users=new ArrayList<>();

    public Registration(String username, String usercountry) {
        this.username = username;
        this.usercountry = usercountry;
    }

    public String getUsercountry() {
        return usercountry;
    }

    public void setUsercountry(String usercountry) {
        this.usercountry = usercountry;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public List<Registration> RegisterUser(String username,String usercountry) {
        users.add(new Registration(username,usercountry));
        return users;
    }

}
