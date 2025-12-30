package ____osnovy._massivy;

import java.util.Arrays;

public class ___FirstTask {
    public void firstTask() {
        String[] recipe = {
                "Засушенная чешуя василиска",
                "Частичка души лесной феи",
                "Капля сока вампирской розы",
                "Яд шершавого ядозуба",
                "Осколок кометы",
                "Слеза феникса"
        };
        System.out.println(Arrays.toString(recipe));
        String[] potion = new String[6];
        potion[2] = recipe[2];
        potion[5] = recipe[5];
        potion[0] = recipe[0];
        potion[1] = recipe[1];
        potion[3] = recipe[3];
        potion[4] = recipe[4];
        System.out.println(Arrays.toString(potion));
        System.out.println(Arrays.equals(recipe, potion));

        // Порядок добавления: Капля сока вампирской розы,
        // Слеза феникса, Засушенная чешуя василиска, Частичка души лесной феи,
        // Яд шершавого ядозуба, Осколок кометы
    }
}