package root.data;

public class step {

    private String name;
    private boolean finished;

    public step (String nameStep) {
        name = nameStep;
        finished = false;
    }

    public void setFinishedStep(){finished = true;}

    public void setName(String nameStep){name = nameStep;}

}
