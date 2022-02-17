package oopInterconectionBetweenClasses;

public class WorkClass {
    public static void main(String[] args) {

        Participant[] participants = {
                new Human("Человек1"),
                new Human("Человек2")
        };

        Subject[] subjects = {
                new Cup("Чашка1"),
                new Cup("Чашка2")
        };

        for (int i = 0; i < subjects.length; i++) {
            for (int j = 0; j < participants.length; j++) {
                subjects[i].interact(participants[j]);
            }
        }
    }
}
