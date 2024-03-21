package ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Main{
    public static void main(String[] args) {
        
        Dept dept = new Dept();
        dept.setDeptName("Computer Science");
        
        Emp emp1 = new Emp();
        emp1.setEmpName("Sunny");
        emp1.setEmpAddress("Delhi");
        emp1.setDept(dept);
        
        Emp emp2 = new Emp();
        emp2.setEmpName("Angel");
        emp2.setEmpAddress("Mumbai");
        emp2.setDept(dept);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(emp1);
        s.save(emp2);
        
        tx.commit();
        s.close();
        sf.close();
    }

}