package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bos on 1/17/17.
 */

public interface Tweetable {
    public String getMessage(); // by default the access label is package sort of
    public Date getDate(); //must be implemented to be tweetable
}
