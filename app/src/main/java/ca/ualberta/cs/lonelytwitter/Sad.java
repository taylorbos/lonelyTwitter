package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bos on 1/17/17.
 */

public class Sad extends Mood{

    public Sad(Date date) {
        super(date);
    }

    public Sad() {
    }

    public String format() {
        return "This tweet is sad";
    }
}
