package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class VideoPlayer implements Playable {

    private File Video;

    VideoPlayer() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            Video = fileChooser.getSelectedFile();
        }
    }

    VideoPlayer(File Video) {
        this.Video = Video;
    }

    @Override
    public void play() {
        try {
            Desktop.getDesktop().open(Video);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
