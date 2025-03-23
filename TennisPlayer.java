public class TennisPlayer extends Person implements Playable, Rankable {
    private int rankSpot;

    public TennisPlayer(String fullName, int yearsOld, int rankSpot) {
        super(fullName, yearsOld);
        this.rankSpot = rankSpot;
    }

    public TennisPlayer() {
        super();
        this.rankSpot = 0;
    }

    @Override
    public void showDetails() {
        System.out.println(fullName + " is a tennis player and is " + yearsOld + " with rank " + rankSpot);
    }

    @Override
    public void playGame() {
        System.out.println(fullName + " is playing a competitive tennis match");
    }

    @Override
    public void checkRank() {
        System.out.println(fullName + " current ranking: " + rankSpot);
    }
}
