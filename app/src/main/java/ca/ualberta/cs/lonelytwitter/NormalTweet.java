/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */
/**
 * A Tweet that is not important.
 * @author amckerna
 * @version 1.0
 * @see ImportantTweet
 * @see Tweet
 * @since 1.0
 */
public class NormalTweet extends Tweet {
    /**
     * A constructor for NormalTweet. Sets the date to the current one.
     * @param message the content of the Tweet
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * A constructor for NormalTweet
     * @param message the content of the Tweet
     * @param date a custom date
     */
    public NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns whether the NormalTweet is important
     * @return a boolean indicating if the NormalTweet is important
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
