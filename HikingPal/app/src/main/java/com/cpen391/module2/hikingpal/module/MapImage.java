package com.cpen391.module2.hikingpal.module;

import android.text.TextUtils;

import java.util.List;

/**
 * Created by YueyueZhang on 2017-03-13.
 * we dont actually need this
 */

public class MapImage {

    private int imageId;      //time
    private long myDuration;
    private long myDistance;
    private List<String> mySpots;
    private String myDate;
    private String myName;    // set time as default, allowing user to modify it
    private int myRating;     // obtain from the touchscreen
    private String absPath;

    private final char BT_MAP_INIT = 'W';
    private final char BT_MAP_DELIMITER = 'Q';
    private final char BT_MAP_FIELD_DELIMITER = 'V';

    public MapImage() {
    }

    public String getAbsPath() {
        return absPath;
    }

    public List<String> getMySpots() {
        return mySpots;
    }

    public int getMyRating() {
        return myRating;
    }

    public String getMyName() {
        return myName;
    }

    public long getMyDuration() {
        return myDuration;
    }

    public long getMyDistance() {
        return myDistance;
    }

    public String getMyDate() {
        return myDate;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setAbsPath(String absPath) {
        this.absPath = absPath;
    }

    public void setMyDate(String myDate) {
        this.myDate = myDate;
    }

    public void setMySpots(List<String> mySpots) {
        this.mySpots = mySpots;
    }

    public void setMyRating(int myRating) {
        this.myRating = myRating;
    }

    public void setMyDistance(long myDistance) {
        this.myDistance = myDistance;
    }

    public void setMyDuration(long myDuration) {
        this.myDuration = myDuration;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    // Parse all the data to send to bluetooth into a string
    public String GetDataString(){
        StringBuilder sb = new StringBuilder();
        sb.append(BT_MAP_DELIMITER);
        sb.append(BT_MAP_FIELD_DELIMITER);
        sb.append(myName);
        sb.append(BT_MAP_FIELD_DELIMITER);
        sb.append(myRating);
        sb.append(BT_MAP_FIELD_DELIMITER);
        sb.append(myDistance);
        sb.append(BT_MAP_FIELD_DELIMITER);
        sb.append(myDuration);
        sb.append(BT_MAP_FIELD_DELIMITER);
        sb.append(TextUtils.join(",", mySpots));
        sb.append(BT_MAP_FIELD_DELIMITER);
        sb.append(myDate);
        sb.append(BT_MAP_FIELD_DELIMITER);
        sb.append(BT_MAP_DELIMITER);

        return sb.toString();
    }
}
