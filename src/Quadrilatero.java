public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retangulo: " + lado1 * lado2);

    }

    public static void area(double baseaMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio: " + ((baseaMaior + baseMenor)*altura)/2);

    }
}
