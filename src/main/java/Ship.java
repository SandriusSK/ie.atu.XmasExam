package ie.atu.XmasExam;

public class Ship {

    private String name;
    private String build;
    private String crew;

    public Ship() {
    }

    public Ship(String name, String build, String crew) {
        this.name = name;
        this.build = build;
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }
    public static void main(String[] args) {
        Ship Sandrius = new Ship();
        Sandrius.setName("Elizabeth");
        Sandrius.setBuild("2003");
        Sandrius.setCrew("196");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
