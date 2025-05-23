/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(int t) {

        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            iFuzzBizz(i);
        }

}

    public static void iFuzzBizz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
