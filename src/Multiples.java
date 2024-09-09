public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            count = countMultiples(i, count);
        }
        System.out.println(count);
    }

    private static int countMultiples(int i, int count) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if ((divisibleBy3 || divisibleBy5) && i > 0) {
            count++;
        }

        return count;
    }
}
