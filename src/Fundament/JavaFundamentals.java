package Fundament;

import java.util.Scanner;

public class JavaFundamentals {
    public static void main(String[] args) {

        //Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя :");
        String name = scan.nextLine();
        System.out.println("Hello " + name);

        //Отобразить в окне консоли аргументы командной строки в обратном порядке.
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("аргумент = " + args[i]);
        }

        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        System.out.print("Введите случайное число :");
        int randomNumber = scan.nextInt();
        for (int i = 1; i <= randomNumber; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= randomNumber; i++) {
            System.out.print(i);
        }

        //Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        System.out.println();
        int addition = Integer.parseInt(args[0]);
        int multiplication = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            addition += Integer.parseInt(args[i]);
            multiplication *= Integer.parseInt(args[i]);
        }
        System.out.println("Сумма =" + addition);
        System.out.println("Произведение =" + multiplication);

        //Ввести число от 1 до 12.
        //Вывести на консоль название месяца, соответствующего данному числу.
        //Осуществить проверку корректности ввода чисел.
        ///////////////////Вариант 1///////////////////
        JavaFundamentals javaTest = new JavaFundamentals();
        javaTest.month();
        ///////////////////Вариант 2 (с использованием enum)///////////////////
        javaTest.monthEnum();

    }

    public void month() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12 :");
        int numb = scan.nextInt();
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if (numb >= 1 && numb <= 12) {
            System.out.println(months[numb]);
        } else {
            System.out.println("Не коректное число!");
            this.month();
        }
    }

    public void monthEnum(){
        System.out.println("Вариант 2 с использованием Enum");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12 :");
        int numb = scan.nextInt();
        if(numb >= 1 && numb <= 12){
            for (Month mon:Month.values()) {
                if (mon.getNumbMonth()==numb ){
                    System.out.println(mon.getTranslationMonth());
                }
            }
        }else {
            System.out.println("Не коректное число!");
            this.monthEnum();
        }
    }
}