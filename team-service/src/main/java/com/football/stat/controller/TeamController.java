package com.football.stat.controller;

import com.football.stat.dto.TeamDto;
import com.football.stat.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private TeamService teamService;

    @GetMapping
    public List<TeamDto> getTeams() {
        return new ArrayList<>();
    }
}
