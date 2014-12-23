package com.mooccircle.sunshine.app;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hassan.abid on 12/23/2014.
 */

public class Courses {

    public String key;

    public String title;

    public String homepage;

    public String subtitle;


    public String  image;

    public Video video;


    public void setKey(String key) {
        this.key = key;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setSubTitle(String subtitle) {
        this.subtitle = subtitle;
    }
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getKey() {
        return key;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subtitle;
    }

    public String setHomepage() {
        return homepage;
    }

    public String setImage() {
        return image;
    }

    public Video getVideo() {
        return video;
    }

}
