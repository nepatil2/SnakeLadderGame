package SnakeLadder;

public class UC4 {
    public static int new_pos = 0;
    public static final int NO_Play = 0;
    public static final int Ladder = 1;
    public static final int Snake = 2;


    public static void main(String[] args) {
        int position  = 0;
        int die_count = 0;

        System.out.println("Player one started game played at position " + position);
        int new_pos  = 0 ;
        int option   = 0;

        while (position < 100) {
            int player1 = (int) Math.floor(Math.random() * 10) % 6 + 1;
            die_count++;
            System.out.println("The player1 Rolls Die get Number is " + player1);
            option = (int) Math.floor(Math.random() * 10) % 3;

            switch (option) {
                case NO_Play:
                    new_pos = 0;
                    break;
                case Ladder:
                    new_pos = player1;
                    break;
                case Snake:
                    new_pos = -player1;
                    break;

            }
            position = position + new_pos;
            System.out.println("die count = " + die_count);
            System.out.println("player position is : " + position);
        }
    }
}
