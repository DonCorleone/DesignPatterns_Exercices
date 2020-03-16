package com.codewithmosh.template;

/**
 * WindowX
 */
public class WindowY extends WindowBase {

    @Override
    protected void beforeClose(){

        System.out.println("Executing Pre-Close Operations Window Y");
    }

    @Override
    protected void afterClose() {

        System.out.println("Executing After-Close Operations Window Y"); 
    }
}