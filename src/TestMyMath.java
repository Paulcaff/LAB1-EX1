

public class TestMyMath {
    public static void main(String[] args) {

        int result = MyMath.smallestNum(2,1,3);
        System.out.println("1 is the expected answer::: "+result);

        result = MyMath.smallestNum(2,1,3);
        System.out.println("1 is the expected answer::: "+result);

         result = MyMath.smallestNum(20,10,3);
        System.out.println("3 is the expected answer::: "+result);

         result = MyMath.smallestNum(112,111,300);
        System.out.println("111 is the expected answer::: "+result);

        double answer = MyMath.pow(2,2);
            System.out.println("4 expected answer = "+ answer);

        answer = MyMath.pow(3,3);
        System.out.println("4 expected answer = "+ answer);

        answer = MyMath.pow(4,4);
        System.out.println("4 expected answer = "+ answer);

        answer = MyMath.pow(3,4);
        System.out.println("4 expected answer = "+ answer);

        int total = MyMath.sumOfNumbers(4);
        System.out.println("10 expected answer = "+ total);

        total = MyMath.sumOfNumbers(5);
        System.out.println("15 expected answer = "+ total);

        total = MyMath.sumOfNumbers(7);
        System.out.println("28 expected answer = "+ total);

        total = MyMath.sumOfNumbers(10);
        System.out.println("55 expected answer = "+ total);

        int factorial = MyMath.factorial(4);
        System.out.println("Expected Answer 24 answer got = "+factorial);

        factorial = MyMath.factorial(7);
        System.out.println("Expected Answer 5040 answer got = "+factorial);

        factorial = MyMath.factorial(1);
        System.out.println("Expected Answer 1 answer got = "+factorial);

        factorial = MyMath.factorial(5);
        System.out.println("Expected Answer 120 answer got = "+factorial);

        boolean prime = MyMath.isPrime(5);
        System.out.println(" 5true expected answer = "+ prime);

        prime = MyMath.isPrime(11);
        System.out.println("11 true expected answer = "+ prime);

        prime = MyMath.isPrime(2);
        System.out.println("2 true expected answer = "+ prime);

        prime = MyMath.isPrime(12);
        System.out.println("12 false expected answer = "+ prime);

        prime = MyMath.isPrime(99);
        System.out.println("99 false expected answer = "+ prime);

        prime = MyMath.isPrime(12345);
        System.out.println("12345 false expected answer = "+ prime);

        int words = MyMath.NumberCount("THE CAT IN THE HAT");
        System.out.println("5 is expected result = "+words);

        words = MyMath.NumberCount("The Delegation Event model is one of the many techniques used to handle events in GUI (Graphical User Interface) programming languages. GUI represents a system where an user visually or graphically interacts with the system.");
        System.out.println("35 is expected result = "+words);

        boolean valid = MyMath.Validate("Paulcaff1");
        System.out.println("valid password : "+valid);

        valid = MyMath.Validate("caff1");
        System.out.println("Invalid password : "+valid);

        valid = MyMath.Validate("paulcaff1");
        System.out.println("Invalid password : "+valid);

        valid = MyMath.Validate("Srqf8vwq");
        System.out.println("valid password : "+valid);



        MyMath.NumberCounter(1,2,3,4,5,6);

        }



    }

