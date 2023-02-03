package ua.osadchuk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.osadchuk.model.Actor;
import ua.osadchuk.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Actor.class).addAnnotatedClass(Movie.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

//            Створення акторів та фільмів:
//            Movie movie = new Movie("Our Family", 1994);
//            Actor actor = new Actor("Andrii", 27);
//            Actor actor1 = new Actor("Taras", 21);
//            movie.setActors(new ArrayList<>(List.of(actor, actor1)));
//            actor.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            actor1.setMovies(new ArrayList<>(Collections.singletonList(movie)));
//            session.save(movie);
//            session.save(actor);
//            session.save(actor1);

//            Усі актори фільму:
//            Movie movie = session.get(Movie.class, 1);
//            System.out.println(movie.getActors());

//            Усі фільми актора:
//            Actor actor = session.get(Actor.class, 2);
//            System.out.println(actor.getMovies());

//            Новий фільм до існуючого актора:
//            Movie movie = new Movie("For Rest", 2021);
//            Actor actor = session.get(Actor.class, 2);
//            actor.getMovies().add(movie);
//            movie.setActors(new ArrayList<>(Collections.singletonList(actor)));
//            session.save(movie);

//            Видалення фільму у актора:
//            Actor actor = session.get(Actor.class, 2);
//            System.out.println(actor.getMovies());
//            Movie movie = actor.getMovies().get(0);
//            actor.getMovies().remove(0);
//            movie.getActors().remove(actor);
//            System.out.println(actor.getMovies());

            session.getTransaction().commit();
        }
    }
}
