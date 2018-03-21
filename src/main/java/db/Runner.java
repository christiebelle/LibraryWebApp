import db.DBHelper;
import models.Book;
import models.Borrower;


public class Runner {

    public static void main(String[] args) {
        Book Book1 = new Book("The Falcons of Montabard", "Elizabeth Chadwick", false);
        DBHelper.save(Book1);

        Book Book2 = new Book("The Greek Myths", "Robert Graves", false);
        DBHelper.save(Book2);

        Book Book3 = new Book("Around the World in 80 Days", "Jules Verne", false);
        DBHelper.save(Book3);

        Borrower Borrower1 = new Borrower("Engelbert Humperdinck");
        DBHelper.save(Borrower1);

    }
}
