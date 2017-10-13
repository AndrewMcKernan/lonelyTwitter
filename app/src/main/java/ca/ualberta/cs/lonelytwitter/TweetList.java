package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by amckerna on 10/12/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void add(Tweet tweet){
        if(this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
        Collections.sort(this.tweets);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public int getCount(){
        return tweets.size();
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){
        return this.tweets;
    }
}
