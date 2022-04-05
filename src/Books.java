import java.util.ArrayList;

public class Books{

    // attributes
    private String ID;
    private String book_name;
    private String author_name;
    private int available_quantity;
    private int issued_quantitiy;



    public Books() {}


    public Books(String ID, String book_name, String author_name, int available_quantity, int issued_quantitiy) {
        this.ID = ID;
        this.book_name = book_name;
        this.author_name = author_name;
        this.available_quantity = available_quantity;
        this.issued_quantitiy = issued_quantitiy;
    }


// setters and getters
    public String get_Book_ID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBook_name() {
        return this.book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return this.author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getAvailable_quantity() {
        return this.available_quantity;
    }

    public void setAvailable_quantity(int available_quantity) {
        this.available_quantity = available_quantity;
    }

    public int getIssued_quantitiy() {
        return this.issued_quantitiy;
    }

    public void setIssued_quantitiy(int issued_quantitiy) {
        this.issued_quantitiy = issued_quantitiy;
    }
// used to parse the array and create an object and store the correct attributes
    public void create(ArrayList<String> f , int start )
    {
        setID(f.get(start));
        setBook_name(f.get(++start));
        setAuthor_name(f.get(++start));
        int x= Integer.parseInt(f.get(++start));
        int xx  = Integer.parseInt(f.get(++start));
        setAvailable_quantity(x);
        setIssued_quantitiy(xx);
    }


    @Override
    public String toString() {
        return "{" +
                " ID='" + get_Book_ID() + "'" +
                ", book_name='" + getBook_name() + "'" +
                ", author_name='" + getAuthor_name() + "'" +
                ", available_quantity='" + getAvailable_quantity() + "'" +
                ", issued_quantitiy='" + getIssued_quantitiy() + "'" +
                "}";
    }




}