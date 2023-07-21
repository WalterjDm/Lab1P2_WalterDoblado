package lab1p2_walterdoblado;

import java.util.Scanner;

public class Lab1P2_WalterDoblado {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int opc = 0;
        while (opc != 3) {

            menu();
            opc = lea.nextInt();
            if (opc == 1) {
                double a = 0, b = 0, c = 0, des = 0;
                int cont = 0;
                int expo = 0;
                System.out.println("ingrese a");
                a = lea.nextInt();
                System.out.println("ingrese b");
                b = lea.nextInt();
                System.out.println("ingrese c");
                c = lea.nextInt();
                ////es el 100 pero lo puede variar
                System.out.println("ingrese desplasamiento");
                des = lea.nextInt();

                double vert = -b / 2 * a;

                vert = vert - 200;
                double del = metod(a, b, c, des, vert, cont, expo);

                System.out.println(del);

            } else if (opc == 2) {
                int x = 0;
                int des = 0;
                double acum = 0;
                double expo = 0;
                double sc;
                double alt = 0;
                double cont = 0;
                int x2 = x;
                System.out.println("ingrese x");
                x = lea.nextInt();
                System.out.println("ingrese el desplasamiento");
                des = lea.nextInt();
                if (x > 90) {
                    System.out.println("ingrese un numero de x menor a noventa");
                    x2 = lea.nextInt();

                }
                double scd = taysin(x, des, acum, alt, cont);
                System.out.println("el seno es: " + scd);
                double del = taycos(x, des, acum, alt, cont);
                System.out.println("el coseno es: " + del);

                double tan = taycos(x2, des, acum, alt, cont);
                System.out.println("tangente es: " + tan);
            } else if (opc == 3) {
                System.out.println("salio del codigo");

            } else {
                System.out.println("invalido");
            }

        }

    }

    public static void menu() {

        System.out.println("---Menu---"
                + "\n1. Ejercicio 1"
                + "\n2. Ejercicio 2"
                + "\n3. salir");

    }

    public static double metod(double a, double b, double c, double des, double vert, int cont, int expo) {

        if (cont == des) {
            return vert;
        } else {

            expo = (int) Math.pow(vert, 2);
            vert = vert - 2 * expo + vert + 3;
            vert = vert / 4 * vert + 1;
            return metod(a, b, c, des, vert, cont + 1, expo);

        }
    }

    public static int taysin(int x, int des, double acum, double alt, double cont) {
//        int cont = 0;
//        int acum = 0;
        double expo = 0;
        double sc;
//        int alt = 0;

        if (cont == des) {

            return (int) alt;

        } else {
            sc = (int) Math.pow(-1, cont);

            double fac = 2 * cont + 1;

            double fa = factorial(fac);

            sc = sc / fa;

            expo = 2 * cont + 1;

            double expo2 = Math.pow(x, expo);

            alt += sc * expo2;

            return taysin(x, des, acum, alt, cont + 1);

        }

    }

    private static double factorial(double n) {

        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }

    }

    public static int taycos(int x, int des, double acum, double alt, double cont) {
//        int cont = 0;
//        int acum = 0;
        double expo = 0;
        double sc;
//        int alt = 0;

        if (cont == des) {

            return (int) alt;

        } else {
            sc = (int) Math.pow(-1, cont);

            double fac = 2 * cont;

            double fa = factorial(fac);

            sc = sc / fa;

            expo = 2 * cont;

            double expo2 = Math.pow(x, expo);

            alt += sc * expo2;

            return taysin(x, des, acum, alt, cont + 1);

        }

    }

    public static double taytan(int x, int des, double acum, double alt, double cont) {
        Scanner lea = new Scanner(System.in);
//        int cont = 0;
//        int acum = 0;
        double expo = 0;
        double sc;
//        int alt = 0;

        if (cont == des) {

            return (int) alt;

        } else {

            sc = (int) Math.pow(-4, cont);

            int expo3 = 0;
            expo3 = (int) Math.pow(x, 2);
            sc = 2 * cont * sc * (1 - expo3);

            double fac = 2 * cont;

            double fa = factorial(fac);

            sc = sc / fa;

            expo = 2 * cont - 1;

            double expo2 = Math.pow(x, expo);

            alt += sc * expo2;

            return taysin(x, des, acum, alt, cont + 1);

        }

    }

}
