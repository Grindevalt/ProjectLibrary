package dao;

import table.BookAuthors;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Interface DAO for book authors
 */
public interface BookAuthorDao {
    /**
     *
     * @param bookAuthors
     * @throws SQLException
     */
    public void addBookAuthors (BookAuthors bookAuthors) throws SQLException;

    /**
     *
     * @return
     * @throws SQLException
     */
    public List<BookAuthors> getBookAuthors() throws SQLException;
}
