package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <code>Mood</code> is an abstract class that has the attribute date. <br>
 *     It also sets up for a message that will be determined by its subclasses.
 *
 * @author bos
 * @version 1.0
 * @see Happy
 * @see Sad
 * @see #setDate(Date)
 * @see #getDate()
 * @see #format()
 */

public abstract class Mood {
    private Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }

    /**
     * returns the date associated with the mood.
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date associated with the mood.
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Makes sure that the subclasses have a format
     */
    public abstract String format();
}
