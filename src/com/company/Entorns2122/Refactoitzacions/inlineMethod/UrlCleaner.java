package com.company.Entorns2122.Refactoitzacions.inlineMethod;

public class UrlCleaner {

    public String clean(String title) {

        return title.replaceAll("[\\s]+", " ").replaceAll("[\\s]", "-").replaceAll("[\\.\\:\\,\\?\\!\\_\\;]", "").trim().toLowerCase();
    }


}
