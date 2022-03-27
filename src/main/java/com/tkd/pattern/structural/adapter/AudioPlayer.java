package com.tkd.pattern.structural.adapter;
/**
 * @author tkd
 *
 */
public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String filename, String mediaType) {
		if (mediaType.contains("mp3")) {
			System.out.println("Playing Audio As MP3");
		} else if (mediaType.contains("vlc") || mediaType.contains("quicktime")) {
			MediaAdapter mediaAdapter = new MediaAdapter(mediaType);
			mediaAdapter.play(filename, mediaType);
		} else {
			System.out.println("Invalid Data type");
		}

	}

}
