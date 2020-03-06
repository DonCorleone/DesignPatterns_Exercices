package com.codewithmosh.memento;

import com.codewithmosh.memento.History;
import com.codewithmosh.memento.Document;
/**
 * Demo
 */
public class Demo {

    public static void show() {
        History history = new History();

        Document doc = new Document();

        doc.setContent("Ole");
        doc.setFontName("Helvetica");
        doc.setFontSize(12);

        history.push(doc.createState());
        System.out.println(doc); 

        doc.setContent("OleOle");
        doc.setFontName("Helvetica Neue");

        System.out.println(doc); 
        history.push(doc.createState());

        doc.setFontSize(14);
        history.push(doc.createState());

        System.out.println(doc); 

        doc.restore(history.pop());

        System.out.println(doc); 
    }
}