/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

/**
 * A Tweet that is important.
 * @author amckerna
 * @version 1.0
 * @see NormalTweet
 * @see Tweet
 * @since 1.0
 */
public class ImportantTweet extends Tweet{

    /**
     * A constructor for ImportantTweet.
     * @param message the content of the ImportantTweet
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * A constructor for ImportantTweet
     * @param message the content of the ImportantTweet
     * @param date a custom date
     */
    public ImportantTweet (String message, Date date){
        super(message, date);
    }

    /**
     * A method specifying whether the ImportantTweet is important
     * @return bool representing whether the ImportantTweet is important
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
