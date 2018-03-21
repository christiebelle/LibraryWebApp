package db;

public class Seeds {

    Book book1 = new Book("Coding for Dummies", "Mr Java", True);
    DBHelper.save(book1);

    Borrower borrower = new Borrower("Mr Smith");
    DBHelper.save(borrower1)

}
