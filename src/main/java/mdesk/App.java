package com.skobka.mdesk;

import javafx.application.Application;

public class App {
    public static void main(String[] args) {
        Application.launch(JavaFxApplication.class, args);
    }

    static AppComponent getComponent() {
        return DaggerAppComponent.create();
    }
}
