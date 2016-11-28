package com.skobka.mdesk;

import com.skobka.mdesk.controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        MainController controller = App.getComponent().getMainController();
        stage = controller.createStage();
        stage.setResizable(false);
        stage.show();
    }
}
