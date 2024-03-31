package ru.first.spring;
import java.util.ArrayList;

public class MusicPlayer
{
    private ArrayList<Music> songs = new ArrayList<>();
    private String name;
    private int volume;
    //IoC
    public MusicPlayer(Music music)
    {
        this.songs.add(music);
    }

    public MusicPlayer() {}

    public void setMusic(Music music)
    {
        this.songs.add(music);
    }
    public void playMusic()
    {
        for(int i = 0; i < songs.size(); ++i)
        {
            System.out.println("Playing " + songs.get(i));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setSong(Music song)
    {
        this.songs.add(song);
    }

//    public void setSongs(Music song)
//    {
//
//    }

}
