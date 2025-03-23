public class Coach extends Person {
    private String gamePlan;

    public Coach(String fullName, int yearsOld, String gamePlan) {
        super(fullName, yearsOld);
        this.gamePlan = gamePlan;
    }

    public Coach() {
        super();
        this.gamePlan = "Default Game Plan";
    }

    @Override
    public void showDetails() {
        System.out.println(fullName + " is a coach with the game plan: " + gamePlan);
    }

    public void trainAthlete() {
        System.out.println(fullName + " is training the player and game plan is" + gamePlan);
    }
}
