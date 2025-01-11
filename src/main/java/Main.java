import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String carName;
        double carSpeed;
        Scanner scanner = new Scanner(System.in);
        Race carLeaderRace = new Race();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Введите название машины № " + i);
            carName = scanner.next();
            while (true) {
                System.out.println("Введите скорость машины № " + i);
                if (scanner.hasNextDouble()) {
                    carSpeed = scanner.nextDouble();
                    if (carSpeed > 0 && carSpeed <= 250) {
                        break;
                    } else {
                        System.out.println("Неправильная скорость");
                    }
                } else {
                    System.out.println("Некорректный ввод. Пожалуйста, введите число.");
                    scanner.next();
                }
            }
            Car carObject = new Car(carName,carSpeed);
            carLeaderRace.leaderCalculations(carObject);
        }
        System.out.println("Самая быстрая машина: " + carLeaderRace.carLeaderName);
        scanner.close();
    }
}