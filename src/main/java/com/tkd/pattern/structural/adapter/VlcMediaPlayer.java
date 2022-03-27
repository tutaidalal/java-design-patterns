package com.tkd.pattern.structural.adapter;
/**
 * @author tkd
 *
 */
public class VlcMediaPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String mediaFile) {
		System.out.println("Using VLC");
	}

	@Override
	public void playQuickTime(String medString) {
		// TODO Auto-generated method stub
		//DO Nothing
	}

}
