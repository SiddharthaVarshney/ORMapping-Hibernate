package OneToMany;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Main{
    public static void main(String[] args) {
        
        Employeee emp1 = new Employeee();
        emp1.setEmpName("Raja");
        emp1.setEmpAddress("Mumbai");
        
        Employeee emp2 = new Employeee();
        emp2.setEmpName("Rohan");
        emp2.setEmpAddress("Delhi");
        
        Set<Employeee> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        
        Department dept = new Department();
        dept.setDeptName("Computer Science");
        dept.setEmployees(employees);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(dept);
        
        tx.commit();
        s.close();
        sf.close();
    }
}