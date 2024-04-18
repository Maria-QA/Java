//Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
//- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
//- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
public class Main {
    public static void main(String[] args) {

        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int sum;
        int difference;
        int product;
        int quotient;
        if (a > b) {
            System.out.println(String.format(" %d > %d", a, b));
        } else if (a == b) {

            System.out.println(String.format(" %d = %d", a, b));
        }
        else {

            System.out.println(String.format(" %d < %d", a, b));

        }
        if (b == 0){
            System.out.println( " на 0 делить нельзя " );
        }

        sum = a + b;
        System.out.println( a + " + " + b + " = " + sum );

        difference = a - b;
        System.out.println( a + " - " + b + " = " + difference );

        product = a * b;
        System.out.println( a + " * " + b + " = " + product );

        quotient = a / b;
        System.out.println( a + " / " + b + " = " + quotient );
    }
}