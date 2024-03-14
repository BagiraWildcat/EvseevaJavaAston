import java.util.Objects;
import java.util.Scanner;

public class SameStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Здравствуйте! Эта простая программа попросит ввести две строки" +
                "\nсравнит их и выдаст заключение, одинаковые они или нет");

        System.out.print("Введите первую строку: ");
        String first = scanner.next();

        System.out.print("Введите вторую строку: ");
        String second = scanner.next();
        if(Objects.equals(first, second)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}
