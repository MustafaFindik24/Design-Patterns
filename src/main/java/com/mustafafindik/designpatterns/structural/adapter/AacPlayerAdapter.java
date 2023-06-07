package com.mustafafindik.designpatterns.structural.adapter;

public class AacPlayerAdapter implements Mp3Player{
    private AacPlayer aacPlayer;
    public AacPlayerAdapter(AacPlayer aacPlayer){
        this.aacPlayer = aacPlayer;
    }
    @Override
    public void playMusic(String fileName) {
        aacPlayer.playAac(fileName);
    }
}
