package dao.main.java.dao.impl;

import dao.AuthorDao;
import org.hibernate.Session;
import table.Author;
import util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * DAO for table "author" in database
 */
public class AuthorDaoImpl implements AuthorDao {
    /**
     * Adding the author to the database
     * @param author
     * @throws SQLException
     */
    public void addAuthor(Author author) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(author);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /**
     * Removal of the author from the database
     * @param author
     * @throws SQLException
     */
    public void deleteAuthor(Author author) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(author);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
    }

    /**
     * Getting the author from the database by id
     * @param id
     * @return
     * @throws SQLException
     */
    public Author getAuthor(int id) throws SQLException {
        Author result = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = (Author) session.get(Author.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return result;
    }

    /**
     * Getting the list of authors from the database
     * @return
     * @throws SQLException
     */
    public List<Author> getAuthors() throws SQLException {
        List<Author> authors = new ArrayList<Author>();
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            authors = session.createCriteria(Author.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen())) session.close();
        }
        return authors;
    }
}
