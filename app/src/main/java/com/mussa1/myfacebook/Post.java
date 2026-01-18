package com.mussa1.myfacebook;

import android.widget.ImageView;

public class Post {
     String username;
    int profileimg;
     int image;
    String caption;

    public Post(String username, int profileimg, int image, String caption)
    {
        this.username = username;
        this.profileimg = profileimg;
        this.image =image;
        this.caption = caption;
    }

    // Getters for accessing post data
    public String getUsername() {
        return username;
    }


    public int getProfilePicResId() {
        return profileimg;
    }

    public int getImageResId() {
        return image;
    }

    public String getCaption() {
        return caption;
    }


}
