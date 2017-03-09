package dao.main.java.dao.impl;

import dao.BookAuthorDao;
import org.hibernate.Session;
import table.BookAuthors;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * DAO for table "book_authors" in database
 */
public class BookAuthorDaoImpl implements BookAuthorDao {
    /**
     * Adding the author of book to the database
     * @param bookAuthor
     * @throws SQLException
     */
    public void addBookAuthors(BookAuthors bookAuthor) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(bookAuthor);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /**
     * Removal author of the book from the database
     * @return
     * @throws SQLException
     */
    public List<BookAuthors> getBookAuthors() throws SQLException {
        List<BookAuthors> bookAuthorss = new ArrayList<BookAuthors>();
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            bookAuthorss = session.createCriteria(BookAuthors.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return bookAuthorss;
    }
}
