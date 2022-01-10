package pl.edu.pw.gamearranger.dto.mapper;

import pl.edu.pw.gamearranger.domain.Game;
import pl.edu.pw.gamearranger.dto.CreateGameDTO;
import pl.edu.pw.gamearranger.dto.GameDTO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GameMapper {

    public List<GameDTO> map(List<Game> games){
        List<GameDTO> mappedGames = new LinkedList<>();

        for (Game g: games) {
            mappedGames.add(new GameDTO(g.getTeams(), g.getLocation(), g.getDate(), g.getTime()));
        }

        return mappedGames;
    }

    public GameDTO map(Game game) {
        return new GameDTO(game.getTeams(), game.getLocation(), game.getDate(), game.getTime());
    }

    public Game map(CreateGameDTO game) {
        Game g = new Game();
        g.setLocation(game.getLocation());
        g.setDate(game.getDate());
        g.setTime(game.getTime());
        g.setTeams(new ArrayList<>());
        return g;
    }
}
