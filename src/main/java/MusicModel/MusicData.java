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
    
    private String musicTitle;
    private String musicAlbum;
    private int musicLength;
    private String musicGenre;
    private int musicStreams;

    public MusicData(String musicTitle, String musicAlbum, int musicLength, String musicGenre,int musicStreams) {
        this.musicTitle = musicTitle;
        this.musicAlbum = musicAlbum;
        this.musicLength = musicLength;
        this.musicGenre = musicGenre;
        this.musicStreams=musicStreams;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public String getMusicAlbum() {
        return musicAlbum;
    }

    public int getMusicLength() {
        return musicLength;
    }

    public String getMusicGenre() {
        return musicGenre;
    }
    
    public int getMusicStreams(){
        return musicStreams;
    }

    @Override
    public String toString() {
        return "Music data:\n"+"\tTitle: "+musicTitle+"\n\tAlbum: "+musicAlbum+"\t\nLength: "+musicLength+"\n\tGenre: "+musicGenre+"\n\tStreams: "+musicStreams;
    }
  
}
