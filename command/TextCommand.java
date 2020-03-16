package com.codewithmosh.command;

import com.codewithmosh.command.Fx.History;

public class TextCommand extends AbstractUndoableCommand {

    private String text;

    public TextCommand(String text, History history, VideoEditor videoEditor) {
        super(history, videoEditor);

        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
