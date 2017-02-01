package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by bos on 1/17/17.
 *
 * Tweet class is a super class that implements Tweetable
 */

public abstract class Tweet implements Tweetable { //can't make it but can make sub its
    private Date date;
    private String message;
    private ArrayList<Mood> moods;

    public ArrayList<Mood> getMoods() { //returns the mood list
        return moods;
    }

    public void setMoods(ArrayList<Mood> moods) { //initializes the list
        this.moods = moods;
    }

    public void addMood(Mood mood) {  //adds a mood to the mood list
        this.moods.add(mood);
    }
    // private String hiddenString;

    public Tweet(Date date, String message)  {
        this.date = date;
        this.message = message;
    }

    public Tweet(String message)  {
        this.message = message;
        this.date = new Date(); // current time and date
    }

    public abstract Boolean isImportant(); //all subclasses must be implemented

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 144){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }


    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
