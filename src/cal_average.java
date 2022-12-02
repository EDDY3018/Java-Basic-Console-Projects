public class cal_average {
    private static Object average;

    public static void main(String[] args) {
        //enter elements to the array
        double[] elements ={45.3,67.5,-45.6,20.34};
        double sum =0.0;

        // compute the sum for ( double num : elements) {sum + = num;



        int totalElement = elements.length;

        //compute the average double average = sum / totalElement;

        System.out.format("The average is: %.2f",average);
    }
}
