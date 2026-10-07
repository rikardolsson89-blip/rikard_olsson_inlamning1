package uppgift1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Matratt> meny = new ArrayList<>();


        Matratt pasta = new Matratt("Ost Pasta", 90, 350, MatTyp.Vegetarisk);
        Matratt sallad = new Matratt("Penat Sallad", 70, 300, MatTyp.Vegansk);
        Matratt meatballs = new Matratt("Köttbular med Mos", 100, 500, MatTyp.Kött);
        Matratt chiken = new Matratt("Kyckling & Ris", 85, 250, MatTyp.Kalorisnål );

        meny.add(pasta);
        meny.add(sallad);
        meny.add(meatballs);
        meny.add(chiken);

        System.out.println("\nDagens lunch meny:");

        for (Matratt meal : meny) {
            System.out.println("\n" + meal.name + ":");
            System.out.println("Pris: " + meal.price);
            System.out.println("Kalorier: " + meal.calories);
            System.out.println("Typ: " + meal.typ);
            System.out.println("---");

        }
    }
}
