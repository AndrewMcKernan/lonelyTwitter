package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    protected Date date;
    private ArrayList<CurrentMood> moods = new ArrayList<CurrentMood>();

    public Tweet (String message){
        this.message = message;
        this.date = new Date();
    }

    public Tweet (String message, Date date){
        this.message = message ;
        this.date = date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 144){
            this.message = message;
        }
        else{
            //dont do that nerd!!!
            throw new TweetTooLongException();
        }
    }
    public Date getDate(){
        return this.date;
    }

    public String getMessage(){
        return this.message;
    }

    public ArrayList<CurrentMood> getMoods(){
        return moods;
    }

    public void setMoods(ArrayList<CurrentMood> moods){
        this.moods = moods;
    }

    public abstract Boolean isImportant();

    public String toString(){
        return date.toString() + "|" + message;
    }

}
