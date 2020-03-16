package com.codewithmosh.command;

public class Demo {
    public static void show(){
        History history = new History();
        VideoEditor videoEditor = new VideoEditor();

        ContrastCommand contrastCommand = new ContrastCommand((float) 0.7, history, videoEditor);
        TextCommand textCommand = new TextCommand("Hello Video", history, videoEditor);

        System.out.println(videoEditor);

        contrastCommand.doExecute();

        System.out.println(videoEditor);

        textCommand.doExecute();

        System.out.println(videoEditor);

        contrastCommand.undo();

        System.out.println(videoEditor);

        textCommand.undo();

        System.out.println(videoEditor);
    }
}
