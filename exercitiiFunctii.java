public class exercitiiFunctii {
    // o functie care sa returneze aria unui dreptunghi
    // rasp va fi de tip double
    // are nevoie de parametrii? YES
    public static double arieDreptunghi(double Lungime, double latime) {
        double arieDrept = Lungime * latime;
        return arieDrept;
    }

    // Aria cercului PI * r patrat
    // va da un raspuns? da---> de tip double
    // are nevoie de parametrii? Are
    public static double arieCerc(double raza) {
        final double PI = 3.14;
        double arieC = PI * Math.pow(raza,2);
        return arieC;
    }

    // o functie care returneaza cate caractere are numele+ prenumele tau
    public static int lettersCounter(String nume, String prenume){
        int letterscount = nume.length() + prenume.length();
        return letterscount;
    }

    public static void main(String[] args) {
        System.out.println(arieDreptunghi(7.5,5.5));
        System.out.println(arieDreptunghi(4.8, 3.5));

        System.out.println(arieCerc(5.2));
        System.out.println(arieCerc(8));


        System.out.println(lettersCounter("Manta","Mirela"));
        System.out.println(lettersCounter("Oprea", "TiberiuAlexandru"));
    }
}
