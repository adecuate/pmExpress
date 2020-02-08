package pmtest.org.service;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pmtest.org.model.Team;


public interface TeamServiceInterface {
    Team addTeam (Team team);
}
