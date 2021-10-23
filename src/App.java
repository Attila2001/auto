/*
 * File: App.java
 * Created Date: 2021-09-24 22:18:18
 * Author: Sallai Andras
 * Github: https://github.com/Attila2001
 * -----
 * Last Modified: 2021-10-15
 * Modified By: Jakab Attila
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 */

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        MainWindow mainWindow = new MainWindow();
        new MainController(mainWindow);
        mainWindow.setVisible(true);
    }
}
