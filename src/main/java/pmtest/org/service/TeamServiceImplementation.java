package pmtest.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pmtest.org.dao.repositories.TeamRepository;
import pmtest.org.model.Team;

import java.util.List;

@Service
public class TeamServiceImplementation implements TeamServiceInterface{

    @Override
    public List<Team> addListTeam(List<Team> events) {
        return (List<Team>) teamRepository.saveAll(events);
    }

    private TeamRepository teamRepository;

    @Override
    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    @Autowired
    public void setTeamRepository(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
}
