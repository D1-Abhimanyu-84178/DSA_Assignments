package com.sunbeam.SinglyCircular;

import java.util.Scanner;

public class SinglyCircularTailMain {

	public static void main(String[] args) {
        List l1 = new List();
        Scanner scanner = new Scanner(System.in);
        int choice;
        int value;
        int position;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Delete First");
            System.out.println("4. Delete Last");
            System.out.println("5. Add at Position");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Enter after given node");
            System.out.println("9. Enter before given node");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a character to add at the first position: ");
                    value = scanner.nextInt();
                    l1.addFirst(value);
                    break;
                case 2:
                    System.out.print("Enter a character to add at the last position: ");
                    value = scanner.nextInt();
                    l1.addLast(value);
                    break;
                case 3:
                    l1.deleteFirst();
                    break;
                case 4:
                    l1.deleteLast();
                    break;
                case 5:
                    System.out.print("Enter a character to add: ");
                    value = scanner.nextInt();
                    System.out.print("Enter the position: ");
                    position = scanner.nextInt();
                    l1.addPosition(value, position);
                    break;
                case 6:
                    System.out.print("Enter the position to delete: ");
                    position = scanner.nextInt();
                    l1.deletePosition(position);
                    break;
                case 7:
                    l1.display();
                    break;
                case 8:
                	System.out.println("Enter the no to add: ");
                	value = scanner.nextInt();
                	System.out.println("Enter the position: ");
                	position = scanner.nextInt();
                    l1.insertAfterNode(value, position);
                    break;
                case 9:
                	System.out.println("Enter the no to add: ");
                	value = scanner.nextInt();
                	System.out.println("Enter the position: ");
                	position = scanner.nextInt();
                    l1.insertBeforeNode(value, position);
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}

