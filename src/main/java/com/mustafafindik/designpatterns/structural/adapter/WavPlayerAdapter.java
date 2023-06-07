package com.mustafafindik.designpatterns.structural.adapter;

public class WavPlayerAdapter implements Mp3Player{
    private WavPlayer wavPlayer;
    public WavPlayerAdapter(WavPlayer wavPlayer){
        this.wavPlayer = wavPlayer;
    }
    @Override
    public void playMusic(String fileName) {
        wavPlayer.playWav(fileName);
    }
}
