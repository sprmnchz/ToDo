package root.output;

import root.interfaces.menu;
import java.util.ArrayList;
import java.util.List;

public class mainMenu implements menu {

    private List<String> mainMenuList = new ArrayList<>();
    List <String> mainMenu = null;

    private void createMainMenu() {
        mainMenuList.add("Create target");
        mainMenu = new ArrayList<>(mainMenuList);
    }


    @Override
    public List get() {
        createMainMenu();
        return mainMenu;
    }
}
