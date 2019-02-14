import java.util.*;

public class myPow {
    public static double myPow(double x, int y){

       double result = 0;

        if ( y == 0) {
            return 1;
        }
        if(y == 1){
                return x;
        }
        else{
             result = x * myPow(x, y-1);
            return result;

        }




    }
}
