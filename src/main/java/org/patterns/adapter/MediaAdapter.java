package org.patterns.adapter;

public class MediaAdapter implements MediaPlayer {

    private VideoPlayer videoPlayer;

    public MediaAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play() {
        videoPlayer.playMp4();
    }
}
