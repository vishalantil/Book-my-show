package com.book_my_show.BookmyShow.Convertors;


import com.book_my_show.BookmyShow.DTOs.Request.MovieReqDto;
import com.book_my_show.BookmyShow.Models.Movie;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MovieConvertor {

    public static Movie movieReqDtoToMovie(MovieReqDto movieReqDto) {
        return Movie.builder()
                .name(movieReqDto.getName())
                .directorName(movieReqDto.getDirectorName())
                .duration(movieReqDto.getDuration())
                .genre(movieReqDto.getGenre())
                .rating(movieReqDto.getRating())
                .build();
    }
}
