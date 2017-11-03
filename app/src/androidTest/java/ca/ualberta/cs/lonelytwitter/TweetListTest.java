package ca.ualberta.cs.lonelytwitter;

//removed unused imports
import android.test.ActivityInstrumentationTestCase2;
import java.util.Calendar;

/**
 * Created by amckerna on 10/12/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        //assertTrue(Boolean.FALSE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testAddDuplicate(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        try {
            tweets.add(tweet);
            tweets.add(tweet);
            assertTrue(false);
        }catch(IllegalArgumentException e){
            assertTrue(true);
        }
    }

    public void testSorting(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2");
        Calendar cal = Calendar.getInstance();
        cal.setTime(tweet1.getDate());
        cal.add(Calendar.DATE, -10);
        tweet1.setDate(cal.getTime());
        tweets.add(tweet1);
        tweets.add(tweet2);
        assertTrue(tweets.getTweets().get(1).getDate().after(tweets.getTweets().get(0).getDate()));
    }

    public void testCount(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet("test1");
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet3 = new NormalTweet("test3");

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);
        assertTrue(tweets.getCount() == 3);
    }

    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),tweet.getMessage());
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");

    }
}
