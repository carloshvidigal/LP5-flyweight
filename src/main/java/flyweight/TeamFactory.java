package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeamFactory {
    private static Map<String, Team> teams = new HashMap<>();

    public static Team getTeam(String name, String city) {
        Team team = teams.get(name);
        if (team == null) {
            team = new Team(name, city);
            teams.put(name, team);
        }
        return team;
    }

    public static int getTotalTeams() {
        return teams.size();
    }


}
