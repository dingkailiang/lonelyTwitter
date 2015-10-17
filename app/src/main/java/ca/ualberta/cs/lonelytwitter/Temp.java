package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dingkai on 10/16/15.
 */
public class Temp {
    private Tweet tweet;
    private static Temp instance;

    private Temp() {
    }

    public static Temp getInstance() {
        if (instance==null) instance = new Temp();
        return instance;
    }

    public Tweet getTweet() {
        return tweet;
    }

    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }
}
