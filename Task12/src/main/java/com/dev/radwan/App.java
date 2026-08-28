package com.dev.radwan;

import com.dev.radwan.model.Course;
import com.dev.radwan.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory()
        ){
            Session session = sessionFactory.openSession();
           Transaction transaction = session.beginTransaction();


            Student ahmed = Student.builder().firstName("ahmed").lastName("radwan").email("ahmed@gmail.com").build();
            Student mohamed =
                    Student.builder().firstName("mohamed").lastName("ahmed").email("mohamed@gmail.com").build();

           Course java = Course.builder().name("java").students(List.of(ahmed,mohamed)).build();
           Course spring = Course.builder().name("spring").students(List.of(ahmed)).build();

           ahmed.setCourses(List.of(java,spring));
           mohamed.setCourses(List.of(java));

           session.persist(java);
           session.persist(spring);
           transaction.commit();
        }
    }
}