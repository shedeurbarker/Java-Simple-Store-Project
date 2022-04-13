// Student Grading System
// a JAVA program for grading students
// Author: Edd
// Date: 12-04-22
/////////////////////////////////////////////////////////
package com.tony.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int exam_score;
        int assessment_score;
        boolean fees_status;
        boolean receive_cert = false;
        boolean exam_failed = false;
        boolean assessment_failed = false;
        Scanner student_data;
        String response_message;

        // begin program
        while(true) {   // keep program running until student terminates
            System.out.println("= = = = = = = = = = = = = = = = ");
            System.out.println("STUDENT GRADING SYSTEM");
            System.out.println("= = = = = = = = = = = = = = = = ");
            System.out.println("Please Provide The Following Details");
            System.out.print("Enter Exams Score: ");
            while(true) { // do not end program until valid exams score is provided
                try {
                    student_data = new Scanner(System.in);
                    exam_score = student_data.nextInt();
                    break;
                }
                catch (Exception e) {
                    System.out.print("Sorry, Enter a Valid Exams Score: ");
                }
            }

            System.out.print("Enter Assessment Score: ");
            while(true) { // do not end program until valid assessment score is provided
                try {
                    assessment_score = student_data.nextInt();
                    break;
                }
                catch (Exception e) {
                    student_data = new Scanner(System.in);   // reinitialize the scanner
                    System.out.print("Sorry, enter a valid Assessment Score: ");
                }
            }

            System.out.print("Have you paid your fees in full? Enter Y/N: ");
            String fees_data = student_data.next();
            fees_status = fees_data.equalsIgnoreCase("Y");

            // Component Passed block
            if(exam_score >= 25 && assessment_score >= 15 && fees_status) {
                receive_cert = true;
            }
            else if(exam_score == 24 && assessment_score == 15 && fees_status) { // 39 mark - condoned
                receive_cert = true;
            }
            else if(exam_score == 25 && assessment_score == 14 && fees_status) { // 39 mark - condoned
                receive_cert = true;
            }

            // Component Failed block
            if(!receive_cert) {
                response_message = "SORRY YOU HAVE FAILED.\n - You failed in the following Components: \n";
                if(exam_score < 24) {
                    exam_failed = true;   // only exams failed
                    response_message += " -> Exams Failed\n";
                }
                if(assessment_score < 14) {
                    assessment_failed = true;   // exams and assessment failed
                    response_message += " -> Assessment Failed\n";
                }
                if(!fees_status) {
                    if(!exam_failed && !assessment_failed) { // he passed but problem with the fees
                        response_message += " -> You Passed But Fees not Paid in Full";
                    }
                    else {
                        response_message += " -> Fees Not Paid in Full";
                    }
                }
                if(exam_failed && assessment_failed) {
                    response_message += "\nSince You failed in both Exams and Assessment, YOU WILL BE REPEATED";
                }
            }
            else {
                response_message = "Congratulations, You have passed your Exams and Assessment\n" +
                        "YOU HAVE BEEN AWARDED A CERTIFICATE";
            }
            System.out.println("\n= = = = = = = = =");
            System.out.println(" - - RESULTS - -");
            System.out.println("= = = = = = = = =");
            System.out.println(response_message);
            System.out.print("Do You Want To Restart The Grading System? Y/N: ");
            String repeat = student_data.next();
            boolean restart = repeat.equalsIgnoreCase("N");
            if(!restart)
                System.out.println();
            else
                break;
        }
    }
}
