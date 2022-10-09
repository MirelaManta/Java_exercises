import java.util.ArrayList;
import java.util.Arrays;

public class ProdusMaxim {
    public static void main(String[] args) {
        int[] numere = {4, 7, 9, 10, 6};
        int produsMaxim = numere[0] * numere[1];
        for (int i = 1; i < numere.length; i++) {
            System.out.println("Produsul nr adiacente este " + produsMaxim);
            if (numere[i]*numere[i-1] > produsMaxim) {
                produsMaxim = numere[i]*numere[i-1];
            } else {
                System.out.println("Produsul maxim ramane " + produsMaxim);
            }
        }
        System.out.println("Produsul maxim maxim este " + produsMaxim);


        // problema cu nr maxim din liste de liste
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(3);
        a1.add(9);
        a2.add(4);
        a2.add(6);
        a2.add(8);
        mat.add(a1);
        mat.add(a2);
        System.out.println(mat);

        ArrayList<Integer> numere0 = new ArrayList(Arrays.asList(new Integer[] {1, 3, 7}));
        ArrayList<Integer> numere1 = new ArrayList(Arrays.asList(new Integer[] {7, 12, 4}));
        ArrayList<Integer> numere2 = new ArrayList(Arrays.asList(new Integer[] {6, 3, 11}));

        ArrayList<ArrayList<Integer>> boss = new ArrayList(Arrays.asList(numere0, numere1, numere2));
        System.out.println(boss);
        for (ArrayList lista:boss){
            System.out.println("Lista curenta este " + lista);
        }

        int nr_maxim = 0;
        for (int i = 0; i < boss.size(); i =i+1) {
             ArrayList<Integer> liste = boss.get(i);
             for (int j = 0; j < liste.size(); j = j + 1) {
                if (liste.get(j) > nr_maxim) {
                    nr_maxim = liste.get(j);
                    System.out.println("nr maxim este " + nr_maxim);
                } else {
                    System.out.println("Am gasit deja nr maxim");
                }
            }
        }
        System.out.println("Nr maxim din lista de liste este " + nr_maxim);
    }
}

