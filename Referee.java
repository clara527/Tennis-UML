public class Referee extends Person {
    private int yearsExperience;

    public Referee(String fullName, int yearsOld, int yearsExperience) {
        super(fullName, yearsOld);
        this.yearsExperience = yearsExperience;
    }

    public Referee() {
        super();
        this.yearsExperience = 0;
    }

    @Override
    public void showDetails() {
        System.out.println(fullName + " is a referee with " + yearsExperience + " years of coaching experience");
    }

    public void refGame() {
        System.out.println(fullName + " is reffing the game today");
    }
}
