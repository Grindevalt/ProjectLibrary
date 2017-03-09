package general;

import dao.AuthorDao;
import dao.BookAuthorDao;
import dao.BookDao;
import table.Author;
import table.Book;
import table.BookAuthors;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Main class where all functionality is implemented
 */
public class Project {
    public static void main(String[] args) throws SQLException {
        Factory factory = Factory.getInstance();
        BookDao bookDao = factory.getBookDao();
        AuthorDao authorDao = factory.getAuthorDao();
        BookAuthorDao bookAuthorDao = factory.getBookAouthorDao();

        bookDao.getBook(1);
        bookDao.getBook(2);
        bookDao.getBook(3);
        bookDao.getBook(4);

        authorDao.getAuthor(1);
        authorDao.getAuthor(2);
        authorDao.getAuthor(3);
        authorDao.getAuthor(4);

        BookAuthors bookAuthors = new BookAuthors();
        bookAuthors.setAuthor(authorDao.getAuthor(2));
        bookAuthors.setBook(bookDao.getBook(1));
        bookAuthorDao.addBookAuthors(bookAuthors);

        bookAuthors.setAuthor(authorDao.getAuthor(2));
        bookAuthors.setBook(bookDao.getBook(3));
        bookAuthorDao.addBookAuthors(bookAuthors);

        bookAuthors.setAuthor(authorDao.getAuthor(2));
        bookAuthors.setBook(bookDao.getBook(4));
        bookAuthorDao.addBookAuthors(bookAuthors);

        bookAuthors.setAuthor(authorDao.getAuthor(1));
        bookAuthors.setBook(bookDao.getBook(3));
        bookAuthorDao.addBookAuthors(bookAuthors);


        List<BookAuthors> bookAuthors1 = bookAuthorDao.getBookAuthors();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~TABLE BOOK_AUTHOR~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("id   |  isbn   |   title     |   description   |  id  |  first  |  last   |   middle    |");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (BookAuthors bookAuthor : bookAuthors1) {
            Book book = bookAuthor.getBook();
            Author author = bookAuthor.getAuthor();
            System.out.print(book.getId() + "      " + book.getIsbn() + "     " + book.getTitle() + "      " +
                    book.getDescription() + "  ");
            System.out.println(author.getId() + "     " + author.getFirstName() + "     " + author.getLastName() +
                    "    " + author.getMiddleName() + "  ");
        }
        System.out.println();

        List<Book> books = bookDao.getBooks();
        System.out.println("~~~~~~~~~~~~~~~~~~~~TABLE BOOKS~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("id  ||  isbn    ||  title     ||     description    |");
        System.out.println("-----------------------------------------------------");
        for (Book book : books) {
            System.out.println(book.getId() + "      " + book.getIsbn() + "       " + book.getTitle() + "         " +
                    book.getDescription());
        }
        System.out.println();

        List<Author> author = authorDao.getAuthors();
        System.out.println("~~~~~~~~~~~~~TABLE AUTHORS~~~~~~~~~~~~");
        System.out.println("id  |  first    |     last   |  middle");
        System.out.println("--------------------------------------");
        for (Author author1 : author) {
            System.out.println(author1.getId() + "       " + author1.getFirstName() + "       " + author1.getLastName() + "    " +
                    author1.getMiddleName() + "  ");
        }
    }
}
