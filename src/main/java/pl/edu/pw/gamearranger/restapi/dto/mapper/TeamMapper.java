package pl.edu.pw.gamearranger.restapi.dto.mapper;

import pl.edu.pw.gamearranger.restapi.domain.Team;
import pl.edu.pw.gamearranger.restapi.domain.TeamCaptain;
import pl.edu.pw.gamearranger.restapi.dto.CreateTeamDTO;
import pl.edu.pw.gamearranger.restapi.dto.TeamDTO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TeamMapper {

    public Team map(CreateTeamDTO team, TeamCaptain captain) {
        Team t = new Team();
        t.setName(team.getName());
        t.setCaptain(captain);
        t.setPlayers(new ArrayList<>());
        t.setGames(new ArrayList<>());
        return t;
    }

    public List<TeamDTO> map(List<Team> teams) {
        List<TeamDTO> mappedTeams = new LinkedList<>();
        for(Team t: teams) {
            mappedTeams.add(new TeamDTO(t.getId(), t.getName(), t.getCaptain(), t.getPlayers(), t.getGames()));
        }
        return mappedTeams;
    }

    public TeamDTO map(Team team) {
        return new TeamDTO(team.getId(), team.getName(), team.getCaptain(), team.getPlayers(), team.getGames());
    }

}
