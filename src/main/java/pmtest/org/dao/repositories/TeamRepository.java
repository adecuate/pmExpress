package pmtest.org.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pmtest.org.model.Team;

@Repository
@Transactional
public interface TeamRepository extends CrudRepository <Team, Long> {
}
