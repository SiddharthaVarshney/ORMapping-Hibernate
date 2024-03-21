package ManyToMany;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class Main{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setStdName("Bunny");
        s1.setStdMarks(69);
        
        Student s2 = new Student();
        s2.setStdName("Don");
        s2.setStdMarks(96);
        
        Course c1 = new Course();
        c1.setcName("Java");
        c1.setDuration(5);
        
        Course c2 = new Course();
        c2.setcName("HTML");
        c2.setDuration(10);
        
        Set courses = new HashSet<>();
        courses.add(c1); courses.add(c2);
        
        s1.setCourses(courses);
        s2.setCourses(courses);
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        
        s.save(s1);
        s.save(s2);
        
        tx.commit();
        s.close();
        sf.close();
    }

}