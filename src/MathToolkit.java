public class MathToolkit {
    public static void main(String[] args) {
        // 1. In src/MathToolkit.java, use Math.sqrt and Math.pow to print the hypotenuse of legs 6 and 8.
        double side1 = 6.0;
        double side2 = 8.0;
        double side3 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("Hypotenuse of legs 6 and 8 is " + side3);
        // 2. Print the distance between (1, 2) and (4, 6) with the distance formula. Expect 5.0.
        double x1 = 1.0;
        double x2 = 4.0;
        double y1 = 2.0;
        double y2 = 6.0;

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Distance between (1,2) and (4,6) is " + distance);
        // 3. Print the absolute difference of 12 and 30, then of 7.5 and 9.25, using Math.abs.

        System.out.println(Math.abs(12-30));
        System.out.println(Math.abs(7.5-9.25));
        // 4. Enrichment (char is not tested): print a random capital, (char)('A' + (int)(Math.random() *
        //    26)).

        System.out.println((char)('A' + (int)(Math.random() * 26)));
        // 5. Print a random year from 1990 to 2010 inclusive. State n and min in a comment. Commit and
        //    push.
        int n = 2010-1990;
        int min = 1990;

        System.out.println((int)(Math.random() * n) + min);
}
}