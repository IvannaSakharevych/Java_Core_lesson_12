package Task_3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayListApp {

	public static void main(String[] args) {

		List myArrayList = new ArrayList();
		myArrayList.add("Anna");
		myArrayList.add("Ivanna");
		myArrayList.add("Olia");

		while (true) {
			System.out.println("press 1 to add new element " + "\npress 2 to delete some element"
					+ "\npress 3 to see all elements");
			Scanner scanner = new Scanner(System.in);
			switch (scanner.next()) {

			case "1": {

				System.out.println("Enter new element :");
				scanner = new Scanner(System.in);
				String newElement = scanner.next();

				myArrayList.add(newElement);

				break;
			}

			case "2": {

				System.out.println("Enter what element delete (number):");
				scanner = new Scanner(System.in);
				int deleteElement = scanner.nextInt();

				for (int i = 0; i < myArrayList.size(); i++) {
					if (i == deleteElement) {
						myArrayList.remove(i);
					}
				}

				break;
			}

			case "3": {

				for (Object o : myArrayList) {
					System.out.println(o);
				}

				break;
			}

			}

		}
	}

}
