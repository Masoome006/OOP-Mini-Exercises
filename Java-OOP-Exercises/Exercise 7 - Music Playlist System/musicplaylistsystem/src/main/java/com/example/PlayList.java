package com.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class PlayList {
    
    private String name;
    private ArrayList<Song> songs;
    private String createdby;

    public PlayList(String name , ArrayList<Song> songs , String createdby){
        this.name = name;
        this.songs =new ArrayList<>();
        this.createdby = createdby;
    }

    public void addSong(Song song){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter playlist name: ");
        String name = sc.nextLine();
        System.out.print("Enter your name: ");
        String createdby = sc.nextLine();
        System.out.print("Enter song title: ");
        String title = sc.nextLine();
        System.out.print("Enter artist: ");
        String artist = sc.nextLine();
        System.out.print("Enter duration in seconds: ");
        int duration = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter genre: ");
        String genre = sc.nextLine();

        Song s = new Song(title, artist, duration, genre);
        songs.add(s);

        System.out.println("✔ Song added to playlist '" + this.name + "' by " + this.createdby);
    }

    public void removeSong( String title){}

    public int getTotalDuration(){
        int total = 0;
        for(Song s : songs){
            total += s.getDuration();
        }
        return total;
    }

    public void getFormattedTotalDuration(){
        int total = getTotalDuration();
        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        System.out.printf("Formatted Total Duration : %02d:%02d:%02d" , hours , minutes , seconds );

    }

    public void findSongsByArtist( String artist){
        ArrayList<Song> result = new ArrayList<>();

        for(Song s : songs){
            if(s.getArtist().equalsIgnoreCase(artist))
            result.add(s);

        }
        System.out.printf("result:" , result);

    }

    public void shuffle(){
        if (songs.isEmpty()){
        System.out.println("there is no song!");
        return;
    }

        Random rand = new Random();
        int temp = rand.nextInt(songs.size());
        System.out.printf("" ,songs.get(temp) ); 
    }

    public double getAverageSongDuration(){
        if(songs.isEmpty())
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
