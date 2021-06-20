package root.data;

import java.util.HashMap;
import java.util.Scanner;

public class target {

    private HashMap<Integer, step> collectionsStep = new HashMap<>();;
    private String nameStep;
    private step goalStep;
    private int numberStep = 0;
    Scanner scannerKeyboard = new Scanner(System.in);

    public void outOnDisplay (){
        System.out.println(collectionsStep);
    }

    public void addStep () {
        nameStep = nameStepIn();
        goalStep = new step(nameStep);
        collectionsStep.put(numberStep,goalStep);
        countNumberStep();
    }

    public void finishedStep (){goalStep.setFinishedStep();}

    public void editNameStep (){
        nameStep = nameStepIn();
        goalStep.setName(nameStep);
    }

    public String nameStepIn (){
        String name;
        System.out.println("Enter name step");
        name = scannerKeyboard.nextLine();
        return name;
    }

    private void countNumberStep(){numberStep++;}

}
