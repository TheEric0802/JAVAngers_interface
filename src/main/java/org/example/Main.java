package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String FilePath = "";

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            FilePath = fileChooser.getSelectedFile().toURI().toString();
        } else {
            System.exit(0);
        }

        MusicPlayer player = new MusicPlayer(FilePath);
        player.play();
    }
}