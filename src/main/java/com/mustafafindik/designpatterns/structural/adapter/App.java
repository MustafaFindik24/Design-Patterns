package com.mustafafindik.designpatterns.structural.adapter;

public class App {
    public static void main(String[] args) {
        Mp3Player mp3Player = fileName -> System.out.println("Playing MP3 file : " + fileName);
        mp3Player.playMusic("song.mp3");

        WavPlayer wavPlayer = new WavPlayer();
        Mp3Player wavPlayerAdapter = new WavPlayerAdapter(wavPlayer);

        wavPlayerAdapter.playMusic("song.wav");

        AacPlayer aacPlayer = new AacPlayer();
        Mp3Player aacPlayerAdapter = new AacPlayerAdapter(aacPlayer);

        aacPlayerAdapter.playMusic("song.aac");
    }
}
