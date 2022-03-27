package com.tkd.pattern.behavioral.ommand;

/**
 * @author tkd
 *
 */
public abstract class Command {
	protected Object app;
	protected Editor editor;
	protected String backup;

	/**
	 * @param app
	 * @param editor
	 */
	public Command(Object app, Editor editor) {
		super();
		this.app = app;
		this.editor = editor;
	}

	void saveBackup() {
    	this.backup = editor.text;
    }

	void undo() {
		editor.text = backup;
	}

	abstract void execute();
    
}
