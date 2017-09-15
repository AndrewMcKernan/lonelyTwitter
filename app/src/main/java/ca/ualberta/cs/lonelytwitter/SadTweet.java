package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

public class SadTweet extends CurrentMood {

    public SadTweet() {
        super("Sad");
    }

    public SadTweet(Date date) {
        super("Sad", date);
    }

}
