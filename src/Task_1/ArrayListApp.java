package Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Task_1.Helm.Material;

public class ArrayListApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Material> materialList = new ArrayList<Material>();

		for (Material material : Material.values()) {
			materialList.add(material);
		}

		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {
				// Car[][] arrayOfCars = new Car[getRandomValueFromRange(3,
				// 10)][getRandomValueFromRange(3, 10)];
				List<Car> carsList1 = new ArrayList<Car>();
				for (int i = 0; i < getRandomValueFromRange(3, 10); i++) {
					List<Car> carsList2 = new ArrayList<Car>();
					for (int j = 0; j < getRandomValueFromRange(3, 10); j++) {
						carsList2.add(new Car(getRandomValueFromRange(100, 300), getRandomValueFromRange(1950, 2020),
								new Helm(getRandomValueFromRange(30, 50),
										materialList.get(getRandomValueFromRange(0, materialList.size() - 1))),
								new Engine(getRandomValueFromRange(2, 12))));
					}
					carsList1.addAll(carsList2);
				}

				System.out.println(carsList1);

				break;
			}

			case "2": {
				Car randomCar = new Car(getRandomValueFromRange(100, 300), getRandomValueFromRange(1950, 2020),
						new Helm(getRandomValueFromRange(30, 50),
								materialList.get(getRandomValueFromRange(0, materialList.size() - 1))),
						new Engine(getRandomValueFromRange(2, 12)));

				List<Car> carsList1 = new ArrayList<Car>();

				for (int i = 0; i < getRandomValueFromRange(3, 10); i++) {
					carsList1.add(randomCar);
				}

				System.out.println(carsList1);

				break;
			}

			default: {
				System.out.println("Введіть число 1 або 2!");

				break;
			}

			}
		}
	}

	static void menu() {
		System.out.println("Натисніть 1, щоб вивести масив автомобілів");
		System.out.println("Натисніть 2, щоб заповнити масив одним видом автомобіля");
	}

	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}

}
