package ru.alexey.pustohin;

/**
 * @author Alexey Pustohin
 */
public class MusicPlayer {
    private Music music;

    //I oC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
