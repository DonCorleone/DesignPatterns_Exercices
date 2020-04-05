package com.codewithmosh.mediator;

public class TextBox extends UIControl {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        System.out.println("Content set '" + content + "'");
        notifyEventHandlers();
    }
}
