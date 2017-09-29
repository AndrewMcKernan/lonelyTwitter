/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

/**
 * A Tweet with a Sad mood.
 * @author amckerna
 * @version 1.0
 * @see HappyTweet
 * @see Tweet
 * @see CurrentMood
 * @since 1.0
 */
public class SadTweet extends CurrentMood {

    /**
     * Constructor for the SadTweet class, calling the relevant CurrentMood contructor with argument "Sad"
     * @see CurrentMood
     */
    public SadTweet() {
        super("Sad");
    }

    /**
     * Constructor for the SadTweet class, calling the relevant CurrentMood contructor with argument "Sad".
     * Also takes a custom date.
     * @see CurrentMood
     */
    public SadTweet(Date date) {
        super("Sad", date);
    }

}
