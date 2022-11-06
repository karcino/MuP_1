import java.lang.Math;

public class Kugel {
    private double radius;

    public Kugel(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDurchmesser() {
        return 2*radius;
    }

    public double getVolumen() {
        double v = (1.33) * 3.14 * Math.pow(radius, 3);
        return v;
    }

    public double getOberfläche() {
        double o = 4 * 3.14 * Math.pow(radius, 2);
        return o;
    }
}
