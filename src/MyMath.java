import java.util.ArrayList;

public class MyMath {


    public static int smallestNum(int num1, int num2, int num3) {
        int smallest = 0;

        if (num1 < num2 && num1 < num3) {
            smallest = num1;
        } else if (num2 < num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        return smallest;

    }

    public static double pow(double a, double b) {

        double result = a;

        if (b >= 1) {
            for (int i = 1; i < b; i++) {
                result *= a;

            }

        }

        return result;
    }


    public static int sumOfNumbers(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {

            total += i;


        }

        return total;
    }

    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {

            factorial *= i;
        }

        return factorial;
    }

    public static boolean isPrime(int x) {
        boolean ans = false;

        if (x == 2) {
            ans = true;
        } else if (x != 2) {
            for (int i = 2; i < x; i++) {

                if (x % i == 0) {
                    ans = false;
                    break;
                } else {
                    ans = true;
                }
            }
        }

        return ans;
    }

    public static int NumberCount(String sentence) {
        int words = 1;

        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(1) == ' ') {
                words--;
            }

            if (sentence.charAt(i) == ' ') {
                words++;

            }
        }


        return words;
    }


    public static boolean Validate(String password) {

        boolean valid = false;
        int upper = 0;
        int lower = 0;
        int digit = 0;

        if (password.length() >= 8) {

            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    lower++;
                }
            }

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upper++;
                        }
                    }

             for (int i = 0; i < password.length(); i++) {
                            if (Character.isDigit(password.charAt(i))) {
                                digit++;
                            }
                        }
                    }

        if(lower > 0 && upper > 0 && digit > 0){
            System.out.println(lower +" "+upper+" "+digit);

            valid = true;
        }

            return valid;
    }


    public static void NumberCounter(int a, int b, int c, int d, int e, int f){

        int[] numbers = new int[100];

        for(int i =0; i < 100; i++){
            numbers[a] ++;
            numbers[b] ++;
            numbers[c] ++;
            numbers[d] ++;
            numbers[e] ++;
            numbers[f] ++;

        }

        System.out.println(numbers);

    }


}

