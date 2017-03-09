package dao.main.java.dao.impl;

import dao.BookDao;
import org.hibernate.Session;
import table.Book;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * DAO for table "book" in database
 */
public class BookDaoImpl implements BookDao {
    /**
     * Adding the book to the database
     * @param book
     * @throws SQLException
     */
    public void addBook(Book book) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /**
     * Removal of the book from the database
     * @param book
     * @throws SQLException
     */
    public void deleteBook(Book book) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(book);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }

    }

    /**
     * Getting the book from the database by id
     * @param id
     * @return
     * @throws SQLException
     */
    public Book getBook(int id) throws SQLException {
        Book result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Book) session.get(Book.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return result;
    }

    /**
     * Getting the list of books from the database
     * @return
     * @throws SQLException
     */
    public List<Book> getBooks() throws SQLException {
        List<Book> books = new ArrayList<Book>();
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            books = session.createCriteria(Book.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return books;
    }
}
