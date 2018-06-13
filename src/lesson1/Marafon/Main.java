package lesson1.Marafon;

public class Main {
    public static void main(String[] args) {

        Course course = new Course();
        Team team1 = new Team("team1","human1","cat1","dog1","human11");
        Team team2 = new Team("team2","human2","cat2","dog2","human22");
        Team team3 = new Team("team3","human3","cat3","dog3","human33");
        course.startDistance(team1);
        course.startDistance(team2);
        course.startDistance(team3);
        course.teamInfo(team1);
        course.teamInfo(team2);
        course.teamInfo(team3);
    }
}
