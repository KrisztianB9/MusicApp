package MusicModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bacsokrisztian
 */

//Music Data osztaly

public class MusicData {
    
    private String title;
    private String artist;
    private String genre;
    private long streamCount;

    public MusicData(String musicTitle, String musicAlbum, String musicGenre,int musicStreams) {
        this.title = musicTitle;
        this.artist = musicAlbum;
        this.genre = musicGenre;
        this.streamCount=musicStreams;
    }

    public String getMusicTitle() {
        return title;
    }

    public String getMusicAlbum() {
        return artist;
    }

    public String getMusicGenre() {
        return genre;
    }
    
    public long getMusicStreams(){
        return streamCount;
    }

    @Override
    public String toString() {
        return title+" by "+artist;
    }
  
}
