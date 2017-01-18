package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bos on 1/17/17.
 */

public class TweetTooLongException extends Throwable {
    public TweetTooLongException() {
    }
    public TweetTooLongException(String detailMessage) {
        super(detailMessage);
    }
}
