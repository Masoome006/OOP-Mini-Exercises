package com.example;

import java.util.ArrayList;
import java.util.Random;

public class PlayList {
    
    private String name;
    private ArrayList<Song> songs;
    private String createdby;

    public PlayList(String name, String createdby){
        this.name = name;
        this.songs = new ArrayList<>();
        this.createdby = createdby;
        
    }

    public void addSong(Song song){
        songs.add(song);
        System.out.println("✔ Song added: " + song.getTitle());
    }


    public boolean removeSong(String title){
        for(Song s : songs){
            if (s.getTitle().equalsIgnoreCase(title)){
                songs.remove(s);
                return true;
            }
        }
        return false;
    }

    
    public int getTotalDuration(){

        int total = 0;
        for(Song s : songs){
            total += s.getDuration();
        }
        return total;
    }

    public String getFormattedTotalDuration(){

        int total = getTotalDuration();
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public ArrayList<Song> findSongsByArtist(String artist){
        ArrayList<Song> result = new ArrayList<>();

        for(Song s : songs){
            if(s.getArtist().equalsIgnoreCase(artist)){
                result.add(s);
            }
        }
        return result;
    }

   
    public Song shuffle(){
        if(songs.isEmpty())
        return null;

        Random rand = new Random();
        int index = rand.nextInt(songs.size());
        return songs.get(index);
    }

    public double getAverageSongDuration(){

        if (songs.isEmpty())
        return 0;

        return (double)getTotalDuration()/songs.size();
    }

   
    public Song getLongestSong(){
        if(songs.isEmpty())
        return null;

        Song longest = songs.get(0);
        for(Song s : songs){
            if(s.getDuration() > longest.getDuration())
            longest = s;
        }
        return longest;
    }

    public Song getShortestSong(){
        if(songs.isEmpty()) 
        return null;

        Song shortest = songs.get(0);
        for(Song s : songs){
            if(s.getDuration() < shortest.getDuration())
            shortest = s;
        }
        return shortest;
    }

}
