// Student Grading System
// a JAVA program for grading students
// Author:
// Date: 27-04-22
/////////////////////////////////////////////////////////
package com.tony.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static int[][] highStreetData = {
            {42000, 48000, 50000},  // quarter 1
            {52000, 58000, 60000},  // quarter 2
            {46000, 49000, 58000},  // quarter 3
            {50000, 51000, 61000}};  // quarter 4

    static int[][] mallBranchData = {
            {57000, 63000, 60000},  // quarter 1
            {70000, 67000, 73000},  // quarter 2
            {67000, 65000, 62000},  // quarter 3
            {72000, 69000, 75000}};  // quarter 4

    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#,###");
//        I.	The respective monthly combined sales for the two shops
        System.out.println("RESPECTIVE COMBINED MONTHLY SALES (I)");
        System.out.println("             | Month 1  | Month 2  | Month 3");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - --");

        System.out.println("1st Quarter  | " +
                formatter.format(highStreetData[0][0] + mallBranchData[0][0]) + "   | " +
                formatter.format(highStreetData[0][1] + mallBranchData[0][1]) + "  | " +
                formatter.format(highStreetData[0][2] + mallBranchData[0][2]));

        System.out.println("2nd Quarter  | " +
                formatter.format(highStreetData[1][0] + mallBranchData[1][0]) + "  | " +
                formatter.format(highStreetData[1][1] + mallBranchData[1][1]) + "  | " +
                formatter.format(highStreetData[1][2] + mallBranchData[1][2]));

        System.out.println("3rd Quarter  | " +
                formatter.format(highStreetData[2][0] + mallBranchData[2][0]) + "  | " +
                formatter.format(highStreetData[2][1] + mallBranchData[2][1]) + "  | " +
                formatter.format(highStreetData[2][2] + mallBranchData[2][2]));

        System.out.println("4th Quarter  | " +
                formatter.format(highStreetData[3][0] + mallBranchData[3][0]) + "  | " +
                formatter.format(highStreetData[3][1] + mallBranchData[3][1]) + "  | " +
                formatter.format(highStreetData[3][2] + mallBranchData[3][2]));


        System.out.println();
//        II.	Each shop respective quarterly sales
//        III.	The combined respective quarterly sales for the two shops
//        IV.	The respective shops annual sales
//        V.	The grand annual combined total sales for the two shops
// High Street branch
        int highStreet1Q = highStreetData[0][0] + highStreetData[0][1] + highStreetData[0][2];
        int highStreet2Q = highStreetData[1][0] + highStreetData[1][1] + highStreetData[1][2];
        int highStreet3Q = highStreetData[2][0] + highStreetData[2][1] + highStreetData[2][2];
        int highStreet4Q = highStreetData[3][0] + highStreetData[3][1] + highStreetData[3][2];
// Mall branch
        int mall1Q = mallBranchData[0][0] + mallBranchData[0][1] + mallBranchData[0][2];
        int mall2Q = mallBranchData[1][0] + mallBranchData[1][1] + mallBranchData[1][2];
        int mall3Q = mallBranchData[2][0] + mallBranchData[2][1] + mallBranchData[2][2];
        int mall4Q = mallBranchData[3][0] + mallBranchData[3][1] + mallBranchData[3][2];
        int totalHighStreetYearly = highStreet1Q + highStreet2Q + highStreet3Q + highStreet4Q;
        int totalMallYearly = mall1Q + mall2Q + mall3Q + mall4Q;

        System.out.println("QUESTION II - V");
        System.out.println("Branch         | 1st Quarter | 2nd Quarter | 3rd Quarter | 4th Quarter | Annual Sales");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("High Street    | " +
                formatter.format(highStreet1Q) + "     | " +
                formatter.format(highStreet2Q) + "     | " +
                formatter.format(highStreet3Q) + "     | " +
                formatter.format(highStreet4Q) + "     | " +
                formatter.format(totalHighStreetYearly));
        System.out.println("Mall           | " +
                formatter.format(mall1Q) + "     | " +
                formatter.format(mall2Q) + "     | " +
                formatter.format(mall3Q) + "     | " +
                formatter.format(mall4Q) + "     | " +
                formatter.format(totalMallYearly));
        int total1Q = highStreet1Q + mall1Q;
        int total2Q = highStreet2Q + mall2Q;
        int total3Q = highStreet3Q + mall3Q;
        int total4Q = highStreet4Q + mall4Q;
        System.out.println("Total Sales    | " +
                formatter.format(total1Q) + "     | " +
                formatter.format(total2Q) + "     | " +
                formatter.format(total3Q) + "     | " +
                formatter.format(total4Q) + "     | " +
                formatter.format(total4Q + total2Q + total3Q + total4Q));
        System.out.println("");

        System.out.println("PERFORMANCE & EVALUATION (VI - VIII)");
