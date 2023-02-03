package ua.osadchuk.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movie_id;
    @Column(name = "name")
    private String name;
    @Column(name = "year_of_production")
    private int year_of_production;
    @ManyToMany(mappedBy = "movies")
    private List<Actor> actors;

    public Movie() {
    }

    public Movie(String name, int year_of_production) {
        this.name = name;
        this.year_of_production = year_of_production;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", name='" + name + '\'' +
                ", year_of_production=" + year_of_production +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (movie_id != movie.movie_id) return false;
        if (year_of_production != movie.year_of_production) return false;
        return Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        int result = movie_id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + year_of_production;
        return result;
    }
}
