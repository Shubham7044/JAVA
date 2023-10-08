public class Main {
    public static void main(String[] args) {

        //Implicit Conversion
        int radius = 600;
        double newRadius = radius;
        System.out.println(newRadius);


        //Explicit Conversion
        double diameter = 7.78;
        int newDiameter = (int) diameter;
        System.out.println(newDiameter);
    }
}