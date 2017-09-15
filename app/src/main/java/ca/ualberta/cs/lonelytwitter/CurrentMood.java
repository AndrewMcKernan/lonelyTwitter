package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amckerna on 9/14/17.
 */

public abstract class CurrentMood{

    private Date date;
    private String mood;

    public CurrentMood(String mood) {
        this.mood = mood;
        this.date = date;
    }
    public CurrentMood(String mood, Date date) {
        this.date = date;
        this.mood = mood;
    }

    public String getMood(){
        return this.mood;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }

}
