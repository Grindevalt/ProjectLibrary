package dao;

import table.Book;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Interface DAO for books
 */
public interface BookDao {
    /**
     *
     * @param book
     * @throws SQLException
     */
    public void addBook(Book book) throws SQLException;

    /**
     *
     * @param book
     * @throws SQLException
     */
    public void deleteBook(Book book) throws SQLException;

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Book getBook(int id) throws SQLException;

    /**
     *
     * @return
     * @throws SQLException
     */
    public List<Book> getBooks() throws SQLException;
}
