package ua.osadchuk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.osadchuk.model.Passport;
import ua.osadchuk.model.Person;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Створення людина і паспорта:
//            Person person = new Person("Taras", 21);
//            Passport passport = new Passport(1123456);
//            person.setPassport(passport);
//            session.save(person);

//            Отримання номер пасторту, через людину:
//            Person person = session.get(Person.class,1);
//            System.out.println(person.getPassport().getPassportNumber());

//            Отримання людини, по паспорту:
//            Passport passport = session.get(Passport.class, 1);
//            System.out.println(passport.getPerson().toString());

//            Змінення номеру поспорта:
//            Person person = session.get(Person.class, 1);
//            person.getPassport().setPassportNumber(654321);

//            Видалення лдини:
//            Person person = session.get(Person.class, 1);
//            session.remove(person);

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
