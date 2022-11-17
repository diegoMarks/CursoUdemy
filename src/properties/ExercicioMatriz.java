package properties;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de linhas: ");
        int n = sc.nextInt();

        System.out.print("Quantidade de colunas: ");
        int j = sc.nextInt();

        int[][] matriz = new int[n][j];

        System.out.println();
        System.out.println("Preenchendo a Matriz..");
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < j; y++) {
                matriz[i][y] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Valor a encontrar: ");
        int valor = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int y = 0; y < j; y++) {
                if (matriz[i][y] == valor) {
                    System.out.println("Position: " + i + ", " + y);

                    if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}

                }
            }
        }
        sc.close();
    }
}
