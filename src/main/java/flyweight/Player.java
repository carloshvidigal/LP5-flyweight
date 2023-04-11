package flyweight;

public class Player {

    private String name;
    private Team team;

    public Player(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public String getPlayer() {
        return "Player {" +
                "Player name: " + this.name +
                " - Team: " + team.getName() +
                " - Team City: " + team.getCity() + "}";
    }
}
