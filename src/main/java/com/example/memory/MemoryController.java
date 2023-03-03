package com.example.memory;

import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

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
    private VBox root;

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;
    @FXML
    private Button btn13;
    @FXML
    private Button btn14;
    @FXML
    private Button btn15;
    @FXML
    private Button btn16;

    private int nbCarteRetournee; // nombre de carte(s) retournée(s)
    private Carte carte1; // première carte retournée
    private Carte carte2; // seconde carte retournée
    private int nbCarteTrouvees; // nombre de cartes trouvées. Si == 16 -> partie gagnée

    @FXML
    protected void actionBouton(ActionEvent evt) {

        if(evt.getSource() instanceof Button) {

            Button btn = (Button) evt.getSource();

            if(btn.getId().equals("btn1")) {
                jouer("btn1");
            }

            if(btn.getId().equals("btn2")) {
                jouer("btn2");
            }

            if(btn.getId().equals("btn3")) {
                jouer("btn3");
            }

            if(btn.getId().equals("btn4")) {
                jouer("btn4");
            }

            if(btn.getId().equals("btn5")) {
                jouer("btn5");
            }

            if(btn.getId().equals("btn6")) {
                jouer("btn6");
            }

            if(btn.getId().equals("btn7")) {
                jouer("btn7");
            }

            if(btn.getId().equals("btn8")) {
                jouer("btn8");
            }

            if(btn.getId().equals("btn9")) {
                jouer("btn9");
            }

            if(btn.getId().equals("btn10")) {
                jouer("btn10");
            }

            if(btn.getId().equals("btn11")) {
                jouer("btn11");
            }

            if(btn.getId().equals("btn12")) {
                jouer("btn12");
            }

            if(btn.getId().equals("btn13")) {
                jouer("btn13");
            }

            if(btn.getId().equals("btn14")) {
                jouer("btn14");
            }

            if(btn.getId().equals("btn15")) {
                jouer("btn15");
            }

            if(btn.getId().equals("btn16")) {
                jouer("btn16");
            }

        }

    }

    @FXML
    private void reload() throws Exception {
        Scene scene = root.getScene();
        scene.setRoot(FXMLLoader.load(this.getClass().getResource("memory-application-view.fxml")));
    }

    /**
     * Fonction d'initialisation du contrôleur
     */
    @FXML
    public void initialize() throws Exception {
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

        this.nbCarteRetournee = 0;
        this.nbCarteTrouvees = 0;

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

    /**
     * Permet de retourner la carte
     *
     * @param pfIdCarteInterface id du bouton cliqué par l'utilisateur
     */
    public void jouer(String pfIdCarteInterface) {

        if(this.nbCarteRetournee == 0) {
            Button btn = (Button) this.getById(pfIdCarteInterface);

            for(Carte c : this.listeCarte) {
                if(c.getIdCarteInterface().equals(pfIdCarteInterface)) {
                    this.carte1 = c;
                    btn.setText(Integer.toString(c.getTypeCarte())); // retourne la carte
                    this.nbCarteRetournee++;
                }
            }

            System.out.println("j'ai joué");
        } else if(this.nbCarteRetournee == 1) {
            Button btn = (Button) this.getById(pfIdCarteInterface);

            for(Carte c : this.listeCarte) {
                if(c.getIdCarteInterface().equals(pfIdCarteInterface)) {
                    this.carte2 = c;
                    btn.setText(Integer.toString(c.getTypeCarte())); // retourne la carte
                }
            }

            if(carte1.getTypeCarte() == carte2.getTypeCarte()) {

                Button btnCarte1 = (Button) this.getById(carte1.getIdCarteInterface());

                this.carte1 = null;
                this.carte2 = null;



                btn.setDisable(true);
                btnCarte1.setDisable(true);
                //btn.setStyle("-fx-border-color: #75975e;");

                this.nbCarteRetournee = 0;
                this.nbCarteTrouvees++;
            } else {
                // délais puis retourne la carte

                Button btnCarte1 = (Button) this.getById(carte1.getIdCarteInterface());

                btn.setText("?");
                btnCarte1.setText("?");



                this.carte1 = null;
                this.carte2 = null;

                this.nbCarteRetournee = 0;
            }

        }

    }

    private Node getById(String id) {
        Scene scene = root.getScene();
        return scene.lookup("#" + id);
    }

}