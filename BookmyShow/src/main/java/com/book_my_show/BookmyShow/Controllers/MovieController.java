package com.book_my_show.BookmyShow.Controllers;

import com.book_my_show.BookmyShow.DTOs.Request.MovieReqDto;
import com.book_my_show.BookmyShow.Service.MovieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/add")
    public String addMovie(@RequestBody MovieReqDto movieReqDto) {
        return movieService.addMovie(movieReqDto);
    }
}
