import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercitiiTibi {
    public static void main(String[] args) {
        // 1. De cate ori se impart la 2 nr din lista?
//        List<Integer> lista = Arrays.asList(new Integer[]{6, 2, 5, 10});
//        int contor = 0;
//        for (int i = 0; i < lista.size(); i= i+1) {
//            int impartealaLaDoi = lista.get(i);
//            while (impartealaLaDoi % 2 == 0) {
//                impartealaLaDoi = impartealaLaDoi / 2;
//                contor = contor + 1;
//                }
//            }
//        System.out.println("Nr din lista se impart la 2 de " + contor+ " ori");
//
//
//        // 2. Afla daca un nr este prim!
//        Scanner sc = new Scanner(System.in); // preluare date de la tastatura
//        System.out.println("Introdu un nr ");
//        int oare_prim = sc.nextInt();
//        int counter = 0; // declar o variabila care o sa tina de cate ori se imparte nr
//        for (int n = 2; n < oare_prim; n++){
//            if (oare_prim % n ==0) {
//                counter = counter +1;
//            }
//        }
//        if (counter == 0) {
//            System.out.println("Nr este prim.");
//        } else {
//            System.out.println("Nu este un nr prim.");
//        }


        // 3. VERIFICA DACA NR DINTR-O LISTA SUNT PRIME SI DACA SUNT ADAUGA LE LA O LISTA NOUA
//        List<Integer>candidatiPrimi = Arrays.asList(new Integer[] {1,2,4,9,7});
//        List<Integer> listaPrimi = new ArrayList<>();
//        for (int i=0; i < candidatiPrimi.size(); i= i+1) {
//            int c = 0; // asta o sa tina de cate ori se imparte un nr
//            for( int j = 1; j < candidatiPrimi.get(i) ; j++){
//                if (candidatiPrimi.get(i) % j == 0){
//                    c = c + 1;
//                    System.out.println(candidatiPrimi.get(i) + " se imparte cu " + j);
//                }
//            }
//            System.out.println(candidatiPrimi.get(i) + " are " + c + " divizori.");
//            if (c <= 1) {
//                listaPrimi.add(candidatiPrimi.get(i));
//                System.out.println("Este nr prim, il adaug la lista noua.");
//            } else {
//                System.out.println("Nu este nr prim.");
//            }
//            }
//        System.out.println(listaPrimi);


        /*
        4. Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an
non-negative integer size.
Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be
bigger than the previous one exactly by 1.
He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of
additional statues needed.
 VARIANTA 1
         */

//        List<Integer> statues = Arrays.asList(new Integer[]{2, 8, 7, 1});
//        int max = statues.get(0);
//        int min = statues.get(0);
//        for(int i = 0; i < statues.size(); i++) {
//            if (statues.get(i) > max) {
//                 max = statues.get(i);
//            }
//            if (statues.get(i) < min) {
//                min = statues.get(i);
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(statues.size());
//        System.out.println("Este necesar sa fie adaugate " + (max - min - statues.size() + 1) + " elemente.");
//
//        // VARIANTA 2
//        List<Integer> statues = Arrays.asList(new Integer[]{2, 8, 7, 1}); //lista nr intregi mai mari decat 0
//        for (int i = 0; i < statues.size(); i++) {
//            for (int j = i + 1; j < statues.size(); j++) {
//                if (statues.get(i) > statues.get(j)){
//                    int temporar = statues.get(i);
//                    statues.set(i,statues.get(j)) ;
//                    statues.set(j, temporar);
//
//                }
//            }
//        }
//        System.out.println(statues);
//        int counter = 0; // tine cate elemente trebuiesc adaugate
//        for(int i = 1; i < statues.size(); i++){
//            if (statues.get(i) - statues.get(i-1) != 1) {
//                counter = counter + statues.get(i) - statues.get(i-1) - 1;
//            }
//        }
//        System.out.println("Trebuiesc adaugate " + counter + " elemente listei.");


        // 5. AlmostIncreasingSequence
        /* Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing
        sequence by removing no more than one element from the array.
         */
        List<Integer> sequence = Arrays.asList(new Integer[]{2, 3, 9, 6, 7, 8});
        for (int i = 0; i < sequence.size(); i++) {
            List<Integer> sequenceNd = new ArrayList<>(sequence);
            sequenceNd.remove(i);
            int contor = 0; // tine minte daca si cate cazuri de perechi descrescatoare
            for (int j = 0; j < sequenceNd.size() - 1; j++) {
                if (sequenceNd.get(j) >= sequenceNd.get(j + 1)) {
                    contor = contor + 1;
                }
            }
            if (contor == 0) {
                System.out.println("Lista e strict crescatoare.");
                System.out.println(true);
                break;
            } else {
                System.out.println("Exista " + contor + " nr de perechi descrescatoare.");
            }
        }
    }
}