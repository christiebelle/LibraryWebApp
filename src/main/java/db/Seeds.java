package db;
import db.DBHelper;
import models.Book;
import models.Borrower;

public class Seeds {

    public static void seedData() {
        DBHelper.deleteAll(Book.class);
        DBHelper.deleteAll(Borrower.class);

        Book book1 = new Book("Coding for Dummies", "Mr Java", true);
        DBHelper.save(book1);

        Borrower borrower1 = new Borrower("Mr Smith");
        DBHelper.save(borrower1);
    }

}
