package com.codewithmosh.command;

import com.codewithmosh.command.Fx.History;
import com.codewithmosh.command.Fx.UndoableCommand;

public abstract class AbstractUndoableCommand implements UndoableCommand {

    protected History history;
    protected VideoEditor videoEditor;

    public AbstractUndoableCommand(History history, VideoEditor videoEditor) {

        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
