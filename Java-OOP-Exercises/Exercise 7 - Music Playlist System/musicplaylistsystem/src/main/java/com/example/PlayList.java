package com.example;

import java.util.ArrayList;

public class PlayList {
    
    private String name;
    private ArrayList<Song> songs;
    private String createdby;

    public PlayList(String name , ArrayList<Song> songs , String createdby){
        this.name = name;
        this.songs =new ArrayList<>();
        this.createdby = createdby;
    }

    public void addSong(String song){}

    public void removeSong( String title){}

    public void getTotalDuration(){}

    public void getFormattedTotalDuration(){}

    public void findSongsByArtist( String artist){}

    public void shuffle(){}

    public void getAverageSongDuration(){}

    public void getLongestSong(){}

    public void getShortestSong(){}
   


   




    
}
