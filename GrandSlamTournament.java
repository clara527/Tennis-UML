public class GrandSlamTournament extends Tournament {
    public GrandSlamTournament(String tourneyName, int cashPrize) {
        super(tourneyName, cashPrize);
    }

    @Override
    public void kickOff() {
        System.out.println(tourneyName + " Grand Slam is kicking off with a prize of $" + cashPrize);
    }
}

