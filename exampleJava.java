package com.tony.java;

public class exampleJava {

    public static void main(String [] args) {
        int[] numV = {2, 4, 6, 8, 16, 32, 64, 128, 264};
        int[] dnumV = {2, 4, 0, 8, 4, 16, 64, 0};
        for (int i = 0; i < numV.length; i++) {
            try {
                int Answer = numV[i] / dnumV[i];

                System.out.println(Answer);
            } catch (NumberFormatException ArithmeticException) {
                System.out.println("Error");
            }//end catch

        }//end main

    }
}//end class