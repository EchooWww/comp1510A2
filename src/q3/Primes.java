package q3;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Primes: this program usese the sieve of Eratosthenes 
 * to determine which numbers are prime within a upper bound entered by user.
 *
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class Primes {
    
    /**
     * An boolean arraylist for primes, the value is true for primes.
     */
    private ArrayList<Boolean> primes = new ArrayList<Boolean>();
    
    /**
     * Constructor of the Primes class.
     * 
     * @param n the maximum index of the primes ArrayList (the upper bound)
     */
    public Primes(int n) {
        primes.ensureCapacity(n);
        primes = markPrimes(n);
    }
    
    /**
     * Finds and marks prime using the Sieve of Eratosthenes.
     * 
     * @param n the upper bound
     * @return a boolean list representing prime or not
     */
    private ArrayList<Boolean> markPrimes(int n) {
        ArrayList<Boolean> primeList = new ArrayList<Boolean>();
        for (int j = 0; j <= n; j++) {
            primeList.add(true);
        }
        primeList.set(0, false);
        primeList.set(1, false);
        int i = 2;
        //find the muptiples of i and set to false
        while (i <= Math.sqrt(n)) {
            for (int p = i * 2; p <= n; p += i) {
                primeList.set(p, false);
            } 
            i++;
        }
        return primeList;
    }
    
    /**
     * Prints out the list of primes.
     */
    public void printPrimes() {
        for (int i = 0; i <= primes.size() - 1; i++) {
            if (primes.get(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    /**
     * Counts the number of primes.
     * 
     * @return the number of primes
     */
    public int countPrimes() {
        int i = 0;
        int j = 0;
        while (j <= primes.size() - 1) {
            if (primes.get(j)) {
                i++;
            }
            j++;
        }
        return i;
    }
    
    /**
     * Decides if an int is prime or not.
     * 
     * @param n the number
     * @return the true or false being a prime
     */
    public boolean isPrime(int n) {
        return primes.get(n);
    }
    
    /**
     * Drives the program. 
     * Validates user input, creates an object of Primes class with it, 
     * and print results with calling methods in Primes class.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program uses the sieve of Eratosthenes"
                + "to determine which numbers are prime.\n"
                + "Enter an upper bound:");
        
        //validate the upper bound to be a integer greater than 1
        while (!scan.hasNextInt()) {
            System.out.println("Invalid input! "
                    + "Please enter an integer larger than 1.");
            scan.next();
        }
        int n = scan.nextInt();
        while (n <= 1) {
            System.out.println("Invalid input! "
                    + "Please enter an integer larger than 1.");
            while (!scan.hasNextInt()) {
                System.out.println("Invalid input! "
                        + "Please enter an integer larger than 1.");
                scan.next();
            }
            n = scan.nextInt();
        }
        
        //create a Prime obeject with user input and print results
        Primes primes1 = new Primes(n);
        int count = primes1.countPrimes();
        System.out.println("There are " + count + " primes:\n"
                + "The prime numbers between 0 and " + n + " are:");
        primes1.printPrimes();
        scan.close();
        System.out.println("");
        System.out.println("Question three was called and ran sucessfully.");
    }

}
