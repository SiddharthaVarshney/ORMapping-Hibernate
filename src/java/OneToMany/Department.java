package OneToMany;

import java.util.Set;

class Department{
    private int deptId;
    private String deptName;
    
    private Set<Employeee> employees;

    public Department() {
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set<Employeee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employeee> employees) {
        this.employees = employees;
    }

    
}