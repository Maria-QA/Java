//Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"

import java.util.Scanner;
public class Main2 { public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    String s1 = console.nextLine();
    String s2 =  console.nextLine();
    if (s1.equals(s2)) {
        System.out.println("Строки идентичны");
    }
    else {
        System.out.println("Строки неидентичны");
    }
}
}
