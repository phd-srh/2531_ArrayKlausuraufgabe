public class Main {

    /*
     * 3 Gründe, warum man Methoden benutzen sollte:
     * - um eine domainspezifische Sprache einzuführen, und nebenbei
     *   um den Programmcode übersichtlicher zu machen
     *   (Grundsatz: Programmteile nicht länger als eine Bildschirmseite)
     * - wiederholende Aufgaben sollen nur einmal bearbeitet werden (DRY)
     * - komplexe Probleme lassen sich dadurch in kleinere bearbeitbare
     *   Teilprobleme zerlegen
     */

    public static int differenzMinMax(int[] array) {
        int minimalerWert = array[0];
        int maximalerWert = array[0];
        for (int i=1; i < array.length; i++) {
            if (array[i] < minimalerWert) minimalerWert = array[i];
            if (array[i] > maximalerWert) maximalerWert = array[i];
        }
        return maximalerWert - minimalerWert;
    }

    public static int differenzMinMax_v1(int[] array) {
        return maximalerWertImArray(array) - minimalerWertImArray(array);
    }

    private static int minimalerWertImArray(int[] array) {
        int aktuellerMinmalerWert = Integer.MAX_VALUE;
        for (int element : array) {
            if (aktuellerMinmalerWert > element)
                aktuellerMinmalerWert = element;
        }
        return aktuellerMinmalerWert;
    }

    private static int maximalerWertImArray(int[] array) {
        int aktuellerMaximalerWert = Integer.MIN_VALUE;
        for (int element : array) {
            if (aktuellerMaximalerWert < element)
                aktuellerMaximalerWert = element;
        }
        return aktuellerMaximalerWert;
    }


    public static void main(String[] args) {

    }
}
