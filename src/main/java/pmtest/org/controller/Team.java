package pmtest.org.controller;

public class Team {

    private String firstTeamName;
    private String secTeamName;

    @Override
    public String toString() {
        return "Team{" +
                "firsTeamName='" + firstTeamName + '\'' +
                ", secTeamName='" + secTeamName + '\'' +
                '}';
    }

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
