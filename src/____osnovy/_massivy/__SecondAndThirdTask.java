package ____osnovy._massivy;

import java.util.Arrays;
import java.util.Scanner;

public class __SecondAndThirdTask {
    public void prepare() {
        Scanner scanner = new Scanner(System.in);
        String[] ingredients = {"Драконий коготь", "Лист мандрагоры", "Корень шершавой астрелии"};
        System.out.println("Добро пожаловать в лабораторию зелий!");
        System.out.println("Введите ингредиенты, которые у вас есть (через запятую (, ):");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        System.out.println(Arrays.toString(userIngredients));
        int ingredientsLength = ingredients.length;
        int score = 0;
        for (int a = 0; a < ingredientsLength; ++a) {
            for (int b = 0; b < userIngredients.length; ++b) {
                if (ingredients[a].equals(userIngredients[b])) {
                    ++score;
                }
            }
        }
        if (score == ingredientsLength) {
            System.out.println("У вас есть все необходимые ингредиенты для зелья! Можете начинать создание");
        } else {
            System.out.println("У вас не хватает некоторых ингредиентов. Нельзя приступать к созданию зелья.");
        }
    }
}