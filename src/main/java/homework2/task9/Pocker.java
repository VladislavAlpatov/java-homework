package homework2.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Pocker {
    public static void main(String[] args) {
        // Чтение числа игроков
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        // Проверка возможности раздачи карт
        if (n * 5 > 52) {
            System.out.println("Слишком много игроков для одной колоды.");
            return;
        }

        // Создание и перемешивание колоды
        ArrayList<String> deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        Collections.shuffle(deck);

        // Раздача карт
        for (int i = 0; i < n; i++) {
            ArrayList<String> hand = new ArrayList<>(deck.subList(i * 5, (i + 1) * 5));
            System.out.println("Карты игрока " + (i + 1) + ": ");
            for (String card : hand) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}
