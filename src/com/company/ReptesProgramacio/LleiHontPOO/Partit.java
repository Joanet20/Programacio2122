package com.company.ReptesProgramacio.LleiHontPOO;

public class Partit {

    private String nom;
    private int vots;
    private int escons;
    private boolean participa;

    public Partit(String nom, int vots, int escons, boolean participa) {
        this.nom = nom;
        this.vots = vots;
        this.escons = escons;
        this.participa = participa;
    }

    public String getNom() {
        return nom;
    }


    public int getVots() {
        return vots;
    }

    public boolean isParticipa() {
        return participa;
    }

    public void setParticipa(boolean participa) {
        this.participa = participa;
    }
}
