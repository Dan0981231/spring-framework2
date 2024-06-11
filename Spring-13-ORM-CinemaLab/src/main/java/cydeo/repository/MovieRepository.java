package cydeo.repository;

import cydeo.entity.Account;
import cydeo.entity.Movie;
import cydeo.enums.MovieState;
import cydeo.enums.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name
    List<Movie> findMovieByName(String name);

    //Write a derived query to list all movies between a range of prices
    List<Movie> findMovieByPriceBetween(BigDecimal price1, BigDecimal price2);
    //Write a derived query to list all movies where duration exists in the specific list of duration

    List<Movie> findMovieByDurationIn(List<Integer> duration);
    //Write a derived query to list all movies with higher than a specific release date

    List<Movie> findMovieByReleaseDateAfter(LocalDate releaseDate);
    //Write a derived query to list all movies with a specific state and type

    List<Movie> findAllByStateAndType(MovieState state, MovieType type);
    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices

    @Query("select m from Movie m where m.price between ?1 and ?2")
    List<Movie> getByPriceBetween(BigDecimal price1, BigDecimal price2);
    //Write a JPQL query that returns all movie names
    @Query("select m.name from Movie m")
    List<String> fetchAllMovieNames();
    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name

    @Query(value = "SELECT * FROM movie WHERE name = ?1", nativeQuery = true)
    Optional<Movie> retrieveByName(String name);

    //Write a native query that return the list of movies in a specific range of prices

    @Query(value = "SELECT * FROM movie WHERE price BETWEEN ?1 AND ?2", nativeQuery = true)
    List<Movie> retrieveByPriceRange(@Param("price1") BigDecimal price1, @Param("price2") BigDecimal price2);

    //Write a native query to return all movies where duration exists in the range of duration
    @Query(value = "SELECT * FROM movie WHERE duration IN ?1", nativeQuery = true)
    List<Movie> retrieveByDurationInRange(@Param("durations") List<Integer> durations);

    //Write a native query to list the top 5 most expensive movies
    @Query(value = "SELECT * FROM movie ORDER BY price DESC LIMIT 5", nativeQuery = true)
    List<Movie> top5ExpensiveMovies();
}
