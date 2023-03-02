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

    // Identifiant non unique déterminant le type de la carte (pour déclarer la paire)
    private int typeCarte;

    private String nomCarte;

    /**
     * @param pfIdCarte l'identifiant de la carte
     * @param pfNomCarte le nom de la carte
     */
    public Carte(int pfIdCarte, int pfTypeCarte, String pfNomCarte) {
        //TODO : vérifier si idCarte est un integer > 0
        this.idCarte = pfIdCarte;
        this.nomCarte = pfNomCarte;
        this.typeCarte = pfTypeCarte;
    }

    /**
     * @return l'identifiant de la carte
     */
    public int getIdCarte() {
        return this.idCarte;
    }

    /**
     * @return le type de la carte
     */
    public int getTypeCarte() {
        return this.typeCarte;
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
     * @param pfTypeCarte le type de la carte
     */
    public void setTypeCarte(int pfTypeCarte) {
        this.typeCarte = pfTypeCarte;
    }

    /**
     * @param pfNomCarte le nom de la carte
     */
    public void setNomCarte(String pfNomCarte) {
        this.nomCarte = pfNomCarte;
    }

}
