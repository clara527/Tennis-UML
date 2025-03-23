public class TennisMain {
    public static void main(String[] args) {
        TennisPlayer player1 = new TennisPlayer("Roger Federer", 40, 1);
        TennisPlayer player2 = new TennisPlayer("Rafael Nadal", 38, 2);

        Match match = new Match(player1, player2);
        match.beginMatch();

        GrandSlamTournament gs = new GrandSlamTournament("US Open", 1000000);
        Helper.printTourneyDetails(gs);
        gs.kickOff();

        Coach coach = new Coach("Ivan Lendl", 60, "Offensive Play");
        coach.trainAthlete();

        Referee ref = new Referee("Carlos Ramos", 45, 20);
        ref.refGame();
    }
}
