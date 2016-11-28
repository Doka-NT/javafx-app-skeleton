package com.skobka.mdesk;

import com.skobka.mdesk.controller.MainController;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AppModule.class})
interface AppComponent {
    MainController getMainController();
}
