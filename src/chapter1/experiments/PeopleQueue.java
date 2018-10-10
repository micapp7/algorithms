package chapter1.experiments;

import chapter1.queue.Queue;

public class PeopleQueue {
    public static void main(String[] args) {
        Queue<String> lineOfPeople = new Queue<>();
        lineOfPeople.enqueue("Tasha");
        lineOfPeople.enqueue("Justin");
        lineOfPeople.enqueue("Jace");
        lineOfPeople.enqueue("Coco");
        lineOfPeople.enqueue("Tyrone");


        System.out.println("Line of people");
        for (String person : lineOfPeople) {
            System.out.println(person);
        }

        System.out.println("Check if Coco is in this line");
        System.out.println(isPersonInLine(lineOfPeople, "jace"));
    }

    private static boolean isPersonInLine(Queue<String> queue, String search) {
        for (String person : queue) {
            if (person.equalsIgnoreCase(search)) {
                return true;
            }
        }

        return false;
    }
}
