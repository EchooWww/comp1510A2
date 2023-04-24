package q1;

/**
 * Cylinder: represents a cylinder with radius and height.
 * 
 * @author Echo Wang - Set 1C
 * @version 1.0
 *
 */
public class Cylinder {

    /**
     * the radius of a cylinder.
     */
    private double radius;
    
    /**
     * the height of a cylinder.
     */
    private double height;
    
    /**
     * the constuctor for Cylinder class.
     * 
     * @param r the radius of the object
     * @param h the height of the object
     */
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    
    /**
     * Getter of radius.
     * 
     * @return radius
     */
    public double getR() {
        return radius;
    }
    
    /**
     * Getter of height.
     * @return height
     */
    public double getH() {
        return height;
    }
    
    /**
     * Setter of radius.
     * 
     * @param r radius
     */
    public void setR(double r) {
        radius = r;
    }
    
    /**
     * Setter of height.
     * 
     * @param h height
     */
    public void setH(double h) {
        height = h;
    }
    
    /**
     * Calculates and returns the surface area of a cylinder.
     * 
     * @return area
     */
    public double calcArea() {
        double area = 2 * Math.PI * radius * (radius + height);
        return area;
    }
    
    /**
     * Calculates and returns the volume of a cylinder.
     * 
     * @return volume
     */
    public double calcVol() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }
    
    /**
     * returns descriptinon of the cylinder.
     * 
     * @return the description
     */
    public String toString() {    
        return  "radius =" + radius 
                + "\nheight =" + height;
    }
}
