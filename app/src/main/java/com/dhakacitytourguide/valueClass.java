package com.dhakacitytourguide;

public class valueClass {
    private final String mTitle;
    private final String mDescription;
    private final int mImageResourceId;
    private final String mUrl;

    public valueClass(){
        this.mTitle = "Default";
        this.mDescription = "Default";
        this.mImageResourceId = R.mipmap.ic_launcher;
        this.mUrl = "default";
    }

    public valueClass(String mTitle, String mDescription, int mImageResourceId, String mUrl) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mImageResourceId = mImageResourceId;
        this.mUrl = mUrl;
    }

    public String getmTitle(){
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmUrl() {
        return mUrl;
    }

}
