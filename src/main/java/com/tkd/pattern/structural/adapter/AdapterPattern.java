package com.tkd.pattern.structural.adapter;

/**
 * @author tkd
 */
public class AdapterPattern {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("abc.mp3", "mp3");

		audioPlayer.play("abc.vlc", "vlc");
		audioPlayer.play("abc.json", "json");
		audioPlayer.play("abc.quicktime", "quicktime");
	}
}
