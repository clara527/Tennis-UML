public class Match {
    private TennisPlayer playerA;
    private TennisPlayer playerB;

    public Match(TennisPlayer playerA, TennisPlayer playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void beginMatch() {
        System.out.println("Match between " + playerA.fullName + " and " + playerB.fullName + " is starting now!");
        playerA.playGame();
        playerB.playGame();
        System.out.println("The match has ended. Check the results online!");
    }
}
