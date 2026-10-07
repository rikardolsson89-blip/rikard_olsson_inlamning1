package uppgift3;

public class Main {
    public static void main(String[] args){

        Person rikard = new Person(1989);

        Person petter = new Person(1994);

        rikard.setName("Rikard Olsson");
        rikard.setAddres("Skomakargatan 14");
        rikard.setPostNumer(75434);
        rikard.setPostOrt("Uppsala");

        System.out.println("\n" + rikard.getName() + " bor för närvarande på " + rikard.getAddres() + ", " + rikard.getPostNumer() + " " + rikard.getPostOrt() + ".");

        petter.setName("Petter Lyhne");
        petter.setAddres("Ritargatan 6B");
        petter.setPostNumer(75433);
        petter.setPostOrt("Uppsala");

        System.out.println("\n" + petter.getName() + " bor för närvarande på " + petter.getAddres() + ", " + petter.getPostNumer() + " " + petter.getPostOrt() + ".");

        System.out.println("\n" +rikard.getName() + " flyttar...");

        changeAdres(rikard, petter);

        System.out.println("\n" + rikard.getName() + " bor nu på " + rikard.getAddres() + ", " + rikard.getPostNumer() + " " + rikard.getPostOrt() + ".");
        System.out.println(petter.getName() + " bor kvar på " + petter.getAddres() + ", " + petter.getPostNumer() + " " + petter.getPostOrt() + ".");

    }

    public static void changeAdres(Person person1, Person person2){
        person1.setAddres(person2.getAddres());
        person1.setPostNumer(person2.getPostNumer());
        person1.setPostOrt(person2.getPostOrt());

    }
}