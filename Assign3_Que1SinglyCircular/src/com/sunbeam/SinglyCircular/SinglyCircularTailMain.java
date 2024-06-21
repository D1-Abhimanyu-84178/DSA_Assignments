package com.sunbeam.SinglyCircular;
//
//public class SinglyCircularTailMain {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        List l1 = new List();
//        
//		
//		l1.addFirst('N');
//		l1.addFirst('U');
//		l1.addFirst('S');
//		l1.addLast('B');
//		l1.addLast('E');
//		l1.addLast('A');
//		l1.addLast('M');
////
////		l1.deleteFirst();
////		l1.deleteLast();
//		l1.addPosition('@', 8);
//		l1.deletePosition(7);
//		l1.display();
//	}
//
//}

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
            System.out.println("8. Exit");
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
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
