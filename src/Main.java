public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int age = 25;
        if (age >= 18) {
            System.out.println("Пользователю " + age + " лет. Поздравлем с совершеннолетием!");
        } else {
            System.out.println("Пользователю " + age + " лет. Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет.");
        }
        else if (age >= 24){
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }

        // Задание 3
        System.out.println("Задание 3");
        int vagon = 102;
        int vagonSit = 60;
        int vagonStand = vagon -vagonSit;

        int vagonSitTicket = 30;
        int vagonStandTicker = 14;
        if (vagonSitTicket < vagonSit) {
            System.out.println("Есть еще " + (vagonSit-vagonSitTicket) + " сидячих мест.");
        } else {
            System.out.println("Сидячих мест нет!");
        }
        if (vagonStandTicker < vagonStand) {
            System.out.println("Есть еще " + (vagonStand-vagonStandTicker) + " стоячих мест.");
        } else {
            System.out.println("Стоячих мест нет!");
        }

    }
}