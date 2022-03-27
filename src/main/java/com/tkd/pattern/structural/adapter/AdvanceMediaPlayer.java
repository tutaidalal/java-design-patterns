package com.tkd.pattern.structural.adapter;

/**
 * @author tkd
 *
 */
public interface AdvanceMediaPlayer {

	/**
	 * @param mediaFile
	 */
	void playVlc(String mediaFile);

	/**
	 * @param medString
	 */
	void playQuickTime(String medString);

}
