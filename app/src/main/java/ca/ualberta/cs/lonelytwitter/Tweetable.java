/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 *
 *
 */

/**
 * An interface that represents when something is able to be tweeted.
 * @author amckerna
 * @version 1.0
 * @see Tweet
 * @since 1.0
 */
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
