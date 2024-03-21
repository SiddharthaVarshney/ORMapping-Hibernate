package OneToOne;

class Employee{
    private int empId;
    private String name;
    private float salary;
    
    private Address address;

    public Employee() {
    }

    public Employee(int empId, String name, float salary, Address address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
            
    
}