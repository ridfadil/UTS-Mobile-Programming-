package apps.farid.football.matchfootbalapps.model;

public class MatchModel {
    private String nameHome;
    private String nameAway;
    private String scoreHom;
    private String scoreAway;
    private String descrription;
    private int logoHome;
    private int logoAway;

    public MatchModel(String nameHome, String nameAway, String scoreHom, String scoreAway, String descrription, int logoHome, int logoAway) {
        this.nameHome = nameHome;
        this.nameAway = nameAway;
        this.scoreHom = scoreHom;
        this.scoreAway = scoreAway;
        this.descrription = descrription;
        this.logoHome = logoHome;
        this.logoAway = logoAway;
    }

    public String getNameHome() {
        return nameHome;
    }

    public void setNameHome(String nameHome) {
        this.nameHome = nameHome;
    }

    public String getNameAway() {
        return nameAway;
    }

    public void setNameAway(String nameAway) {
        this.nameAway = nameAway;
    }

    public String getScoreHom() {
        return scoreHom;
    }

    public void setScoreHom(String scoreHom) {
        this.scoreHom = scoreHom;
    }

    public String getScoreAway() {
        return scoreAway;
    }

    public void setScoreAway(String scoreAway) {
        this.scoreAway = scoreAway;
    }

    public String getDescrription() {
        return descrription;
    }

    public void setDescrription(String descrription) {
        this.descrription = descrription;
    }

    public int getLogoHome() {
        return logoHome;
    }

    public void setLogoHome(int logoHome) {
        this.logoHome = logoHome;
    }

    public int getLogoAway() {
        return logoAway;
    }

    public void setLogoAway(int logoAway) {
        this.logoAway = logoAway;
    }
}
