package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bos on 1/17/17.
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
