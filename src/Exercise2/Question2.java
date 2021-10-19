package Exercise2;

// Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01"
// and either print a decimal or BigDecimal


import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        double[] DecimalArray = {0.90, 1.00, 9.00, 8.78, 0.01};

        System.out.println(Arrays.stream(DecimalArray).sum());
    }

    }

