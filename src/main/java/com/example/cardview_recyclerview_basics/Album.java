package com.example.cardview_recyclerview_basics;

public class Album {
    private String name;
    private int thumbnail;
    private int numOfSongs;

    public Album(String name, int thumbnail, int numOfSongs) {
        this.name = name;
        this.thumbnail = thumbnail;
        this.numOfSongs = numOfSongs;
    }

    public String getName() {
        return name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }
}
