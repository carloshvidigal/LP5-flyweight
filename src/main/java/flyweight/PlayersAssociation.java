package flyweight;

import java.util.ArrayList;
import java.util.List;

public class PlayersAssociation {

    private List<Player> players = new ArrayList<>();

    public void enroll(String playerName, String teamName, String teamCity) {
        Team team = TeamFactory.getTeam(teamName, teamCity);
        Player player = new Player (playerName, team);
        players.add(player);
    }

    public List<String> getPlayers() {
        List<String> list = new ArrayList<String>();
        for (Player player : this.players) {
            list.add(player.getPlayer());
        }
        return list;
    }
}
