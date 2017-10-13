package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/14/16.
 */
public abstract class Tweet implements Comparable<Tweet>{
    protected String message;
    private Date date;

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }


    public int compareTo(Tweet tweet){
        if (this.date.after(tweet.getDate())){
            return 1;
        }
        else if (this.date.before(tweet.getDate())){
            return -1;
        }
        else{
            return 0;
        }
    }

    public Date getDate() {
        return date;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    abstract public boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
