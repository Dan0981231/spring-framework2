package cydeo.bootstrap;

import cydeo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataGenerator implements CommandLineRunner {

    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;
    private final MovieRepository movieRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final TicketRepository ticketRepository;
    private final GenreRepository genreRepository;

    public DataGenerator(AccountRepository accountRepository, CinemaRepository cinemaRepository, MovieRepository movieRepository, MovieCinemaRepository movieCinemaRepository, TicketRepository ticketRepository, GenreRepository genreRepository) {
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
        this.movieRepository = movieRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.ticketRepository = ticketRepository;
        this.genreRepository = genreRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(cinemaRepository.findByName("Hall 1 - EMPIRE"));
        System.out.println(accountRepository.fetchAllAdminAccounts());
        System.out.println(cinemaRepository.distinctBySponsoredName());
        System.out.println(movieRepository.fetchAllMovieNames());
        System.out.println(movieCinemaRepository.countAllByCinemaId(4L));
        System.out.println(movieCinemaRepository.retrieveAllByLocationName("AMC Empire 25"));
        System.out.println(ticketRepository.fetchAllTicketsByUserAccount(4L));
        System.out.println(genreRepository.fetchAllGenre());
        System.out.println(ticketRepository.fetchAllTicketsWithRangeOfDates(LocalDateTime.now().minusDays(25), LocalDateTime.now()));
        System.out.println(ticketRepository.retrieveAllBySearchCriteria("it"));

    }
}
