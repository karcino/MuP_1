public class Kugeln {

    /**
     * @author Paul Fiedler 3726896
     */
    public static void main(String[] args) {

        Kugel r5 = new Kugel(5);
        Kugel r7 = new Kugel(7);
        Kugel rminus21 = new Kugel(-21);

        System.out.println("Eigenschaften einer Kugel mit dem Radius " + r5.getRadius());
        System.out.println("Durchmesser: " + r5.getDurchmesser() + "   Volumen: " + r5.getVolumen()
                + "   Oberfläche: " + r5.getOberfläche());

        System.out.println();
        System.out.println("Eigenschaften einer Kugel mit dem Radius " + r7.getRadius());
        System.out.println("Durchmesser: " + r7.getDurchmesser() + "   Volumen: " + r7.getVolumen()
                + "   Oberfläche: " + r7.getOberfläche());

        System.out.println();
        System.out.println("Eigenschaften einer Kugel mit dem Radius " + rminus21.getRadius());
        System.out.println("Durchmesser: " + rminus21.getDurchmesser() + "   Volumen: " + rminus21.getVolumen()
                + "   Oberfläche: " + rminus21.getOberfläche());


    }
}
