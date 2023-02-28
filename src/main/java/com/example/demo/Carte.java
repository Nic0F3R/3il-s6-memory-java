package com.example.demo;

/**
 * Classe Carte (modèle MVC) permettant de stocker les infomations d'une carte du jeu Memory
 *
 * @since le 28/02/2023
 * @version le 02/2023
 *
 * @author Nicolas Ferrayé - 3iL
 */
public class Carte {

    private int idCarte;
    private String nomCarte;

    /**
     * @param pfIdCarte l'identifiant de la carte
     * @param pfNomCarte le nom de la carte
     */
    public Carte(int pfIdCarte, String pfNomCarte) {
        this.idCarte = pfIdCarte;
        this.nomCarte = pfNomCarte;
    }

    /**
     * @return l'identifiant de la carte
     */
    public int getIdCarte() {
        return this.idCarte;
    }

    /**
     * @return le nom de la carte
     */
    public String getNomCarte() {
        return this.nomCarte;
    }

    /**
     * @param pfIdCarte l'identifiant de la carte
     */
    public void setIdCarte(int pfIdCarte) {
        this.idCarte = pfIdCarte;
    }

    /**
     * @param pfNomCarte le nom de la carte
     */
    public void setNomCarte(String pfNomCarte) {
        this.nomCarte = pfNomCarte;
    }

}
