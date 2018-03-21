import db.DBHelper;
import models.Book;
import models.Borrower;


public class Runner {

    public static void main(String[] args) {

        Book book1 = new Book("The Falcons of Montabard", "Elizabeth Chadwick", false);
        DBHelper.save(book1);

        Book book2 = new Book("The Greek Myths", "Robert Graves", false);
        DBHelper.save(book2);

        Book book3 = new Book("Around the World in 80 Days", "Jules Verne", false);
        DBHelper.save(book3);

        Borrower borrower1 = new Borrower("Engelbert Humperdinck");
        DBHelper.save(borrower1);

    }
}
