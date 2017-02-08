package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <code>ImportantTweet</code> is a <code>Tweet</code> which returns TRUE when
 * <code>isImportant</code> is called and it adds "!!!!" to the end of the message.
 *
 * @author bos
 * @version 1.0
 * @see Tweet
 * @see #isImportant()
 * @see #getMessage() 
 */

public class ImportantTweet extends Tweet { //don't have to reimplement attributes
    public ImportantTweet(Date date, String message)  {
        super(date, message); // calls super class constructor
    }

    public ImportantTweet(String message)  {
        super(message);
    }

    /**
     * Shows that the tweet is important.
     * @return TRUE
     */
    @Override
    public Boolean isImportant() { //important tweet is important
        return Boolean.TRUE;
    }

    /**
     * Adds "!!!!" to the end of the message.
     * @return modified message
     */
    @Override
    public String getMessage() { // overrides the parent method without creating a new method
        return super.getMessage() + "!!!!";
    }
}
