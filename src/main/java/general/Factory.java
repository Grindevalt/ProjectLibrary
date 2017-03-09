package general;

import dao.AuthorDao;
import dao.BookAuthorDao;
import dao.BookDao;
import dao.main.java.dao.impl.AuthorDaoImpl;
import dao.main.java.dao.impl.BookAuthorDaoImpl;
import dao.main.java.dao.impl.BookDaoImpl;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Factory pattern for creating DAO objects
 */
public class Factory {
    private static Factory instance = new Factory();
    private BookDao bookDao;
    private AuthorDao authorDao;
    private BookAuthorDao bookAouthorDao;

    private Factory() {
    }

    /**
     * Getter for property 'instance'.
     *
     * @return Value for property 'instance'.
     */
    public static Factory getInstance() {
        return instance;
    }

    /**
     * Getter for property 'authorDao'.
     *
     * @return Value for property 'authorDao'.
     */
    public AuthorDao getAuthorDao() {
        if (authorDao == null) authorDao = new AuthorDaoImpl();
        return authorDao;
    }

    /**
     * Getter for property 'bookDao'.
     *
     * @return Value for property 'bookDao'.
     */
    public BookDao getBookDao() {
        if (bookDao == null) bookDao = new BookDaoImpl();
        return bookDao;

    }

    /**
     * Getter for property 'bookAouthorDao'.
     *
     * @return Value for property 'bookAouthorDao'.
     */
    public BookAuthorDao getBookAouthorDao() {
        if (bookAouthorDao == null) bookAouthorDao = new BookAuthorDaoImpl();
        return bookAouthorDao;
    }
}
