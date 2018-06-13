package lesson1.Marafon;

public class Team {
    String name;

    Competitor[] competitors;

    public Team(String teamName, String humanName, String catName, String dogName, String twoHumanName) {
        Competitor[] competitors = {new Human(humanName), new Human(twoHumanName), new Cat(catName), new Dog(dogName)};
        this.competitors = competitors;
        name = teamName;
    }

}
