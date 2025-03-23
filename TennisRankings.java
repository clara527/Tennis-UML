import java.util.List;
import java.util.ArrayList;

public class TennisRankings {
    private List<TennisPlayer> rankedPlayers;

    public TennisRankings() {
        rankedPlayers = new ArrayList<>();
    }

    public void refreshRankings() {
        System.out.println("Refreshing player rankings...");
        for (TennisPlayer player : rankedPlayers) {
            player.checkRank();
        }
    }

    public void addPlayer(TennisPlayer player) {
        rankedPlayers.add(player);
        System.out.println(player.fullName + " added to the rankings.");
    }
}
