/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

/**
 * A class representing the current mood of a Tweet.
 * @author amckerna
 * @version 1.0
 * @see HappyTweet
 * @see SadTweet
 * @since 1.0
 */
public abstract class CurrentMood{

    private Date date;
    private String mood;

    /**
     * A constructor for CurrentMood.
     * @param mood a string representing the current mood of a Tweet.
     * @see HappyTweet
     * @see SadTweet
     */
    public CurrentMood(String mood) {
        this.mood = mood;
        this.date = date;
    }

    /**
     * A constructor for CurrentMood.
     * @param mood a string representing the current mood of a Tweet.
     * @param date a custom date of the Tweet.
     * @see HappyTweet
     * @see SadTweet
     */
    public CurrentMood(String mood, Date date) {
        this.date = date;
        this.mood = mood;
    }

    /**
     * A method returning the current mood.
     * @return a string representing the mood.
     */
    public String getMood(){
        return this.mood;
    }

    /**
     * A method for setting the date.
     * @param date a Date object.
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * A method that returns the date.
     * @return a Date object.
     */
    public Date getDate(){
        return this.date;
    }

}
