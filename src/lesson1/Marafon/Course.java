package lesson1.Marafon;

public class Course {
    Obstacle[] course;

    public Course() {
        Obstacle[] course = {new Cross(500), new Wall(2), new Wall(1), new Cross(120)};
        this.course = course;
    }

    public void startDistance(Team team) {

        System.out.println("***** В команде " + team.name + ":              *****");

        for (
                Competitor c : team.competitors) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }

        System.out.print("*****Команда " + team.name + " закончила марафон*****\n\n");

    }

    public void teamInfo(Team team) {
        System.out.println("***** В команде " + team.name + ":              *****");
        for (
                Competitor c : team.competitors) {
            c.info();
        }
        System.out.print("*****Команда " + team.name + " **********************\n\n");
    }
}
