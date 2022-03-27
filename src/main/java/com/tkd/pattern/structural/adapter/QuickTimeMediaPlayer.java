package com.tkd.pattern.structural.adapter;
/**
 * @author tkd
 */
public class QuickTimeMediaPlayer implements AdvanceMediaPlayer {

	@Override
	public void playVlc(String mediaFile) {
		// TODO Auto-generated method stub
	}

	@Override
	public void playQuickTime(String medString) {
		System.out.println("I am in quicktimeplayer");
	}

}
