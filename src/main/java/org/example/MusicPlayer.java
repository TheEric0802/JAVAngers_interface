package org.example;

import javafx.application.Platform;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;

import javax.swing.*;

public class MusicPlayer implements Playable {

    private String SongPath;

    MusicPlayer() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            SongPath = fileChooser.getSelectedFile().toURI().toString();
        }
    }

    MusicPlayer(String SongPath) {
        this.SongPath = SongPath;
    }

    @Override
    public void play() {
        Platform.startup(() -> {
            Media Song = new Media(SongPath);
            AudioClip ac = new AudioClip(Song.getSource());
            ac.setVolume(0.1);
            ac.play();
        });
    }
}
