import java.util.ArrayList;

public class Issued_Books {

    //attributes
    private String procedure_iD;
    private String Book_id;
    private String student_id;
    private boolean returned;



    // setters and getters
    public String getProcedure_iD() {
        return this.procedure_iD;
    }

    public void setProcedure_iD(String procedure_iD) {
        this.procedure_iD = procedure_iD;
    }

    public String getBook_id() {
        return this.Book_id;
    }

    public void setBook_id(String Book_id) {
        this.Book_id = Book_id;
    }

    public String getStudent_id() {
        return this.student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public boolean isReturned() {
        return this.returned;
    }

    public boolean getReturned() {
        return this.returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }


    public void create(ArrayList<String> f , int start )
    {
        // parse the array of strings and store the attributes to create an object
        setProcedure_iD(f.get(start));
        setBook_id(f.get(++start));
        setStudent_id(f.get(++start));
        setReturned( Boolean.parseBoolean(f.get(++start)));
    }

    @Override
    public String toString() {
        return "{" +
                " procedure_iD='" + getProcedure_iD() + "'" +
                ", Book_id='" + getBook_id() + "'" +
                ", student_id='" + getStudent_id() + "'" +
                ", returned='" + isReturned() + "'" +
                "}";
    }



}
