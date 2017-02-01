package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Happy is a <code>Mood</code> that returns "This tweet is happy".
 *
 * @author bos
 * @version 1.0
 * @see Mood
 * @see #format()
 */

public class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }

    public Happy() {
    }

    /**
     * Returns the message "This tweet is happy".
     * @return message
     */
    public String format() {
        return "This tweet is happy";
    }
}
