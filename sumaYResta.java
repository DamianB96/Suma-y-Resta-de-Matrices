package sumaRestaMatrices;

import java.util.Scanner;

/**
 *
 * @author damian
 */
public class sumaYResta {

    public static void main(String[] args) {

        //declaro las variables
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matrizre[][] = new int[3][3];
        int choise, cont;

        Scanner in = new Scanner(System.in);

        //lleno la primera matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {

                matriz1[i][j] = (int) (Math.random() * 10);

            }
        }

        //lleno la segunda matriz
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {

                matriz2[i][j] = (int) (Math.random() * 10);

            }
        }

        do {
            System.out.println("Que operacion queres hacer con las matrices? ");
            System.out.println("1)Sumar");
            System.out.println("2)Restar");
            choise = in.nextInt();

            if (choise == 1) {

                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1.length; j++) {

                        matrizre[i][j] = matriz1[i][j] + matriz2[i][j];

                    }
                }

            } else if (choise == 2) {
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1.length; j++) {

                        matrizre[i][j] = matriz1[i][j] - matriz2[i][j];

                    }
                }
            } else if (choise != 1 && choise != 2) {

                System.out.println("No existe esa opcion!");
            }

            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1.length; j++) {
                    System.out.print("[" + matriz1[i][j] + "]");
                }
                if (i == 1 && choise == 1) {
                    System.out.print("   +   ");
                } else if (i == 1 && choise == 2) {
                    System.out.print("   -   ");
                } else {
                    System.out.print("       ");
                }
                for (int j = 0; j < matriz2.length; j++) {
                    System.out.print("[" + matriz2[i][j] + "]");

                }
                if (i == 1) {
                    System.out.print("   =   ");
                } else {
                    System.out.print("       ");
                }
                for (int j = 0; j < matrizre.length; j++) {
                    System.out.print("[" + matrizre[i][j] + "]");

                }
                System.out.println("");
            }

            System.out.println("Quiere hacer otra operacion? ");
            System.out.println("1)Si");
            System.out.println("2)No");
            cont = in.nextInt();

        } while (cont == 1);
    }
}
