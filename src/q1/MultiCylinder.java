package q1;

/**
 * MultiCylinder: the driver class of Cylinder.
 * 
 * @author Echo Wang - Set 1C
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * Drives the program. Creates objects of Cylinder class.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        final double r1 = 1.0;
        final double h1 = 1.5;
        final double r2 = 2.0;
        final double h2 = 2.5;
        
        //instantiate first Cylinder object and print info before modification
        Cylinder c1 = new Cylinder(r1, h1);
        System.out.println("Cylinder object c1 before modification: \n"
                + c1);
       
        //modify first Cylinder object and print info after modification
        c1.setR(r2);
        c1.setH(h2);
        System.out.println("Cylinder object c1 after modification: \n"
                + c1 + "\nfinal volume = " + c1.calcVol() 
                + "\nfinal surface area = " + c1.calcArea());

        final double r3 = 3.0;
        final double h3 = 3.5;
        final double r4 = 4.0;
        final double h4 = 4.5;
       
        //instantiate second Cylinder object and print info before modification
        Cylinder c2 = new Cylinder(r3, h3);
        System.out.println("Cylinder object c2 before modification: \n"
                + c2);
        
        //modify first Cylinder object and print info after modification
        c2.setR(r4);
        c2.setH(h4);
        System.out.println("Cylinder object c2 after modification: \n"
                + c2 + "\nfinal volume = " + c2.calcVol() 
                + "\nfinal surface area = " + c2.calcArea());
        System.out.println("Question one was called and ran sucessfully.");
    }
}
