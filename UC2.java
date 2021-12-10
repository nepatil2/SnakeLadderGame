package SnakeLadder;
import java.math.*;

public class UC2 {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Player one started game played at position " + position);

        int player1 = (int)Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The player1 Rolls Die get Number is " + player1);
    }
}
