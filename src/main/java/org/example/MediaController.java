package org.example;

public class MediaController {

    private Playable media;

    public MediaController(Playable media) {
        this.media = media;
    }

    public void playMedia() {
        media.play();
    }
}
