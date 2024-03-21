package OneToOne;

class Address{
    private int addId;
    private String city;
    private String state;
    private String country;
    
    private Employee employee;

    public Address() {
    }

    public Address(int addId, String city, String state, String country, Employee employee) {
        this.addId = addId;
        this.city = city;
        this.state = state;
        this.country = country;
        this.employee = employee;
    }

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}