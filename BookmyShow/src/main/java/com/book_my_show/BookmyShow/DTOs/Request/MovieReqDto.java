package com.book_my_show.BookmyShow.DTOs.Request;

import com.book_my_show.BookmyShow.Enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieReqDto {

    private String name;

    private double duration;

    private String directorName;

    private double rating;

    private Genre genre;
}
