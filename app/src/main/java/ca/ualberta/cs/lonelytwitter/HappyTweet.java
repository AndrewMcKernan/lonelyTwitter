/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

/**
 * A Tweet that has a happy mood.
 * @author amckerna
 * @version 1.0
 * @see CurrentMood
 * @see Tweet
 * @see SadTweet
 * @since 1.0
 */
public class HappyTweet extends CurrentMood {

    /**
     * A constructor for HappyTweet. Sets the mood to "Happy" explicitly.
     */
    public HappyTweet() {
        super("Happy");
    }

    /**
     * A constructor for HappyTweet. Sets the mood to "Happy" explicitly.
     * @param date a custom date for the HappyTweet.
     */
    public HappyTweet(Date date) {
        super("Happy", date);
    }

}
