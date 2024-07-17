package com.book_my_show.BookmyShow.Convertors;


import com.book_my_show.BookmyShow.DTOs.Request.UserReqDto;
import com.book_my_show.BookmyShow.Models.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConvertor {

    public static User userReqDtoToUser(UserReqDto userReqDto) {
        return User.builder()
                .name(userReqDto.getName())
                .age(userReqDto.getAge())
                .mobileNo(userReqDto.getMobileNo())
                .emailId(userReqDto.getEmailId())
                .build();
    }
}
