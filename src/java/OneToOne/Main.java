package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Main{
    public static void main(String[] args) {
        
        // Creating persistent class's objects:
        Employee emp = new Employee();
        emp.setName("Bob");
        emp.setSalary(500);
        
        Address add = new Address();
        add.setCity("Hydrabad");
        add.setState("Telangana");
        add.setCountry("India");
        
        emp.setAddress(add);
        add.setEmployee(emp);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(emp);
        
        tx.commit();
        s.close();
        sf.close();
    }

}