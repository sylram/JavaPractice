import java.util.Arrays;
import java.util.Scanner;

public class Conditionals {

    public static String fizzBuzz(int number){
        String result = "";
        for (int i = 1; i <number ; i++) {
            result = "";
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if ( i % 5 == 0) {
                result += "Buzz";
            }
            if (result.isEmpty()){

               result = "" + i;
            }
            System.out.println(result);
        }
        return  result;
    }

    public static String reverseString(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverseString2(String str){
        StringBuilder reversed2 = new StringBuilder(str);
        reversed2.reverse();

        return reversed2.toString();
    }

    public static String reverseString3(String str) {
        if (str.isEmpty())
            return str;
        return reverseString3(str.substring(1)) + str.charAt(0);
    }

    public static String getGrade(int score){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score");
        score = scanner.nextInt();
        String grade;
        if( score >= 90){
            grade = "A";
        }
        else if( score >= 80){
            grade = "B";
        }
        else if( score >= 70){
            grade = "C";
        }
        else if( score >= 60){
            grade = "D";
        }
        else {
            grade = "F";
        }
        return grade;
    }

    static int countA (String s) {
        int countA = 0;
        char a = 'a';
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) == a ) {
                countA++;
            }
        }
        return countA;
    }

    static long repeatedString(String s, int n) {

        long remaining =0;
        long len = s.length();
        long count = countA(s);
        long calculateReps = n/len;
        if( n % len != 0) {
            remaining = n % len ;
        }
        int remaining2 = (int) remaining;
        System.out.println(remaining);
        String lastRep = s.substring(0,remaining2);
        return calculateReps*count + countA(lastRep);
    }

    public static String lineOfStars(int num) {
        String container = "";
        for (int i = 0; i <num ; i++) {
            container += "* ";
        }
        return container;
    }

    public static String verticalLineStars(int num){
        String container = "";
        for (int i = 0; i <num ; i++) {
            container += lineOfStars(num)+"\n";
        }
        return container;
    }

    public static double multipleTable(int num) {
            double result = 1;
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= 4 ; j++) {
                result = Math.pow(i,j);
                System.out.printf("%10.0f",result);
            }
            System.out.println();
        }
        return result;
    }

    public static int[] modifyArray(int[] arr, int num) {
        int result = 0;
        int counter = 0;
        for (int value: arr) {
            result = num+ value;
            arr[counter++] = result;
        }
        return arr;
    }

    public static void main(String[] args) {
//        fizzBuzz(16);
        System.out.println(reverseString2("casa"));
        System.out.println(reverseString3("loca"));
//        System.out.println("your grade is " + getGrade(40));
        System.out.println(repeatedString("aba",10));
        System.out.println(verticalLineStars(4));
//        multipleTable(4);
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(modifyArray(arr, 5)));
    }
}
