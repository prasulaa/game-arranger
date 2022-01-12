package pl.edu.pw.gamearranger.restapi.dto;

import pl.edu.pw.gamearranger.restapi.domain.Game;
import pl.edu.pw.gamearranger.restapi.domain.Player;
import pl.edu.pw.gamearranger.restapi.domain.TeamCaptain;

import java.util.List;

public class TeamDTO {

    private Long id;
    private String name;
    private TeamCaptain captain;
    private List<Player> players;
    private List<Game> games;

    public TeamDTO() {
    }

    public TeamDTO(Long id, String name, TeamCaptain captain, List<Player> players, List<Game> games) {
        this.id = id;
        this.name = name;
        this.captain = captain;
        this.players = players;
        this.games = games;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeamCaptain getCaptain() {
        return captain;
    }

    public void setCaptain(TeamCaptain captain) {
        this.captain = captain;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
