package template;

public class Race implements java.io.Serializable {
    private int id_race;
    private String name;
    private String specie;

    public int getIdRace() {
        return id_race;
    }

    public void setIdRace(int id_race) {
        this.id_race = id_race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String toString(){
        return String.format("%s - %s", name, specie);
    }
    
    
}
