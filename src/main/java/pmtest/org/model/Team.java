package pmtest.org.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                '}';
    }

    private String firstTeamName;
    private String secTeamName;


    public String getFirstTeamName() {
        return firstTeamName;
    }

    public void setFirstTeamName(String firstTeamName) {
        this.firstTeamName = firstTeamName;
    }

    public String getSecTeamName() {
        return secTeamName;
    }

    public void setSecTeamName(String secTeamName) {
        this.secTeamName = secTeamName;
    }


}
