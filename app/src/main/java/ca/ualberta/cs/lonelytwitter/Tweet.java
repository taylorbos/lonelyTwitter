package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * <code>Tweet</code> class is an abstract super class that implements <code>Tweetable</code>
 * It has attribute: date, message, and moods.
 *
 * @author bos
 * @version 1.0
 * @see #Tweet(Date, String)
 * @see #getMoods()
 * @see #addMood(Mood)
 * @see #Tweet(String)
 * @see #isImportant()
 * @see #getDate()
 * @see #setDate(Date)
 * @see #getMessage()
 * @see #setMessage(String)
 * @see NormalTweet
 * @see ImportantTweet
 */

public abstract class Tweet implements Tweetable { //can't make it but can make sub its
    private Date date;
    private String message;
    private ArrayList<Mood> moods;

    /**
     * This returns a list of moods.
     * @return the list of moods
     */
    public ArrayList<Mood> getMoods() { //returns the mood list
        return moods;
    }

    /**
     * This sets the list of moods
     * @param moods
     */
    public void setMoods(ArrayList<Mood> moods) { //initializes the list
        this.moods = moods;
    }

    /**
     * This adds a mood to the list of moods.
     * @param mood
     */
    public void addMood(Mood mood) {  //adds a mood to the mood list
        this.moods.add(mood);
    }
    // private String hiddenString;

    /**
     * This initializes the tweet when a date is given.
     * @param date
     * @param message
     */
    public Tweet(Date date, String message)  {
        this.date = date;
        this.message = message;
    }

    /**
     * This initailizes a tweet with the current date.
     * @param message
     */
    public Tweet(String message)  {
        this.message = message;
        this.date = new Date(); // current time and date
    }

    /**
     * This is to make sure that the subclasses initialize this class.
     * @return TRUE or FALSE depending on if the tweet is important
     */
    public abstract Boolean isImportant(); //all subclasses must be implemented

    /**
     * This returns the date associated with the tweet.
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * This sets the date for the tweet.
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This returns the message associated with the tweet.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * This sets the message for the tweet and throws the <code>TweetTooLongException</code>
     * if the message is longer than 144 characters.
     * @param message
     * @throws TweetTooLongException
     */
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
