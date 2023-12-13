package template;

public class Consultation implements java.io.Serializable {
    private int id_consultation;
    private Animal id_animal;
    private Customer id_customer;
    private Doctor id_doctor;
    private String date;
    private String description;

    public int getIdConsultation() {
        return id_consultation;
    }

    public void setIdConsultation(int id_consultation) {
        this.id_consultation = id_consultation;
    }

    public Animal getIdAnimal() {
        return id_animal;
    }

    public void setIdAnimal(Animal id_animal) {
        this.id_animal = id_animal;
        this.id_customer = id_animal.getIdCustomer();
    }

    public Customer getIdCustomer() {
        return id_customer;
    }

    /*private void setIdCustomer(Customer id_customer) {
        this.id_customer = id_customer;
    }*/

    public Doctor getIdDoctor() {
        return id_doctor;
    }

    public void setIdDoctor(Doctor id_doctor) {
        this.id_doctor = id_doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}