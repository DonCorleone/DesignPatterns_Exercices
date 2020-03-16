package com.codewithmosh.template;

/**
 * WindowX
 */
public class WindowX extends WindowBase {

    @Override
    protected void beforeClose(){

        System.out.println("Executing Pre-Close Operations Window X");
    }

    @Override
    protected void afterClose() {

        System.out.println("Executing After-Close Operations Window X"); 
    }
}