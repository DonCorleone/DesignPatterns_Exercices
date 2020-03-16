package com.codewithmosh.command;

public class ContrastCommand extends AbstractUndoableCommand {

    private float prevContrast;
    private float contrast;

    public ContrastCommand (float contrast, History history, VideoEditor videoEditor) {
        super(history, videoEditor);

        this.prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    public void undo() {
       super.videoEditor.setContrast(prevContrast);
    }

    @Override
    protected void doExecute() {
        super.videoEditor.setContrast(contrast);
    }
}
