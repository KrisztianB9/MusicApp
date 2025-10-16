package MusicModel;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bacsokrisztian
 */
public class Toplist {
    
    private String toplistGenre;
    private List<MusicData> musicList;

    public Toplist(String toplistGenre) {
        if(toplistGenre==null || toplistGenre.isBlank()){
            throw new IllegalArgumentException("A mufaj nem lehet ures!");
        }
        this.toplistGenre = toplistGenre;
        this.musicList=new ArrayList<>();
    }
    
    public String getToplistGenre(){
        return toplistGenre;
    }
    
    public List<MusicData> getMusicList(){
        return musicList;
    }
    
    public void addMusicToPlaylist(MusicData a){
        this.musicList.add(a);
    }
    
    public long getTotalStreamCount() {
        return musicList.stream().mapToLong(MusicData::getMusicStreams).sum();
    }
    
}
