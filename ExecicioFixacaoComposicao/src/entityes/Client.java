package entityes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date birthDay;

    private static SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public Client() {
    }

    public Client(String name, String email, Date birthDay) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return this.getName() + " (" + dFormat.format(this.getBirthDay()) + ") " + 
        "- " + this.getEmail() + "\n";
    }

}
