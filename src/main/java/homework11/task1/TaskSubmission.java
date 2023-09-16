package homework11.task1;
import java.util.Date;

public class TaskSubmission {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerName = "Ваша_фамилия"; // Замените на свою фамилию

        // Дата и время получения задания (текущее время)
        Date dateReceived = new Date();

        // Дата и время сдачи задания (предположим, что задание сдано сразу после получения)
        Date dateSubmitted = new Date();

        // Вывод информации на экран
        System.out.println("Фамилия разработчика: " + developerName);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}
