package table;

import javax.persistence.*;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Entity author in database
 */
@Entity
@Table(name = "author")
public class Author {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column (name = "middle_name")
    private String middleName;

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
     * Getter for property 'firstName'.
     *
     * @return Value for property 'firstName'.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for property 'firstName'.
     *
     * @param firstName Value to set for property 'firstName'.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for property 'lastName'.
     *
     * @return Value for property 'lastName'.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for property 'lastName'.
     *
     * @param lastName Value to set for property 'lastName'.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for property 'middleName'.
     *
     * @return Value for property 'middleName'.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Setter for property 'middleName'.
     *
     * @param middleName Value to set for property 'middleName'.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
