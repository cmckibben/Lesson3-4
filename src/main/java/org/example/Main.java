package org.example;

public class Main {
    public static void main(String[] args) {
        testScore(76);
        testScore2(76);
        upDown("up");
        upDown("down");
        upDown("left");
        upDown("right");
        upDown(";lkdajsdf;alskdjfas;ldjfk");
        toMonth(8);
        upDown2("up");
        upDown2("down");
        upDown2("left");
        upDown2("right");
        upDown2(";lkdajsdf;alskdjfas;ldjfk");
        toMonth2(8);
    }

    private static void upDown(String direction) {
        switch (direction) {
            case "up":
                System.out.println("up");
            break;
            case "down":
                System.out.println("down");
            break;
            case "left":
            case "right":
                System.out.println("left or right");
            break;
            default:
                System.out.println("unknown");
            break;
        }
    }

    private static void upDown2(String direction) {
        switch (direction) {
            case "up" ->             System.out.println("up");
            case "down" ->           System.out.println("down");
            case "left" , "right" -> System.out.println("left or right");
            default ->               System.out.println("unknown");
        }
    }

    public static void testScore(int testscore) {
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
    public static void testScore2(int testscore) {
        char grade;

        if (testscore >= 60) {
            grade = 'D';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 90) {
            grade = 'A';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
    public static void toMonth(int month) {
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
    public static void toMonth2(int month) {
        String monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println(monthString);
    }
}
