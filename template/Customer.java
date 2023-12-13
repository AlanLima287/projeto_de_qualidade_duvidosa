package template;

public class Customer implements java.io.Serializable {
   
    private int id_customer;
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String birth_date;

    public int getIdCustomer() {
        return id_customer;
    }

    public void setIdCustomer(int id_customer) {
        this.id_customer = id_customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }

    @Override
    public String toString(){
        return name;
    }
    
}