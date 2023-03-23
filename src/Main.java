import Objects.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new List();

        System.out.println("===================================");
        System.out.println(" Single Linked List Implementation ");
        System.out.println("===================================");
        System.out.println("Choose class to use:");
        System.out.println("1. Animals");
        System.out.println("2. Fruits");
        System.out.println("3. Heroes");
        System.out.println("4. Planets");
        System.out.println("5. Vehicles");
        System.out.print("Choose an option: ");
        int class_opt = Integer.parseInt(scanner.next());

        if (class_opt > 5 || class_opt < 1) {
            System.out.println("Invalid option");
            System.exit(0);
        }

        System.out.println("===================================");
        System.out.println(" Single Linked List Implementation ");
        System.out.println("===================================");
        System.out.println("Choose an option:");
        System.out.println("1. Add first");
        System.out.println("2. Add last");
        System.out.println("3. Add at index");
        System.out.println("4. Remove first");
        System.out.println("5. Remove last");
        System.out.println("6. Remove at index");
        System.out.println("7. Print list");
        System.out.print("Choose an option: ");
        int option = Integer.parseInt(scanner.next());

        do{
            switch (class_opt) {
                case 1 -> list.setClassInstance(new Animals());
                case 2 -> list.setClassInstance(new Fruits());
                case 3 -> list.setClassInstance(new Heroes());
                case 4 -> list.setClassInstance(new Planets());
                case 5 -> list.setClassInstance(new Vehicles());
            }

            System.out.println("===================================");
            switch (option) {
                case 1 -> list.addFirst();
                case 2 -> list.addLast();
                case 3 -> {
                    System.out.print("Input index: ");
                    int index = Integer.parseInt(scanner.next());
                    list.add(index);
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> {
                    System.out.print("Input index: ");
                    int index2 = Integer.parseInt(scanner.next());
                    list.remove(index2);
                }
                case 7 -> list.print();
                default -> System.out.println("Invalid option");
            }

            System.out.print("Continue? (y/n): ");
            String continueOption = scanner.next();
            if (continueOption.equalsIgnoreCase("y") || continueOption.isBlank() || continueOption.isEmpty()) {
                System.out.print("Choose an option: ");
                option = Integer.parseInt(scanner.next());
            } else {
                option = 0;
            }
        } while (option != 0);
    }
}
