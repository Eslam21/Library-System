import java.util.ArrayList;

public class Librarians {

    // attributes
    private String librarian_name;
    private String librarian_id;
    private String librarian_password;

    // zero argument constructor
    public Librarians(){ }
    // constructor
    public Librarians(String librarian_name, String librarian_id, String librarian_password) {
        this.librarian_name = librarian_name;
        this.librarian_id = librarian_id;
        this.librarian_password = librarian_password;
    }

    // setters and getters
    public String getLibrarian_name() {
        return this.librarian_name;
    }

    public void setLibrarian_name(String librarian_name) {
        this.librarian_name = librarian_name;
    }

    public String getLibrarian_id() {
        return this.librarian_id;
    }

    public void setLibrarian_id(String librarian_id) {
        this.librarian_id = librarian_id;
    }

    public String getLibrarian_password() {
        return this.librarian_password;
    }

    public void setLibrarian_password(String librarian_password) {
        this.librarian_password = librarian_password;
    }



    public void create(ArrayList<String> f , int start )
    {
        // used to parse the array given to extract the attributes of an object
        setLibrarian_id(f.get(start));
        setLibrarian_name(f.get(++start));
        setLibrarian_password(f.get(++start));
    }


    @Override
    public String toString() {
        return "{" +
                " librarian_name='" + getLibrarian_name() + "'" +
                ", librarian_id='" + getLibrarian_id() + "'" +
                ", librarian_password='" + getLibrarian_password() + "'" +
                "}";
    }




}



