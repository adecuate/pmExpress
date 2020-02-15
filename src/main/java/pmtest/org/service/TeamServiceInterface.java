package pmtest.org.service;

import pmtest.org.model.Team;

import java.util.List;


public interface TeamServiceInterface {
    Team addTeam (Team team);
    Iterable<Team> addListTeam (List<Team> team);
}
