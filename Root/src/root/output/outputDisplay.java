package root.output;

import root.input.keyboardInput;

public class outputDisplay {

  public static void output(){
      mainMenu mainMenu = new mainMenu();
      keyboardInput keyboardInput = new keyboardInput();
      System.out.println(mainMenu.get());
      System.out.println("Enter letter point menu or number target");
      keyboardInput.getInputDataKeyboard();

  }

}
