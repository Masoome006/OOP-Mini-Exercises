package com.example;

public class Song {

    private String title;
    private String artist;
    private int duration;
    private String genre;

    public Song(String title , String artist , int duration , String genre){

        if(duration < 0){
            throw new IllegalArgumentException("duration should be positive!");
        }

        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public void setTitle( String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return artist;
    }
    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }

    public String getFormattedDuration(){
        int min = duration / 60;
        int sec = duration % 60;
        return String.format("%02d:%02d", min , sec);
    }

    public String getSongInfo(){
        return "Title:" + title + " , Artist:" + artist + " , Duration:" + getFormattedDuration() + " , Genre:" + genre;
       
    }

    @Override
    
    public String toString(){
       return getSongInfo();
    }




    
    
}
