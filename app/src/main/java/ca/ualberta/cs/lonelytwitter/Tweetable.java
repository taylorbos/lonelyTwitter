package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is an interface that makes sure everything that is tweetable has
 * the methods: getMessage and getDate.
 * @see Tweet
 */

public interface Tweetable {
    public String getMessage(); // by default the access label is package sort of
    public Date getDate(); //must be implemented to be tweetable
}
