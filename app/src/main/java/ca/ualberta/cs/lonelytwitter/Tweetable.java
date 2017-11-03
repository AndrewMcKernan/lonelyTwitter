package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 */
public interface Tweetable {
    // removed redundant "public" modifier in interface
    String getMessage();
    Date getDate();
}
