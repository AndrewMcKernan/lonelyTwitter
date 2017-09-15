package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

public class HappyTweet extends CurrentMood {

    public HappyTweet() {
        super("Happy");
    }

    public HappyTweet(Date date) {
        super("Happy", date);
    }

}
