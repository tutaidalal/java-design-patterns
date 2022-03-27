package com.tkd.pattern.structural.adapter;
/**
 * @author tkd
 *
 */
public class MediaAdapter implements MediaPlayer {

	AdvanceMediaPlayer advancePlayer;
	/**
	 * @param mediaType
	 */
	public MediaAdapter(String mediaType) {
		if(mediaType.equals("vlc")) {
			advancePlayer = new VlcMediaPlayer();
		} else if(mediaType.equals("quicktime")) {
			advancePlayer = new QuickTimeMediaPlayer();
		}
	}
	
	
	@Override
	public void play(String filename, String mediaType) {
		if(mediaType.equals("vlc")) {
			advancePlayer.playVlc(mediaType);
		} else if(mediaType.equals("quicktime")) {
			advancePlayer.playQuickTime(filename);
		}
	}

}
