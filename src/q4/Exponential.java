package q4;

/**
 * Exponential: calculates the value of e^x with a given x using loops.
 * 
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class Exponential {
    
    /**
     * Calculated e to the power of x.
     * 
     * @param x the value of the exponent
     * @return the value of e^x
     */
    public static double exp(double x) {
        double expo = 1;
        double xn = 1;
        final int n = 30;
        
        //when x >= 0
        if (x >= 0) {
            for (int i = 0; i <= n; i++) {
                xn *= x / (i + 1);
                expo += xn;
            } return expo;
        
        //when x < 0
        } else {
            for (int i = 0; i <= n; i++) {
                xn *= -x / (i + 1);
                expo += xn;
            } return 1 / expo;
        }
    }
    
    /**
     * Drives the program. Prints x and e^x with for x from -10.0 to 10.0
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final double a = -10.0;
        final double b = 10.0;
        System.out.println("x\te^x");
        //print the exponent of e from -10 to 10
        for (double x = a; x <= b; x++) {
            System.out.println(x + "\t" + exp(x));
        }
        System.out.println("Question four was called and ran sucessfully.");
    }
}

