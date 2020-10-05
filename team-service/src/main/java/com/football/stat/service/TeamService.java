package com.football.stat.service;

import com.football.stat.dto.TeamDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    public List<TeamDto> getTeams() {
        return new ArrayList<>();
    }
}