//        VI.	Your program should evaluate which shop performed better in the year
        System.out.print("1. Best Yearly Performance: ");
        if(totalMallYearly < totalHighStreetYearly)
            System.out.print("HIGH STREET BRANCH");
        else if(totalMallYearly == totalHighStreetYearly)
            System.out.print("THERE WAS A TIE");
        else
            System.out.print("MALL BRANCH");
//        VIII.	Your program should rank the shops according to their best quarterly performance
        System.out.println();
        System.out.println();
        System.out.println("2. Best Quarterly Performance");
        String best1Q;
        String best2Q;
        String best3Q;
        String best4Q;
        if(highStreet1Q > mall1Q) best1Q = "HIGH STREET";else best1Q = "MALL BRANCH";
        if(highStreet2Q > mall2Q) best2Q = "HIGH STREET";else best2Q = "MALL BRANCH";
        if(highStreet3Q > mall3Q) best3Q = "HIGH STREET";else best3Q = "MALL BRANCH";
        if(highStreet4Q > mall4Q) best4Q = "HIGH STREET";else best4Q = "MALL BRANCH";

        System.out.println("1st Quarter  | " + best1Q);
        System.out.println("2nd Quarter  | " + best2Q);
        System.out.println("3rd Quarter  | " + best3Q);
        System.out.println("4th Quarter  | " + best4Q);

//        VII.	Your program should rank the shops according to their best monthly performance
        System.out.println();
        System.out.println("3. Best Monthly Performance (VII)");
        System.out.println("            | Month 1     | Month 2     | Month 3");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Quarter 1   | ");
        if(highStreetData[0][0] > mallBranchData[0][0]) System.out.print("HIGH STREET |");else System.out.print("MALL BRANCH |");
        if(highStreetData[0][1] > mallBranchData[0][1]) System.out.print(" HIGH STREET |");else System.out.print(" MALL BRANCH |");
        if(highStreetData[0][2] > mallBranchData[0][2]) System.out.print(" HIGH STREET");else System.out.print(" MALL BRANCH");

        System.out.println();
        System.out.print("Quarter 2   | ");
        if(highStreetData[1][0] > mallBranchData[1][0]) System.out.print("HIGH STREET |");else System.out.print("MALL BRANCH |");
        if(highStreetData[1][1] > mallBranchData[1][1]) System.out.print(" HIGH STREET |");else System.out.print(" MALL BRANCH |");
        if(highStreetData[1][2] > mallBranchData[1][2]) System.out.print(" HIGH STREET");else System.out.print(" MALL BRANCH");

        System.out.println();
        System.out.print("Quarter 3   | ");
        if(highStreetData[2][0] > mallBranchData[2][0]) System.out.print("HIGH STREET |");else System.out.print("MALL BRANCH |");
        if(highStreetData[2][1] > mallBranchData[2][1]) System.out.print(" HIGH STREET |");else System.out.print(" MALL BRANCH |");
        if(highStreetData[2][2] > mallBranchData[2][2]) System.out.print(" HIGH STREET");else System.out.print(" MALL BRANCH");

        System.out.println();
        System.out.print("Quarter 2   | ");
        if(highStreetData[3][0] > mallBranchData[3][0]) System.out.print("HIGH STREET |");else System.out.print("MALL BRANCH |");
        if(highStreetData[3][1] > mallBranchData[3][1]) System.out.print(" HIGH STREET |");else System.out.print(" MALL BRANCH |");
        if(highStreetData[3][2] > mallBranchData[3][2]) System.out.print(" HIGH STREET");else System.out.print(" MALL BRANCH");
        System.out.println();
    }
}
