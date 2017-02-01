package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bos on 1/17/17.
 */

public class ImportantTweet extends Tweet { //don't have to reimplement attributes
    public ImportantTweet(Date date, String message)  {
        super(date, message); // calls super class constructor
    }

    public ImportantTweet(String message)  {
        super(message);
    }
    @Override
    public Boolean isImportant() { //important tweet is important
        return Boolean.TRUE;
    }

    @Override
    public String getMessage() { // overrides the parent method without creating a new method
        return super.getMessage() + "!!!!";
    }
}
