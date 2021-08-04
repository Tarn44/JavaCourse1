import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args){
        String city1, city2;

        Scanner input = new Scanner(System.in);

        // Получить имена двух городов
        System.out.println("Введите имя первого города: ");
        city1 = input.nextLine();
        System.out.println("Введите имя второго города: ");
        city2 = input.nextLine();

        // Сравнить и отобразить имена городов по алфавиту
        if (city1.compareTo(city2) < 0) {
            System.out.println("Имена городов по алфавиту: "
                    + city1 + " " + city2);
        } else {
            System.out.println("Имена городов по алфавиту: "
                    + city2 + " " + city1);
        }
    }
}
