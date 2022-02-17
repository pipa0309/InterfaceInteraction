package oopInterconectionBetweenClasses;

public class Human implements Participant {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void take() {
    }

    @Override
    public String toString() {
        return "Human {" +
                "name='" + name + '\'' +
                '}';
    }
}
