
import models.House;


import java.time.LocalDate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        Object HouseType = null;
        House house1 = new House(111L, "Дом1", 1, 100, HouseType.VILLA, LocalDate.of(2020, 1, 1));
        House house2 = new House(222L, "Дом2", 2, 200, HouseType.APARTMENT, LocalDate.of(2020, 2, 2));
        House house3 = new House(333L, "Дом3", 3, 300, HouseType.COTTAGE, LocalDate.of(2020, 3, 3));



        while (true) {
            System.out.println("""
                    1.Добавить дом:
                    2.Получите дома:
                    3.Получить дом по ID:
                    4.Обновить дом:
                    5.Удалить дом:
                    """);
            int a = scanner1.nextInt();
            while (true) {
                try {

                } catch (InputMismatchException e) {
                    System.out.println();
                    scanner.nextLine();
                }
            }
        }

    }
}