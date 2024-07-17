package com.book_my_show.BookmyShow.Service;

import com.book_my_show.BookmyShow.Convertors.MovieConvertor;
import com.book_my_show.BookmyShow.DTOs.Request.MovieReqDto;
import com.book_my_show.BookmyShow.Models.Movie;
import com.book_my_show.BookmyShow.Repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    public String addMovie(MovieReqDto movieReqDto) {
        Movie movie = MovieConvertor.movieReqDtoToMovie(movieReqDto);
        movieRepository.save(movie);
        return "Movie Added";
    }
}