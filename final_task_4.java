import java.util.Scanner;

public class final_task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String answer = "Заархивированный вирус";

        int attempts = 3;

        boolean usedHint = false;

        while (attempts > 0) {
            System.out.print("Отгадайте загадку: ");
            String guess = scanner.nextLine();

            if (guess.equalsIgnoreCase("Подсказка")) {
                if (usedHint) {
                    System.out.println("Подсказка уже недоступна");
                } else {
                    System.out.println("Подсказка: Это что-то связано с компьютерами");
                    usedHint = true;
                }
            } else if (guess.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Обидно, приходи в другой раз");
                } else {
                    System.out.println("Подумай еще! У вас осталось " + attempts + " попыток");
                }
            }
        }
    }
}