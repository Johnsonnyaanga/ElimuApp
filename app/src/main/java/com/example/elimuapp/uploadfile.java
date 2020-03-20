package com.example.elimuapp;

public class uploadfile {
    private String name;
    private String mImageUrl;

    public  uploadfile(){

    }

    public uploadfile(String name, String mImageUrl) {
        if(name.trim().equals("")){
            name ="no name";
        }
        this.name = name;
        this.mImageUrl = mImageUrl;
    }

    public String getName() {
        return name;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
