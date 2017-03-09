package table;

import javax.persistence.*;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Entity book authors in database where situated all relations
 */
@Entity
@Table (name = "book_authors")
public class BookAuthors {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JoinColumn (name = "book_id", referencedColumnName = "id")
    private Book book;

    @JoinColumn (name = "author_id", referencedColumnName = "id")
    private Author author;

    /**
     * Getter for property 'book'.
     *
     * @return Value for property 'book'.
     */
    public Book getBook() {
        return book;
    }

    /**
     * Setter for property 'book'.
     *
     * @param book Value to set for property 'book'.
     */
    public void setBook(Book book) {
        this.book = book;
    }

    /**
     * Getter for property 'author'.
     *
     * @return Value for property 'author'.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Setter for property 'author'.
     *
     * @param author Value to set for property 'author'.
     */
    public void setAuthor(Author author) {
        this.author = author;
    }
}
