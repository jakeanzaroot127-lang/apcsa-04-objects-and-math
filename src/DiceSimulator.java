public class DiceSimulator {
    public static void main(String[] args) {
        // Roll one die: an int from 1 to 6.
        int die1 = (int)(Math.random() * 6) + 1;
        int die2 = (int)(Math.random() * 6) + 1;   // replace 0 with the random expression
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + (die1 + die2));

        int n = 20;
        int die3 = (int)(Math.random() * n) + 1;
        int die4 = (int)(Math.random() * 6);

        System.out.println("Die 3: " + die3);
        System.out.println("Die 4: " + die4);

        int die5 = (int)(Math.random() * 26) + 50;
        System.out.println("Die 5: " + die5);
        System.out.println(die5 >= 50);
        System.out.println(die5 <= 75);


    }
}
