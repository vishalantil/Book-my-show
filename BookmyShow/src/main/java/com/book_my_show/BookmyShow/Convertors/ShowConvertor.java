package com.book_my_show.BookmyShow.Convertors;

import com.book_my_show.BookmyShow.DTOs.Request.ShowReqDto;
import com.book_my_show.BookmyShow.Models.Show;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConvertor {

    public static Show showReqDtoToShow(ShowReqDto showReqDto) {
        return Show.builder()
                .showDate(showReqDto.getShowDate())
                .showStartTime(showReqDto.getShowStartTime())
                .showEndTime(showReqDto.getShowEndTime())
                .build();
    }
}
