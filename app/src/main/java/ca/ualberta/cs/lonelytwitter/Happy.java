package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bos on 1/17/17.
 */

public class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }

    public Happy() {
    }

    public String format() {
        return "This tweet is happy";
    }
}
