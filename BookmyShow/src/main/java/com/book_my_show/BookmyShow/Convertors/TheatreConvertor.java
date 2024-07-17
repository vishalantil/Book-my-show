package com.book_my_show.BookmyShow.Convertors;

import com.book_my_show.BookmyShow.DTOs.Request.TheatreReqDto;
import com.book_my_show.BookmyShow.Models.Theatre;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConvertor {

    public static Theatre theatreReqDtoToTheatre(TheatreReqDto theatreReqDto) {
        return Theatre.builder()
                .name(theatreReqDto.getName())
                .location(theatreReqDto.getLocation())
                .build();
    }
}
