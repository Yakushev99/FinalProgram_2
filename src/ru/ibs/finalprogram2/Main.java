package ru.ibs.finalprogram2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите уравнение с одним неизвестным x: ");
        Scanner input = new Scanner(System.in);
        String equation = input.next();
        if (equation.charAt(3) != '=') {
            System.out.println("Ошибка! Уравнение введено неправильно!");
        } else {
            //Значение после знака =
            int result = Integer.parseInt(String.valueOf(equation.charAt(4)));
            int x;
            switch (equation.charAt(1)) {
                case '+':
                    if (equation.charAt(0) == 'x') {
                        int number2 = Integer.parseInt(String.valueOf(equation.charAt(2)));
                        x = result - number2;
                    }
                    else {
                        int number1 = Integer.parseInt(String.valueOf(equation.charAt(0)));
                        x = result - number1;
                    }
                    System.out.println("x="+x);
                    break;
                case '-':
                    if (equation.charAt(0) == 'x') {
                        int number2 = Integer.parseInt(String.valueOf(equation.charAt(2)));
                        x = result + number2;
                    }
                    else {
                        int number1 = Integer.parseInt(String.valueOf(equation.charAt(0)));
                        x = number1 - result;
                    }
                    System.out.println("x="+x);
                    break;
            }
        }
    }
}
