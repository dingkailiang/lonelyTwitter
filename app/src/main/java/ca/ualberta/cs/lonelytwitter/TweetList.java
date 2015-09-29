package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by dingkai on 9/28/15.
 */
public class TweetList {
    private ArrayList<Tweet> tweets;

    public TweetList(){
        tweets = new ArrayList<Tweet>();
    }

    public TweetList(ArrayList<Tweet> list) {
        tweets = list;
    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Boolean contains(Tweet tweet){
        return tweets.contains(tweet);
    }

    public int count(){
        return tweets.size();
    }

    public void clear(){
        tweets.clear();
    }

    public ArrayList<Tweet> get(){
        return tweets;
    }
}
