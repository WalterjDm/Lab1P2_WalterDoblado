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
                double a, b, c, des;
                System.out.println("ingrese a");

                System.out.println("ingrese b");
                System.out.println("ingrese c");
                System.out.println("ingrese des");

            } else if (opc == 2) {
                int x = 0;
                int des = 0;
                double acum = 0;
                double expo = 0;
                double sc;
                double alt = 0;
                double cont = 0;
                System.out.println("ingrese x");
                x = lea.nextInt();
                System.out.println("ingrese el desplasamiento");
                des = lea.nextInt();
                double scd = taysin(x, des, acum, alt, cont);
                System.out.println("el seno es: "+scd);
                double del =taycos( x,  des,  acum,  alt,  cont);
                System.out.println("el coseno es: "+del);
                double tan =taycos( x, des, acum, alt, cont);
                System.out.println("tangente es: "+tan);
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

//    public static int metod(double a, double b, double c, double des) {
//
//    }
    public static int taysin(int x, int des, double acum, double alt, double cont) {
//        int cont = 0;
//        int acum = 0;
        double expo = 0;
        double sc;
//        int alt = 0;

        if (des == 0) {

            return (int) alt;

        } else {
            sc = (int) Math.pow(-1, cont);
            System.out.println("numerador exponente" +sc);
            double fac = 2 * cont + 1;
            System.out.println("denominador" +fac);
            double fa = factorial(fac);
            System.out.println("factorial"+fa);
            sc = sc / fa;
            System.out.println("divicion"+sc);
            expo = 2 * cont + 1;
            System.out.println("expo de x"+expo);

            double expo2 =  Math.pow(x, expo);
            System.out.println("resultado de expo de x"+expo2);
            alt += sc * expo2;
            System.out.println("final"+alt);
            
            return taysin(x, des - 1, acum, alt, cont);

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

        if (des == 0) {

            return (int) alt;

        } else {
            sc = (int) Math.pow(-1, cont);
            System.out.println("numerador exponente" +sc);
            double fac = 2 * cont;
            System.out.println(""+fac);
            double fa = factorial(fac);
            System.out.println(fa);
            sc = sc / fa;
            System.out.println(sc);
            expo = 2 * cont;
            System.out.println(expo);

            double expo2 =  Math.pow(x, expo);

            alt += sc * expo2;
            System.out.println(alt);
            
            return taysin(x, des - 1, acum, alt, cont);

        }

    }
            public static double taytan(int x, int des, double acum, double alt, double cont) {
//        int cont = 0;
//        int acum = 0;
        double expo = 0;
        double sc;
//        int alt = 0;

        if (des == 0) {

            return (int) alt;

        } else {
            if(x){
                
            }
            sc = (int) Math.pow(-1, cont);
            System.out.println(sc);
            double fac = 2 * cont + 1;
            System.out.println(fac);
            double fa = factorial(fac);
            System.out.println(fa);
            sc = sc / fa;
            System.out.println(sc);
            expo = 2 * cont + 1;
            System.out.println(expo);

            double expo2 =  Math.pow(x, expo);

            alt += sc * expo2;
            System.out.println(alt);
            
            return taysin(x, des , acum, alt, cont);

        }

    }


}
