package edu.labs.LAB2;

import java.util.*;

public class Application1 {
    private static int getRandomInt(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[6];

        // ключи - это элемент массива, значение - колличество повторения

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getRandomInt(10, 17);
        }

        int n = 0;
        boolean stop = false;
        while (!stop) {
            System.out.println(
                    "Menu:\n" +
                            "1 - добавление (сумма всех чисел)\n" +
                            "2 - сумма минимального и максимального значения чисел\n" +
                            "3 - среднее арифметическое\n" +
                            "4 - моды\n" +
                            "5 - медиана\n" +
                            "6 - количество элементов большего и меньше за среднее\n" +
                            "0 - выход");


            n = sc.nextInt();

            switch (n) {
                case 1:
                    showSummTotal(numbers);
                    break;
                case 2:
                    showSummMaxMin(numbers);
                    break;
                case 3:
                    showAverage(numbers);
                    break;
                case 4:
                    showModa(numbers);
                    break;
                case 5:
                    showMediana(numbers);
                    break;
                case 6:
                    showCountLessMidItems(numbers);
                    break;
                case 0:
                    stop = true;
                    break;
            }
        }
    }
    private static void showSummTotal(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum: " + sum);
    }

    private static void showSummMaxMin(int[] numbers) {
        int min = 0, max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }

            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nMax: " + max);

        min = max;

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }

        }
        System.out.println("\nMin: " + min);

    }

    private static void showAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nAverage: " + ((double)sum / (double)numbers.length));
    }

    private static void showModa(int[] numbers) {
        Map<Integer, Integer> moda = new HashMap<>();
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
            if (moda.containsKey(numbers[i])) {
                c = moda.get(numbers[i]) + 1;
                moda.put(numbers[i], c);
                continue;
            }
            moda.put(numbers[i], 1);
        }
        int maxKey = 0, maxVal = 0;
        for (Map.Entry<Integer, Integer> entry : moda.entrySet()) {

            if (maxKey < entry.getValue()) {
                maxKey = entry.getValue();
                maxVal = entry.getKey();
            }

        }

        System.out.println("\nModa: " + maxVal);
    }

    private static void showMediana(int[] numbers) {
        double mediana = 0;
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        if (numbers.length % 2 == 0) {
            int m1 = (numbers.length / 2) - 1;
            int m2 = (numbers.length / 2) + 1;
            mediana = ((double)numbers[m1] + (double)numbers[m2]) / 2;
        } else {
            mediana = numbers[numbers.length / 2];
        }

        System.out.println("\nMediana: " + mediana);
    }

    private static void showCountLessMidItems(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        double avg = ((double)sum / (double)numbers.length);
        System.out.println("\nAverage: " + avg);

        //Arrays.sort(numbers);

        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < avg) {
                c++;
            }
        }
        System.out.println("Count of items less than average: " + c);

    }

}
