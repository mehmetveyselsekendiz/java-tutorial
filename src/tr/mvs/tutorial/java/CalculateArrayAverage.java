package tr.mvs.tutorial.java;

public class CalculateArrayAverage {

    public static double calculateArrayAverage(int[] elements) {
        double sum = 0;
        for (int value : elements) {
            sum += value;
        }
        return sum / (elements.length);
    }

    public static void printSmallArrayElements(int[] elements, double average) {
        for (int value : elements) {
            if (value < average)
                System.out.println(value);
        }
    }

    public static void main(String[] args) {
        int[] elements = {12, 25, 36, 41, 32};

        double average = calculateArrayAverage(elements);

        printSmallArrayElements(elements, average);
    }
}
