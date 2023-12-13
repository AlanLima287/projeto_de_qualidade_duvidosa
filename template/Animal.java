package template;

public class Animal implements java.io.Serializable {

    private int id_animal;
    private Customer id_customer;
    private String name;
    private String gender;
    private String birth_date;
    private Race id_race;

    public int getIdAnimal() {
        return id_animal;
    }

    public void setIdAnimal(int id_animal) {
        this.id_animal = id_animal;
    }

    public Customer getIdCustomer() {
        return id_customer;
    }

    public void setIdCustomer(Customer id_customer) {
        this.id_customer = id_customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }

    public Race getIdRace() {
        return id_race;
    }

    public void setIdRace(Race id_race) {
        this.id_race = id_race;
    }

    @Override
    public String toString(){
        return name;
    }

}
