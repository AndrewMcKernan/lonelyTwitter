/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 *   Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 *
 * An abstract class representing a Tweet. Any Tweet classes must extend this class.
 *
 * @author amckerna
 * @version 1.0
 * @see Tweetable
 * @see NormalTweet
 * @see ImportantTweet
 * @see HappyTweet
 * @see SadTweet
 * @since 1.0
 *
 */

public abstract class Tweet implements Tweetable {
    private String message;
    protected Date date;
    private ArrayList<CurrentMood> moods = new ArrayList<CurrentMood>();

    /**
     * A constructor for Tweet. Sets the Date to the current one.
     * @param message a string representing the content of the Tweet.
     *
     */

    public Tweet (String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * A constructor for Tweet, accepting a custom Date.
     *
     * @param message a string representing the content of the Tweet.
     * @param date a custom date for the Tweet
     *
     */

    public Tweet (String message, Date date){
        this.message = message ;
        this.date = date;
    }

    /**
     * Sets the date of a Tweet.
     * @param date the new date to overwrite the old one.
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Sets the content of the message of the Tweet.
     * @param message message to overwrite the old one.
     * @throws TweetTooLongException the max length of a message is 144 characters
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 144){
            this.message = message;
        }
        else{
            //dont do that nerd!!!
            throw new TweetTooLongException();
        }
    }

    /**
     * Returns the date of the Tweet.
     * @return returns a Date object
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * Returns the content of the tweet
     * @return a String
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Returns a list of the moods of the Tweet
     * @return arraylist of CurrentMoods
     */

    public ArrayList<CurrentMood> getMoods(){
        return moods;
    }

    /**
     * Set the list of moods of the Tweet.
     * @param moods
     */
    public void setMoods(ArrayList<CurrentMood> moods){
        this.moods = moods;
    }

    /**
     * A method returning whether a Tweet is important
     * @return true if important, false otherwise.
     */
    public abstract Boolean isImportant();

    /**
     * Output the Tweet in a String format.
     * @return formatted string output of content and date of Tweet
     */
    public String toString(){
        return date.toString() + "|" + message;
    }

}
