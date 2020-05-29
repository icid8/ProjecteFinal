package com.example.dfc;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class objEntrenament {
    String nom, nsetmanes, dilluns, diamrts, dimecres,dijous, divendres,dissabte,diumenge;

    public objEntrenament() {

    }

    public objEntrenament( String nom, String nsetmanes, String dilluns, String diamrts, String dimecres, String dijous, String divendres, String dissabte, String diumenge ) {


        this.nom = nom;
        this.nsetmanes = nsetmanes;
        this.dilluns = dilluns;
        this.diamrts = diamrts;
        this.dimecres = dimecres;
        this.dijous = dijous;
        this.divendres = divendres;
        this.dissabte = dissabte;
        this.diumenge = diumenge;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDilluns() {
        return dilluns;
    }

    public void setDilluns(String dilluns) {
        this.dilluns = dilluns;
    }

    public String getDiamrts() {
        return diamrts;
    }

    public void setDiamrts(String diamrts) {
        this.diamrts = diamrts;
    }

    public String getDimecres() {
        return dimecres;
    }

    public void setDimecres(String dimecres) {
        this.dimecres = dimecres;
    }

    public String getDijous() {
        return dijous;
    }

    public void setDijous(String dijous) {
        this.dijous = dijous;
    }

    public String getDivendres() {
        return divendres;
    }

    public void setDivendres(String divendres) {
        this.divendres = divendres;
    }

    public String getDissabte() {
        return dissabte;
    }

    public void setDissabte(String dissabte) {
        this.dissabte = dissabte;
    }

    public String getDiumenge() {
        return diumenge;
    }

    public void setDiumenge(String diumenge) {
        this.diumenge = diumenge;
    }

    public String getNsetmanes() {
        return nsetmanes;
    }

    public void setNsetmanes(String nsetmanes) {
        this.nsetmanes = nsetmanes;
    }

}
