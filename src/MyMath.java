public class MyMath {


        public static int smallestNum (int num1,int num2,int num3){
            int smallest = 0;

            if(num1 < num2 && num1 < num3) {
                smallest = num1;
            }

            else if (num2 < num3) {
                    smallest = num2;
                }
                else {
                    smallest = num3;
                }

            return smallest;

        }

        public static double pow(double a,double b){

            double result = a;

            if(b >= 1){
               for(int i = 1; i < b; i++ ){
                   result *= a;

               }

            }

            return result;
        }


        public static int sumOfNumbers(int n) {
        int total = 0;

        for(int i = 1; i <= n; i++) {

            total += i ;


        }

        return total;
        }

        public static int factorial (int n){
            int factorial = 1;

            for(int i = 1; i <= n; i++){

                factorial *= i;
            }

            return factorial;
        }

        public static boolean isPrime(int x ){
            boolean ans = false;

            if(x == 2){
                ans = true;
            }
                else if(x !=2) {
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

        public static void NumberCount ()

}
