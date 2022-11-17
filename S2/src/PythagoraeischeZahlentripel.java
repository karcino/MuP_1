public class PythagoraeischeZahlentripel {

    public static void main(String[] args) {
        System.out.println("Tripel: " + pythagoraeischeZahlentripel(0,2000));
    }

    // a)
    public static int[] createIntArray(int minimum, int maximum) {
        int[] arr = new int[maximum - minimum + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = minimum++;
        }
        return arr;
    }

    // b)
    public static void arrayInhaltAusgeben(int[] array) {
        for (int var: array) {
            System.out.print(var + ",");
        }
    }

    // c)
    public static int[] quadriere(int[] array) {
        int[] arrQuad = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrQuad[i] = (int) Math.pow(array[i], 2);
        }
        return arrQuad;
    }

    // d)
    public static boolean testAufQuadratzahl(int zahl) {
        if (Math.sqrt(zahl)%1 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // e)
    public static int pythagoraeischeZahlentripel(int minimum,int maximum) {
        int[] arrQuad;
        arrQuad = quadriere(createIntArray(minimum,maximum));
        arrayInhaltAusgeben(arrQuad);
        int tripelCount = 0;

        for (int j: arrQuad) {
            for (int i: arrQuad) {
                if (!(j > i)) {
                    break;
                } else if (i == 0 || j == 0) {  // optinal ohne 0, weil pythagoreische Tripel mit i oder j gleich 0 trivial
                    continue;
                }
                if(testAufQuadratzahl(j-i)) {
                    System.out.println("Inhalt des Arrays an der Position i: " + j);
                    System.out.println("Inhalt des Arrays an der Position j: " + i);
                    System.out.println("Differenz: " + (j-i));
                    System.out.println("Ausgabe \n" + Math.sqrt(i) + "^2 + "
                            + Math.sqrt(j-i) + "^2 = " + Math.sqrt(j) + "^2");
                    tripelCount++;
                }
            }
        }
        return tripelCount;
    }

}
