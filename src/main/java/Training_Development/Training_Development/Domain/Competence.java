package Training_Development.Training_Development.Domain;

public class Competence {

    private int competencyId;
    private String name;
    private String description;
    private String level;
    private boolean active;

    public Competence() {

    }

    public Competence(int competencyId, String name, String description, String level, boolean active) {
        this.competencyId = competencyId;
        this.name = name;
        this.description = description;
        this.level = level;
        this.active = active;
    }

    public int getCompetencyId() {
        return competencyId;
    }

    public void setCompetencyId(int competencyId) {
        this.competencyId = competencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void activateCompetency(){
        this.active = true;
    }

    public void deactivateCompetency(){
        this.active = false;
    }

    @Override
    public String toString() {
        return "Competency{" +
                "competencyId=" + competencyId +
                ", name=" + name +
                ", description=" + description +
                ", level=" + level +
                ", active=" + active +
                "}";
    }
}
