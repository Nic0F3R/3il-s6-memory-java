package com.example.memory;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.*;

/**
 * Contrôleur (modèle MCV) de l'interface memory-application-view.fxml du jeu Memory
 *
 * @author Nicolas Ferrayé - 3iL
 *
 * @since le 02/03/2023
 * @version le 03/03/2023
 */
public class MemoryController {

    //private ObservableList<Carte> listeCarte; // Liste des cartes
    private List<Carte> listeCarte;
    private int nbCarte; // Nombre de cartes dans la partie (doit être un nombre pair positif)

    @FXML
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;
    private Button btn16;


    @FXML
    protected void actionBouton(ActionEvent evt) {

        if(evt.getSource() instanceof Button) {

            Button btn = (Button) evt.getSource();

            if(btn.getId().equals("btn1")) {
                jouer();
            }

        }

    }

    /**
     * Fonction d'initialisation du contrôleur
     */
    @FXML
    public void initialize() {
        //todo

        /*
        listeCarte = new ObservableList<Carte>() {
            @Override
            public void addListener(ListChangeListener<? super Carte> listChangeListener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super Carte> listChangeListener) {

            }

            @Override
            public boolean addAll(Carte... cartes) {
                return false;
            }

            @Override
            public boolean setAll(Carte... cartes) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends Carte> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Carte... cartes) {
                return false;
            }

            @Override
            public boolean retainAll(Carte... cartes) {
                return false;
            }

            @Override
            public void remove(int i, int i1) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Carte> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Carte carte) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Carte> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Carte> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Carte get(int index) {
                return null;
            }

            @Override
            public Carte set(int index, Carte element) {
                return null;
            }

            @Override
            public void add(int index, Carte element) {

            }

            @Override
            public Carte remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Carte> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Carte> listIterator(int index) {
                return null;
            }

            @Override
            public List<Carte> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener invalidationListener) {

            }

            @Override
            public void removeListener(InvalidationListener invalidationListener) {

            }
        };

        */

        this.listeCarte = new ArrayList<Carte>();

        creerPartie(16);
    }

    /**
     * Permet de créer la partie à partir d'un nombre de carte
     *
     * @param pfNbCarte le nombre de carte (doit être un nombre pair positif)
     */
    public void creerPartie(int pfNbCarte) {

        // TODO : vérifier si le nombre de carte est positif et pair

        this.nbCarte = pfNbCarte;
        int typeCarte = 0; // permet de déclarer les paires
        int i;

        for(i = 0 ; i < this.nbCarte ; i++) {

            if(i % 2 == 0) {
                typeCarte++;
            }

            Carte maCarte = new Carte(i, typeCarte, "");
            this.listeCarte.add(maCarte);

        }

        i = 0;

        // Mélange de manière aléatoire (pas encore) les identifiants des boutons de l'interface avec l'identifiant des cartes
        for(Carte c : this.listeCarte) {
            i++;
            c.setIdCarteInterface("btn" + i);
        }

        System.out.println(this.afficherListeCarte());
    }

    /**
     * @return la chaîne de caractères des valeurs de la liste de cartes
     */
    public String afficherListeCarte() {

        String res = "";

        for(Carte c : this.listeCarte) {
            res += "ID:" + c.getIdCarte() + ";IDint:" + c.getIdCarteInterface() + ";TYP:" + c.getTypeCarte() + ";NOM:" + c.getNomCarte() + ";\n";
        }

        return res;
    }

    public void jouer() {
        System.out.println("j'ai joué");
    }

}