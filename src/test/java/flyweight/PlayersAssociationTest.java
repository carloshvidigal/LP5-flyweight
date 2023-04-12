package flyweight;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.List;

import static java.lang.reflect.Array.*;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayersAssociationTest {

    @Test
    void shouldReturnPlayers() {
        PlayersAssociation playerAssociation = new PlayersAssociation();
        playerAssociation.enroll("Léo Jardim", "Vasco da Gama", "Rio de Janeiro");
        playerAssociation.enroll("Puma Rodriguez", "Vasco da Gama", "Rio de Janeiro");
        playerAssociation.enroll("Alex Teixeira", "Vasco da Gama", "Rio de Janeiro");
        playerAssociation.enroll("Raphael Veiga", "Palmeiras", "São Paulo");

        List<String> list = asList(
                "Player {Player name: Léo Jardim - Team: Vasco da Gama - Team City: Rio de Janeiro}",
                "Player {Player name: Puma Rodriguez - Team: Vasco da Gama - Team City: Rio de Janeiro}",
                "Player {Player name: Alex Teixeira - Team: Vasco da Gama - Team City: Rio de Janeiro}",
                "Player {Player name: Raphael Veiga - Team: Palmeiras - Team City: São Paulo}");

        assertEquals(list, playerAssociation.getPlayers());
    }

    @Test
    void shouldReturnTotalTeams() {
        PlayersAssociation playerAssociation = new PlayersAssociation();
        playerAssociation.enroll("Léo Jardim", "Vasco da Gama", "Rio de Janeiro");
        playerAssociation.enroll("Puma Rodriguez", "Vasco da Gama", "Rio de Janeiro");
        playerAssociation.enroll("Alex Teixeira", "Vasco da Gama", "Rio de Janeiro");
        playerAssociation.enroll("Raphael Veiga", "Palmeiras", "São Paulo");

        
        List<String> list = asList(
                "Player {Player name: Léo Jardim - Team: Vasco da Gama - Team City: Rio de Janeiro}",
                "Player {Player name: Puma Rodriguez - Team: Vasco da Gama - Team City: Rio de Janeiro}",
                "Player {Player name: Alex Teixeira - Team: Vasco da Gama - Team City: Rio de Janeiro}",
                "Player {Player name: Raphael Veiga - Team: Palmeiras - Team City: São Paulo}");

        assertEquals(2, TeamFactory.getTotalTeams());
    }


}
