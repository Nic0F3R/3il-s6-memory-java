package com.example.memory;

/**
 * Classe Carte (modèle MVC) permettant de stocker les infomations d'une carte du jeu Memory
 *
 * @author Nicolas Ferrayé - 3iL
 *
 * @since le 28/02/2023
 * @version le ../02/2023
 */
public class Carte {

    private int idCarte;
    private String nomCarte;

    /**
     * @param pfIdCarte l'identifiant de la carte
     * @param pfNomCarte le nom de la carte
     */
    public Carte(int pfIdCarte, String pfNomCarte) {
        //TODO : vérifier si idCarte est un integer > 0
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
        //TODO : vérifier si idCarte est un integer > 0
        this.idCarte = pfIdCarte;
    }

    /**
     * @param pfNomCarte le nom de la carte
     */
    public void setNomCarte(String pfNomCarte) {
        this.nomCarte = pfNomCarte;
    }

}
