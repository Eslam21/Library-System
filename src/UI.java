import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public static void main(String[] args) throws Exception {
        /* Creating FileM objects for each file,
        those objects are used to read, write and hold the data in the csv file in a string array
         */
        //extract functions  that we will use in User Interface
        UI_Fuctions funct=new UI_Fuctions();
        FileM Admins_file = new FileM();
        FileM Books_file = new FileM();
        FileM Issued_books_file = new FileM();
        FileM Librarians_file = new FileM();
        FileM Students_file = new FileM();

        // Opening all the csv files and storing all data in an array of strings
        funct.Reading_all_files(Admins_file, Books_file, Issued_books_file, Librarians_file, Students_file);

        // Creating arraylists of all our classes, to create an array of objects
        ArrayList<Admins> Admins_objects = new ArrayList<Admins>();
        ArrayList<Books> Books_objects = new ArrayList<Books>();
        ArrayList<Issued_Books> Issued_books_objects = new ArrayList<Issued_Books>();
        ArrayList<Librarians> Librarians_objects = new ArrayList<Librarians>();
        ArrayList<Students> Students_objects = new ArrayList<Students>();

        // fill the objects, this function changes the array of strings, to  array of objects, this is to make it easier to edit and delete
        // afterwards we will be working on the array of objects
        funct.creating_objects(Admins_file, Books_file, Issued_books_file, Librarians_file, Students_file, Admins_objects, Books_objects,Issued_books_objects,Librarians_objects,Students_objects);

        // starting the interface, make the user choose whether he is admin or librarian
        // then will start to ask for ID and checks the password
        // which interface variable is used to let us know afterwords which interface to open, admin or librarian
        int which_interface = funct.login(Admins_file, Librarians_file);

        //this "if" statement is to diverge the code into the two possible interfaces
        // admin or librarian
        if(which_interface == 1)
        {
            // this function contains the admin interface along with all the functions an admin can do
            funct.Admin_view(Admins_file, Books_file, Issued_books_file, Librarians_file, Students_file, Admins_objects, Books_objects,Issued_books_objects,Librarians_objects,Students_objects );
        }
        else
        {
            // this function contains the interface of the librarian and all the functions a librarian can do
            funct.librarian_view(Admins_file, Books_file, Issued_books_file, Librarians_file, Students_file, Admins_objects, Books_objects,Issued_books_objects,Librarians_objects,Students_objects );
        }
    
    }


}


