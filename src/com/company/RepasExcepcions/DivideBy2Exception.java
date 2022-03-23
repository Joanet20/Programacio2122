package com.company.RepasExcepcions;

//Punt 14 - Reforç excepcions
public class DivideBy2Exception extends Exception{

    public DivideBy2Exception() {
    }
    public DivideBy2Exception(String message) {
        super(message);
    }
    public DivideBy2Exception(Throwable cause) {
        super(cause);
    }
    public DivideBy2Exception(String message, Throwable cause) {
        super(message, cause);
    }
    public DivideBy2Exception(String message, Throwable cause,
                              boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
