package core.output;

import core.interfaces.menu;
import java.util.ArrayList;
import java.util.List;

public class mainMenu implements menu {

    private List<String> mainMenuList = new ArrayList<>();

    private void createMainMenu() {
        mainMenuList.add("Create target");
    }

    @Override
    public List get() {
        createMainMenu();
        return mainMenuList;
    }
}
