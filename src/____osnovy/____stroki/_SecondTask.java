package ____osnovy.____stroki;

import java.util.Random;

public class _SecondTask {
    public void secondTask() {
        //задаю переменной текст
        String spell = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        //присваиваю новой переменной тот же текс только с маленьким регистром
        String spellLower = (spell.toLowerCase());
        //задаю переменной рандомное значение от 0 до 50
        int start = new Random().nextInt(0, 50);
        //задаю переменной обрезанную строку методом substring
        String spellCropped = spellLower.substring(start);
        //вывожу на экран дабы провести промежуточную проверку
        System.out.println(spellCropped);
        //создаю StringBuilder вношу в него spellCropped
        StringBuilder spellBuilder = new StringBuilder(spellCropped);
        //переворачиваю строку
        spellBuilder.reverse();
        //вывожу на экран для промежуточной проверки
        System.out.println(spellBuilder);
        //задаю переменной значение нулевого индекса в строке
        char zero = (spellBuilder.charAt(0));
        //задаю переменной значение первого индекса в строке
        System.out.println(zero);
        //вывожу на экран для промежуточной проверки
        char one = (spellBuilder.charAt(1));
        //вывожу на экран для промежуточной проверки
        System.out.println(one);
        //задаю границы где менять и на что менять, нулевой индекс на первый
        spellBuilder.replace(0, 1, String.valueOf(one));
        //задаю границы где менять и на что менять, первый индекс на нулевой
        spellBuilder.replace(1, 2, String.valueOf(zero));
        //вывожу на экран итог
        System.out.println(spellBuilder);
    }
}