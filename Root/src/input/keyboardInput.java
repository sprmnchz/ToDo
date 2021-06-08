package input;

import interfaces.InputDataKeyboard;

import java.util.Scanner;

public class keyboardInput implements InputDataKeyboard {

    private String inputKeyboardBuffer;
    static String returnStringBuffer;

    private void scannerKeyboard() {
        Scanner scannerKeyboard = new Scanner(System.in);
        inputKeyboardBuffer = scannerKeyboard.nextLine();
        returnStringBuffer = inputKeyboardBuffer;
    }


    @Override
    public String getInputDataKeyboard() {
        scannerKeyboard();
        return returnStringBuffer;
    }
}
