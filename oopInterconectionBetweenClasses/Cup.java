package oopInterconectionBetweenClasses;

public class Cup implements Subject {
    private final String name;

    public Cup(String name) {
        this.name = name;
    }

    @Override
    public void interact(Participant participant) {
        System.out.printf("%s провзаимодействовал с %s\n", this.name, participant);
    }
}
