package com.skobka.mdesk.controller;

import com.skobka.javafx.AbstractFXMLViewController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Soshnikov Artem <213036@skobka.com>
 *         Created at 28.11.16.
 */
public class MainController extends AbstractFXMLViewController {
    @FXML
    public Button button1;

    @Inject
    public MainController() {
    }

    @Override
    protected URL getFxmlResourceUrl() {
        return getClass().getClassLoader().getResource("views/main.fxml");
    }

    @Override
    protected ResourceBundle getFxmlResourceBundle() {
        return null;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
