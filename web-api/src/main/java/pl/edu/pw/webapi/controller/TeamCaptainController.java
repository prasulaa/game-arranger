package pl.edu.pw.webapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pw.webapi.dto.CreateTeamCaptainDTO;
import pl.edu.pw.webapi.dto.TeamCaptainDTO;
import pl.edu.pw.webapi.dto.mapper.TeamCaptainMapper;
import pl.edu.pw.webapi.service.TeamCaptainService;

@RestController
@RequestMapping("api/teamcaptain")
public class TeamCaptainController {

    private final TeamCaptainService teamCaptainService;

    public TeamCaptainController(TeamCaptainService teamCaptainService) {
        this.teamCaptainService = teamCaptainService;
    }

    @PostMapping
    public TeamCaptainDTO createTeamCaptain(@RequestBody CreateTeamCaptainDTO teamCaptain) {
        return new TeamCaptainMapper().map(teamCaptainService.createTeamCaptain(teamCaptain));
    }
}
