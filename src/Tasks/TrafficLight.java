package Tasks;

import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static String getNextState(int currentState) {
        switch (currentState) {
            case 0: // Красный -> Жёлтый
                return "1";
            case 1: // Жёлтый -> Зелёный (если был красный) или Красный (если был зелёный)
                return "2"; // Упрощённая версия - всегда в зелёный
            case 2: // Зелёный -> Жёлтый
                return "1";
            default:
                return "0"; // По умолчанию возвращаем красный
        }
    }

    public static String getAction(int currentState) {
        switch (currentState) {
            case 0: // Красный
                return "Change to Yellow";
            case 1: // Жёлтый
                return "Change to Green"; // Упрощённая версия - всегда в зелёный
            case 2: // Зелёный
                return "Change to Yellow";
            default:
                return "Stop"; // По умолчанию "Stop"
        }
    }
}
