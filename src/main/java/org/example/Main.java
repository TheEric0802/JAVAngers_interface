package org.example;

import javax.swing.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = null;
        String filePath = "";
        String fileExtension = "";

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            filePath = file.toURI().toString();
            fileExtension = filePath.substring(filePath.lastIndexOf("."));
        } else {
            System.exit(0);
        }

        MediaController mc;

        switch (fileExtension) {
            case ".mp3":
                MusicPlayer mp = new MusicPlayer(filePath);
                mc = new MediaController(mp);
                mc.playMedia();
                break;
            case ".mp4":
                VideoPlayer vp = new VideoPlayer(file);
                mc = new MediaController(vp);
                mc.playMedia();
                break;
        }

    }
}