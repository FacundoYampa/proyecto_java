public class App {//app nombre de clase = nombre del archivo
    public static void main(String[] args) throws Exception {//fx principal de nuestro programa
        
        //Tipos de variables primitivas:
        //Numeros enteros:

        byte bt = 127; //[-127;127]
        short sh = -32768; // [-32768;32768]
        int entero = 30;
        long lg = 100;

        //Numeros decimles;
        float fl = 10.5f;
        double dbl = 10.35;

        //byte < short < int < long < float < double

        //Texto;
        char letra = 'a';
        String palabra = "palabra";

        //Boolean:
        boolean flag; //false (x defecto); true

        //Tipos WRAPPER
        Byte bb = -127;
        Short ss = 32767;
        Integer ii = 1000;
        Float ff = 10.5F;
        Double dd = 10.5;

        Object cajaGrande = 10;

        System.out.println("Hello, World!");
    }
}
