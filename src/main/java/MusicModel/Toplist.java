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

    public Toplist(String toplistGenre, List<MusicData> musicList) {
        this.toplistGenre = toplistGenre;
        this.musicList = new ArrayList<>();
    }
    
    public String getToplistGenre(){
        return toplistGenre;
    }
    
    public List<MusicData> getMusicList(){
        return musicList;
    }
    
    public void addMusicToPlaylist(MusicData a){
        musicList.add(a);
    }
    
}
