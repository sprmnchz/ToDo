package root.output;

import root.input.keyboardInput;

public class outputDisplay {

    private String inputData;

  public void output(){
      mainMenu mainMenu = new mainMenu();
      keyboardInput keyboardInput = new keyboardInput();
      System.out.println(mainMenu.get());
      System.out.println("Enter letter point menu or number target");
      inputData = keyboardInput.getInputDataKeyboard();

  }

}
