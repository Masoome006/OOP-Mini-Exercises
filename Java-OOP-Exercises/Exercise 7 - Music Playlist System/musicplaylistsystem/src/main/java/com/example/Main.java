package com.example;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.PlayList;
import com.example.Song;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter playlist name: ");
        String name = sc.nextLine();
        System.out.print("Enter created by: ");
        String createdBy = sc.nextLine();

        PlayList playlist = new PlayList(name, createdBy);

        while(true){
            System.out.println("\n**** PLAYLIST MENU ****");
            System.out.println("1. Add song");
            System.out.println("2. Remove song");
            System.out.println("3. Search song by artist");
            System.out.println("4. Show formatted total duration");
            System.out.println("5. Show average duration");
            System.out.println("6. Show longest song");
            System.out.println("7. Show shortest song");
            System.out.println("8. Shuffle (random song)");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Artist: ");
                    String artist = sc.nextLine();
                    System.out.print("Duration (seconds): ");
                    int duration = Integer.parseInt(sc.nextLine());
                    System.out.print("Genre: ");
                    String genre = sc.nextLine();
                    Song s = new Song(title, artist, duration, genre);
                    playlist.addSong(s);
                    break;

                case 2:
                    System.out.print("Enter song title to remove: ");
                    String titlle = sc.nextLine();
                    playlist.removeSong(titlle);
                    break;

                case 3:
                    System.out.print("Enter artist name: ");
                    String artistt = sc.nextLine();
                    ArrayList<Song> result = playlist.findSongsByArtist(artistt);

                    if(result.isEmpty()){
                        System.out.println("No songs found.");
                    }
                    else{
                        for (Song so : result){
                            System.out.println(so);
                        }
                    }
                    break;

                case 4:
                     System.out.println("Formatted Total Duration: " + playlist.getFormattedTotalDuration());
                    break;

                case 5:
                    System.out.println("Average Duration: " + playlist.getAverageSongDuration());
                    break;

                case 6:
                    Song longSong = playlist.getLongestSong();
                    System.out.println("Longest: " + (longSong != null ? longSong : "No songs"));
                    break;

                case 7:
                    Song shortSong = playlist.getShortestSong();
                    System.out.println("Shortest: " + (shortSong != null ? shortSong : "No songs"));
                    break;

                case 8:
                    Song randSong = playlist.shuffle();
                    if(randSong != null){
                        System.out.println("Random Song: " + randSong);
                    }
                    else{
                        System.out.println("Playlist is empty.");
                    }
                    break;

                case 9:
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
