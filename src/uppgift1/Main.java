package uppgift1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //1.
        ArrayList<Matratt> meny = new ArrayList<>();


        Matratt pasta = new Matratt("Pasta", 90, 300, "Vegetarisk");
        Matratt sallad = new Matratt("Sallad", 70, 200, "Vegansk");
        Matratt meatballs = new Matratt("Köttbular", 100, 500, "Kött");

        meny.add(pasta);
        meny.add(sallad);
        meny.add(meatballs);

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
//GÖr enum, kolla hur man kan säkra up inehålet.
//Gör en metod som skriver olika texter baserat på enum