import java.util.ArrayList;

public class Students {

    // attributes
    private String student_name;
    private String student_id;
    private String mobile;
    private String email;
    private String birthday;

    //zero constructor
    public Students(){ }
    // argument constructor
    public Students(String name, String id, String mob, String em, String birth) {
        student_name=name;
        student_id=id;
        mobile=mob;
        email=em;
        birthday=birth;

    }
    //setters and getters
    public String getStudent_name() {
        return this.student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_id() {
        return this.student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void create(ArrayList<String> f , int start )
    {
        // used to parse the array given to extract the attributes of an object
        setStudent_id(f.get(start));
        setStudent_name(f.get(++start));
        setBirthday(f.get(++start));
        setEmail(f.get(++start));
        setMobile(f.get(++start));
    }
  

    @Override
    public String toString() {
        return "{" +
            " student_name='" + getStudent_name() + "'" +
            ", student_id='" + getStudent_id() + "'" +
            ", mobile='" + getMobile() + "'" +
            ", email='" + getEmail() + "'" +
            ", birthday='" + getBirthday() + "'" +
            "}";
    }

    
}
