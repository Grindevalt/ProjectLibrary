package dao;

import table.Author;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Interface DAO for authors
 */
public interface AuthorDao {
    /**
     *
     * @param author
     * @throws SQLException
     */
    public void addAuthor(Author author) throws SQLException;

    /**
     *
     * @param author
     * @throws SQLException
     */
    public void deleteAuthor(Author author) throws SQLException;

    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Author getAuthor(int id) throws SQLException;

    /**
     *
     * @return
     * @throws SQLException
     */
    public List<Author> getAuthors() throws SQLException;
}
