package Work2.Num9;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        String[] values = new String[]{"10", "9", "8", "7", "6", "5", "4", "3", "2","Jack", "Queen", "King", "Ace"};
        String[] card_suit = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] deck = new String[52];
        for (int i = 0; i < values.length;i++){
            for (int j = 0; j < card_suit.length; j++){
                deck[i*4+j] = values[i] + " Of " + card_suit[j];
            }
        }
        shufle(deck);
        gamePoker(deck, 5);
    }
    public static void shufle(String[] str){
        String temp;
        for (int i = 0; i < 500;i++){
            Random rand = new Random();
            int r = rand.nextInt(51);
            temp = str[r];
            str[r] = str[str.length - r - 1];
            str[str.length - r - 1] = temp;
        }
    }
    public static void gamePoker(String[] str, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(str[j + i * 5]);
            }
            System.out.println();
        }
    }
}
