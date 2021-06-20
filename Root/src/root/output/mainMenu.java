package root.output;

import root.interfaces.menu;
import java.util.ArrayList;


public class mainMenu implements menu {

    private ArrayList<String>mainMenuList = new ArrayList<>();
    ArrayList <String> mainMenu = null;

    private void createMainMenu() {
        mainMenuList.add("a:Create target");
        mainMenu = new ArrayList<>(mainMenuList);
    }


    @Override
    public ArrayList get() {
        createMainMenu();
        return mainMenu;
    }
}
