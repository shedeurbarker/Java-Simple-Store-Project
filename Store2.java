package com.tony.java;

import java.util.Scanner;

public class Store2 {
    boolean examPassed;
    boolean assessmentPassed;
    boolean feesStatus;
    boolean condoned;

    int gradeA = 0;
    int gradeB = 0;
    int gradeC = 0;
    int gradeD = 0;
    int gradeDPlus = 0;
    int gradeF = 0;

    Scanner scannerInput;
    String alertMessage;

    double[] studentScores = new double[3];
    String[] studentGrade = new String[1];
/*
    // begin program
        while(true) {   // keep program running until student terminates
        StringBuilder componentMessage = new StringBuilder("Your Grading Results: \n");
        System.out.println("= = = = = = = = = = = = = = = = ");
        System.out.println("STUDENT GRADING SYSTEM");
        System.out.println("= = = = = = = = = = = = = = = = ");
        System.out.println("Please Provide The Following Details");
        System.out.print("Enter Exams Score: ");
        while(true) { // do not end program until valid exams score is provided
            try {
                scannerInput = new Scanner(System.in);
                double exams = scannerInput.nextDouble();
                if(exams > 70) {
                    System.out.print("Sorry, Exams Score cannot be more than 70. Try Again: ");
                }
                else {
                    studentScores[0] = exams;
                    break;
                }
            }
            catch (Exception e) {
                System.out.print("Sorry, Enter a Valid Exams Score: ");
            }
        }

        System.out.print("Enter Assessment Score: ");
        while(true) { // do not end program until valid assessment score is provided
            try {
                double assessment = scannerInput.nextDouble();
                if(assessment > 30) {
                    System.out.print("Sorry, Assessment Score cannot be more than 30. Try Again: ");
                }
                else {
                    studentScores[1] = assessment;
                    break;
                }
            }
            catch (Exception e) {
                scannerInput = new Scanner(System.in);   // reinitialize the scanner
                System.out.print("Sorry, enter a valid Assessment Score: ");
            }
        }
// total score
        studentScores[2] = studentScores[0] + studentScores[1];
        if(studentScores[2] >= 70) {
            studentGrade[0] = "A";
            gradeA++;
        }
        else if(studentScores[2] > 59.99) {
            studentGrade[0] = "B";
            gradeB++;
        }
        else if(studentScores[2] > 49.99) {
            studentGrade[0] = "C";
            gradeC++;
        }
        else if(studentScores[2] > 39.99) {
            studentGrade[0] = "D";
            gradeD++;
        }
        else if(studentScores[2] == 39) {
            studentGrade[0] = "D+";
            gradeDPlus++;
        }
        else {
            studentGrade[0] = "F";
            gradeF++;
        }
// reset variables for other students
        examPassed = false;
        assessmentPassed = false;
        condoned = false;

        System.out.print("Have you paid your fees(GHc100) in full? Enter Y/N: ");
        String feesData = scannerInput.next();
        feesStatus = feesData.equalsIgnoreCase("Y");

        // Check Components Passed / Failed
        if(studentScores[0] > 34)
            examPassed = true;
        if(studentScores[1] > 14)
            assessmentPassed = true;
        if(studentScores[2] == 39)
            condoned = true;

        if(examPassed && assessmentPassed && feesStatus) {      // all clear
            alertMessage = "Congratulations, You have passed and will be AWARDED A CERTIFICATE\n";
        }
        else if(condoned && feesStatus) { // 39 mark - condoned and fees paid
            alertMessage = "Well Done!, You Scored a total of 39 in your Exams and Assessment.\n";
            alertMessage += "You have been Condoned and will be AWARDED A CERTIFICATE\n";
        }
        else {  // failed block
            alertMessage = "SORRY YOU HAVE FAILED\n";
            if(studentScores[0] < 35)
                examPassed = false;   // exams failed
            if(studentScores[1] < 15)
                assessmentPassed = false;   // assessment failed
            if(!examPassed && !assessmentPassed)
                alertMessage += "Since You failed in both Exams and Assessment, YOU WILL BE REPEATED\n";
            else
                alertMessage += "You failed a Component and so cannot be cleared for this Module\n";

// check fees status
            if(!feesStatus) {
                if(examPassed && assessmentPassed) { // Passed but problem with the fees
                    alertMessage = "Well Done! You have passed your exams and assessment but will NOT be awarded a " +
                            "Certificate because your fees are not full paid\n";
                }
                else {
                    alertMessage += " -> Fees Not Paid in Full\n";
                }
            }
        }
// showing which components were passed or failed and show grade
        if(examPassed)
            componentMessage.append(" -> Exams: ").append(studentScores[0]).append(" -  Passed\n");
        else
            componentMessage.append(" -> Exams: ").append(studentScores[0]).append(" - Failed\n");
        if(assessmentPassed)
            componentMessage.append(" -> Assessment: ").append(studentScores[1]).append(" - Passed\n");
        else
            componentMessage.append(" -> Assessment: ").append(studentScores[1]).append(" - Failed\n");
        componentMessage.append(" -> Total Score: ").append(studentScores[2]).append("\n");
        componentMessage.append(" -> Grade: ").append(studentGrade[0]);

        System.out.println("\n= = = = = = = =  = =  = = =");
        System.out.println("   - - GRADING RESULTS - -");
        System.out.println("= = = = = = = = = = =  = = ");
        System.out.println(alertMessage);
        System.out.println(componentMessage);


// tracking user frequency
        System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("      GRADING FREQUENCY");
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Score    Grade     Total");
        System.out.println("70 - 100     A     " + gradeA);
        System.out.println("60 - 69.99   B     " + gradeB);
        System.out.println("50 - 59.99   C     " + gradeC);
        System.out.println("40 - 49.9    D     " + gradeD);
        System.out.println("Exactly 39   D+    " + gradeDPlus);
        System.out.println("below 39     F     " + gradeF);

        System.out.print("Do You Want To Grade Another Student? Y/N: ");
        String repeat = scannerInput.next();
        boolean restart = repeat.equalsIgnoreCase("N");
        if(!restart)
            System.out.println();
        else
            break;
    }
*/
}
