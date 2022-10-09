import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrice {
    public static void main(String[] args) {
        int[][] matrice = {
                {1, 5, 7, 3},
                {2, 6, 9, 8},
                {3, 5, 0, 4},
                {1, 1, 1, 1},

        };
        int sum = 0;
        List<Integer> denied = new ArrayList<>(); // tre sa gasesc coloanele pe care apare elem 0
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
                if (!denied.contains(j)) {
                    sum = sum + matrice[i][j];
                }
                if (matrice[i][j] == 0) {
                    denied.add(j);
                }
                System.out.println();
            }
        }
        System.out.println("Coloanele pe care exista elem 0 sunt " + denied);
        System.out.println("Suma numerelor din matrice este " + sum);
    }
}
