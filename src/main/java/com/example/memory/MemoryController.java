package com.example.memory;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Contrôleur (modèle MCV) de l'interface memory-application-view.fxml du jeu Memory
 *
 * @author Nicolas Ferrayé - 3iL
 *
 * @since le ../02/2023
 * @version le ../02/2023
 */
public class MemoryController {
    @FXML
    private Button btn1;

    @FXML
    protected void actionBouton(ActionEvent evt) {

        if(evt.getSource() instanceof Button) {
            Button btn = (Button) evt.getSource();
            if(btn.getId().equals("btn01")) {
                System.out.println("C'est mon bouton\n");
            }
        }

    }
}