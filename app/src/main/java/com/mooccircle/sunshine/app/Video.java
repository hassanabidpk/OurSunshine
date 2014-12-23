package com.mooccircle.sunshine.app;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hassan.abid on 12/23/2014.
 */
public class Video {

    @SerializedName("teaser_video")
    public String video;

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideo() {
        return video;
    }

}
