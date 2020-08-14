package Task_2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListApp {

	enum Seasons {

		WINTER, SPRING, SUMMER, FALL;

	}

	enum Months {

		JANUARY(31, Seasons.WINTER), 
		FEBRUARY(28, Seasons.WINTER), 
		MARCH(31, Seasons.SPRING), 
		APRIL(30, Seasons.SPRING),
		MAY(31, Seasons.SPRING), 
		JUNE(30, Seasons.SUMMER), 
		JULY(31, Seasons.SUMMER), 
		AUGUST(31, Seasons.SUMMER),
		SEPTEMBER(30, Seasons.FALL), 
		OCTOBER(31, Seasons.FALL), 
		NOVEMBER(30, Seasons.FALL),
		DECEMBER(31, Seasons.WINTER);

		private int days;
		Seasons season;

		Months(int days, Seasons season) {
			this.days = days;
			this.season = season;
		}

		public int getDays() {
			return days;
		}

		public Seasons getSeason() {
			return season;
		}

	}
	
	
	public static void main(String[] args) {

		List<Months> monthsList = Arrays.asList(Months.values());
//		List<Months> monthsList = new ArrayList<Months>();
//		for (Months months : Months.values()) {
//			monthsList.add(months);
//		}
		
		List<Seasons> seasonsList = Arrays.asList(Seasons.values());
//		List<Seasons> seasonsList = new ArrayList<Seasons>();
//		for (Seasons seasons : Seasons.values()) {
//			seasonsList.add(seasons);
//		}
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {
				System.out.println("������ ����� �����");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.name().equals(month)) {
						System.out.println("����� ����� ��������");
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("����� ����� �� ��������");
				}

				break;
			}

			case "2": {
				System.out.println("������ ���� ����");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.getSeason().name().equals(season)) {
						flag = true;
					}

				}

				if (flag) {
					Seasons seasonsValue = Seasons.valueOf(season);
					for (Months m2 : monthsList) {
						if (m2.getSeason().toString().equalsIgnoreCase(season)) {
							System.out.println(m2);
						}
					}

				}

				if (!flag) {
					System.out.println("���� ���� �� ��������");
				}

				break;
			}

			case "3": {
				System.out.println("������ ������� ���");
				scanner = new Scanner(System.in);
				int days = scanner.nextInt();

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.getDays() == days) {
						System.out.println(m.name());
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("̳����� � ����� ������� ��� �� ��������");
				}

				break;
			}

			case "4": {
				System.out.println("������ ������� ���");
				scanner = new Scanner(System.in);
				int days = scanner.nextInt();

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.getDays() < days) {
						System.out.println(m.name());
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("̳����� � ����� ������� ��� �� ��������");
				}

				break;
			}

			case "5": {
				System.out.println("������ ������� ���");
				scanner = new Scanner(System.in);
				int days = scanner.nextInt();

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.getDays() > days) {
						System.out.println(m.name());
						flag = true;
					}

				}

				if (!flag) {
					System.out.println("̳����� � ����� ������� ��� �� ��������");
				}

				break;
			}

			case "6": {
				System.out.println("������ ���� ����");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : seasonsList) {
					if (s.name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("�������� ���� ���� - ");
					Seasons seasonsValue6 = Seasons.valueOf(season);
					int ordinal = seasonsValue6.ordinal();
					if (ordinal == (seasonsList.size() - 1)) {
						ordinal = 0;
						System.out.println(seasonsList.get(ordinal));
					} else {
						System.out.println(seasonsList.get(ordinal + 1));
					}

				}

				if (!flag) {
					System.out.println("���� ���� �� ��������");
				}

				break;
			}

			case "7": {
				System.out.println("������ ���� ����");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : seasonsList) {
					if (s.name().equals(season)) {
						flag = true;
					}
				}

				if (flag) {
					System.out.println("��������� ���� ���� - ");
					Seasons seasonsValue7 = Seasons.valueOf(season);
					int ordinal = seasonsValue7.ordinal();
					if (ordinal == 0) {
						ordinal = (seasonsList.size() - 1);
						System.out.println(seasonsList.get(ordinal));
					} else {
						System.out.println(seasonsList.get(ordinal - 1));
					}

				}

				if (!flag) {
					System.out.println("���� ���� �� ��������");
				}

				break;
			}

			case "8": {
				System.out.println("̳����, �� ����� ����� ������� ���");
				// scanner = new Scanner(System.in);

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m.name());
						flag = true;
					}

				}

				break;
			}

			case "9": {
				System.out.println("̳����, �� ����� ������� ������� ���");
				// scanner = new Scanner(System.in);

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.getDays() % 2 != 0) {
						System.out.println(m.name());
						flag = true;
					}
				}

				break;
			}

			case "10": {
				System.out.println("������ ����� �����");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : monthsList) {
					if (m.name().equals(month)) {
						flag = true;
					}

				}

				if (flag) {
					for (Months m : monthsList) {
						if (m.name().equals(month)) {
							if (m.getDays() % 2 == 0) {
								System.out.println("��� ����� �� ����� ������� ���");
							} else {
								System.out.println("��� ����� �� ������� ������� ���");
							}
						}
					}

				}

				if (!flag) {
					System.out.println("����� ����� �� ��������");
				}

				break;
			}

			}

		}

	}

	static void menu() {
		System.out.println("�������� 1, ��� ��������� �� � ����� �����");
		System.out.println("�������� 2, ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3, ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6, ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7, ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8, ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9, ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}


}
