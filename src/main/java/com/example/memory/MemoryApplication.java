package com.example.memory;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Classe de lancement du jeu Memory
 *
 * @author Nicolas Ferrayé - 3iL
 *
 * @since le 28/02/2023
 * @version le 02/03/2023
 */
public class MemoryApplication extends Application {

    private ObservableList<Carte> listeCarte; // Liste des cartes
    private int nbCarte; // Nombre de cartes dans la partie (doit être un nombre pair positif)

    /**
     * Fonction de lancement de l'interface
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MemoryApplication.class.getResource("memory-application-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 400);
        stage.setTitle("Memory - Ferrayé");
        stage.setScene(scene);
        stage.show();

        this.listeCarte = FXCollections.observableArrayList();

        creerCarte(9);
    }

    /**
     * Permet de créer la carte à partir d'un nombre de carte
     *
     * @param pfNbCarte le nombre de carte (doit être un nombre pair positif)
     */
    public void creerCarte(int pfNbCarte) {

        // TODO : vérifier si le nombre de carte est positif et pair

        this.nbCarte = 16;
        int typeCarte = 0; // permet de déclarer les paires

        for(int i = 0 ; i < this.nbCarte ; i++) {

            if(i % 2 == 0) {
                typeCarte++;
            }

            Carte maCarte = new Carte(i, typeCarte, "");
            listeCarte.add(maCarte);

        }

        System.out.println(this.afficherListeCarte());

    }

    /**
     * @return la chaîne de caractères des valeurs de la liste de cartes
     */
    public String afficherListeCarte() {

        String res = "";

        for(Carte c : this.listeCarte) {
            res += c.getIdCarte() + "->" + c.getTypeCarte() + "->" + c.getNomCarte() + " ; ";
        }

        return res;
    }

    public static void main(String[] args) {
        launch();
    }
}