package com.company.ExercicisCurs2122.Excepcions;

public class DivideBy2Exception extends Exception{

    public DivideBy2Exception(){

    }

    public DivideBy2Exception(String message){
        System.out.println(message);
    }

    public DivideBy2Exception(Throwable cause){

    }

    public DivideBy2Exception(String message, Throwable cause){

    }

    public DivideBy2Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
