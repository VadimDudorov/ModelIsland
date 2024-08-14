package modelIsland;

import modelIsland.app.Application;
import modelIsland.controller.MainController;
import modelIsland.view.SwingView;
import modelIsland.view.View;

public class Main {
    public static void main(String[] args) {
        View swingView = new SwingView();
        MainController mainController = new MainController(swingView);
        Application application = new Application(mainController);
        application.run();
        }
    }