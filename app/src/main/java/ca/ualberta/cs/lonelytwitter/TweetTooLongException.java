package ca.ualberta.cs.lonelytwitter;

/**
 * This is thrown whenever a message excedes 144 characters.
 * @author bos
 * @version 1.0
 * @see Tweet
 */

public class TweetTooLongException extends Throwable {
    public TweetTooLongException() {
    }
    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
