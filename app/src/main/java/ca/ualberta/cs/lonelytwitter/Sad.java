package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <code>Sad</code> is a subclass of <code>Mood</code> which has the attribute
 * date and sets the message to "This tweet is sad".
 *
 * @author bos
 * @version 1.0
 * @see #Sad()
 * @see #Sad(Date)
 * @see #format()
 */

public class Sad extends Mood{

    /**
     * This is one way of initializing Sad
     * @param date
     * @see Sad
     */
    public Sad(Date date) {
        super(date);
    }

    /**
     * This is one way of initializing Sad
     * @see Sad
     */
    public Sad() {
    }

    /**
     * This sets the message for the Sad Mood.
     *
     * @return String of "This tweet is sad"
     * @see Sad
     */
    public String format() {
        return "This tweet is sad";
    }
}
