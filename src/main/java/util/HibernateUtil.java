package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Vlad Badilovskii on 09.03.2017.
 */

/**
 * Class for creating sessionFactory and getting data from database
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Getter for property 'sessionFactory'.
     *
     * @return Value for property 'sessionFactory'.
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
