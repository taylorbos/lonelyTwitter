package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * <code>NormalTweet</code> is a subclass of <code>Tweet</code> which sets
 * the boolean <code>isImportant</code> to false and does not change the messsage.
 *
 * @author bos
 * @see Tweet
 * @see #NormalTweet(Date, String)
 * @see #NormalTweet(String)
 * @see #isImportant()
 */
public class NormalTweet extends Tweet {

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(Date date, String message)  {
        super(date, message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     * @throws TweetTooLongException the tweet too long exception
     */
    public NormalTweet(String message)  {
        super(message);
    }
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
