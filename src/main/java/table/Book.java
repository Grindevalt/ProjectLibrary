package table;

import javax.persistence.*;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Entity book in database
 */
@Entity
@Table(name = "book")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "isbn")
    private int isbn;

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for property 'title'.
     *
     * @return Value for property 'title'.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for property 'title'.
     *
     * @param title Value to set for property 'title'.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for property 'description'.
     *
     * @return Value for property 'description'.
     * @param
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for property 'description'.
     *
     * @param description Value to set for property 'description'.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for property 'isbn'.
     *
     * @return Value for property 'isbn'.
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * Setter for property 'isbn'.
     *
     * @param isbn Value to set for property 'isbn'.
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
