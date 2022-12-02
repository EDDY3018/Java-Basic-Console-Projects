public class Average {
    public static void main(String[] args) {

        //enter elements to the Array
        double [] elements = {45.3,67.5,-45.6, 20.34};
        double sum = 0.0;

        //Compute the sum
        for (double num : elements ) {

            sum += num;//To calculate the sum of all numbers
        }

        int totalelements = elements.length; // To calculate the number of elements

        //compute the Average
        double average = sum / totalelements;
        System.out.println("The Average is : %.2f = " + average );

    }

}
