import java.util.*;

public class Anotimpuri {
    public static void main(String[] args) {
        // declar un map
        Map<String, List<String>> anotimpi = new HashMap<>();
        anotimpi.put("vara", Arrays.asList( new String[] {"iunie","iulie", "august"}));
        anotimpi.put("primavara", Arrays.asList(new String[] {"martie", "aprilie", "mai"}));
        anotimpi.put("toamna", Arrays.asList(new String[] {"septembrie"," octombrie", "noiembrie"}));
        anotimpi.put("iarna", Arrays.asList(new String[] {"decembrie", "ianuarie", "februarie"}));

        // aflu valori
        System.out.println("Numele lunilor de primavara sunt " + anotimpi.get("primavara"));
        System.out.println("Lunile de vara se numesc " + anotimpi.get("vara"));
        System.out.println("Iarna contine urmatoarele luni" + anotimpi.get("iarna"));
        System.out.println("Ziua mea de nastere este toamna. Lunile de toamna sunt " + anotimpi.get("toamna"));
        System.out.println(anotimpi.keySet());

        // actualizez valori
        anotimpi.replace("vara", Arrays.asList(new String[]{"Ciresar", "Cuptor", "Gustar"}));
        System.out.println("Am vorbit eu acolo sus sa se schimbe lunile de vara in " + anotimpi.get("vara"));

        // aflu dimensiunea
        System.out.println(anotimpi.size());

        // sterg un anotimp
        anotimpi.remove("iarna");
        System.out.println(anotimpi.size());
        System.out.println(anotimpi);

        // afisez una din valori
        System.out.println("A doua luna de vara este " + anotimpi.get("vara").get(1));

        // scot una din valori(luni)
       String[] lunile_v = {"iunie,", "iulie", "august"};
       List<String> lunile_verii = new ArrayList<>(Arrays.asList(lunile_v));
       lunile_verii.add("jador");
       System.out.println(lunile_verii);

        int index_iulie = lunile_verii.indexOf("iulie");
        lunile_verii.remove(2);
        System.out.println(lunile_verii);





    }


}
