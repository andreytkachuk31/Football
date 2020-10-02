package com.football.stat.controller;

import com.football.stat.dto.TeamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @PostMapping
    public void addTeam(@RequestBody TeamDto teamDto) {

    }

    @GetMapping
    public List<TeamDto> getTeams() {
        return new ArrayList<>();
    }
}
