package uppgift2;

public class Main {
    public static void main(String[] args){

        Student rikard = new Student("Rikard", "Olsson", "Nackakademin", 150);

        rikard.setAge(37);

        System.out.println("\n" + rikard.getFirstName() + " " + rikard.getLastName() + " är " + rikard.getAge() + " år gammal och pluggar på " + rikard.getSchoolName() + ".");

    }
}

//Förstog inte riktgit med att skriva ut med setters?
